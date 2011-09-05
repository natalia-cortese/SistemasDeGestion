package Experto;

public class FabricaExperto{
    private static FabricaExperto instancia;

    public static FabricaExperto getInstancia(){
        if(instancia == null){
            instancia = new FabricaExperto();
            }
        return instancia;
        }
    public Experto FabricarExperto(String experto){
        if(experto.equals("ExpertoCliente")){
            return new DecoradorCliente();
        } else if(experto.equals("ExpertoProveedor"))
        {
            return new DecoradorProveedor();
    }else if(experto.equals("ExpertoProducto"))
        {
            return new DecoradorProducto();
    }
        return null;
    }
}
