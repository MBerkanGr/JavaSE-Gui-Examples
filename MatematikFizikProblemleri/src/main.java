
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Matematik ile fizik problemleri programına hoşgeldiniz...");
        
        String islemler = "işlemler\n"
                + "1. Daire alanı hesaplama\n"
                + "2. üçgen çevresi hesaplama\n"
                + "3. İç çarpım hesaplama\n"
                + "çıkış q ya basın";
        
        while (true) {

            System.out.println(islemler);
            System.out.println("İşlemi seçiniz: ");
            String islem = scanner.nextLine();
            
            if(islem.equals("q")){
                System.out.println("Programdan çıkılıyor...");
                break;
            }
            else if (islem.equals("1")){
                
                System.out.println("Dairenin yarı çapı: ");
                int yaricap = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.dairealan(yaricap);
                
            }
            else if(islem.equals("2")){
                
                System.out.print("Kenar 1: ");
                int kenar1 = scanner.nextInt();
                
                System.out.print("Kenar 2: ");
                int kenar2 = scanner.nextInt();
                
                System.out.print("Kenar 3: ");
                int kenar3 = scanner.nextInt();
                scanner.nextLine();
                
                Problem.Matematik.ucgencevresi(kenar1, kenar2, kenar3);

            }
            else if (islem.equals("3")){
                
                Vec vec1 = new Vec("Vektör 1");
                Vec vec2 = new Vec("Vektör 2");
                
                Problem.Fizik.iccarpım(vec1, vec2);
                               
            }
            else{
                System.out.println("Geçersiz işlem...");
            }
            
        }
        
        
        
    }
    
}
