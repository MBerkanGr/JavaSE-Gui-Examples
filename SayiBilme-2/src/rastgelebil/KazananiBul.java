
package rastgelebil;

import java.util.logging.Level;
import java.util.logging.Logger;

public class KazananiBul {
    
    int kisi1;
    int kisi2;
    int rast;
    String samp;
    
    static int scor1 = 0;
    static int scor2 = 0;
    
    
    public KazananiBul(int kisi1,int kisi2,int rast){
        this.kisi1 = kisi1;
        this.kisi2 = kisi2;
        this.rast = rast;
    }
    
    public void bul(){
        
        int f1,f2;
        
        f1 = rast-kisi1;
        f2 = rast-kisi2;
        
        f1 = Math.abs(f1);
        f2 = Math.abs(f2);
        
        
        
        try {       
                
                System.out.println("A'nın sayısı: "+kisi1);
                Thread.sleep(1000);
                System.out.println("B'nın sayısı: "+kisi2);
                Thread.sleep(1000);
                
            
            
                System.out.println("SON 3...");
                Thread.sleep(1000);
                System.out.println("SON 2...");
                Thread.sleep(1000);
                System.out.println("SON 1...");
                Thread.sleep(1000);
                
                if(f1 < f2){
            System.out.println("Kazanan A ");
            scor1++;
            }
        
            else if (f1 > f2){
                System.out.println("Kazanan B ");
                scor2++;
            }
        
            else{
                System.out.println("Kazanan YOK");
            }
                
                System.out.println("Skorlar: " + "A: "+ scor1+" B: "+scor2);
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(RastgeleBil.class.getName()).log(Level.SEVERE, null, ex);
            }       
        
        System.out.println("******************************************************");
        System.out.println("******************************************************");
        
        
        
    }
    
    
}
