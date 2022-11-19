package vistas;

import javax.swing.ImageIcon;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaLogin extends javax.swing.JFrame {

    public VistaLogin() {

        initComponents();
        setLocationRelativeTo(null);
        setImages();

    }

    public void setImages() {
        //iconUser.setIcon(new ImageIcon(getClass().getResource("/resources/user-solid.png")));
        iconEmail.setIcon(new ImageIcon(getClass().getResource("/resources/envelope-solid.png")));
        iconPass.setIcon(new ImageIcon(getClass().getResource("/resources/lock-solid.png")));
      //  btn_back.setIcon(new ImageIcon(getClass().getResource("/resources/arrow-left-solid.png")));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        iconFesc = new javax.swing.JLabel();
        backgroundVista = new javax.swing.JPanel();
        panelIngreso = new javax.swing.JPanel();
        iconEmail = new javax.swing.JLabel();
        iconPass = new javax.swing.JLabel();
        getEmail = new javax.swing.JTextField();
        btnEntrar = new javax.swing.JButton();
        getPassword = new javax.swing.JPasswordField();
        textRegister = new java.awt.Label();
        panelBienvenida = new javax.swing.JPanel();
        labelPlataforma = new javax.swing.JLabel();
        labelBienvenido = new javax.swing.JLabel();

        iconFesc.setMaximumSize(new java.awt.Dimension(120, 120));
        iconFesc.setMinimumSize(new java.awt.Dimension(120, 120));
        iconFesc.setPreferredSize(new java.awt.Dimension(120, 120));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundVista.setBackground(new java.awt.Color(255, 255, 255));
        backgroundVista.setPreferredSize(new java.awt.Dimension(400, 400));
        backgroundVista.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelIngreso.setBackground(new java.awt.Color(255, 255, 255));

        getEmail.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        getEmail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        btnEntrar.setBackground(new java.awt.Color(0, 0, 0));
        btnEntrar.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btnEntrar.setForeground(new java.awt.Color(255, 255, 255));
        btnEntrar.setText("ENTRAR");
        btnEntrar.setBorder(null);
        btnEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntrar.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnEntrar.setDefaultCapable(false);
        btnEntrar.setFocusPainted(false);
        btnEntrar.setFocusable(false);
        btnEntrar.setRequestFocusEnabled(false);
        btnEntrar.setRolloverEnabled(false);
        btnEntrar.setVerifyInputWhenFocusTarget(false);
        btnEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarActionPerformed(evt);
            }
        });

        getPassword.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        getPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));

        textRegister.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        textRegister.setText("Click aquí para crear una cuenta");
        textRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textRegisterMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelIngresoLayout = new javax.swing.GroupLayout(panelIngreso);
        panelIngreso.setLayout(panelIngresoLayout);
        panelIngresoLayout.setHorizontalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconPass, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(iconEmail, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getEmail)
                    .addComponent(getPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelIngresoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(textRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        panelIngresoLayout.setVerticalGroup(
            panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelIngresoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getEmail))
                .addGap(38, 38, 38)
                .addGroup(panelIngresoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(iconPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getPassword))
                .addGap(18, 18, 18)
                .addComponent(btnEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        btnEntrar.getAccessibleContext().setAccessibleParent(btnEntrar);

        backgroundVista.add(panelIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 350, 220));

        panelBienvenida.setBackground(new java.awt.Color(255, 255, 255));

        labelPlataforma.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        labelPlataforma.setText("CHEORL");
        labelPlataforma.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));

        labelBienvenido.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        labelBienvenido.setText("INICIA SESION");

        javax.swing.GroupLayout panelBienvenidaLayout = new javax.swing.GroupLayout(panelBienvenida);
        panelBienvenida.setLayout(panelBienvenidaLayout);
        panelBienvenidaLayout.setHorizontalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addGap(19, 128, Short.MAX_VALUE)
                .addComponent(labelPlataforma)
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelBienvenido)
                .addGap(128, 128, 128))
        );
        panelBienvenidaLayout.setVerticalGroup(
            panelBienvenidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBienvenidaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelPlataforma)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelBienvenido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backgroundVista.add(panelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgroundVista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarActionPerformed
        controladores.ControladorInit.inicioSesion();
    }//GEN-LAST:event_btnEntrarActionPerformed

    private void textRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textRegisterMouseClicked
       controladores.ControladorInit.btnRegister();
    }//GEN-LAST:event_textRegisterMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    public JTextField getGetEmail() {
        return getEmail;
    }

    public JPasswordField getGetPassword() {
        return getPassword;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgroundVista;
    private javax.swing.JButton btnEntrar;
    private javax.swing.JTextField getEmail;
    private javax.swing.JPasswordField getPassword;
    private javax.swing.JLabel iconEmail;
    private javax.swing.JLabel iconFesc;
    private javax.swing.JLabel iconPass;
    private javax.swing.JLabel labelBienvenido;
    private javax.swing.JLabel labelPlataforma;
    private javax.swing.JPanel panelBienvenida;
    private javax.swing.JPanel panelIngreso;
    private java.awt.Label textRegister;
    // End of variables declaration//GEN-END:variables
}
