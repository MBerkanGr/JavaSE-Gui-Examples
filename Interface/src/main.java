
public class main {
    
    public static void main(String[] args) {
        
        IMuhendis muhendis1 = new Pcmuhendis(false, false);
        
        /*
        muhendis1.askerlikdurum();
        muhendis1.adlisicil();
        System.out.println(muhendis1.mezuniyet_ort(3.01));
        
        String[] tecrübe = {"Vestel","Havelsan","Turksat"};
        muhendis1.istecrube(tecrübe);
        */
        
        Makinamuhendisi muhendis2 = new Makinamuhendisi(true, false); //Muhendis olamazdı çünkü referansgetir fonksiyonu orada yok
        
        String[] tecrube = {};
        String[] referans = {"Mehmet Berkan","Saygıner"};
        
        muhendis2.askerlikdurum();
        muhendis2.adlisicil();
        muhendis2.istecrube(tecrube);
        muhendis2.referansgetir(referans);
        System.out.println(muhendis2.mezuniyet_ort(2.0));
        
        muhendis2.calıs();
        
        
              
        
        
    }
    
}
