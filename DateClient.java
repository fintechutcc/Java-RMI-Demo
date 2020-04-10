package th.ac.utcc.computer.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Suparerk Manitpornsut
 * @version 1.0.0
 * @since April 10, 2020
 */
public class DateClient {
    public static void main(String [] args) {
        try {
            DateServer dateServer = (DateServer) Naming.lookup("//localhost/DateServer");
            Date date = dateServer.getDate();
            System.out.println("Date from DateServer: " + date);
        } catch (NotBoundException | MalformedURLException | RemoteException ex) {
            Logger.getLogger(DateClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
