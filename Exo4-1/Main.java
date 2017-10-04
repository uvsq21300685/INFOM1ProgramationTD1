public class Main
{
    
    public static void main(String args[])
    {
        ChaineCryptee str;
        str = ChaineCryptee.Decrypter( "code" ,5);
        System.out.println(str.crypte());
		System.out.println(str.decrypte());
    }
}
