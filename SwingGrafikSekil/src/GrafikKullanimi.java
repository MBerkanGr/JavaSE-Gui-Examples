
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;


public class GrafikKullanimi extends JPanel{

    public GrafikKullanimi() {
        
        setBackground(Color.black);
        
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        
        g.setColor(Color.red);  //Çizgi Renk
        
        g.drawRect(100, 10, 30, 40);  //Dikdörtgen oluşturmak 
        
        g.fillRect(200, 100, 30, 40);  //İçi dolu Dikdörtgen oluşturmak
        
        g.setColor(Color.blue);
        
        g.drawOval(270, 270, 30, 30);  //Daire oluşturmak
        
        g.fillOval(400, 400, 80, 50);  //İçi dolu oval oluşturmak
        
        g.setColor(Color.yellow);
        
        g.drawLine(100,100 , 100, 50); //Çizgi oluşturmak. ilk 2 sayı baş nok. diğerleri bit. nok.
        
    }

    
    
    
    
    
}
