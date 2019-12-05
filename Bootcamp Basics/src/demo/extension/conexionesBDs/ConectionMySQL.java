package demo.extension.conexionesBDs;

import demo.extension.factory.ConectionBD;

public class ConectionMySQL implements ConectionBD {

    private String user;
    private String cadenaConexion;
    private String nombreBD;

    public ConectionMySQL(){
        this.user = "root";
        this.cadenaConexion = "localhost:3306";
        this.nombreBD = "mydb";
    }


    @Override
    public String conectar() {
        return "Conexion Exitosa";
    }

    @Override
    public String desconectar() {
        return "No se pudo establecer una conexion";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCadenaConexion() {
        return cadenaConexion;
    }

    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }


}
