package demo.extension.factory;

public interface AbstractFactory {

    ConectionBD getBD(String motor);
    ConectionRest getURL(String url);

}
