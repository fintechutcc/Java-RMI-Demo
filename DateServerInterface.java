package th.ac.utcc.computer.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Date;

/**
 *
 * @author Suparerk Manitpornsut
 * @version 1.0.0
 * @since April 10, 2020
 */
public interface DateServerInterface extends Remote {
    public Date getDate() throws RemoteException;
}
