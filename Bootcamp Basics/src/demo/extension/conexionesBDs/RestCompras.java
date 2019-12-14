package demo.extension.conexionesBDs;

import demo.extension.factory.IConexionREST;

public class RestCompras implements IConexionREST {

    @Override
    public String recibirURL(String url) {
        if(!url.equalsIgnoreCase("")){
            return "Conexion Establecida";
        }
        return null;
    }
}
