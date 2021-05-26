
public class kare extends sekil{

    private int kenar;
    
    public kare(String isim,int kenar){
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alanhesapla() {
        
        System.out.println(getIsim()+" alanı: "+ (kenar*kenar) );
        
        
    }
    public void cevrehesapla(){
        System.out.println(getIsim()+" çevresi: "+(kenar*4));
    }
    
    
    
}
