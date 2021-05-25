
import java.util.Scanner;


public class test {
    
    public static void main(String[] args) {
        
        System.out.println("Beybalde programına hoşgeldiniz...");
        System.out.println("Çıkış için q ya basın");
        
        Scanner scanner = new Scanner (System.in);
        
        while (true) {
           
            System.out.print("Hangi beyblade üretmek istiyorsunuz? ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Program çıkılıyor...");
                break;
            
            }
            else {
                
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeüret(islem);
                
                if (beyblade == null){
                    
                    System.out.println("GEÇERSİZ İSTEK...");
                }
                else {
                    beyblade.bilgigöster();
                    beyblade.saldir();
                    beyblade.kutsalcanavar();
                    
                }
                
                
            }
            
        }
    }
}
