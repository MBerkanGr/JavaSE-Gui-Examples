
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.plaf.OptionPaneUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author berkan
 */
class Users{
    
    private String kullanici_Adi;
    private String sifre;

    public Users(String kullanici_Adi, String sifre) {
        this.kullanici_Adi = kullanici_Adi;
        this.sifre = sifre;
    }

    public String getKullanici_Adi() {
        return kullanici_Adi;
    }

    public void setKullanici_Adi(String kullanici_Adi) {
        this.kullanici_Adi = kullanici_Adi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
    
    
    
}
public class AnaEkran extends javax.swing.JFrame {

    private static ArrayList<Users> users_list = new ArrayList<Users>();

    public static ArrayList<Users> getUsers_list() {
        return users_list;
    }

    public static void setUsers_list(ArrayList<Users> users_list) {
        AnaEkran.users_list = users_list;
    }
    
    /**
     * Creates new form AnaEkran
     */
    public AnaEkran() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register_login_panel = new javax.swing.JPanel();
        register_buton = new javax.swing.JButton();
        login_buton = new javax.swing.JButton();
        login_panel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kullanici_tf = new javax.swing.JTextField();
        sifre_tf = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GİRİŞ EKRANI");

        register_login_panel.setBackground(new java.awt.Color(204, 0, 153));

        register_buton.setText("Register");
        register_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_butonActionPerformed(evt);
            }
        });

        login_buton.setText("Login");
        login_buton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_butonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout register_login_panelLayout = new javax.swing.GroupLayout(register_login_panel);
        register_login_panel.setLayout(register_login_panelLayout);
        register_login_panelLayout.setHorizontalGroup(
            register_login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(register_login_panelLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(register_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(login_buton, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        register_login_panelLayout.setVerticalGroup(
            register_login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(register_login_panelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(register_login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register_buton)
                    .addComponent(login_buton))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        login_panel.setBackground(new java.awt.Color(102, 153, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Kullanıcı adı:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Şifre:");

        javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
        login_panel.setLayout(login_panelLayout);
        login_panelLayout.setHorizontalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(login_panelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kullanici_tf, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        login_panelLayout.setVerticalGroup(
            login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_panelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(kullanici_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sifre_tf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(register_login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_panel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(login_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(register_login_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void register_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_butonActionPerformed
    
        RegisterEkranı registerEkranı = new RegisterEkranı();
        
        registerEkranı.setVisible(true);
        
    }//GEN-LAST:event_register_butonActionPerformed

    private void login_butonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_butonActionPerformed
    
        String kullanici_adi = kullanici_tf.getText();
        String sifre = sifre_tf.getText();
        
        if(users_list.size() == 0){
            
            JOptionPane.showMessageDialog(this, "Hiçbir kullanıcı bulunmamaktadır.");
            
             kullanici_tf.setText("");
             sifre_tf.setText("");
            
        }
        else{
            
            for(Users user : users_list ){
                
                if(user.getKullanici_Adi().equals(kullanici_adi) && user.getSifre().equals(sifre)){
                    
                    JOptionPane.showMessageDialog(this, "Hoşgeldiniz "+kullanici_adi);
                    return;
                    
                }             
                
            }
            
            JOptionPane.showMessageDialog(this, "Böyle bir kullanıcı bulunmamaktadır. Lütfen kayıt olun...");
            
            kullanici_tf.setText("");
            sifre_tf.setText("");
            
        }
        
        
        
    }//GEN-LAST:event_login_butonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AnaEkran.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AnaEkran().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField kullanici_tf;
    private javax.swing.JButton login_buton;
    private javax.swing.JPanel login_panel;
    private javax.swing.JButton register_buton;
    private javax.swing.JPanel register_login_panel;
    private javax.swing.JPasswordField sifre_tf;
    // End of variables declaration//GEN-END:variables
}
