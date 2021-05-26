
public class test {
    
    public static void main(String[] args) {
        
        String[] array = {"elma","armut","kiraz"};
                 
        /*
        for(int i = 0;i<array.length;i++){
            
            System.out.println(array[i]);                      
        }
        */
        
        for(String a : array){
            System.out.println(a);
        }
        
        int[] array2 = {1,2,3,4,5};
        
        for(int a : array2){
            System.out.println(a);
        }
        
        Deneme[] array3 = {new Deneme("Mehmet"),new Deneme("Berkan"),new Deneme("Görel")};
        
        for(Deneme d : array3){
            d.yaz();
        }
        
        
        
        
                
                
                
                
                
    }
}
