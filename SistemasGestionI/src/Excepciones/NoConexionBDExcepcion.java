package Excepciones;

import Controlador.ControladorPrincipal;
import Excepciones.PantallaNoConexionBD;

public class NoConexionBDExcepcion extends Exception{
    
    private ControladorPrincipal controladorPrincipal;
    private PantallaNoConexionBD pantallaNoConexionBD;

    public NoConexionBDExcepcion(ControladorPrincipal controladorPrincipal){
        this.controladorPrincipal = controladorPrincipal;
        }
    
    public void getPantalla(){
        pantallaNoConexionBD = new PantallaNoConexionBD(this);
        pantallaNoConexionBD.setLocationRelativeTo(null);
        pantallaNoConexionBD.setVisible(true);
        pantallaNoConexionBD.setAlwaysOnTop(true);
        }
    public void error(){
        pantallaNoConexionBD.dispose();
        controladorPrincipal.errorBD();
        }
    }
