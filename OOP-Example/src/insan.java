
import java.util.Scanner;


public class insan {
    Scanner scanner = new Scanner(System.in);
    
    String isim;    
    int boy;
    int kilo;
    String göz;
    String sacrenk;

    public insan(String isim, int boy, int kilo, String göz, String sacrenk) {
        this.isim = isim;
        this.boy = boy;
        this.kilo = kilo;
        this.göz = göz;
        this.sacrenk = sacrenk;
    }

    

    
    public void durum(){
        
        System.out.println("**************");
        System.out.println("İsim: "+isim+" Boy: "+boy+" Kilo: "+kilo+" Göz rengi: "+göz+" Saç rengi: "+sacrenk);
        System.out.println("**************");
    }
    
    public void yemekye(){
        
        System.out.println("**************");
        System.out.println("Yemek yeniyor...");
        System.out.println("**************");             
        kilo = kilo + 1;       
        System.out.println("Son kilo: "+kilo);
        System.out.println("**************");
        
    }
    
    public void sporyap(){
        
        System.out.println("**************");
        System.out.println("Spor yapılıyor...");
        System.out.println("**************");
        kilo = kilo - 1;
        System.out.println("Son kilo: "+kilo);
        System.out.println("**************");
    }
    
    public void sütic(){
        
        System.out.println("**************");
        System.out.println("Süt içiliyor...");
        System.out.println("**************");
        boy = boy + 1;
        System.out.println("Son boy: "+boy);
        System.out.println("**************");
    }
    
    public void lensal(){
        System.out.println("**************");
        System.out.println("Lens almaya gidliyor...");
        System.out.println("**************");
        System.out.print("Hangi renk ? ");     
        this.göz = scanner.nextLine();
        System.out.println("Göz renginiz: "+göz);
        System.out.println("**************");
    }  
    
    
}
