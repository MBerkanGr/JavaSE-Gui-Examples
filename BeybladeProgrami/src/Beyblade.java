
public class Beyblade {
    
    private String beybladeci;
    private int donushizi;
    private int saldiri;

    public Beyblade(String beybladeci, int donushizi, int saldiri) {
        this.beybladeci = beybladeci;
        this.donushizi = donushizi;
        this.saldiri = saldiri;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonushizi() {
        return donushizi;
    }

    public void setDonushizi(int donushizi) {
        this.donushizi = donushizi;
    }

    public int getSaldiri() {
        return saldiri;
    }

    public void setSaldiri(int saldiri) {
        this.saldiri = saldiri;
    }
    
    public void saldir(){
        System.out.println(beybladeci+" "+saldiri+" ve "+donushizi+" saldırıyor ");
        
    }
    
    public void kutsalcanavar(){
        System.out.println("Kutsal canavar yok");
    }
    
    public void bilgigöster(){
        System.out.println("Beybladeci: "+beybladeci);
        System.out.println("Saldırı gücü: "+saldiri);
        System.out.println("Dönüş hızı: "+donushizi);
        
                
        
    }
}
