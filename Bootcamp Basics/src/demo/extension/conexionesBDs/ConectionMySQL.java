package demo.extension.conexionesBDs;

import demo.extension.factory.ConectionBD;

public class ConectionMySQL implements ConectionBD {

    private String user;
    private String connectionString;
    private String dbName;

    public ConectionMySQL(){
        this.user = "root";
        this.connectionString = "localhost:3306";
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
