package demo.extension.proxxy.DbEntidad;

import demo.extension.proxxy.DBConection;
import demo.extension.proxxy.DBConectionInt;

public class TrueDbProxxy implements DBConectionInt {

    private TrueDB db;

    @Override
    public DBConection connect(String nameBD, String host, String pass) {
        db = new TrueDB();
        return db.connect(nameBD, host, pass);
    }

    @Override
    public String disconnect(DBConection db) {
        if(db != null){
            return "Desconectando... \n Desconectado";
        }
        return "Base de datos, desconectada";
    }
}
