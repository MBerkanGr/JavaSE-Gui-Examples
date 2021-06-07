
public class KimYendi {
    
    int kisi1;
    int kisi2;
    int kisi3;
    int rast;
    
    
    public KimYendi(int kisi1,int kisi2,int rast){
        this.kisi1 = kisi1;
        this.kisi2 = kisi2;
        this.rast = rast;
    }
    
    public void yenen(){
        int f1 , f2 ;
        
        f1 = kisi1 - rast; 
        f2 = kisi2 - rast;
     
        
        Math.abs(f1);
        Math.abs(f2);
       
        
        if(f1 > f2){
            System.out.println("BİRİNİCİ KİŞİ KAZANDI");
        }
        
        else if (f1 < f2){
            System.out.println("İKİNİCİ KİŞİ KAZANDI");
        }
        
        
        
    }
    
}
