package ulug.musa;

import java.util.Scanner;

public class _003_Switch
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);


        System.out.println("Bir harf giriniz :");
        char girilenHarf = scan.next().charAt(0);

        switch (girilenHarf)
        {
            case 'A':
                System.out.println("Girilen harf :" + girilenHarf);

                break;
            case 'B':
                System.out.println("Girilen harf :" + girilenHarf);

                break;
            case 'C':
                System.out.println("Girilen harf :" + girilenHarf);

                break;

            default:
                System.out.println("Girdigin harf bulunamadi");

                break;
        }
    }
}
