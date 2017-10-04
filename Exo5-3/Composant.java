
public abstract class Composant
{
    private String nom;
    
    abstract int calculTaille();
    
    public String getNom() 
    {
        return nom;
    }
    
    public void setNom(String nom)
    { 
    this.nom = nom; 
    }
    
}