
public class sınıf1 
{
    public static void selamlama(){  
        
        System.out.println("Selamlar...");
        System.out.println("Merhabalar");
    }
    public static void main(String[] args)
    {
      
        selamlama();
        
        selamlama2("BERKAN");
        
        toplama(5, 6, 7);
        
    }
    public static void selamlama2(String isim)  //PARAMETRE İLE KULLANIM
    {
        System.out.println("MERHABA " + isim); 
    } 
    
    public static void toplama(int a,int b,int c){  //PARAMETRE İLE KULLANIM2
        
        System.out.println("toplamları " + (a+b+c));
    }
    
    
}
