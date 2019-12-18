package demo.extension.conexionesBDs;

import demo.extension.factory.ConectionRest;

public class RestSells implements ConectionRest {


    @Override
    public String getURL(String url) {
        if ("Sells".equalsIgnoreCase(url)){
            return "Successful connection";
        }
        return "Cannot connect...";
    }
}
