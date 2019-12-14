/**
 * Creates an object of ConnectionDB and implements certain common behavior
 * Gives a method getConnection to @return this ConnectionBD object
 * And then just Override the toString method returning the same toString in the ConnectionBD class
 */


package demo.extension.builder;

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
