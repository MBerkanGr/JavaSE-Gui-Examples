class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public String konus() {
        
        return "Hayvan konuşuyor...";
    }
    
    public void zıpla(int h){
        
        System.out.println("Hayvan "+h+" zıplıyor");
    }
}
class Kedi extends Hayvan {
    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public void zıpla(int h) {
        super.zıpla(h);
    }
    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }
}
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
        
    }

}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
        
    }   
}

class kurbaga extends Hayvan{

    public kurbaga(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return getIsim() + " vaklıyor... ";
    }
    
  
}
public class Main {
    
    public static void konustur(Hayvan h){
        
        System.out.println(h.konus());
        
    }
    
    
        
    
    public static void main(String[] args) {
        
       /* Hayvan hayvan1 = new Kedi("Tekir");
        Hayvan hayvan2 = new Kopek("Karabaş");
        Hayvan hayvan3  = new At("Şahbatur");
        System.out.println(hayvan1.konus());
        System.out.println(hayvan2.konus());
        System.out.println(hayvan3.konus());*/
       
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Karabs"));
        konustur(new At("Şahbatur"));
        konustur(new kurbaga("Vaklı"));
        
        
    }
}
