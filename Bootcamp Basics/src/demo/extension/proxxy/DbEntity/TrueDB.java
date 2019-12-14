package demo.extension.proxxy.DbEntity;

import demo.extension.proxxy.DBConnection;
import demo.extension.proxxy.DBConnectionInt;

public class TrueDB implements DBConnectionInt {


    @Override
    public DBConnection connect(String nameBD, String host, String pass) {
       return new DBConnection(nameBD, host, pass);
    }

    @Override
    public String disconnect(DBConnection db) {
        if(db != null){
            return "Disconnecting...\n Disconnected";
        }
        return "Data base already disconnected";
    }
}
