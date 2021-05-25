
public class Dragon extends Beyblade{
    
    private String kutsalcanavar;
    private String gizliyetenek;
    
    public Dragon(String beybladeci, int donushizi, int saldiri,String kutsalcanavar,String gizliyetenek)
    {
            
            super(beybladeci, donushizi, saldiri);
            this.kutsalcanavar = kutsalcanavar;
            this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void bilgigöster() {
        super.bilgigöster(); 
        System.out.println("Kutsal canavar: "+kutsalcanavar);  
        System.out.println("Gizli yetenek: "+gizliyetenek);
    }

    @Override
    public void kutsalcanavar() {
    
        System.out.println(getBeybladeci()+" "+kutsalcanavar+" ı çıkarıyor");
        System.out.println(getBeybladeci()+" ın saldırısı: Hayalet kasırgası");
    
    }
    
}
