
import java.util.Scanner;


public class faktoriyel {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        System.out.println("Lütfen faktoriyelini almanızı gereken sayıyı giriniz.");
        
        int faktoriyel = 1;
        
        int sayi = scanner.nextInt();
        
        for (int i = 1 ; i <= sayi ; i++){
            
            faktoriyel = i * faktoriyel;
            
        }
        
        System.out.println("FAKTORİYEL:" + faktoriyel);
        
    }
    
}
