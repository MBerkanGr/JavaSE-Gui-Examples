
public class Problem {
    
    public static class Matematik{
        public static void dairealan(int yaricap){
            System.out.println("Dairenin alani: "+((yaricap*yaricap)*Math.PI));
        }
        public static void ucgencevresi(int kenar1, int kenar2, int kenar3){            
            System.out.println("Üçgen çevresi "+(kenar1+kenar2+kenar3));
        }
        
        
    }
    public static class Fizik{
        public static void iccarpım(Vec vec1, Vec vec2){
            
            int iccarpım = vec1.getI() * vec2.getI()+ vec1.getJ() * vec2.getJ()+ vec1.getK() * vec2.getK() ; 
            System.out.println(vec1.getIsim() + " ile " + vec2.getIsim() + " iç çarpımı: "+iccarpım);        
        }
        
        
        
    }
}
