import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;


public class Serveur
{
    public LinkedList clients;
    
    public Serveur()
    {
      clients = new LinkedList(); 
    }

    public boolean connecter(Client client)
    {
        clients.add(client);
        return true;
    }
     
    public void diffuser(String message)
    {
        int i;
        Client tmp;
        for(i=0 ; i< clients.size() ; i++);
        {
            tmp=(Client) clients.get(i);
            tmp.recevoir(message);
   
        }
    }
}
