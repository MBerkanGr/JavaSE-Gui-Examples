
public class Araba 
{
    private String renk;
    private int kapılar;
    private int tekerler;
    private String motor;
    private String model;
    
    
    
    public void setModel(String model)
    {
        this.model = model; 
        
    }
    public String getModel()
    {
        return this.model;
        
    }

    /**
     * @return the renk
     */
    public String getRenk() {
        return renk;
    }

    /**
     * @param renk the renk to set
     */
    public void setRenk(String renk) {
        this.renk = renk;
    }

    /**
     * @return the kapılar
     */
    public int getKapılar() {
        return kapılar;
    }

    /**
     * @param kapılar the kapılar to set
     */
    public void setKapılar(int kapılar) {
        
        if(kapılar<0)
        {
            System.out.println("KAPI SAYISI HATA!!");
            
        }
        else 
        {
            this.kapılar = kapılar;    
        }
        
        
    }

    /**
     * @return the tekerler
     */
    public int getTekerler() {
        return tekerler;
    }

    /**
     * @param tekerler the tekerler to set
     */
    public void setTekerler(int tekerler) {
        this.tekerler = tekerler;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
}
