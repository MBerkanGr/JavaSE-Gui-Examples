
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalisanIslemleri {  //veri tabanı üzerindeki bütün güncelleştirme işlemleri ve verileri alma işlemlerini buradan yapacağız
    
    private Connection connection = null;
    
    private Statement statement = null;     
    
    private PreparedStatement preparedStatement = null;
    
    public CalisanIslemleri(){
        
        String url = "jdbc:mysql://" + Database.host + ":" + Database.port + "/" + Database.db_ismi+ "?useUnicode=true&characterEncoding=utf8";
        
        
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı....");
        }
        
        
        try {
            connection = DriverManager.getConnection(url, Database.kullaniciadi, Database.parola);
            System.out.println("Bağlantı Başarılı...");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız...");
            //ex.printStackTrace();
        }
        
        
    }
    
    
        
    public void calisanEkle(String ad,String soyad,String departman,String maas){
        
        String sorgu = "Insert Into calisanlar (ad,soyad,departman,maas) VALUES(?,?,?,?)";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1,ad);
            preparedStatement.setString(2,soyad);
            preparedStatement.setString(3,departman);
            preparedStatement.setString(4,maas);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("HATA!!");
        }
        
    }

    public void calisanSil(int id){
        
        String sorgu = "Delete from calisanlar where id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
               
    }
    
    public void calisanGuncelle(int id,String yeni_ad,String yeni_soyad,String yeni_departman,String yeni_maas){
        
        String sorgu = "Update calisanlar set ad = ? , soyad = ? , departman = ? , maas = ? where id = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, yeni_ad);
            preparedStatement.setString(2, yeni_soyad);
            preparedStatement.setString(3, yeni_departman);
            preparedStatement.setString(4, yeni_maas);
            
            preparedStatement.setInt(5, id);
            
            preparedStatement.executeUpdate();

            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    
    public boolean girisYap(String kullanici_Adi,String parola){
        
        String sorgu = "Select * From adminler where username = ? and password = ?";
        
        try {
            preparedStatement = connection.prepareStatement(sorgu);
            
            preparedStatement.setString(1, kullanici_Adi);
            preparedStatement.setString(2, parola);
            
            ResultSet rs = preparedStatement.executeQuery();
            
             
            /*
            if(rs.next() == false ){   //kayıt yoksa       
                 return false;  
             }   
             else{   
                 return true;
             }
             */
            
            //yapmak yerine " return rs.next(); " yapmak daha kolay yol
            
            return rs.next(); 

        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            
            return false;  //hata için yaptık eğer hata olursa false dönsün dedik mbgr
        }
    }
    
    public ArrayList<Calisan> calisanlariGetir(){
        
        ArrayList<Calisan> cikti = new ArrayList<Calisan>();
        
        try {
            statement = connection.createStatement();
            
            String sorgu = "Select * from calisanlar";
            
            ResultSet rs = statement.executeQuery(sorgu);
            
            while (rs.next()) {

                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String departman = rs.getString("departman");
                String maas = rs.getString("maas");
                
                cikti.add(new Calisan(id, ad, soyad, departman, maas));
                
            }
            
            return cikti;
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CalisanIslemleri.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    
   
}
