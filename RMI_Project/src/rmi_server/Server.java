package rmi_server;
import rmi_client.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;

public class Server {
    public static void main(String args[]){
        try{
            Registry reg=LocateRegistry.createRegistry(1011);
            BS_I_Implement bs= new BS_I_Implement();
            reg.rebind("Services", bs);
            System.out.println("Server konektovan!");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
