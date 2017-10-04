public class Main
{
    public static void main(String args[])
    {
        
        Fraction fraction = new Fraction(7,3);
        System.out.println(fraction.getNumerateur());
		System.out.println(fraction.getDenominateur());
		Fraction fraction2 = new Fraction(14,6);
		System.out.println(fraction2.getValue());
		System.out.println(fraction.sontEgales(fraction2));
    }
}