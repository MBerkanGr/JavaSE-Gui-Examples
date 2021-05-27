
import java.util.Scanner;


public class sınıf 
{
    public static void main(String[] args)
    {
        double gitkm;  //gittiği kilometre
        double kmhar;  //kilometre başında harcadığı para
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("KAÇ KİLOMETRE YOL ALDINIZ? ");
        gitkm = scanner.nextDouble();
        System.out.print("1 KİLOMETREDE KAÇ TL YAKIYOR? ");
        kmhar = scanner.nextDouble();
        
        double c; //toplam harcanan para
        
        c=gitkm*kmhar;
        
        System.out.print("TOPLAM HARCANAN PARA= "+c);
        
        
        
    }
    
}
