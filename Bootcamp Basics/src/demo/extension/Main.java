package demo.extension;

public class Main {

    public static void main(String[] args) {


        //Ejemplo Singleton
        //System.out.println(Conexion.getInstance("root","","mydb").getMensaje());


        FactoryBD fact = new FactoryBD();
        FactoryRest rest = new FactoryRest();

        System.out.println(fact.getBD("SQL").conectar());
        System.out.println(rest.getURL("http::Ventas").recibirURL("Ventas"));

    }
}
