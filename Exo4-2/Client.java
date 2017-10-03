
public class Client
{
    private String nom;
    private Serveur serveur;
    
    public Client(String nom)
    {
      this.nom=nom;
    }

    
    public boolean seConnecter(Serveur serveur)
    {
      serveur.connecter(this);
      this.serveur=serveur;
      return true;
    }
    
    public void envoyer(String message)
    {
        message = this.nom.concat(message);
        serveur.diffuser(message);
    }
    
    public String recevoir(String message)
    {
        return message;
    }
}
