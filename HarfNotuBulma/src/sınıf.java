
import java.util.Scanner;


public class sınıf 
{
    public static void main(String[] args) 
    {
        
        while (true) {
        
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Lütfen quiz notunuzu giriniz: ");
        double quiz = scanner.nextDouble();
        
        System.out.print("Lütfen quiz notunuzu giriniz: ");
        double quiz2 = scanner.nextDouble();
        
        System.out.print("Lütfen vize notunuzu giriniz: ");
        double vize = scanner.nextDouble();
        
        System.out.print("Lütfen final notunuzu giriniz: ");
        double fınal = scanner.nextDouble();
        
        System.out.print("Sınıfın yıl sonu ortalaması nedir? ");
        double sort = scanner.nextDouble();
        
        
        double ort;
        ort = (quiz2*10/100)+(quiz*10/100)+(vize*30/100)+(fınal*50/100);
        
        System.out.println("Ortalamanız: "+ort);
        
        
       
             if (ort > 90)
        {
            System.out.println("AA"); //90 - 100
        }
        else if (ort >= 85)
        {
            System.out.println("AB"); //85 - 90
        }
        else if (ort >= 80)
        {
            System.out.println("BB"); //80 - 85
        }
        else if (ort >= 75)
        {
            System.out.println("BC"); //75 - 80
        }
        else if (ort >= 70)
        {
            System.out.println("CC"); //70 - 75
        }       
        else if (ort >= 60)
        {
            System.out.println("CD"); //60 - 70
        }      
        else if (ort >= 50)
        {
            System.out.println("DD"); //50- 60
        }
        else if (ort >= 40)
        {
            System.out.println("FD"); // 40 - 50
        }
        else if (ort < 40)
        {
            System.out.println("FF"); // 0 - 40
        }
        
        
        
        if (ort > sort)
        {
            System.out.println("TEBRİKLER SINIFI GEÇTİNİZ...");           
        }
        else 
        {
            System.out.println("Malesef kaldınız...");
        }
        
        
        }
        
        
        
        
            
        
        
    }
}
