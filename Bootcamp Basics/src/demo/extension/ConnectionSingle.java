package demo.extension;

public final class ConnectionSingle {

    private static ConnectionSingle getter;

    private String message;



    private ConnectionSingle(String connect){
        this.message = connect;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }

    public static ConnectionSingle getInstance(String root, String pass, String nameDb){
        if("root".equalsIgnoreCase(root) && "mydb".equalsIgnoreCase(nameDb)){
            return getter = new ConnectionSingle("Connection successful");
        }
        return getter = new ConnectionSingle("Without connection");
    }



}
