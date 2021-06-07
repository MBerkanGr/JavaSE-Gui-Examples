
import java.awt.HeadlessException;
import javax.swing.JFrame;


public class OyunEkrani extends JFrame {

    public OyunEkrani(String title) throws HeadlessException {
        super(title);
    }
    
    
    
    public static void main(String[] args) {
        
        OyunEkrani ekran = new OyunEkrani("Uzay Oyunu");
        
        ekran.setResizable(false);  //Boyutlandırma
        
        ekran.setFocusable(false);  //Bütün işlemlerin JPanelde olması için JFrame değil
        
        ekran.setSize(800, 600);    //Ekran boyutlandrıma
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  //Kapat tuşunda kapatma
        
        Oyun oyun = new Oyun();
        
        oyun.requestFocus();        //Artık klavye tuşları oyun da etkili olacak 
        
        oyun.addKeyListener(oyun);  //Klavyeden işlemleri almayı sağlar
        
        oyun.setFocusable(true);    //Bütün işlemlerin panelde olmasını sağlıyor
        
        oyun.setFocusTraversalKeysEnabled(false);    //Klavye işlemlerini panelin anlaması için kullanılıyor
        
        ekran.add(oyun);  //Ekrana oyunu ekleme (paneli) 
        
        ekran.setVisible(true);     //Ekran görünürlüğü
            
    }
    
}
