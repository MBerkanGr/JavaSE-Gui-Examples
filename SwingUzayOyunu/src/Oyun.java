
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.stream.FileImageInputStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

class Ates {
    
    private int x;
    private int y;

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
    
}

//KeyListener tuşların okunması vs
//ActionListener topun hareketi vs

public class Oyun extends JPanel implements KeyListener,ActionListener{
    
    private int gecensure=0;
    private int harcanan_ates=0;
    private BufferedImage image;  //uzay gemisi fotoğrafı
       
    private ArrayList<Ates> atesler = new ArrayList<Ates>();
    
    private int atesdir_y = 1;    //Ateşin yukarı doğru gitmesi
    private int top_x = 0;        //Topun Başlama noktası
    private int topdirx = 2;      //Topun hareketi
    
    private int uzaygemisi_x=0;     //Uzay gemisi başlama noktası
    private int diruzayx = 20;      //Uzay gemisi hareketi
    
    Timer timer = new Timer(5,this);
    
    
    public boolean kontrolet(){
        
        for(Ates ates : atesler){
            
            if(new Rectangle(ates.getX(),ates.getY(),10,20).intersects(new Rectangle(top_x,0,20,20))){
                
                return true;
                
            }
            
        }
        return false;
    }

    public Oyun() {
        
        try {
            image = ImageIO.read(new FileImageInputStream(new File("uzaygemisi.png")));
        } catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.black);
        
        timer.start();
        
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        gecensure += 5; 
        
        g.setColor(Color.red);
        
        g.fillOval(top_x, 0, 20, 20);
        
        g.drawImage(image,uzaygemisi_x,490,image.getWidth() / 3  ,image.getHeight() / 3 ,this);
        
        for(Ates ates : atesler){
            
            if(ates.getY() < 0){             
                atesler.remove(ates);                              
            }
  
        }
        
        g.setColor(Color.blue);
        
        for(Ates ates : atesler){
            
            g.fillRect(ates.getX(), ates.getY(), 10, 20);
            
            
        }       
        if(kontrolet()){
            
            timer.stop();
            
            String message = "Kazandınız! \n"
                    + "Harcanan ateş: " + harcanan_ates +
                    "\n Geçen süre: " + gecensure/1000.0 + " sn";
            JOptionPane.showMessageDialog(this, message);
            
            System.exit(0);
            
        }
    }

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }
    

    @Override
    public void keyTyped(KeyEvent e) {
        
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        int c = e.getKeyCode();
        
        if( c == KeyEvent.VK_LEFT){
            
            if(uzaygemisi_x <= 10){
                
                uzaygemisi_x = 0;
                
            }
            else{
                
                uzaygemisi_x -= diruzayx; 
                
            }
            
        }
        else if( c == KeyEvent.VK_RIGHT){
            
            if(uzaygemisi_x >= 750){
                
                uzaygemisi_x = 750;
            }
            else{
                
                uzaygemisi_x += diruzayx;
                
            }            
        }
        else if( c == KeyEvent.VK_CONTROL){
            
            atesler.add(new Ates(uzaygemisi_x+15,490));
            
            harcanan_ates++;       
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for(Ates ates : atesler){
            
            ates.setY(ates.getY() - atesdir_y);
            
        }
        
        top_x += topdirx;
        
        if(top_x >= 750 ){
            
            topdirx = -topdirx;
            
        }
        
        if(top_x <= 0){
            
            topdirx = -topdirx;
            
        }
        repaint();
        
    }
    
    
    
    
    
}
