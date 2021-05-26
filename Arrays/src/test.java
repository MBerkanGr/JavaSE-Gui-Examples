
import java.util.Scanner;


public class test {
    
    public static void main(String[] args) {
        
        //int a;
        
        //int[] a= new int[10];  //bellekte 10 tane int yer açılıyor a orasını gösteriyor
        
        /*a[5] = 32;  //5.kısma 32 koy
        a[9] = 50;*/
        
        //int[] a =  {1,2,3,4,5,6,7,8,9,10};
        
       // int[] a = {30,40,50,60,70};
        
       // System.out.println(a[0]); //30
       // System.out.println(a[2]); //50
       // System.out.println(a[6]); //hata
       
       /*
       int[] a = new int [5];
        
       for(int i=0;i<5;i++){
           
           a[i] = i*4+2;
           
       }
                     
       for(int i=0;i<5;i++){
           
           System.out.println(a[i]);          
       }

       */
       
       /*
       int[] a = new int [5];
       
       Scanner scanner = new Scanner(System.in);
        
        for(int i = 0;i<5;i++){
            
            a[i] = scanner.nextInt();
        }
        
        for (int i = 0;i<5;i++){
            System.out.println(a[i5]);
        }
        */
    
        //int[] b = {10,20,30,50,40};
        //System.out.println("Array in uzunluğu: "+b.length); 
        
        
        
        int[] b = {10,20,30,40,50};
        
        arraybastir(b);
    
    }
    
    public static void arraybastir(int [] array){
        
        for(int i = 0;i<array.length;i++){
            
            System.out.println("Element"+(i+1)+": "+array[i]);
            
        }
        
    }               
}
