package demo.extension.builder;

import demo.extension.factory.ConectionBD;

public abstract class ConnectionBuilder {

    protected ConnectionDB bd;

    public ConnectionDB getConnection(){
        return bd;
    }

    @Override
    public String toString() {
        return this.bd.toString();
    }

    public abstract String connect(String host, String pass, String user);
    public abstract  String disconnect();

}
