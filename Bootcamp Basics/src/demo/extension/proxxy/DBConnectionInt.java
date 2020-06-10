package demo.extension.proxxy;

public interface DBConnectionInt {

    DBConnection connect(String nameBD, String host, String pass);
    String disconnect(DBConnection db);

}
