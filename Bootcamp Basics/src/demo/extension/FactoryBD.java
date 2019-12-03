package demo.extension;

import demo.extension.conexionesBDs.ConexionMySQL;
import demo.extension.conexionesBDs.ConexionSQL;
import demo.extension.factory.AbstractFactory;
import demo.extension.factory.IConexionBD;
import demo.extension.factory.IConexionREST;

public class FactoryBD implements AbstractFactory {


    @Override
    public IConexionBD getBD(String motor) {
        if(motor.equalsIgnoreCase("SQL") || motor.equalsIgnoreCase("SQL Server")){
            return new ConexionSQL();
        }
        else
            if(motor.equalsIgnoreCase("MYSQL")){
                return new ConexionMySQL();
            }
        return null;
    }

    @Override
    public IConexionREST getURL(String url) {
        return null;
    }
}
