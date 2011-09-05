package Persistencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertirFechas {

    public static String sinComillas(String recibido) {
        String ult;
        int aux;
        aux = recibido.length();
        aux = aux - 1;
        ult = recibido.substring(1, aux);
        return ult;
    }

    public static String fechaAString(Date fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String fechaSt = sdf.format(fecha);
        return "'" + fechaSt + "'";
    }

    public static Date stringAFecha(String fecha) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaDt;
        try {
            fechaDt = sdf.parse(fecha);
        } catch (ParseException ex) {
            fechaDt = new Date();
        }
        return fechaDt;
    }

    public static Date stringAHora(String hora) {
        SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
        Date horaDt;
        try {
            horaDt = sdf.parse(hora);
        } catch (ParseException ex) {
            horaDt = new Date();
        }
        return horaDt;
    }

    public static String horaAString(Date hora) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("kk:mm");
            String horaSt = sdf.format(hora);
            return "'" + horaSt + "'";
        } catch (Exception e) {
            return "'00:00'";
        }

    }
}
