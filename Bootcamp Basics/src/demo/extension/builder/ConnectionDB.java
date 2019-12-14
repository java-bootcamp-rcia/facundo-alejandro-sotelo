/**
 * Class that provides an entity to do a builder connection by several different classes
 * It receives the host, pass and the actual user, to match a concrete connection or database
 * toString method that @return the running host for this instance and the user using that host
 */


package demo.extension.builder;

public class ConnectionDB {

    private String host;
    private String pass;
    private String user;

    public ConnectionDB(String host, String pass, String user){
        this.host = host;
        this.pass = pass;
        this.user = user;
    }

    @Override
    public String toString() {
        return "Running in host: "+this.host+" with the user: "+user;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
