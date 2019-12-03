package demo.extension.factory;

public interface AbstractFactory {

    IConexionBD getBD(String motor);
    IConexionREST getURL(String url);

}
