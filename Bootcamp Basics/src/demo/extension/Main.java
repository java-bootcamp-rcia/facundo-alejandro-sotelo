package demo.extension;

import demo.extension.builder.ConnectionDirector;
import demo.extension.builder.SQLServerConnect;
import demo.extension.proxxy.DbEntity.TrueDbProxxy;

public class Main {

    public static void main(String[] args) {



        System.out.println(ConnectionSingle.getInstance("root","","mydb").getMessage());

        FactoryBD fact = new FactoryBD();
        FactoryRest rest = new FactoryRest();

        System.out.println(fact.getBD("SQL").connect());
        System.out.println(rest.getURL("http::Sells").getURL("Sells"));




        TrueDbProxxy trb = new TrueDbProxxy();

        System.out.println(trb.connect("mydb","3306","").toString());


        ConnectionDirector cdr = new ConnectionDirector(new SQLServerConnect());
        cdr.getConnection("localhost:3306","","admin");
        System.out.println(cdr.toString());

        System.out.println(cdr.getDisconnection());




    }
}
