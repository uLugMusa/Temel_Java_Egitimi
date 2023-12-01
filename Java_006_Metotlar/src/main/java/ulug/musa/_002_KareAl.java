package ulug.musa;

public class _002_KareAl
{
    public static void main(String[] args)
    {
        System.out.println("Kare Al");

        System.out.println(kareAl(5,2));

        System.out.println("Topla");
        System.out.println(topla(5,2,10));

    }

    private static float topla(int sayi1,int sayi2,int sayi3)
    {
        return sayi1+sayi2+sayi3;

    }

    private static double kareAl(double taban,double üst)
    {
        return Math.pow(taban,üst);

    }

}
