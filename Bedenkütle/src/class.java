
import java.util.Scanner;


public class sınıff 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Boyunuzu yazınız.(metre cinsinde): ");
        double boy = scanner.nextDouble();
        System.out.println("Kilonuzu yazınız: ");
        double kilo = scanner.nextDouble();
        
        double bki = kilo / (boy*boy);
        System.out.println(bki);
        
        if(bki < 18.5){
            
            System.out.println("ZAYIF");                    
    }
        else if (bki >= 18.5 && bki < 25){
            
            System.out.println("NORMAL");
        }
        else if (bki >= 25 && bki < 30){
            
            System.out.println("FAZLA KİLOLU");
        }
        else if (bki >= 30 ){
            
            System.out.println("OBEZ");
        }
        
    }
}
