/**
 * works like a DAO in order to give a structure to implement certain common functionalities
 * To those classes that implements this interface
 * This just don't have the persistence part
 */

package demo.extension.factory;

public interface ConnectionBD {

    String connect();
    String disconnect();

}
