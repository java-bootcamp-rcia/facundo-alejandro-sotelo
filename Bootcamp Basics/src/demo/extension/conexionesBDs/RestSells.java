package demo.extension.conexionesBDs;

import demo.extension.factory.ConnectionRest;

public class RestSells implements ConnectionRest {


    @Override
    public String getURL(String url) {
        if ("Sells".equalsIgnoreCase(url)){
            return "Successful connection";
        }
        return "Cannot connect...";
    }
}
