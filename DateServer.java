package th.ac.utcc.computer.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suparerk Manitpornsut
 * @version 1.0.0
 * @since April 10, 2020
 */
public class DateServer extends UnicastRemoteObject 
        implements DateServerInterface {

    public DateServer() throws RemoteException {
        super();
    }
    
    @Override
    public Date getDate() throws RemoteException {
        return new Date();
    }
    
    public static void main(String [] args) {
        try {
            DateServer dateServer = new DateServer();
            Naming.rebind("//localhost/DateServer", dateServer);
        } catch (MalformedURLException | RemoteException ex) {
            Logger.getLogger(DateServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
