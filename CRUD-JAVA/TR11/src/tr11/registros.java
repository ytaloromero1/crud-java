
package tr11;

import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;



public class registros extends javax.swing.JFrame {

  
    public registros() {
        initComponents();
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnguardar = new javax.swing.JButton();
        txtapellido = new javax.swing.JTextField();
        txtsexo = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        txtusuario = new javax.swing.JTextField();
        txtclave = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnguardar.setBackground(new java.awt.Color(195, 205, 254));
        btnguardar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnguardar.setText("GUARDAR");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        txtapellido.setBackground(new java.awt.Color(255, 229, 229));
        txtapellido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtsexo.setBackground(new java.awt.Color(255, 229, 229));
        txtsexo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtcorreo.setBackground(new java.awt.Color(255, 229, 229));
        txtcorreo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtusuario.setBackground(new java.awt.Color(255, 229, 229));
        txtusuario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtclave.setBackground(new java.awt.Color(255, 229, 229));
        txtclave.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtnombre.setBackground(new java.awt.Color(255, 229, 229));
        txtnombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(44, 53, 214));
        jLabel1.setText("REGISTRATE");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRE :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("APELLIDO :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("SEXO :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("CORREO :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("USUARIO :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("CLAVE :");

        btnlimpiar.setBackground(new java.awt.Color(195, 205, 254));
        btnlimpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(195, 205, 254));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN_iniciar-sesion.png"))); // NOI18N
        jButton1.setText("INICIAR SESION");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarse LOGO.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1)
                .addGap(86, 86, 86)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(33, 33, 33))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnlimpiar)
                        .addGap(55, 55, 55)
                        .addComponent(btnguardar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnlimpiar)
                    .addComponent(btnguardar))
                .addGap(98, 98, 98))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
        
    private void limpiar(){
    
        txtnombre.setText(null);
        txtapellido.setText(null);
        txtsexo.setText(null);
        txtcorreo.setText(null);
            txtusuario.setText(null);
                txtclave.setText(null);

    
    
    }

    
    
    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed


  
//        crea un objeto de la clase coneccion llamado coninsert
        conexion coninsert =new conexion();

        
//        creo una variable de tipo connection llamado cn 
//                que sera igual ami objeto anterior con la funcion conectar
            Connection cn = coninsert.conectar();
            
            
            //creo una variable para mi sql
            String sql ="";
            
//            creo variables para los txt inputs con su tipo de dato
          String nom ;
          String apellido ;
          String sexo ;
          String correo ;
          String usuario ;
          String clave ;
       
         
        
          
//          ago que las variables sean iguales al txt corexpondiente obtenendo el dato get text()
          nom = txtnombre.getText();
          apellido = txtapellido.getText();
          correo = txtcorreo.getText();
          clave = txtclave.getText();
          sexo = txtsexo.getText();
          usuario = txtusuario.getText();
          
        
       
          
          
          
//          creo una variavle que almasene mi consulta sql   los parametros ?????   seran asigmados despues en la consulta
          sql="  INSERT INTO registros(nombre,apellidos,sexo,correo,usuario,clave)        "
                  +"   VALUES(?,?,?,?,?,?)  ";


          
                   try {
                       
//                       preparo la consulta con  PreparedStatement  llamandola pst 
//                       pasandole la conexion  y mi consulta sql invocando al metodo connection .prepare statement
                       PreparedStatement pst  = cn.prepareStatement(sql);



//                        usamos la variable pst y set para estableser los daos en la consulta               especificando el orden del valuee (??) y el dato a asignar (nom) 
                       pst.setString(1,nom);
                       pst.setString(2,apellido);
                       pst.setString(3,sexo);
                       pst.setString(4,correo);
                       pst.setString(5,usuario);
                       pst.setString(6,clave);
                      
                       
                       
                       
                       
                      if(nom.equals("")  ||   apellido.equals("")||sexo.equals("")  ||  correo.equals("")  ||  usuario.equals("")  || clave.equals("")   ){
                      
                                   JOptionPane.showMessageDialog(null, "Le falta completar un campo","conexi",JOptionPane.INFORMATION_MESSAGE);

                          }else{
                      //ejecuto la consulta con  executeUpdate y la transformo a un numero entero llamado n 
                       int n =pst.executeUpdate();
                       
                       
                       //si el numero es mayor a 0 osea si es true (verdadero) me imprime un texto
                       if(n>0){
                       
                                   JOptionPane.showMessageDialog(null, "registro exitoso del vendedor ","conexi",JOptionPane.INFORMATION_MESSAGE);
                                 
                                   
                    //borar lo que estaba escrito llamando al metodo limpiar
                       limpiar();
                      
                       
                    ///crea un nuevo jfrom de menu
                       menu paginamenu =new menu();
                        paginamenu.setVisible(true);
                        
                        
                        
                        //desecho  la pagina anterior cuando ya se abra la nueva paina creada
                       this.dispose();
                       
                       }
                      }//del else
                       
                    } catch (Exception ex) {
            
                                               JOptionPane.showMessageDialog(null, "erooo de insercion"+ex,"erorerrrr",JOptionPane.ERROR_MESSAGE);
 
            
            
                          }











 






 

























        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarActionPerformed

    
    
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
    
limpiar();        

// TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //abre una nueva pagina de el jfrom menu 
        menu paginamenu =new menu();
                        paginamenu.setVisible(true);
                        
        
                                //desecho la pagina anterior cuando ya se abra la nueva paina creada
                                 this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtclave;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtsexo;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables
}
