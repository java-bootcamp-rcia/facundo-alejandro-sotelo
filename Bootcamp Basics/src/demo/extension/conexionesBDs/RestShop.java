package demo.extension.conexionesBDs;

import demo.extension.factory.ConectionRest;

public class RestShop implements ConectionRest {

    @Override
    public String getURL(String url) {
        if("Shops".equalsIgnoreCase(url)){
            return "Successful connection";
        }
        return "Cannot connect...";
    }
}
