package demo.extension;

public final class ConexionSingle {

    private static ConexionSingle getter;

    private String mensaje;



    private ConexionSingle(String conexion){
        this.mensaje = conexion;
    }

    public String getMensaje() {
        return mensaje;
    }

    private void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public static ConexionSingle getInstance(String root, String pass, String nameDb){
        if(root.equalsIgnoreCase("root") && pass.equalsIgnoreCase("") && nameDb.equalsIgnoreCase("mydb")){
            return getter = new ConexionSingle("Conexion exitosa");
        }
        return getter = new ConexionSingle("Sin Conexion");
    }



}
