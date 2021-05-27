
public class Makinamuhendisi implements IMuhendis,Icalısma {

    @Override
    public void calıs() {
        System.out.println("Makine mühendisi çalışıyor");
    }

    private boolean askerlik;
    private boolean adlisicil;

    public Makinamuhendisi(boolean askerlik, boolean adlisicil) {
        this.askerlik = askerlik;
        this.adlisicil = adlisicil;
    }
    
    
    
    @Override
    public void askerlikdurum() {
        
        if(askerlik){
            System.out.println("Askerliğimi yaptım.");
        }
        else{
            System.out.println("Askerliğimi yapmadım.");
        }
        
    }

    @Override
    public String mezuniyet_ort(double derece) {
        
        return "Ortalama: " + derece;
        
    }

    @Override
    public void adlisicil() {
        
        if(adlisicil){
            System.out.println("Adli sicil kaydım bulunuyor");
        }
        else{
            System.out.println("Herhangibir adli sicil kaydım yok");
        }
        
    }

    @Override
    public void istecrube(String[] array) {
        
        if(array.length == 0){
            System.out.println("iş tecrübe yok");
        }
        else{
            System.out.println("Makine mühenisi olarak şu şirketlerde çalıştım: ");
            for (int i = 0;i<array.length;i++){
                
                System.out.println(array[i]);
                
            }
        }
    }
    
    public void referansgetir(String[] array){
        
        if(array.length==0){
            System.out.println("Herhangi bir referansım yok");
        }
        else{
            System.out.println("Referanslarım...");    
            for (int i = 0;i<array.length ;i++){
                
                    System.out.println(array[i]);
                
            }
            
                
        }
    }
    
    
    
}
