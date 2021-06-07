
public class Test
{
    public static void main(String[] args) 
    {
        Araba araba1 = new Araba();  //araba1 kaynak olarak belirliyoruz
        
        araba1.setModel("Renault");
        
        System.out.println("Arabanın modeli "+ araba1.getModel());
        
        araba1.setKapılar(-6);
        
        Araba araba2 = new Araba();
        
        araba2.setModel("Opel");
        
        System.out.println("2.Arabanın modeli: "+araba2.getModel());
         
    }
    
}
