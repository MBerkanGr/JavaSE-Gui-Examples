
import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.println("*******************");
        System.out.println("HOŞGELDİNİZ KARAKTER OLUŞTURULUYOR...");
        System.out.println("*******************");
        System.out.print("İsim: ");
        String isim = scanner.nextLine();
        System.out.print("Boy: ");
        int boy = scanner.nextInt();
        System.out.print("Kilo: ");
        int kilo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Göz rengi: ");
        String göz = scanner.nextLine();
        System.out.print("Saç rengi: ");
        String sacrengi = scanner.nextLine();
        System.out.print("Maaş: ");
        int maas = scanner.nextInt();
        
        
        
        
        
       memur memur1 = new memur(isim, boy, kilo, göz, sacrengi, maas, 0);
        
        while (true) {            
        
        
        System.out.println("*******************");
        String islem = "1.işlem Durum öğrenme \n"
                + "2.işlem spor yapma\n"
                + "3.işlem yemek ye\n"
                + "4.işlem süt içmek\n"
                + "5.işlem lens almak\n"
                + "6.işlem zam yapmak\n"
                + "0 a basarak çıkış yaparsınız...";
        System.out.println("*******************");
        System.out.println(islem);
        System.out.print("Lütfen işlem seçin: ");
        int islemsec = scanner.nextInt();
        System.out.println("*******************");
        
        if(islemsec == 1){
            memur1.durum();
            
        }
        else if(islemsec == 2){
            memur1.sporyap();
            
        }
        
        else if(islemsec == 3){
            memur1.yemekye();
            
        }
        else if(islemsec == 4){
            memur1.sütic();
        }
        else if(islemsec == 5){
            
            
            memur1.lensal();
        }
        else if(islemsec == 6){
            System.out.print("Ne kadar zam yapıalcak? ");
            int zam = scanner.nextInt();
            memur1.zamyap(zam);
        }
        
        else if (islemsec == 0){
            
            break;
        }
        else{
            System.out.println("Yanlış işlem seçeneği...");
        }
        
        }
        
    }
    
}
