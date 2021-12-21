package rmi_client;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface BS_Interface extends Remote{
    public String SearchName(String name) throws RemoteException;
}
