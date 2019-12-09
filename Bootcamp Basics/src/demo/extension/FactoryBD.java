package demo.extension;

import demo.extension.conexionesBDs.ConnectionMySQL;
import demo.extension.conexionesBDs.ConnectionSQL;
import demo.extension.factory.AbstractFactory;
import demo.extension.factory.ConnectionBD;
import demo.extension.factory.ConnectionRest;

public class FactoryBD implements AbstractFactory {


    @Override
    public ConnectionBD getBD(String motor) {
        if("SQL".equalsIgnoreCase(motor) || "SQL Server".equalsIgnoreCase(motor)){
            return new ConnectionSQL();
        }
        else
            if("MYSQL".equalsIgnoreCase(motor)){
                return new ConnectionMySQL();
            }
        return null;
    }

    @Override
    public ConnectionRest getURL(String url) {
        return null;
    }
}
