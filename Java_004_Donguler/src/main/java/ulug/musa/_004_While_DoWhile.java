package ulug.musa;

public class _004_While_DoWhile
{
    public static void main(String[] args)
    {
        System.out.println("---------FOR---------");
        for(int i = 0; i<10 ; i++)
        {
            System.out.println(i);

        }

        /*  for sonsuz döngü rami bitirene kadar çalışır
        for( ; ; ;){
        }
         */

        System.out.println("----------ForEach----------");

        int[] sayilar = {0,1,2,3,4,5,6,7,8,9};

        for(int sayi : sayilar)
        {

            System.out.println(sayi);

        }


        System.out.println("----------While----------");

        int i = 0;

        while(i<10)
        {
            System.out.println(i);

            i++;
        }

        System.out.println("----------DoWhile----------");

        int a = 0;

        do
        {
            System.out.println(a);
            a++;

        } while (a < 10);



















        


    }

}
