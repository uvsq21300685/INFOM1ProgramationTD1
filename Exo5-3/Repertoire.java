
import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;


public class Repertoire extends Composant
{
    private LinkedList<Composant> composants;

    public Repertoire(String nom)
    {
        this.nom = nom;
        this.composants = new LinkedList();
    }
    
    public boolean contient(Composant composant) {
        Iterator<Composant> it = composants.iterator();
        Composant tmp;
        
        while(it.hasNext()) {
            tmp = it.next();
            
            if(tmp.equals(composant)){
                return true;
            }
            else if(tmp instanceof Repertoire) {
                 if(((Repertoire) tmp).contient(composant)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean ajouter(Composant composant)
    {
        if(this.contient(composant)) {
            return false;
        }
        else if((composant instanceof Repertoire) && (((Repertoire) composant).contient(this))) {
            return false;
        }
        else {
            return composants.add(composant);
        }
    }
    
    public boolean retirer(Composant composant)
    {
        return composants.remove(composant);
    }
    
    public int calculTaille()
    {
        Iterator<Composant> it = composants.iterator();
        int somme = 0;
        
        while(it.hasNext()) {
            somme = somme + it.next().calculTaille(); 
        }
        return somme;
    }
}