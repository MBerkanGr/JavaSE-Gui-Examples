
public class BeybladeFabrikasi {
    
    public Beyblade beybladeüret(String beybladecituru){
        
        if(beybladecituru.equals("Dragon")){
            return new Dragon("Takao", 800, 300, "Mavi ejderha", "Kutsal canavar ile konuşma");
            
        }
        else if (beybladecituru.equals("Dranza")){
            
            return new Dranza("Kai", 600, 400, "Kırmızı anka kuşu");
        }
        
        else if (beybladecituru.equals("Drayga")){
            
            return new Drayga("Rei", 800, 250, "Beyaz kaplan");
        }
        
        else if (beybladecituru.equals("Draicel")){
            return new Dranza("Max", 400, 1000, "Kara kablumbağa");
        }
        else {
            return null;
        }
    }
    
}
