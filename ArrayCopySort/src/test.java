
import java.util.Arrays;
import java.util.Scanner;


public class test {
    
    public static void main(String[] args) {
        
        int[] a=arrayidoldur(5);
        //arrayibastir(a);
        arraysort(a);
        
        
    }

    public static int[] arrayidoldur(int sayi){
        
        Scanner scanner = new Scanner(System.in);
        int[] cikti = new int[sayi];
        
        for(int i = 0;i<sayi;i++){
            cikti[i] = scanner.nextInt();
        }
        return cikti;
    }

    public static void arrayibastir(int [] array){
        
        for(int i = 0;i<array.length;i++){
            System.out.println("Element "+(i+1)+":"+array[i]);
            
        }
        
        
    }
    
    public static void arraysort(int [] array){
        
        Arrays.sort(array);
        arrayibastir(array);
        
    }
    

    
}

