
public class ChaineCryptee
{
    private String enClair;
    private int decalage;
    
    private ChaineCryptee(String enClair, int decalage)
    {
        StringBuffer str = new StringBuffer(); 
        String enClairMaj = enClair.toUpperCase(); //toUpperCase: passe tout les caractère en majuscule
        int i;
        
        if(enClair != null) {
            for(i = 0; i <enClair.length(); i++) {
                str.append(decaleCaractere(enClairMaj.charAt(i), decalage));
            }
        }
        this.enClair = str.toString();
        this.decalage = decalage;
    }
    
    public static ChaineCryptee Crypter(String enClair, int decalage) { 
        
        StringBuilder str = new StringBuilder();
        String enClairMaj = enClair.toUpperCase();
        int i;
        
        if(enClair != null) {
            for(i = 0; i < enClair.length(); i++) {
                str.append(decaleCaractere(enClairMaj.charAt(i), - decalage));
            }
        }
        ChaineCryptee ch = new ChaineCryptee(str.toString(), decalage);
        return ch;
    }
    
    public static ChaineCryptee Decrypter(String enClair, int decalage) {
        ChaineCryptee ch = new ChaineCryptee(enClair, decalage);
        return ch;
    }

    public String decrypte()
    {
        StringBuilder str = new StringBuilder();
        String enClairMaj = enClair.toUpperCase();
        int i;
        
        for(i = 0; i < enClair.length(); i++) {
            str.append(decaleCaractere(enClairMaj.charAt(i), - decalage));
        }
        return str.toString();
    }
    
    
    private static char decaleCaractere(char c, int decalage) {
            return (c < 'A' || c > 'Z' ) ? c : (char) ((( c - 'A' + decalage) % 26) + 'A');
    }
    

    public String crypte()
    {
        return enClair;
    }
}
