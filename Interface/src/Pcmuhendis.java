
public class Pcmuhendis implements IMuhendis {
    
    private boolean askerlik;
    private boolean adlisicil;

    public Pcmuhendis(boolean askerlik, boolean adlisicil) {
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
            System.out.println("Herhangi bir adli sicil kaydım yok");
        }
        
    }

    @Override
    public void istecrube(String[] array) {
        
        System.out.println("Bilgisyar mühendisi olarak şu şirketlerde çalıştım: ");
        for (int i = 0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }

    
    
    
}
