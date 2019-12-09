/**
 * This class, basically is used for his father to implement the connection and disconnection methods
 *
 */


package demo.extension.builder;

public class SQLServerConnect extends ConnectionBuilder {

    @Override
    public String connect(String host, String pass, String user) {
        this.bd = new ConnectionDB(host, pass, user);
        return this.bd.toString();
    }

    @Override
    public String disconnect() {
        this.bd = null;
        return "Now disconnecting... Disconnected";
    }
}
