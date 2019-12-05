package demo.extension.proxxy.DbEntidad;

import demo.extension.proxxy.DBConection;
import demo.extension.proxxy.DBConectionInt;

public class TrueDB implements DBConectionInt {


    @Override
    public DBConection connect(String nameBD, String host, String pass) {
       return new DBConection(nameBD, host, pass);
    }

    @Override
    public String disconnect(DBConection db) {
        if(db != null){
            return "Disconnecting...\n Disconnected";
        }
        return "-1";
    }
}
