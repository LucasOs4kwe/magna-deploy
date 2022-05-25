/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.magna.swing.java.swing.signup;

import com.magna.swing.java.api.Memory;
import com.magna.swing.java.database.connection.Connection;
import com.magna.swing.java.database.connection.repository.EmpresaRepository;
import com.magna.swing.java.database.connection.repository.TotemRepository;
import com.magna.swing.java.external.Network;
import java.net.InetAddress;

import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Gustavo
 */
public class UserLogin extends javax.swing.JFrame {
    List<EmpresaRepository> userAdvancedUse;
    Network network = new Network();


    /**
     * Creates new form Signup
     * @throws java.lang.InterruptedException
     * @throws java.net.UnknownHostException
     */
    public UserLogin() throws InterruptedException, UnknownHostException {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        lblError.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblEmail = new javax.swing.JLabel();
        fieldEmail = new javax.swing.JTextField();
        separatorEmail = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        lblSenha = new javax.swing.JLabel();
        separatorSenha = new javax.swing.JSeparator();
        fieldSenha = new javax.swing.JPasswordField();
        lblError = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bannerMagna = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(32, 33, 35));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblEmail.setBackground(new java.awt.Color(255, 255, 255));
        lblEmail.setForeground(new java.awt.Color(255, 255, 255));
        lblEmail.setText("Email");

        fieldEmail.setBackground(new java.awt.Color(32, 33, 35));
        fieldEmail.setForeground(new java.awt.Color(255, 255, 255));
        fieldEmail.setBorder(null);
        fieldEmail.setCaretColor(new java.awt.Color(255, 255, 255));
        fieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldEmailActionPerformed(evt);
            }
        });

        separatorEmail.setBackground(new java.awt.Color(255, 255, 255));
        separatorEmail.setForeground(new java.awt.Color(255, 255, 255));

        btnLogin.setBackground(new java.awt.Color(2, 216, 240));
        btnLogin.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 0, 0));
        btnLogin.setText("ENTRAR");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    btnLoginActionPerformed(evt);
                } catch (UnknownHostException e) {
                    e.printStackTrace();
                } catch (SocketException e) {
                    e.printStackTrace();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        lblSenha.setBackground(new java.awt.Color(255, 255, 255));
        lblSenha.setForeground(new java.awt.Color(255, 255, 255));
        lblSenha.setText("Senha");

        separatorSenha.setBackground(new java.awt.Color(255, 255, 255));
        separatorSenha.setForeground(new java.awt.Color(255, 255, 255));

        fieldSenha.setBackground(new java.awt.Color(32, 33, 35));
        fieldSenha.setForeground(new java.awt.Color(255, 255, 255));
        fieldSenha.setBorder(null);
        fieldSenha.setCaretColor(new java.awt.Color(255, 255, 255));
        fieldSenha.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        lblError.setForeground(new java.awt.Color(255, 0, 50));
        lblError.setText("Usuário ou senha incorreto.");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblError)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separatorSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(lblSenha)
                            .addComponent(fieldSenha))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(separatorEmail)
                            .addComponent(lblEmail)
                            .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(59, 59, 59))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(lblEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separatorEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(separatorSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblError)
                .addGap(78, 78, 78)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(90, 90, 90));

        bannerMagna.setIcon(new javax.swing.ImageIcon(getClass().getResource("/magna-banner.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bannerMagna, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(bannerMagna)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldEmailActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) throws UnknownHostException, SocketException, InterruptedException {//GEN-FIRST:event_btnLoginActionPerformed
        TotemSignup totemSignup = new TotemSignup();
        String passwordGetText = new String(fieldSenha.getPassword());
//        Network net = new Network();
        Connection config = new Connection();
        JdbcTemplate con = new JdbcTemplate(config.getDataSource());

        
        userAdvancedUse = con.query("SELECT * FROM empresa WHERE email = ? AND senha = ?",
        new BeanPropertyRowMapper<>(EmpresaRepository.class), fieldEmail.getText(), passwordGetText);
        
        
        if (userAdvancedUse.isEmpty()) {
            lblError.setVisible(true);
        }
        
        else {
            InetAddress addr = InetAddress.getLocalHost();
            
            List<TotemRepository> macAdvancedUse = con.query("SELECT endereco_mac FROM totem WHERE endereco_mac = ?",
                new BeanPropertyRowMapper<>(TotemRepository.class), new Object[]{network.getMAC(addr)});
            
            if (macAdvancedUse.isEmpty()) {
                
                this.dispose();
                totemSignup.setResizable(false);
                totemSignup.setLocationRelativeTo(null);
                totemSignup.pack();
                totemSignup.setVisible(true);
                lblError.setVisible(false);

                Integer fkEmpresa = con.queryForObject("SELECT id FROM empresa WHERE email = ?",
                    Integer.class, fieldEmail.getText());

                con.update("INSERT INTO totem (hostname, localizacao, totem_status, sistema_operacional, fk_empresa, endereco_mac)VALUES (?, ?, ?, ?, ?, ?)",
                        InetAddress.getLocalHost().getHostName(), null, null, System.getProperty("os.name"), fkEmpresa, network.getMAC(addr));
                lblError.setVisible(true);
            
            } else {
                this.dispose();

                RunningScreen runningScreen = new RunningScreen();


            }
            
            
        }

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserLogin().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                } catch (UnknownHostException ex) {
                    Logger.getLogger(UserLogin.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bannerMagna;
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JPasswordField fieldSenha;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JSeparator separatorEmail;
    private javax.swing.JSeparator separatorSenha;
    // End of variables declaration//GEN-END:variables
}