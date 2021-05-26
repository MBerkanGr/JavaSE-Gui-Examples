
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Baglanti {
    
    private String kullaniciadi = "root";
    private String parola = "";
    
    private String db_ismi = "demo";
    
    private String host = "localhost";
    
    private int port = 3306;
    
    private Connection connection = null;
    
    private Statement statement = null;     
    
    private PreparedStatement preparedStatement = null;
    
    public void prePared_calisanlariGetir(int id){
        
        String sorgu = "Select * From calisanlar where id > ? and ad like ?";  
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            preparedStatement.setInt(1, id);   //1 1.soru işareti  yerine girilen id gelir
            preparedStatement.setString(2, "O%"); //2 2. soru işareti yerine o harfi gelir pc de ona göre çalışır.
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while (rs.next()) {

                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Ad: "+ad+" Soyad: "+soyad+" email: "+email);
                
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
    public void calisanekle(){
        
        try {
            statement = connection.createStatement();
            String ad="Semih";
            String soyad= "sfs";
            String email="s@gmail.com";
            
            //Insert Into calisanlar(ad,soyad,email) VALUES("Berkan","Görel","Bgr@gmail.com");
            String sorgu = "Insert Into calisanlar(ad,soyad,email) VALUES (" + "'" + ad + "'," + "'"+ soyad + "'," + "'" + email + "')";
            
            statement.executeUpdate(sorgu);
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanSil(){
        
        try{
            statement = connection.createStatement();
            
            String sorgu = "Delete from calisanlar where id = 6";
            
            statement.executeUpdate(sorgu);
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void calisanGuncelle(){
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "Update calisanlar set email = 'mehmetberkangorel@gmail.com' where id=1";
            
            statement.executeUpdate(sorgu);
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public void calisanlariGetir(){
        
        String sorgu = "Select * From calisanlar"; 
        
        // "Select * From calisanlar where id > 2";  
        
        
        try {
            statement = connection.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while(rs.next()){  //daha okunacak değer var mı demek .next
                
                int id = rs.getInt("ıd");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");
                
                System.out.println("Id: "+id + " Ad: "+ad+" soyad: "+soyad + " Email: "+email);
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public Baglanti(){
        
        //jdbc:mysql://localhost:3306/demo 
        
        //?useUnicode=true&characterEncoding=utf8   (Türkçe karakter)
        
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi+"?useUnicode=true&characterEncoding=utf8";
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı");
        }
        
        try {
            connection = DriverManager.getConnection(url, kullaniciadi, parola);
            System.out.println("Bağlantı başarılı!");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız..");
        }
        
    }
    
    public static void main(String[] args) {
        
        Baglanti baglanti = new Baglanti();
        
        baglanti.prePared_calisanlariGetir(3);
        
        /*
        baglanti.calisanlariGetir();
        
        System.out.println("Kullanıcılar Güncellendi");
        
        baglanti.calisanSil();
        
        baglanti.calisanlariGetir();
        */
        
        
        
        
        
        
        
        
        
    }
    
    
}
