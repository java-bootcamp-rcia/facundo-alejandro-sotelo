package demo.extension.builder;

import demo.extension.factory.ConectionBD;

public class SQLServerConnect extends ConnectionBuilder {

    @Override
    public String connect(String host, String pass, String user) {
        this.bd = new ConnectionDB(host, pass, user);
        return this.bd.toString();
    }

    @Override
    public String disconnect() {
        return "Now disconnecting... Disconnected";
    }
}
