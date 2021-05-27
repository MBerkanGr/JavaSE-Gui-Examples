
public class Main {
    
    public static void main(String[] args) {
        
        Kopek kopek = new Kopek("Karabaş",20,50,4,42);
        Hayvan kopek2 = new Kopek("Kap", 19, 0, 0, 0);
        kopek.kos(10);
        kopek2.yemek_ye();
    }
    
}
