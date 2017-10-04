public class Main
{
   
    public static void main(String args[])
    {
        Fichier fichier = new Fichier("monFichier",32);    
        Fichier fichier2 = new Fichier("monAutreFichier",64);
        Fichier fichier3 = new Fichier("monDernierFichier",32);
        Repertoire repertoire = new Repertoire("monRepertoire");
        System.out.println(fichier.calculTaille());
        System.out.println(fichier2.calculTaille());
        System.out.println(fichier3.calculTaille());
        repertoire.ajouter(fichier);
        repertoire.ajouter(fichier2);
        repertoire.ajouter(fichier3);
        System.out.println(repertoire.calculTaille());
    }
}