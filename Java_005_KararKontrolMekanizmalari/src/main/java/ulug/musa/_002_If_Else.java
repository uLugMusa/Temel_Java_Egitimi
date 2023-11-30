package ulug.musa;
import java.util.Scanner;


public class _002_If_Else
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int notu;
        System.out.println("---------IF ELSE----------");

        System.out.println("Sinav notunuzu giriniz :");
        notu = input.nextInt();


        if(notu<100 & notu>=50)
        {
            System.out.println("Gectiniz");


        }else if(notu<50) {

            System.out.println("Kaldiniz");

        }else{
            System.out.println("Gecersiz not girdiniz");
        }

    }
}
