
public class Fraction 
{
    
    private final int numerateur;
    private final int denominateur;
    
    static Fraction ZERO = new Fraction();
    static Fraction UN = new Fraction(1, 1);

    public Fraction(int numerateur, int denominateur)
    {
        this.numerateur = numerateur;
        this.denominateur = denominateur;
    }
    
    public Fraction(int numerateur)
    {
        this(numerateur, 1);
    }
    
    public Fraction()
    {
        this(0, 1);
    }
    
    public int getNumerateur()
    { 
        return numerateur; 
    }
    
    public int getDenominateur()
    {
        return denominateur; 
    }
    
    public double getValue()
    { 
        return ((double) numerateur / (double) denominateur); 
    }
    
    public static int calculePgcd(int a,int b) {
        int reste = a;
        
        while (reste != 0) {
            reste = a%b;
            a=b;
            b=reste;
        }
        return a;
    }
    
    public static Fraction fractionReduite(int numerateur, int denominateur)
    {
        int pgcd = calculePgcd(numerateur, denominateur);
        numerateur= numerateur/pgcd;
        denominateur = denominateur/pgcd;
        return new Fraction(numerateur, denominateur);
    }
    
    public Fraction addition(Fraction fraction)
    {
        return fractionReduite(numerateur * fraction.denominateur + denominateur * fraction.numerateur, denominateur * fraction.getDenominateur());
    }
    
    public boolean sontEgales(Object objet)
    {
        if(objet instanceof Fraction) {
            Fraction fraction1 = fractionReduite(numerateur, denominateur);
            Fraction fraction2 = fractionReduite(((Fraction) objet).getNumerateur(), ((Fraction) objet).getDenominateur());
            
            return fraction1.getNumerateur() == fraction2.getNumerateur() && fraction1.getDenominateur() == fraction2.getDenominateur();
        }
        else {
            return false;
        }
    }
   
    
    public boolean comparerFraction(Fraction fraction1, Fraction fraction2)
    {
        int f1 = fraction1.getNumerateur() * fraction2.getDenominateur(); 
        int f2 = fraction2.getNumerateur() * fraction1.getDenominateur();
        
        if(f1 == f2){
            return true;
        }
        return false;
    }
}
