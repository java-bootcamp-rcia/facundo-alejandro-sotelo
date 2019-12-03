package demo.extension;

import demo.extension.proxxy.DbEntidad.TrueDB;
import demo.extension.proxxy.DbEntidad.TrueDbProxxy;

public class Main {

    public static void main(String[] args) {


        //Ejemplo Singleton
        //System.out.println(Conexion.getInstance("root","","mydb").getMensaje());


        //Factory
        //FactoryBD fact = new FactoryBD();
        //FactoryRest rest = new FactoryRest();

        //System.out.println(fact.getBD("SQL").conectar());
        //System.out.println(rest.getURL("http::Ventas").recibirURL("Ventas"));



        //Proxxy
        TrueDbProxxy trb = new TrueDbProxxy();

        System.out.println(trb.conectar("mydb","3306","").toString());


    }
}
