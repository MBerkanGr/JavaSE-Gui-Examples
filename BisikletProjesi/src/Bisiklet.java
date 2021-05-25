
public class Bisiklet {
    
    private int hiz = 0;
    private int vites = 1;
    private String isim;
    private String model;
    private static int o_bis = 0;
    
    
    
    public Bisiklet(String isim,String model,int vites){
     
        this.isim = isim;
        this.model = model;
        this.vites= vites;
        
    }
    
    void vites_degis(int yeni_vites){
        
        if(vites < yeni_vites) 
        {
            hiz_arttir();
        }         
        else if (vites > yeni_vites ) 
        {
            frenle();
        }
        vites = yeni_vites;
    }
    
    void hiz_arttir(){
        hiz +=5;
    }
    
    void frenle(){
        hiz -=5;
    }
    
    void bilgileri_goster(){
        System.out.println("İSİM: "+isim);
        System.out.println("MODEL: "+model);
        System.out.println("HIZ: "+hiz);
        System.out.println("VİTES: "+vites);
        System.out.println("OLUSTURULAN BİSİKLET: "+o_bis);
    }

    /**
     * @return the vites
     */
    public int getVites() {
        return vites;
    }

    /**
     * @param vites the vites to set
     */
    public void setVites(int vites) {
        if(vites > 7 || 1 > vites ){
            System.out.println("VİTES DEGİSTİRME HATASI");
        }
        else {
            this.vites = vites;
        }
        
    }
    
}
