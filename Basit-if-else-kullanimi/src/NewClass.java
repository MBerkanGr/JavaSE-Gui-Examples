
import java.util.Scanner;


public class NewClass {

    public static void main(String[] args)
    {
        
       Scanner scanner = new Scanner(System.in);
       
       int girishakki = 3;
       
       String Sys_kullaniciadi = "Mehmet Berkan";
       String Sys_parola = "123456";
       
        System.out.println("*********************");
        System.out.println("KULLANICI GİRİŞİ");
        System.out.println("*********************");
        
        while(true){
            
            System.out.print("Kullanıcı adınızı girin: ");
            String kullanici = scanner.nextLine();
            System.out.print("Parola giriniz: ");
            String parola = scanner.nextLine();
            
            
            if (kullanici.equals(Sys_kullaniciadi) && parola.equals(Sys_parola)){
                
                System.out.println("HOŞGELDİNİZ " + kullanici);
                break;
            }   
            else if(kullanici.equals(Sys_kullaniciadi)&& !parola.equals(Sys_parola))
            {
              
                System.out.println("PAROLA HATALI TEKRAR DENEYİNİZ...");
                girishakki -= 1;
                System.out.println("Kalan "+girishakki +" hakkınız");
                if (girishakki == 0){
                    
                    break;
                }
                
                continue;
                
                                        
            } 
            else if(!kullanici.equals(Sys_kullaniciadi) && parola.equals(Sys_parola))
            {
              
                System.out.println("KULLANICI ADI HATALI TEKRAR DENEYİNİZ...");
                girishakki -=1;
                System.out.println("Kalan "+girishakki+" hakkınız");
                if (girishakki == 0){
                    
                    break;
                }
                continue;
                                        
            } 
            
            
            
            else if(!kullanici.equals(Sys_kullaniciadi) && !parola.equals(Sys_parola))
            {
                
                
                System.out.println("Hatalı işlem...");
                girishakki -=1;
                System.out.println("Kalan "+girishakki+" hakkınız");
                if (girishakki == 0){
                    
                    break;
                }
            }

            
            
        }
        
        
       
        
        
    }
    
}
