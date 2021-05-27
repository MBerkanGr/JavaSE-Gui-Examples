
import java.util.Scanner;


public class Vec {
    
    private String isim;
    private int i;
    private int j;
    private int k;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    public Vec(String isim){
        this.isim = isim;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println(isim + " vektörün i j k değerliri giriniz: ");
        
        System.out.print("i: ");
        this.i = scanner.nextInt();
        System.out.print("j: ");
        this.j = scanner.nextInt();
        System.out.print("k: ");
        this.k = scanner.nextInt();
    }
    
}
