package demo.extension.proxxy;

public interface IDBConection {

    DBConection conectar(String nameBD, String host, String pass);
    String desconectar(DBConection db);

}
