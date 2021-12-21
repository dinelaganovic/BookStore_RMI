package rmi_client;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class BS_I_Implement extends UnicastRemoteObject implements BS_Interface{

    public BS_I_Implement()throws RemoteException {
         super();
    }
    
    @Override
    public String SearchName(String nazivKnjige) throws RemoteException {
        String tekst = null;
        String k1="Imancipacija";
        String k2="Djela srca";
        String k3="Vjera je savjet";
        String k4="Fenix";
        String k5="Jaka si najlepša";
        if(nazivKnjige.equals(k1)==true){
            tekst="Pisac: Hanka Vlahovljak\n" +
"ISBN:\n" +
"9789926836313\n" +
"\n" +
"Cijena:\n" +
"30KM\n" +
"\n" +
"Izdavač:\n" +
"Udruženje Oaza\n" +
"\n" +
"Dostupnost:\n" +
"na stanju\n" +
"\n" +
"Šifra:\n" +
"B3989\n" +
"\n" +
"Broj strana:\n" +
"515\n" +
"\n" +
"Težina:\n" +
"692 g";
        }else if(nazivKnjige.equals(k2)==true){
            tekst="Pisac: mr. Hajrudin Tahir Ahmetović\n" +
"ISBN:\n" +
"9789926836323\n" +
"\n" +
"Cijena:\n" +
"20KM\n" +
"\n" +
"Izdavač:\n" +
"Udruženje Oaza\n" +
"\n" +
"Dostupnost:\n" +
"na stanju\n" +
"\n" +
"Šifra:\n" +
"B39898\n" +
"\n" +
"Broj strana:\n" +
"420\n" +
"\n" +
"Težina:\n" +
"492 g";
        }else if(nazivKnjige.equals(k3)==true){
           tekst="Pisac: mr. Hajrudin Tahir Ahmetović\n" +
"ISBN:\n" +
"9789926836333\n" +
"\n" +
"Cijena:\n" +
"50KM\n" +
"\n" +
"Izdavač:\n" +
"Udruženje Oaza\n" +
"\n" +
"Dostupnost:\n" +
"na stanju\n" +
"\n" +
"Šifra:\n" +
"B39879\n" +
"\n" +
"Broj strana:\n" +
"387\n" +
"\n" +
"Težina:\n" +
"372 g";
        }else if(nazivKnjige.equals(k4)==true){
           tekst="Pisac: Amra Halilović\n" +
"ISBN:\n" +
"9789926836343\n" +
"\n" +
"Cijena:\n" +
"15KM\n" +
"\n" +
"Izdavač:\n" +
"Udruženje Oaza\n" +
"\n" +
"Dostupnost:\n" +
"na stanju\n" +
"\n" +
"Šifra:\n" +
"B3959\n" +
"\n" +
"Broj strana:\n" +
"225\n" +
"\n" +
"Težina:\n" +
"300 g";
        }else if(nazivKnjige.equals(k5)==true){
            tekst="Pisac: Sara Sabri\n" +
"ISBN:\n" +
"9789926836353\n" +
"\n" +
"Cijena:\n" +
"10KM\n" +
"\n" +
"Izdavač:\n" +
"Udruženje Oaza\n" +
"\n" +
"Dostupnost:\n" +
"na stanju\n" +
"\n" +
"Šifra:\n" +
"B3939\n" +
"\n" +
"Broj strana:\n" +
"180\n" +
"\n" +
"Težina:\n" +
"192 g";
        }else
        {
            tekst="Knjiga nije dostupna! \n"+"Proverite unete podatke!";
        }
        return tekst;
    }
    
}
