package demo.extension;

import demo.extension.conexionesBDs.ConectionMySQL;
import demo.extension.conexionesBDs.ConectionSQL;
import demo.extension.factory.AbstractFactory;
import demo.extension.factory.ConectionBD;
import demo.extension.factory.ConectionRest;

public class FactoryBD implements AbstractFactory {


    @Override
    public ConectionBD getBD(String motor) {
        if("SQL".equalsIgnoreCase(motor) || "SQL Server".equalsIgnoreCase(motor)){
            return new ConectionSQL();
        }
        else
            if(motor.equalsIgnoreCase("MYSQL")){
                return new ConectionMySQL();
            }
        return null;
    }

    @Override
    public ConectionRest getURL(String url) {
        return null;
    }
}
