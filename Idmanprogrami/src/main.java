
import java.util.Scanner;


public class main {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("********************");
        System.out.println("HOŞGELDİNİZ");
        System.out.println("********************");
        
        String idmanlar = "Geçerli hareketler...\n"
                + "Burpee\n"
                + "Pushup(şınav)\n"
                + "Situp(mekik)\n"
                + "Squad\n";
        
        System.out.println(idmanlar);
        System.out.println("*********************");
        
        System.out.println("Bir idman oluşturun...");
        
        System.out.print("Burpee sayısı: ");
        int burpee = scanner.nextInt();
        
        System.out.print("Pushup sayısı: ");
        int pushup = scanner.nextInt();
        
        System.out.print("Situp sayısı: ");
        int situp = scanner.nextInt();
        
        System.out.print("Squad sayısı: ");
        int squad = scanner.nextInt();
        
        scanner.nextLine();
        
        
        idman idman = new idman(burpee, pushup, situp, squad);
        
        System.out.print("İdmanınız başlıyor...");
        
        while(idman.idmanbittimi()== false){
            
            System.out.print("Hareket türü (burpee , pushup , situp , squad) : ");
            String tur = scanner.nextLine();
            
            System.out.print("Bu hareketten kaç tane yapmak istiyorsunuz : ");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketyap(tur, sayi);
            
            
        }
        System.out.println("***************************");
        System.out.println("***************************");
        System.out.println("TEBRİKLER İDMAN BİTTİ");
        System.out.println("***************************");
        System.out.println("***************************");
        
        
    }
    
}
