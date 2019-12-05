package demo.extension.conexionesBDs;

import demo.extension.factory.IConexionREST;

public class RestVentas implements IConexionREST {


    @Override
    public String recibirURL(String url) {
        if (!url.equalsIgnoreCase("")){
            return "Conexion establecida";
        }
        return null;
    }
}
