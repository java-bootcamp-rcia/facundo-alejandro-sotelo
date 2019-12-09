/**
 * Class that uses an object from ConnectionBuilder
 * Interacts with the object from ConnectionBuilder to make use of its methods
 * In order to do this, ConnectionDirector just creates a couple of "dummy" methods
 * That only calls the methods from the object
 */


package demo.extension.builder;

public class ConnectionDirector {

    private ConnectionBuilder cb;

    public ConnectionDirector(ConnectionBuilder cb){
        this.cb = cb;
    }

    @Override
    public String toString() {
        return this.cb.toString();
    }

    public ConnectionDB getDB(){
        return this.cb.getConnection();
    }

    public String getConnection(String host, String pass, String user){
        return this.cb.connect(host, pass, user);
    }

    public String getDisconnection(){
        return this.cb.disconnect();
    }



}
