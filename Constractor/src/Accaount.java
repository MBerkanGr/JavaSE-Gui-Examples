
public class Accaount
{
    private String HesapNo;
    private double Bakiye;
    private String İsim;
    private String Email;
    private String Telno;
    
    public Accaount(){
    
        //System.out.println("KENDİ YAZDIĞIMIZ CONSTRACTOR....");
        
        /*
        this.HesapNo = "Bilgi yok";
        this.Bakiye = 0.0;
        this.İsim = "Bilgi yok";
        this.Telno = "Bilgi yok";
        this.Email = "Bilgi yok"; */
        
        this("Bilgi yok", 0.0, "Bilgi yok", "Bilgi yok", "Bilgi yok");
        
        
    }
    public Accaount(String HesapNo , double Bakiye , String İsim , String Email , String Telno )
    {
        this.HesapNo = HesapNo;
        this.Email = Email;
        this.Bakiye = Bakiye;
        this.İsim = İsim;
        this.Telno = Telno;
        
        
    }
    
    public Accaount(String İsim, String Email , String Telno ){
        
        /*this.İsim = İsim;
        this.Email = Email;
        this.Telno = Telno;
        
        this.Bakiye = 0.0;
        this.HesapNo = "Bilgi yok";*/
        
        this("Bilgi yok",0.0,İsim,Email,Telno);
        
       
        
    }
    public  void bilgilerigöster(){
        
        System.out.println("Hesap no: "+this.HesapNo);
        System.out.println("İsim: "+this.İsim);
        System.out.println("Bakiye: "+this.Bakiye);
        System.out.println("e-mail: "+this.Email);
        System.out.println("TelNo: "+this.Telno);
        
        
        
        
    }
    
    public void parayatır(double miktar)
    {
        Bakiye +=miktar;
        
        System.out.println("Yeni bakiye "+Bakiye);
        
        
        
    }
    
    public void paracekme(double miktar)
    {
        if (miktar > 1500){
            System.out.println("Bir günde 1500 tl den fazla çekemezsiniz");
            
        }
        else if (Bakiye - miktar < 0){
            
            System.out.println("Yeterli bakiye yok"+"bakiyeniz "+ Bakiye);
        }
        else 
        {
            Bakiye -=miktar;
            System.out.println("Son bakiye "+Bakiye);
        }
        
        
        
    }
    /**
     * @return the HesapNo
     */
    public String getHesapNo() {
        return HesapNo;
    }

    /**
     * @param HesapNo the HesapNo to set
     */
    public void setHesapNo(String HesapNo) {
        this.HesapNo = HesapNo;
    }

    /**
     * @return the Bakiye
     */
    public double getBakiye() {
        return Bakiye;
    }

    /**
     * @param Bakiye the Bakiye to set
     */
    public void setBakiye(double Bakiye) {
        this.Bakiye = Bakiye;
    }

    /**
     * @return the İsim
     */
    public String getİsim() {
        return İsim;
    }

    /**
     * @param İsim the İsim to set
     */
    public void setİsim(String İsim) {
        this.İsim = İsim;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the Telno
     */
    public String getTelno() {
        return Telno;
    }

    /**
     * @param Telno the Telno to set
     */
    public void setTelno(String Telno) {
        this.Telno = Telno;
    }
}
