
import java.util.Random;
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
      
        
        int sayi1,sayi2,sayi3,rast;
        
        rast = random.nextInt(100);
               
        System.out.print("Lütfen 1.kisi sayı giriniz (0-100) : ");
        
        sayi1 = scanner.nextInt();
        
        System.out.print("Lütfen 2.kisi sayı giriniz (0-100) : ");
        
        sayi2 = scanner.nextInt();
        
       
        
        KimYendi kimyendi = new KimYendi(sayi1, sayi2, rast);
        
        System.out.println("Sayımız: "+rast); 
        
        kimyendi.yenen();
        
        
        
        
        
        
        
        
    }
    
}
