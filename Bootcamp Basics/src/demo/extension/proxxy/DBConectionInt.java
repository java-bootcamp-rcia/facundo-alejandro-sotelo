package demo.extension.proxxy;

public interface DBConectionInt {

    DBConection connect(String nameBD, String host, String pass);
    String disconnect(DBConection db);

}
