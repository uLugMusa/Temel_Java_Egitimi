package ulug.musa;


public class _003_StringMetodu
{
    public static void cizgiCiz()
    {
        System.out.println("-----------------------------");

    }
    public static void main(String[] args)
    {
        String adi = "Musa";

        System.out.println(adi.length());

        if(adi.length()>5)
        {
            System.out.println("EVET");

        }else{
            System.out.println("HAYIR");
        }

        cizgiCiz();

        String adi2 = "Mustafa";
        String adi3 = "Mehmet";

        if(adi2 == adi3)
        {
            System.out.println("EŞİT");
        }else
        {
            System.out.println("DEĞİL");
        }

        cizgiCiz();

        if (adi2.equals(adi3))
        {
            System.out.println("EŞİT");
        }else
        {
            System.out.println("DEĞİL");

        }


        cizgiCiz();
        selamVer("Musa Uluğ");
        cizgiCiz();
        selamVer(adi3);
        cizgiCiz();

        String sonuc =hesabikapat(1, "Merve", "Türk" ,true);
        System.out.println(sonuc);


    }

    private static String hesabikapat(int uyeNo, String adi, String soyadi, boolean uyeDurumu)
    {
        return "İşlem Tamamlandı";

    }

    private static void selamVer(String isim)
    {
        System.out.println("Selamlar Sayın "+isim+" Hoşgeldiniz");
    }
}

