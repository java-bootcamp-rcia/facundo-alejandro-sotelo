package demo.extension.conexionesBDs;

import demo.extension.factory.ConectionRest;

public class RestSells implements ConectionRest {


    @Override
    public String recibirURL(String url) {
        if (!url.equalsIgnoreCase("")){
            return "Conexion establecida";
        }
        return null;
    }
}
