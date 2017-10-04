
public class Main
{
   
    public static void main(String args[])
    {
        
        Serveur s = new Serveur();
        Client c1 = new Client("Azer");
        Client c2 = new Client("Std");
        c1.seConnecter(s);
        c2.seConnecter(s);
        
        Client c3 = new Client("Nima");
        c3.seConnecter(s);
        
        c3.envoyer("Bonjour");
        
    }
}
