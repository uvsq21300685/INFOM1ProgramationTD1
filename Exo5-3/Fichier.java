
public class Fichier extends Composant
{
    private int taille;

    public Fichier(String nom, int taille)
    {
        this.setNom(nom);
        this.taille = taille;
    }

    public int calculTaille()
    {
        return taille;
    }
}
