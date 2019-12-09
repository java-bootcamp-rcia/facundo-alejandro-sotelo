package demo.extension;

import demo.extension.conexionesBDs.RestShop;
import demo.extension.conexionesBDs.RestSells;
import demo.extension.factory.AbstractFactory;
import demo.extension.factory.ConnectionBD;
import demo.extension.factory.ConnectionRest;

public class FactoryRest implements AbstractFactory {

    @Override
    public ConnectionBD getBD(String motor) {
        return null;
    }

    @Override
    public ConnectionRest getURL(String url) {
        if("http::Shops".equalsIgnoreCase(url)){
            return new RestShop();
        }
        else
            if("http::Sells".equalsIgnoreCase(url)){
                return new RestSells();
            }
        return null;
    }
}
