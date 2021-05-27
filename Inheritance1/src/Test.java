
public class Test {
    
    public static void main(String[] args) {
        
        // IS-A 
        
        Yonetici yonetici1 = new Yonetici("Koray Altay", 2500, "IT",10);
        yonetici1.bilgilerigoster();
        //yonetici1.zam_yap(200);
        
        Calisan calisan1 = new Calisan("Mehmet Berkan ", 2650, "IT");
        calisan1.bilgilerigoster();
        
    }
    
}
