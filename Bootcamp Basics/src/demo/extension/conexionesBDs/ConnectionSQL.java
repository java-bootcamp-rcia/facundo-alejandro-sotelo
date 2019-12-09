package demo.extension.conexionesBDs;

import demo.extension.factory.ConnectionBD;

public class ConnectionSQL implements ConnectionBD {


    private String user;
    private String connectionString;
    private String dbName;

    public ConnectionSQL(){
        this.user = "root";
        this.connectionString = "localhost:8000";
        this.dbName = "mydb";
    }

    @Override
    public String connect() {
        return "Successful connection";
    }

    @Override
    public String disconnect() {
        return "Disconnecting... Disconnected";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getConnectionString() {
        return connectionString;
    }

    public void setConnectionString(String connectionString) {
        this.connectionString = connectionString;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }
}
