
public class memur extends insan {

    int maas;
    int zam;

    public memur(String isim, int boy, int kilo, String göz, String sacrenk,int maas,int zam) {
        super(isim, boy, kilo, göz, sacrenk);
        this.maas = maas;
        this.zam = zam;
        zam = 0;
    }
    
    void zamyap(int zam){
        
        this.zam = zam;
        maas += zam;
        System.out.println(zam+" şu kadar zam yapılmıştır "+"Güncel maaş: "+maas);
          
    }
    
    public void durum(){
        
        System.out.println("**************");
        //super.durum(); insan class ındaki durum fonksiyonunu getirir...
        System.out.println("İsim: "+isim+" Boy: "+boy+" Kilo: "+kilo+" Göz rengi: "+göz+" Saç rengi: "+sacrenk+" Maaş: "+maas);
        System.out.println("**************");
    }
    
    public void yemekye(){
        
        System.out.println("**************");
        System.out.println("Yemek yeniyor...");
        System.out.println("**************"); 
        System.out.println("50TL ödeniyor...");
        System.out.println("**************"); 
        maas -=50;
        kilo = kilo + 1;       
        System.out.println("Son kilo: "+kilo);
        System.out.println("**************");
        System.out.println("Son bakiye: "+maas);
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
        System.out.println("250TL ödeniyor...");
        maas -=250;
        System.out.println("Son bakiye: "+maas);
    }
    
    public void sütic(){
        
        System.out.println("**************");
        System.out.println("Süt içiliyor...");
        System.out.println("**************");
        System.out.println("10TL ödeniyor...");
        System.out.println("**************");
        boy = boy + 1;
        maas -=10;       
        System.out.println("Son boy: "+boy);
        System.out.println("**************");
        System.out.println("Son bakiye: "+maas);
        System.out.println("**************");
    }  
    
}
