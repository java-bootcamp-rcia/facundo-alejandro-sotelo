package demo.extension.conexionesBDs;

import demo.extension.factory.ConnectionRest;

public class RestShop implements ConnectionRest {

    @Override
    public String getURL(String url) {
        if("Shops".equalsIgnoreCase(url)){
            return "Successful connection";
        }
        return "Cannot connect...";
    }
}
