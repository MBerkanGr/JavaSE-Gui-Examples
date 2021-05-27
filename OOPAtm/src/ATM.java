
import java.util.Scanner;


public class ATM {
    
    public void calis(Hesap hesap) {
        
        Login login = new Login();
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("BGR BANKASINA HOŞGELDİNİZ....");
        
        System.out.println("*************************");
        
        System.out.println("Kullanıcı girişi");
        
        System.out.println("*************************");
        
        int girishakkı = 3;
        
        while (true) {

            if(login.login(hesap)){
                
                System.out.println("GİRİŞ BAŞARILI...");
                break;
            }
            else{
                
                System.out.println("GİRİŞ BAŞARISIZ...");
                girishakkı--;
                System.out.println("KALAN HAK: "+girishakkı);
            }
            if (girishakkı == 0){
                
                System.out.println("GİRİŞ HAKKINIZ BİTTİ!");
                return;
            }
                
            
        }
        //GİRİŞ BAŞARILI OLDUYSA BURAYA GEÇİLİR...
        
        System.out.println("**********************");
        String islemler = "1. Bakiye görüntüle\n"
                          +"2. Para yatırma \n"
                          +"3. Para çekme \n"
                          +"Çıkış için q ya basın";
        System.out.println(islemler);
        System.out.println("**********************");
        
        while (true) {

            System.out.print("İşlem seçiniz: ");
            String islem = scanner.nextLine();
            
            if (islem.equals("q")){
                
                break;
            }
            else if (islem.equals("1")){
                
                System.out.println("Bakiyeniz: " + hesap.getBakiye());
            }
            else if (islem.equals("2")){
                System.out.print("Yatırmak istediğiniz tutar: ");   
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                
                hesap.paraYatir(tutar);                               
            }
            else if (islem.equals("3")){
                System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                
                hesap.paraCek(tutar);                    
            }
            else{
                
                System.out.println("Geçersiz işlem isteği!");
            }
            
            
            
        }
        
    }
    
}
