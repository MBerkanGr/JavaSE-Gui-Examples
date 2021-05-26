
public abstract class sekil {
    
    private String isim;

    public sekil(String isim) {
        this.isim = isim;
    }
    
    public void isminisöyle(){
        
        System.out.println("Bu obje "+ isim + "objedir");
        
    }
    abstract void alanhesapla();

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
        
        
        
    
}
