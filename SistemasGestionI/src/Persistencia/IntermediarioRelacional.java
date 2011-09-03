package Persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public abstract class IntermediarioRelacional extends IntermediarioPersistencia {

    protected String tabla;
    protected String oid;

    public abstract Registro convertirObjetoRegistro(ObjetoPersistente objeto);

    public abstract ArrayList<ObjetoPersistente> convertirRegistroObjeto(List<Registro> rs);

    public String armarInsert(Registro reg) {
        String SQL = "INSERT INTO " + tabla + " ( ";

        for (Campo campo : reg.getCampo()) {
            SQL += campo.getNombre() + ", ";
        }
        SQL = SQL.substring(0, SQL.length() - 2);
        SQL += ")";
        SQL += " VALUES (";

        for (Campo c : reg.getCampo()) {
            SQL += c.getValor() + ", ";
        }

        SQL = SQL.substring(0, SQL.length() - 2);

        SQL += ");";
        System.out.println("INSERT*************** " + SQL);
        return SQL;

    }

    public String armarUpdate(Registro reg) {
        String SQL = "UPDATE " + tabla + " SET ";

        for (Campo c : reg.getCampo()) {
            SQL += c.getNombre() + "=" + c.getValor() + ", ";
        }

        SQL = SQL.substring(0, SQL.length() - 2);

        SQL += " WHERE " + oid + " = " + reg.getCampo(oid).getValor() + ";";
        System.out.println("************* " + SQL);
        return SQL;
    }

    public String generarSQL_Criterio(Criterio criterio) {
        String SQL = "SELECT * FROM " + tabla + " WHERE " + criterio;
        System.out.println("*************" + SQL);
        return SQL;
    }

    //Para el criterio compuesto
    public String generarSQL_Criterio(List<Criterio> criterio) {
        String sql = "SELECT * FROM " + tabla + " WHERE ";
        for (Criterio cr : criterio) {
            sql += cr.getAtributo() + cr.getOperador() + cr.getValor().toString() + " AND ";
        }
        return sql;
    }

    public String generarSQLOID(String oid) {
        String SQL = "SELECT * FROM " + tabla.toLowerCase() + " WHERE " + this.oid + " = '" + oid + "'";
        System.out.println("************* " + SQL);
        return SQL;
    }

    public List<Registro> ejecutarSQLB(String consulta) {
        Registro registro;
        List<Registro> resultado = new ArrayList<Registro>();
        List<String> nombres = new ArrayList<String>();

        try {
            ResultSet rs = AdministradorTx.getInstance().getConexion().createStatement().executeQuery(consulta);
            for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++) {
                nombres.add(rs.getMetaData().getColumnName(i));
            }

            while (rs.next()) {
                registro = new Registro();
                for (String nombrecampo : nombres) {
                    String valor = rs.getString(nombrecampo);
                    Campo campovalor = new Campo(nombrecampo, valor);
                    registro.addCampo(campovalor);
                    campovalor = null;
                }
                resultado.add(registro);
                registro = null;
            }


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultado;
    }
    public String generarSQL_Todos() {
        String sql = "SELECT * FROM " + tabla ;
        return sql;
    }

    public boolean ejecutarSQLG(String consulta) {
        try {
            AdministradorTx.getInstance().getConexion().createStatement().execute(consulta);
        } catch (SQLException ex) {
            try {
                System.out.println(ex.getMessage());
                AdministradorTx.getInstance().getConexion().rollback();
                ex.printStackTrace();
                return false;
            } catch (SQLException ex1) {
                ex1.printStackTrace();
                return false;
            }
        }
        return true;
    }

    public ArrayList materializar(Criterio criterio) {
        String SQL = generarSQL_Criterio(criterio);

        List<Registro> reg = ejecutarSQLB(SQL);
        return convertirRegistroObjeto(reg);
    }

    public ObjetoPersistente materializar(String oid) {
        String SQL = generarSQLOID(oid);
        List<Registro> reg = ejecutarSQLB(SQL);
        try {
            return convertirRegistroObjeto(reg).get(0);
        } catch (NullPointerException e) {
            return null;
        }
    }

        public ArrayList materializar() {
        String SQL = generarSQL_Todos();
        List<Registro> reg = ejecutarSQLB(SQL);
        try {
            return convertirRegistroObjeto(reg);
        } catch (NullPointerException e) {
            return null;
        }
    }

    public boolean desmaterializar(ObjetoPersistente objeto) {
        try {
            if (objeto.getoid().isEmpty()) {
                oid = generarOID().toString();
                objeto.setoid(oid);
                return ejecutarSQLG(armarInsert(convertirObjetoRegistro(objeto)));

            } else {

                return ejecutarSQLG(armarUpdate(convertirObjetoRegistro(objeto)));
            }
        } catch (NullPointerException e) {
            oid = generarOID().toString();
            objeto.setoid(oid);
            return ejecutarSQLG(armarInsert(convertirObjetoRegistro(objeto)));
        }
    }

    public String generarOID() {
        oid = java.util.UUID.randomUUID().toString();

        return oid;
    }
}
