
import java.util.Scanner;


public class atm 
{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1.BAKİYE ÖĞRENME\n"
                + "2.İŞLEM PARA ÇEKME\n"
                + "3.İŞLEM PARA YATIRMA\n"
                + "4.İŞLEM ÇIKIŞ (Q) BASIN";
        
        System.out.println("******************");
        System.out.println(islemler);
        System.out.println("******************");
        
        
        while (true) {

            
            System.out.print("İşlemi seçin: "); 
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                System.out.println("SİSTEMDEN ÇIKILIYOR...");
                break;
                
            }
            else if (islem.equals("1")){
                
                System.out.println(bakiye);
                
            }
            else if (islem.equals("2")){
                
                System.out.print("çekmek istediğiniz miktarı giriniz: ");
                int a = scanner.nextInt();
                if(bakiye - a < 0){
                    
                    scanner.nextLine(); //hata yı engellemek için 
                    System.out.println("YETERLİ BAKİYE YOK  "+"BAKİYENİZ: "+bakiye);
                }
                else{
                    
                    bakiye -=a;
                    scanner.nextLine();
                    System.out.println(bakiye + " TL KALDI");
                }
                
                
                
                
            }
            else if (islem.equals("3")){
                
                System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
                int b = scanner.nextInt();
                
                bakiye+=b;
                scanner.nextLine();
                System.out.println("YENİ BAKİYENİZ: " + bakiye);
                
            }
            else{
                
                System.out.println("HATALI İŞLEM KONTROL EDİNİZ...");
            }
                
            
            
            
        }
        
        
        
        
    }
}
