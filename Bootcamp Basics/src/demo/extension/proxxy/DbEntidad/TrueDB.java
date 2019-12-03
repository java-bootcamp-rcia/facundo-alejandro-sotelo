package demo.extension.proxxy.DbEntidad;

import demo.extension.proxxy.DBConection;
import demo.extension.proxxy.IDBConection;

public class TrueDB implements IDBConection {


    @Override
    public DBConection conectar(String nameBD, String host, String pass) {
       return new DBConection(nameBD, host, pass);
    }

    @Override
    public String desconectar(DBConection db) {
        if(db != null){
            return "Desconectando...\n Desconectado";
        }
        return "-1";
    }
}
