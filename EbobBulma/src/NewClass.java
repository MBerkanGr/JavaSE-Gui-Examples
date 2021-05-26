
import java.util.Scanner;


public class NewClass 
{
    public static int EbobBulma(int sayi1 , int sayi2)
    {
        int ebob = 1;
        for (int i=1 ; i <= sayi1 && i <= sayi2 ; i++)
        {
           if( ( sayi1 % i == 0 ) && ( sayi2 % i == 0) ){
               
               ebob = i;
           }
            
        }
        return ebob;
    }
    
    
    public static void main(String[] args) 
    {
     Scanner scanner = new Scanner (System.in);
     
        System.out.print("1. SAYI = ");
        int sayi1 = scanner.nextInt();
        System.out.print("2.SAYI = ");
        int sayi2 = scanner.nextInt();
        
        System.out.println(sayi1+" ve "+sayi2+" ebobu = "+EbobBulma(sayi1, sayi2));
        
    }
}
