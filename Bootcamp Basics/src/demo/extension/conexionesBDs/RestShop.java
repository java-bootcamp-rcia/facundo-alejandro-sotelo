package demo.extension.conexionesBDs;

import demo.extension.factory.ConectionRest;

public class RestShop implements ConectionRest {

    @Override
    public String recibirURL(String url) {
        if(!url.equalsIgnoreCase("")){
            return "Conexion Establecida";
        }
        return null;
    }
}
