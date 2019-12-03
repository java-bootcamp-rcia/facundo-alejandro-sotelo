package demo.extension;

import demo.extension.conexionesBDs.RestCompras;
import demo.extension.conexionesBDs.RestVentas;
import demo.extension.factory.AbstractFactory;
import demo.extension.factory.IConexionBD;
import demo.extension.factory.IConexionREST;

public class FactoryRest implements AbstractFactory {

    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }

    @Override
    public IConexionREST getURL(String url) {
        if(url.equalsIgnoreCase("http::Compras")){
            return new RestCompras();
        }
        else
            if(url.equalsIgnoreCase("http::Ventas")){
                return new RestVentas();
            }
        return null;
    }
}
