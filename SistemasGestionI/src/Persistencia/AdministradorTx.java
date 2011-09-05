package Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AdministradorTx {

    private static AdministradorTx instancia = null;
    private Connection conexion = null;
    private short contadorTx = 0;

    public static AdministradorTx getInstance(){
        if (instancia == null) {
            instancia = new AdministradorTx();
            }
        return instancia;
        }

    public synchronized void iniciarTX(){
        if (contadorTx == 0){
            System.out.println("***************** SE INICIO LA TX ******************");
            }
        contadorTx++;
        }

    public synchronized void finalizarTx(){
        if (contadorTx > 1){
            try {
                conexion.close();
                System.out.println("************** SE FINALIZO LA TX ********************");
                }
            catch (SQLException ex){
                }
            }
        contadorTx--;
        }

    public void crearConexion(String dir,String usuario,String pass) throws Exception{
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        //conexion = DriverManager.getConnection("jdbc:mysql://192.168.20.2/disenio", "disenio", "disenio");
       conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/sg1", "root", "duendecito");
       //conexion = DriverManager.getConnection("jdbc:mysql:" + dir, usuario,pass);
        }

    public Connection getConexion(){
        return conexion;
        }

    public synchronized void Rollback() {
        try {
            if (!conexion.isClosed()) {
                conexion.rollback();
            }
            contadorTx = 0;
            return;
        } catch (SQLException ex1) {
            contadorTx = 0;
            return;
        }
    }
}
