package ulug.musa;

public class AppMain
{
    public static void main(String[] args)
    {

        int sayi0; // 2,147,483,647

        byte yasi1 = 127; // sınır: 127
        short yasi2 = 32000; // sınır: 32767
        int sonuc = yasi1 +yasi2;
        System.out.println(sonuc);


        /*
        byte + byte = int tipindedir
        byte +short = int tipindedir
        short short = int tipindedir
         */


        int deneme1 = 2147483647;
        int deneme2 = 10;
        long sonuc2 = deneme1 + (long)deneme2;
        System.out.println(sonuc2);


        float piSayisi = 3.14f; //  float piSayisi = 3.14F;

        double bankaHesabiBligisi = 12.3456789;

        long hesabBilgisi = 10_000_000; // _ bunu tüm tiplerde kullanabiliriz okunaklı olsun diye kullanırız

        float sayimiz1 = 1;  // virgüllü yazmaszsak çalışır fakat virgülü yazarsak hata verir
        double sayimiz2 = 2;
        double sonucumuz  = sayimiz1 +sayimiz2;
        System.out.println(sonucumuz);







    }

}