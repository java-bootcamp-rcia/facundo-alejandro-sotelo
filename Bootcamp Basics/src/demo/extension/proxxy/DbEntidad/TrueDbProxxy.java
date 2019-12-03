package demo.extension.proxxy.DbEntidad;

import demo.extension.proxxy.DBConection;
import demo.extension.proxxy.IDBConection;

public class TrueDbProxxy implements IDBConection {

    private TrueDB db;

    @Override
    public DBConection conectar(String nameBD, String host, String pass) {
        db = new TrueDB();
        return db.conectar(nameBD, host, pass);
    }

    @Override
    public String desconectar(DBConection db) {
        if(db != null){
            return "Desconectando... \n Desconectado";
        }
        return "Base de datos, desconectada";
    }
}
