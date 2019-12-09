/**
 * Works like a model to the classes that implement this interface
 *
 */


package demo.extension.factory;

public interface AbstractFactory {

    ConnectionBD getBD(String motor);
    ConnectionRest getURL(String url);

}
