package ulug.musa;

public class AppMain {

    private static void ayir()
    {
        System.out.println("********************************");
    }
    public static void main(String[] args)
    {
        int sayi1 = 10;
        int sayi2 = 20;
        int sayi3 = 30;
        int sayi4 = 40;
        int sayi5 = 50;
        System.out.println(sayi1 + " " + sayi2 + " " + sayi3 + " " + sayi4 + " " + sayi5);

        ayir();

        int[] sayilar = new int [5];   // 5 elemanlı dizinin son indeksi 4' tür.
        sayilar[0] = 100;
        sayilar[1] = 200;
        sayilar[2] = 300;
        sayilar[3] = 400;
        sayilar[4] = 500;
        System.out.println(sayilar[0] + " " + sayilar[1] + " " + sayilar[2] + " "+sayilar[3] + " "+sayilar[4]);

        ayir();

        /*
        sayilar[26] = 123;                      sınırı aşma hatası verir
        System.out.println(sayilar[26]);
         */

        short myArray[] = new short[4];
        // myArray[0] = 100000000; short sınırını aşıyor

        System.out.println(myArray[2]);  // değer verilmediği için varsayılan değeri yani  0 çıktısı verir.

        ayir();

        byte myArrayByteByte[] = {14, 53, 19, 23};
        System.out.println(myArrayByteByte[2]);

        ayir();

        for(int i =0; i < myArrayByteByte.length;i++)
        {
            System.out.println(i +". indeks " + myArrayByteByte[i]);
        }

        ayir();















    }
}