
package rastgelebil;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RastgeleBil {

  
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int el;
        int rast;
        
        rast = random.nextInt(100)+1;
        
        System.out.print("Kaç el atılsın: ");
        el = scanner.nextInt();
        
        int kisi1,kisi2;
        
        
           
        for(int i = 0; i < el ; i++){
        
        System.out.print("A kişisi sayını sec: ");
        kisi1 = scanner.nextInt();
        
        System.out.print("B Kişisi sayını sec: ");
        kisi2 = scanner.nextInt();
        
        KazananiBul kazananiBul = new KazananiBul(kisi1, kisi2, rast);
    
        System.out.println("Sayımız: "+rast);
        
        kazananiBul.bul();
        
        } 
        
        if(KazananiBul.scor1 > KazananiBul.scor2){
            System.out.println("ŞAMPİYON: "+"A KİŞİSİ");
        }
        else if(KazananiBul.scor1 < KazananiBul.scor2){
            System.out.println("ŞAMPİYON: "+"B KİŞİSİ");
        }
        
    }
    
}
