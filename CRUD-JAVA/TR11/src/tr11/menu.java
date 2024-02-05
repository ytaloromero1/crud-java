

package tr11;

import java.awt.event.ActionEvent;
import static java.lang.reflect.Array.get;
import static java.nio.file.Paths.get;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.get;
import javax.swing.table.DefaultTableModel;








public class menu extends javax.swing.JFrame {

    
    /////////////////////////////////////////////////////PESTAÑA PRODUCTOS///////////////////////////////////////////////////////////////////////
    
//    //nos permite manejar la tabla
////    creamos una variable llamadda modelo
  DefaultTableModel modeloproductos;
//    //añado los titulos ala tabla como un stringareglo
   String[] titulosproductos= {"COD","NOMBRE","PRECIO","MARCA","CANTIDAD"};
////cantidad de campos de la tavla    
   String []datosproductos =new String[5];

   ///////////////////////////////////////////////FIN PESTAÑA PRODUCTOS/////////////////////////////////////////
   
  
   
   
       /////////////////////////////////////////////////////PESTAÑA CLIENTESS///////////////////////////////////////////////////////////////////////

     DefaultTableModel modeloclientes;
   
      String[] titulosclientes= {"COD","NOMBRE","CORREO","SEXO","EDAD","DNI"};

     String []datosclientes =new String[6];

        /////////////////////////////////////////////////////FINN PESTAÑA CLIENTESSS///////////////////////////////////////////////////////////////////////


        /////////////////////////////////////////////////////PESTAÑA VENTAAAA///////////////////////////////////////////////////////////////////////
  
    
       DefaultTableModel modeloventas ;
   
      String[] titulosventas= {"idProducto", "PRE_UNITARIO", "CANTIDAD","SUB_TOTAL"};

     String []datosventas =new String[5];

     

        /////////////////////////////////////////////////////FINN PESTAÑA VENTAAAA///////////////////////////////////////////////////////////////////////









//int txtprecioventa=0;
     
     
    /**
     * Creates new form menu
     */
    public menu() {
        initComponents();
        
        //pongo todas las pestallas inavilitadas esepto el login 
        pestañaclientes.setEnabledAt(1, false);
        pestañaclientes.setEnabledAt(2, false);
        pestañaclientes.setEnabledAt(3, false);
         
         llenarcomboboxventa("clientes","nombre",jComboBoxventaclientes);
//         llenarcomboboxventa("producto2","nombre",jComboBoxventaproductos);

llenarcomboboxventa("producto2","nombre",comboBoxProducto);
// /////////////PESTAÑA VENTAA////////////
          
          //
        Calendar calendar =new GregorianCalendar();
       txtfecha.setText(""  +calendar.get(Calendar.YEAR) + " / "  +      calendar.get(Calendar.MONTH) + " / "  + calendar.get(Calendar.DAY_OF_MONTH)       );        

modeloventas = new DefaultTableModel(null,titulosventas); 
        tablaventas.setModel(modeloventas);
  /////////////FINNNN   PESTAÑA VENTAAA////////////


/////////////PESTAÑA PRODUCTOS////////////
        
        mostrartablaproductos ();
       
 /////////////FINNNN   PESTAÑA PRODUCTOS////////////
    




 /////////////PESTAÑA CLIENTES////////////
 

    mostrartablaclientes ();


/////////////FINNNN   PESTAÑA CLIENTES////////////


    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pestañaclientes = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtusuariologin = new javax.swing.JTextField();
        btnguardarlogin = new javax.swing.JButton();
        btnlimpiarlogin = new javax.swing.JButton();
        btnregistro = new javax.swing.JButton();
        txtclavelogin = new javax.swing.JPasswordField();
        jLabel14 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtnombrecliente = new javax.swing.JTextField();
        txtsexocliente = new javax.swing.JTextField();
        txtedadcliente = new javax.swing.JTextField();
        btnlimpiarcliente = new javax.swing.JButton();
        btnguardarcliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaclientes = new javax.swing.JTable();
        btneliminarclientes = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtcorreocliente = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprecioproductos = new javax.swing.JTextField();
        txtcantidadproductos = new javax.swing.JTextField();
        btnlimpiarproductos = new javax.swing.JButton();
        btnguardarproductos = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproductos = new javax.swing.JTable();
        txtmarcaproductos = new javax.swing.JTextField();
        txtnombreproductos = new javax.swing.JTextField();
        btneliminarproductos = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtprecioventa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboBoxventaclientes = new javax.swing.JComboBox<>();
        btnlimpiarventa = new javax.swing.JButton();
        txtbuscar = new javax.swing.JTextField();
        btnbuscarcliente = new javax.swing.JButton();
        txtproductoventa = new javax.swing.JTextField();
        btninsertartablaventa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaventas = new javax.swing.JTable();
        btncalcular = new javax.swing.JButton();
        txttotal = new javax.swing.JTextField();
        btngenerarventa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        txtcantidadventa = new javax.swing.JTextField();
        txtmontoneto = new javax.swing.JTextField();
        txtigv = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        comboBoxProducto = new javax.swing.JComboBox<>();
        btneliminarventa = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pestañaclientes.setBackground(new java.awt.Color(158, 242, 244));
        pestañaclientes.setForeground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(157, 239, 228));

        jLabel17.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel17.setText("USUARIO :");

        jLabel18.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel18.setText("CLAVE :");

        txtusuariologin.setBackground(new java.awt.Color(255, 229, 229));
        txtusuariologin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtusuariologin.setForeground(new java.awt.Color(8, 0, 255));

        btnguardarlogin.setBackground(new java.awt.Color(195, 205, 254));
        btnguardarlogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnguardarlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/iniciar-sesion_1.png"))); // NOI18N
        btnguardarlogin.setText("GUARDAR");
        btnguardarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarloginActionPerformed(evt);
            }
        });

        btnlimpiarlogin.setBackground(new java.awt.Color(195, 205, 254));
        btnlimpiarlogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnlimpiarlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnlimpiarlogin.setText("LIMPIAR");
        btnlimpiarlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarloginActionPerformed(evt);
            }
        });

        btnregistro.setBackground(new java.awt.Color(195, 205, 254));
        btnregistro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnregistro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registrarse.png"))); // NOI18N
        btnregistro.setText("REGISTRATE");
        btnregistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistroActionPerformed(evt);
            }
        });

        txtclavelogin.setBackground(new java.awt.Color(255, 229, 229));
        txtclavelogin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtclavelogin.setForeground(new java.awt.Color(8, 0, 255));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/perfil-del-usuario.png"))); // NOI18N

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 50)); // NOI18N
        jLabel6.setText("LOGIN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(253, 253, 253)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18)
                            .addComponent(jLabel17))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclavelogin, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(txtusuariologin)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(jLabel14)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 165, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnlimpiarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(btnguardarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(368, 368, 368))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(btnregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtusuariologin, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclavelogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlimpiarlogin, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        pestañaclientes.addTab("LOGIN", jPanel1);

        jPanel2.setBackground(new java.awt.Color(157, 239, 228));

        jLabel9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel9.setText("DNI :");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel10.setText("CORREO :");

        jLabel11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel11.setText("SEXO :");

        jLabel12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel12.setText("EDAD :");

        txtnombrecliente.setBackground(new java.awt.Color(255, 229, 229));
        txtnombrecliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtnombrecliente.setForeground(new java.awt.Color(8, 0, 255));

        txtsexocliente.setBackground(new java.awt.Color(255, 229, 229));
        txtsexocliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtsexocliente.setForeground(new java.awt.Color(8, 0, 255));

        txtedadcliente.setBackground(new java.awt.Color(255, 229, 229));
        txtedadcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtedadcliente.setForeground(new java.awt.Color(8, 0, 255));

        btnlimpiarcliente.setBackground(new java.awt.Color(195, 205, 254));
        btnlimpiarcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnlimpiarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnlimpiarcliente.setText("LIMPIAR");
        btnlimpiarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarclienteActionPerformed(evt);
            }
        });

        btnguardarcliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnguardarcliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnguardarcliente.setText("GUARDAR");
        btnguardarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarclienteActionPerformed(evt);
            }
        });

        tablaclientes.setBackground(new java.awt.Color(204, 255, 255));
        tablaclientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        tablaclientes.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jScrollPane2.setViewportView(tablaclientes);

        btneliminarclientes.setBackground(new java.awt.Color(195, 205, 254));
        btneliminarclientes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png"))); // NOI18N
        btneliminarclientes.setText("ELIMINAR");
        btneliminarclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarclientesActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/clientelogo.png"))); // NOI18N

        txtdni.setBackground(new java.awt.Color(255, 229, 229));
        txtdni.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtdni.setForeground(new java.awt.Color(8, 0, 255));

        jLabel15.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel15.setText("NOMBRE :");

        txtcorreocliente.setBackground(new java.awt.Color(255, 229, 229));
        txtcorreocliente.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcorreocliente.setForeground(new java.awt.Color(8, 0, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15))
                        .addGap(82, 82, 82)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtnombrecliente)
                            .addComponent(txtsexocliente)
                            .addComponent(txtedadcliente, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(txtdni)
                            .addComponent(txtcorreocliente)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnlimpiarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnguardarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btneliminarclientes)
                                .addGap(83, 83, 83))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtnombrecliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtcorreocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtsexocliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtedadcliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnguardarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btneliminarclientes)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel16)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pestañaclientes.addTab("CLIENTES", jPanel2);

        jPanel3.setBackground(new java.awt.Color(157, 239, 228));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("NOMBRE : ");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("MARCA :");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("PRECIO :");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("CANTIDAD :");

        txtprecioproductos.setBackground(new java.awt.Color(255, 229, 229));
        txtprecioproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtprecioproductos.setForeground(new java.awt.Color(8, 0, 255));

        txtcantidadproductos.setBackground(new java.awt.Color(255, 229, 229));
        txtcantidadproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcantidadproductos.setForeground(new java.awt.Color(8, 0, 255));

        btnlimpiarproductos.setBackground(new java.awt.Color(195, 205, 254));
        btnlimpiarproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnlimpiarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnlimpiarproductos.setText("LIMPIAR");
        btnlimpiarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarproductosActionPerformed(evt);
            }
        });

        btnguardarproductos.setBackground(new java.awt.Color(195, 205, 254));
        btnguardarproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnguardarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btnguardarproductos.setText("GUARDAR");
        btnguardarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarproductosActionPerformed(evt);
            }
        });

        tablaproductos.setBackground(new java.awt.Color(190, 253, 248));
        tablaproductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tablaproductos.setGridColor(new java.awt.Color(0, 0, 0));
        tablaproductos.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jScrollPane1.setViewportView(tablaproductos);

        txtmarcaproductos.setBackground(new java.awt.Color(255, 229, 229));
        txtmarcaproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmarcaproductos.setForeground(new java.awt.Color(8, 0, 255));

        txtnombreproductos.setBackground(new java.awt.Color(255, 229, 229));
        txtnombreproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtnombreproductos.setForeground(new java.awt.Color(8, 0, 255));

        btneliminarproductos.setBackground(new java.awt.Color(195, 205, 254));
        btneliminarproductos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarproductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/basura.png"))); // NOI18N
        btneliminarproductos.setText("ELIMINAR:");
        btneliminarproductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarproductosActionPerformed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoproductos_1.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logoproducto_2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel5))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(45, 45, 45)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(76, 76, 76)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtprecioproductos, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                                .addComponent(txtmarcaproductos)
                                .addComponent(txtnombreproductos))
                            .addComponent(txtcantidadproductos, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addContainerGap(20, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnlimpiarproductos)
                                .addGap(29, 29, 29)
                                .addComponent(btnguardarproductos))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(364, 364, 364)
                                .addComponent(btneliminarproductos))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(8, 8, 8)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombreproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtmarcaproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtprecioproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtcantidadproductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiarproductos)
                            .addComponent(btnguardarproductos)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btneliminarproductos)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pestañaclientes.addTab("PRODUCTO", jPanel3);

        jPanel4.setBackground(new java.awt.Color(157, 239, 228));

        jLabel7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel7.setText("PRECIO :");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setText("CANTIDAD:");

        txtprecioventa.setBackground(new java.awt.Color(255, 229, 229));
        txtprecioventa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtprecioventa.setForeground(new java.awt.Color(8, 0, 255));

        jLabel13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel13.setText("CLIENTES");

        jComboBoxventaclientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBoxventaclientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecciona un cliente" }));
        jComboBoxventaclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxventaclientesActionPerformed(evt);
            }
        });

        btnlimpiarventa.setBackground(new java.awt.Color(195, 205, 254));
        btnlimpiarventa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnlimpiarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/limpiar.png"))); // NOI18N
        btnlimpiarventa.setText("LIMPIAR");
        btnlimpiarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarventaActionPerformed(evt);
            }
        });

        txtbuscar.setBackground(new java.awt.Color(255, 229, 229));
        txtbuscar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtbuscar.setForeground(new java.awt.Color(8, 0, 255));

        btnbuscarcliente.setBackground(new java.awt.Color(151, 209, 198));
        btnbuscarcliente.setText("BUSCAR CLIENTE");
        btnbuscarcliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuscarclienteActionPerformed(evt);
            }
        });

        txtproductoventa.setBackground(new java.awt.Color(255, 229, 229));
        txtproductoventa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtproductoventa.setForeground(new java.awt.Color(8, 0, 255));

        btninsertartablaventa.setBackground(new java.awt.Color(195, 205, 254));
        btninsertartablaventa.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btninsertartablaventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agregar.png"))); // NOI18N
        btninsertartablaventa.setText("GUARDAR");
        btninsertartablaventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertartablaventaActionPerformed(evt);
            }
        });

        tablaventas.setBackground(new java.awt.Color(204, 255, 255));
        tablaventas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tablaventas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaventas.setSelectionBackground(new java.awt.Color(255, 51, 102));
        jScrollPane3.setViewportView(tablaventas);

        btncalcular.setBackground(new java.awt.Color(195, 205, 254));
        btncalcular.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btncalcular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/calculator.png"))); // NOI18N
        btncalcular.setText("CALCULAR");
        btncalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalcularActionPerformed(evt);
            }
        });

        txttotal.setBackground(new java.awt.Color(255, 229, 229));
        txttotal.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txttotal.setForeground(new java.awt.Color(8, 0, 255));

        btngenerarventa.setBackground(new java.awt.Color(195, 205, 254));
        btngenerarventa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btngenerarventa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTNgenerarventa.png"))); // NOI18N
        btngenerarventa.setText("GENERAR VENTA");
        btngenerarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenerarventaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Subtotal");

        txtfecha.setBackground(new java.awt.Color(255, 229, 229));
        txtfecha.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        txtcantidadventa.setBackground(new java.awt.Color(255, 229, 229));
        txtcantidadventa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtcantidadventa.setForeground(new java.awt.Color(8, 0, 255));

        txtmontoneto.setBackground(new java.awt.Color(255, 229, 229));
        txtmontoneto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtmontoneto.setForeground(new java.awt.Color(8, 0, 255));

        txtigv.setBackground(new java.awt.Color(255, 229, 229));
        txtigv.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtigv.setForeground(new java.awt.Color(8, 0, 255));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel21.setText("IGV");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Monto neto");

        comboBoxProducto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBoxProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "selecciona un producto" }));
        comboBoxProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxProductoActionPerformed(evt);
            }
        });

        btneliminarventa.setBackground(new java.awt.Color(195, 205, 254));
        btneliminarventa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btneliminarventa.setText("ELIMINAR:");
        btneliminarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarventaActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel23.setText("Cod :");

        jLabel24.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel24.setText("Producto :");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                .addComponent(btnlimpiarventa)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addComponent(btninsertartablaventa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(btngenerarventa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel22)
                                .addGap(18, 18, 18)
                                .addComponent(txtmontoneto, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btncalcular)
                            .addComponent(btneliminarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel13))
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jComboBoxventaclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(txtcantidadventa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel24))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtproductoventa, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnbuscarcliente, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(112, 112, 112))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jComboBoxventaclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscarcliente)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtprecioventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcantidadventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtproductoventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btneliminarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(btncalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtigv, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnlimpiarventa)
                            .addComponent(btninsertartablaventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtmontoneto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btngenerarventa, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pestañaclientes.addTab("VENTA", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pestañaclientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 976, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pestañaclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 690, Short.MAX_VALUE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btneliminarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarventaActionPerformed
        Eliminarventa();

        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarventaActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void btngenerarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenerarventaActionPerformed

        conexion coninsert =new conexion();

        Connection cn = coninsert.conectar();

        //-----******************************************insertar venta  bd**************************************

        String sql2 ="";


        //
        String comboboxventa ;
        double total;
        String fecha;

        comboboxventa =jComboBoxventaclientes.getSelectedItem().toString();
        total =Double.parseDouble(txttotal.getText());
        fecha =txtfecha.getText()   ;

        sql2="  INSERT INTO venta (cliente,fecha,montototal)        "
        +"   VALUES(?,?,?)  ";

        try {

            //                       preparo la consulta con  PreparedStatement  llamandola pst
            //                       pasandole la conexion  y mi consulta sql invocando al metodo connection .prepare statement
            PreparedStatement pst  = cn.prepareStatement(sql2);

            //                        usamos la variable pst y set para estableser los daos en la consulta               especificando el orden del valuee (??) y el dato a asignar (nom)
            pst.setString(1,comboboxventa);
            pst.setDouble(3,total);
            pst.setString(2,fecha);

            //ejecuto la consulta con  executeUpdate y la transformo a un numero entero llamado n
            int n =pst.executeUpdate();

            //si el numero es mayor a 0 osea si es true (verdadero) me imprime un texto
            if(n>0){
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                

                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                

                //                          //para que este siempre actualisado el combobox
                //                          llenarcomboboxventa("producto2","nombre",jComboBoxventaproductos);

                JOptionPane.showMessageDialog(null, "VENTA REGISTRADA","conexi",JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "_________________________"+ex,"erorerrrr",JOptionPane.ERROR_MESSAGE);

        }

        //-----******************************************FINNNNinsertar venta  bd**************************************

        //            //********************************************* detalle ventaa insertar******************************
        //

        //***************************AYARR EL IDVENTAS PARA DETALLEVENTA****************************************
        String idventa="";
        String sql3="      SELECT MAX(idventa) from venta               ";

        try {
            Statement pst;

            pst = cn.createStatement();

            ResultSet resul =pst.executeQuery(sql3);

            while(resul.next()){

                idventa = resul.getString(1);

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "erooo de insercion"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);
        }
        //***************************FINNNN  AYARR EL IDVENTAS PARA DETALLEVENTA****************************************

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        String sql="";
        

        int idproduc=0;
        int cantidad =0;
        double preciouni=0;

        for (int i = 0; i < tablaventas.getRowCount(); i++) {

            idproduc  =  Integer.parseInt(tablaventas.getValueAt(i, 0).toString());
            cantidad        =       Integer.parseInt(tablaventas.getValueAt(i, 2).toString());
            preciouni     =Double.parseDouble(  tablaventas.getValueAt(i, 3)  .toString());

            
            
            
 
            
            
            
            
            
            
            
            
            
            
            


            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            

            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            sql ="  INSERT INTO detalleventa (idproducto,cantidad,preciounitario,idventa)     VALUES (?,?,?,?)     ";

            try {

                PreparedStatement pst  = cn.prepareStatement(sql);

                
                pst.setInt(1, idproduc   );
                pst.setInt(2, cantidad);
                pst.setDouble(3, preciouni);
                pst.setString(4,idventa);
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
       String sqlm = "SELECT cantidad FROM producto2 WHERE codigo = ?";

        try (PreparedStatement pstm = cn.prepareStatement(sqlm)) {
        pstm.setInt(1, idproduc);
        try (ResultSet rsm = pstm.executeQuery()) {
            if (rsm.next()) {
            
                //int cantidadcompra es la cantidad que tenia la bd antes de l compra 
                //int cantidad  es la cantidad que se esta comprandoes la cantidad que tenia la bd antes de l compra
                //int cantidadstok  la resta de cuantos productos quedan haora que se compraron
                
            int cantidadcompra = 0;
            
            
             
            
               cantidadcompra = rsm.getInt("cantidad");  // Almacenar en la variable
          //      txtpp.setText(String.valueOf(cantidadcompra));  // Establecer en el campo de texto
   
            
          //  txtppa.setText(String.valueOf(cantidad));
        
            
            int cantidadstok =  cantidadcompra - cantidad;
            
            
            
           // txtppa2.setText(String.valueOf(cantidadstok));
            
                if (cantidadstok <=0 ) {
                     // Mostrar mensaje al usuario
        JOptionPane.showMessageDialog(null, "Ya no hay existencias de este producto.", "Sin existencias", JOptionPane.WARNING_MESSAGE);
                    
                    
                    
                }else{
 
           
           
            String sqlActualizarCantidad = "UPDATE producto2 SET cantidad = ? WHERE codigo = ?";
             PreparedStatement pstActualizar = cn.prepareStatement(sqlActualizarCantidad);
            pstActualizar.setInt(1, cantidadstok);  // Establecer la nueva cantidad
            pstActualizar.setInt(2, idproduc);  // Establecer el código del producto

            
            int filasActualizadas = pstActualizar.executeUpdate();
            }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            } else { 
                
            System.out.println("No se encontró el producto con código " + idproduc);
        }
    }
} catch (SQLException e) {
    JOptionPane.showMessageDialog(null, "Error al consultar la cantidad: " + e, "Error", JOptionPane.ERROR_MESSAGE);
} 
                
                
                
                
                
                
                
                
                
                
                
                int n = pst.executeUpdate();

                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                

    


                
                
                
                
                if(n>0){

                    // JOptionPane.showMessageDialog(null, "PERAAAAA","conexi",JOptionPane.INFORMATION_MESSAGE);
                    limpiarproductos();
                    mostrartablaproductos();

                    
                
                

                    
 
                    

                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    
                }

            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, "erooo de insercion"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

            }
        }//FIN DEL FOR
        //
        //
        //
        //********************************************* FINN   detalle ventaa insertar******************************

        //         TODO add your handling code here:
        
        

        
        
        
        
        
        
        
        
        
        
        
        
        //ACTUALISAR STOKKKKKKKKKKKKK
        
        // Obtener el ID del producto

        
        

        
        
        
        
        
    }//GEN-LAST:event_btngenerarventaActionPerformed

    private void btncalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalcularActionPerformed
        calculartot();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncalcularActionPerformed

    private void btninsertartablaventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertartablaventaActionPerformed

        Double subtotal ;

        String rowData[] = new String[4];

        String producto=txtproductoventa.getText()   ;
        String precio=txtprecioventa.getText();
        String cantidad=txtcantidadventa.getText() ;

        
        
        if (producto.equals("") || precio.equals("") || cantidad.equals("") || jComboBoxventaclientes.getSelectedItem().equals("selecciona un cliente")|| comboBoxProducto.getSelectedItem().equals("selecciona un producto")){
        
        
        JOptionPane.showMessageDialog(null, "Le falta completar un campo o dato invalido","conexi",JOptionPane.INFORMATION_MESSAGE);
        

        

        
        }else{
             
        rowData[0] = producto   ;
        rowData[1]=precio;
        rowData[2]=  cantidad ;

        subtotal = Double.parseDouble(rowData[1])  *  Integer.parseInt(rowData[2]);

        rowData[3] = subtotal.toString();

        modeloventas.addRow(rowData);
// Después de realizar ciertas operaciones
comboBoxProducto.setSelectedIndex(0); // 0 representa el índice del valor por defecto
//jComboBoxventaclientes.setSelectedIndex(0);

        limpiarventa();

        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btninsertartablaventaActionPerformed

    private void btnbuscarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuscarclienteActionPerformed

        conexion conautocompletar= new conexion();
        Connection cn = conautocompletar.conectar();

        String  buscar =txtbuscar.getText();
        String sql;
        sql=" SELECT  nombre FROM clientes WHERE dni = '  "+buscar+ " ' "         ;

        try {
            Statement pst;

            pst = cn.createStatement();

            ResultSet resul =pst.executeQuery(sql);

            //mientras resul tenga datos pasa al siguiente
            if (resul.next()){
                jComboBoxventaclientes.setSelectedItem( resul.getString("nombre"));

                //              txtprecioventa.setText( resul.getString("nombre"))       ;

            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "error de buscqueda"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnbuscarclienteActionPerformed

    private void btnlimpiarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarventaActionPerformed

        limpiarventa();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarventaActionPerformed

    private void jComboBoxventaclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxventaclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxventaclientesActionPerformed

    private void btneliminarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarproductosActionPerformed

        try {
            //optinen la fila seleccionada en la variable fila y fila sera 0,1,2,3  dependiendo cual elijas recierad que ay cuenta el cero
            int fila;
            fila= tablaproductos.getSelectedRow();
            if (fila==-1) {

                JOptionPane.showMessageDialog(null, "Porfavor de Seleccionar un Producto del cuadro","error",JOptionPane.ERROR_MESSAGE);

            }else{
                String codigo =tablaproductos.getValueAt(fila, 0).toString();

                eliminartablas("producto2","codigo",codigo);

            }

        } catch (Exception e) {
        }

        // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarproductosActionPerformed

    private void btnguardarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarproductosActionPerformed

        //        crea un objeto de la clase coneccion llamado coninsert
        conexion coninsert =new conexion();

        //        creo una variable de tipo connection llamado cn
        //                que sera igual ami objeto anterior con la funcion conectar
        Connection cn = coninsert.conectar();

        //creo una variable para mi sql
        String sql ="";

        //            creo variables para los txt inputs con su tipo de dato
        String nom ;
        double precio;
        int cantidad;
        String marca;

        //          ago que las variables sean iguales al txt corexpondiente obtenendo el dato get text()
        nom = txtnombreproductos.getText();
        precio =Double.parseDouble(txtprecioproductos.getText());
        cantidad =Integer.parseInt(txtcantidadproductos.getText());
        marca =txtmarcaproductos.getText();

        //          creo una variavle que almasene mi consulta sql   los parametros ?????   seran asigmados despues en la consulta
        sql="  INSERT INTO producto2(nombre,precio,cantidad, marca)        "
        +"   VALUES(?,?,?,?)  ";

        try {

            //                       preparo la consulta con  PreparedStatement  llamandola pst
            //                       pasandole la conexion  y mi consulta sql invocando al metodo connection .prepare statement
            PreparedStatement pst  = cn.prepareStatement(sql);

            //                        usamos la variable pst y set para estableser los daos en la consulta               especificando el orden del valuee (??) y el dato a asignar (nom)
            pst.setString(1,nom);
            pst.setDouble(2, precio);
            pst.setInt(3, cantidad);
            pst.setString(4,marca);

            //ejecuto la consulta con  executeUpdate y la transformo a un numero entero llamado n
            int n =pst.executeUpdate();

            //si el numero es mayor a 0 osea si es true (verdadero) me imprime un texto
            if(n>0){

                //                          //para que este siempre actualisado el combobox
                //                          llenarcomboboxventa("producto2","nombre",jComboBoxventaproductos);

                JOptionPane.showMessageDialog(null, "PRODUCTO INSERTADO","conexi",JOptionPane.INFORMATION_MESSAGE);
                limpiarproductos();
                mostrartablaproductos();

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "erooo de insercion"+ex,"erorerrrr",JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarproductosActionPerformed

    private void btnlimpiarproductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarproductosActionPerformed
        limpiarproductos();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarproductosActionPerformed

    private void btneliminarclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarclientesActionPerformed

        try {
            //optinen la fila seleccionada en la variable fila y fila sera 0,1,2,3  dependiendo cual elijas recierad que ay cuenta el cero
            int fila;
            fila= tablaclientes.getSelectedRow();
            if (fila==-1) {

                JOptionPane.showMessageDialog(null, "Porfavor de Seleccionar un cliente del cuadro","error",JOptionPane.ERROR_MESSAGE);

            }else{
                String codigo =tablaclientes.getValueAt(fila, 0).toString();

                eliminartablas("clientes","idclientes",codigo);

                mostrartablaclientes ();

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error de buscqueda"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btneliminarclientesActionPerformed

//////// ////////////////////////////////////////////////////// PESTAÑA CLIENTESS//////////////////////////////////////////

        
    private void btnguardarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarclienteActionPerformed

        //        crea un objeto de la clase coneccion llamado coninsert
        conexion coninsert =new conexion();

        //        creo una variable de tipo connection llamado cn
        //                que sera igual ami objeto anterior con la funcion conectar
        Connection cn = coninsert.conectar();

        //creo una variable para mi sql
        String sql ="";

        //            creo variables para los txt inputs con su tipo de dato
        String nom ;

        String sexo ;
        String correo ;

        String edad ;
        String dni ;

        //          ago que las variables sean iguales al txt corexpondiente obtenendo el dato get text()
        nom = txtnombrecliente.getText();

        correo = txtcorreocliente.getText();
        edad = txtedadcliente.getText();
        sexo = txtsexocliente.getText();
        dni = txtdni.getText();

        //          creo una variavle que almasene mi consulta sql   los parametros ?????   seran asigmados despues en la consulta
        sql="  INSERT INTO clientes(nombre,edad,correo,sexo,dni)        "
        +"   VALUES(?,?,?,?,?)  ";

        try {

            //                       preparo la consulta con  PreparedStatement  llamandola pst
            //                       pasandole la conexion  y mi consulta sql invocando al metodo connection .prepare statement
            PreparedStatement pst  = cn.prepareStatement(sql);

            //                        usamos la variable pst y set para estableser los daos en la consulta               especificando el orden del valuee (??) y el dato a asignar (nom)
            pst.setString(1,nom);
            pst.setString(2,edad);
            pst.setString(3,correo);
            pst.setString(4,sexo);
            pst.setString(5,dni);

            if(nom.equals("")  ||   edad.equals("") || sexo.equals("")  ||  correo.equals("") ||  dni.equals("")   ){

                JOptionPane.showMessageDialog(null, "Le falta completar un campo o dato invalido","conexi",JOptionPane.INFORMATION_MESSAGE);

            }else{
                //ejecuto la consulta con  executeUpdate y la transformo a un numero entero llamado n
                int n =pst.executeUpdate();

                //si el numero es mayor a 0 osea si es true (verdadero) me imprime un texto
                if(n>0){

                    llenarcomboboxventa("clientes","nombre",jComboBoxventaclientes);

                    JOptionPane.showMessageDialog(null, "CLIENTE GUARDADO ","conexi",JOptionPane.INFORMATION_MESSAGE);

                    //borar lo que estaba escrito llamando al metodo limpiar
                    limpiarcliente();
                    mostrartablaclientes();

                }
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(null, "erooo de insercion"+ex,"erorerrrr",JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnguardarclienteActionPerformed

    private void btnlimpiarclienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarclienteActionPerformed
        limpiarcliente();

        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarclienteActionPerformed

    private void btnregistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistroActionPerformed
        //que me redirija a otra ventana osea clase jfrom creando una nueva llamada pagina y aser que sea visible co set visible

        //desecho  la pagina anterior
        this.dispose();
        //que me redirija a otra ventana osea clase jfrom creando una nueva llamada pagina y aser que sea visible co set visible
        registros paginaregistro =new registros();
        paginaregistro.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnregistroActionPerformed

    private void btnlimpiarloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarloginActionPerformed
        limpiarlogin();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarloginActionPerformed

//GEN-FIRST:event_btnguardarloginActionPerformed

       private void btnguardarloginActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
    conexion conmostrar = new conexion();
     Connection cn = conmostrar.conectar();

//             Statement pst  = cn.createStatement();
//            
//             ResultSet resul =pst.executeQuery(sql);

             
            
   String usuario;
   String clave;
// String  claven;

   usuario=txtusuariologin.getText();
    clave=txtclavelogin.getText();
//    claven=txtkkk.getText();
  String sql="SELECT * FROM registros WHERE usuario='"+usuario+"' and clave ='"+clave+"'" ;

        try {
            
            PreparedStatement pst  = cn.prepareStatement(sql);
            
            
            ResultSet resul =pst.executeQuery(sql);
                    
            if (resul.next()) {
                
                
                                                   
                    //borar lo que estaba escrito llamando al metodo limpiar
                       limpiarlogin();
                       
                       //cuando el login es corecto y los datos igual que me mande ala pestaña  producto (2)
                 pestañaclientes.setSelectedIndex(2);
                        
                 //si el login es corecto y inicio sesion abiliar para que se puedan usar las demas pestañas
                      pestañaclientes.setEnabledAt(1, true);
                            pestañaclientes.setEnabledAt(2, true);
                 pestañaclientes.setEnabledAt(3, true);
                
            }else{
                                               JOptionPane.showMessageDialog(null, "USTED NO SE REGISRESE","conexi",JOptionPane.ERROR_MESSAGE);


            
            }
            
            
            
        } catch (Exception e) {
        
                          JOptionPane.showMessageDialog(null, "erooo de login"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

        
        
        
        }












        // TODO add your handling code here:
    }   
    
    
    
    
    
    
    
    
    
    
//GEN-LAST:event_btnguardarloginActionPerformed

    private void comboBoxProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxProductoActionPerformed

String productoSeleccionado = (String) comboBoxProducto.getSelectedItem();

    // Realizar consulta para obtener el precio y el ID del producto seleccionado
    String sql = "SELECT codigo, precio FROM producto2 WHERE nombre = ?";
    
    try (Connection cn = new conexion().conectar();
         PreparedStatement pst = cn.prepareStatement(sql)) {
        
        pst.setString(1, productoSeleccionado);
        ResultSet resul = pst.executeQuery();

        if (resul.next()) {
            // Llenar txtproductoventa con el ID del producto
            txtproductoventa.setText(resul.getString("codigo"));
            
            // Llenar txtprecioventa con el precio del producto
            txtprecioventa.setText(resul.getString("precio"));
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error al obtener información del producto: " + e, "Error", JOptionPane.ERROR_MESSAGE);
    }

        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxProductoActionPerformed

    
    
   
    
    
    
    
    
    
    
    
        //////////////////////////////////////////////////////PESTAÑA PRODUCTOSSSSSSSS//////////////////////////////////////////

    private void limpiarproductos(){
    
        txtnombreproductos.setText(null);
        txtcantidadproductos.setText(null);
        txtmarcaproductos.setText(null);
        txtprecioproductos.setText(null);

    
    
    }
  
    public void mostrartablaproductos (){
    
            //nos permite manejar la tabla 
////    creamos una variable llamadda modelo
//    DefaultTableModel modelo;
//    //añado los titulos ala tabla como un stringareglo
//    String[] titulos= {"COD","NOMBRE","PRECIO","MARCA","CANTIDAD","IMPORTE"};
//    
//    String []datos =new String[6];
    
    
        
        
        
        
        
        
        
        
    conexion conmostrar = new conexion();
     Connection cn = conmostrar.conectar();
     
    String sql="" ;
   //insertar los datos del titulo ala traba con defaulrtable model  creados antes
    modeloproductos = new DefaultTableModel(null,titulosproductos); 
    
    
    sql="SELECT  * FROM producto2";
            
   
    
        try {
//             creo una variable de sentencia sql donde pondre mi consulta que sera = a cn.createStatement();
//                     
//                     le paso la conexion cn y creo la sentencia  con el metodo  create..... 
             Statement pst  = cn.createStatement();
            
             ResultSet resul =pst.executeQuery(sql);
             //comoo me devuelbe un conjunto de datos(selec*from ) uso resultset  
             //estableser resultado en la variable resul = a la ejecucion de la consulta con execute
             
            
                        //resulnext()  lee la siguiente fila(resul) pero con el while leera las filas mintras aiga (siguiente )
                      while(resul.next()){
                          
                          //creo mi variable para importe precio por cantiodad
//                       Double imp;
                       
                       //seleciono datosy si posision  previamente echos ariba y los asicno  =    asu campo de la bd sonde se get 
                                datosproductos[0]=resul.getString("codigo");
                                datosproductos[1]=resul.getString("nombre");
                                datosproductos[2]=resul.getString("precio");
                                datosproductos[3]=resul.getString("marca");
                                datosproductos[4]=resul.getString("cantidad");
                                
                                
//                                le asigno un valor que es que importe es igual a precio por cantidad 
//                                 imp = Double.parseDouble(datosproductos[2])*Integer.parseInt(datosproductos[4]);
//                                
//                                datosproductos[5]=imp.toString();
                                
                                
                                //addrow añadir filas  de los datos anteriores
                                modeloproductos.addRow(datosproductos);
                                
                                
                                
                       }
                      //estableser modelo creado  el la tablallamada tabla
                      tablaproductos.setModel(modeloproductos);
                      
            
        } catch (Exception e) {
            
                  JOptionPane.showMessageDialog(null, "erooo de MOSTRARRRR"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

            
            
        }
    
    
    
    
    
    
    
    
    
    
    
    }
    
    
    
    
    
    
    
    
    
        //BOTON ELIMINARRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR
  private void Eliminarventa(){
  int fila;
      if (modeloventas.getRowCount()>0) {
          if (tablaventas.getSelectedRow()!=-1) {
              fila= tablaventas.getSelectedRow();
              modeloventas.removeRow(fila);
              calculartot();
             
          }else{
          JOptionPane.showMessageDialog(null, "Porfavor de Seleccionar un Producto del cuadro");
          }
      }else{
          JOptionPane.showMessageDialog(null, "No hay filas en el cuadro");
      }
  
  
  
  }
  
      public void eliminartablas (String tabla,String columna,String valor){
       
  conexion coneliminar =new conexion();
    Connection  cone =coneliminar.conectar();
      
    String sql="";
    //primmero la tabla luego el campo de la tabla(columna )  sea igual a valor
    sql="DELETE FROM "+tabla+" WHERE  "+columna+"   = ' "+valor+" '          "    ;
      try {
            PreparedStatement pst  = cone.prepareStatement(sql);
            
             int n =pst.executeUpdate();
            
            
             if(n>0){
                       
                               JOptionPane.showMessageDialog(null, "ELIMINADO","yesss",JOptionPane.INFORMATION_MESSAGE);
                                   mostrartablaproductos();
                       }
             
             
             
             
             
             
             
      } catch (Exception e) {
      }
     
  }
    
        //////////////////////////////////////////////////////FINNNN  PESTAÑA PRODUCTOSSSSSSSS//////////////////////////////////////////

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
             ////////////////////////////////////////////////////// PESTAÑA VENTA//////////////////////////////////////////

    
    
    
      
    public void llenarcomboboxventa (String tabla ,String valor,JComboBox combo){
    
    conexion concombobox = new conexion();
     Connection cn = concombobox.conectar();
     
    String sql="SELECT *  FROM  " + tabla;
    
    
    
        try {
            
            Statement pst  = cn.createStatement();
            
             ResultSet resul =pst.executeQuery(sql);
            
           //mientras resul tenga datos pasa al siguiente
             while(resul.next()){
             
             combo.addItem(resul.getString(valor));
             
             //aquiii
            
             
             }
             
        } catch (Exception e) {
                              JOptionPane.showMessageDialog(null, "erorr chek boxxxxxxx"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

            
        }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
   
      private void limpiarventa(){
    
       txtbuscar.setText(null);
        txtproductoventa.setText(null);
        txtcantidadventa.setText(null);
        txtprecioventa.setText(null);

    
    
   }
  
   
         //////////////////////////////////////////////////////FINNNNNN PESTAÑA VENTA//////////////////////////////////////////

        
        
        
    
     
    
    
    
    
    
        
        
        
        
        
    private void limpiarcliente(){
    
        txtnombrecliente.setText(null);
        txtcorreocliente.setText(null);
        txtsexocliente.setText(null);
        txtedadcliente.setText(null);

    
    
    }
    
    
    public void mostrartablaclientes (){
    

        
        
        
        
        
        
        
        
    conexion conmostrarclientes = new conexion();
     Connection cn = conmostrarclientes.conectar();
     
    String sql="" ;
   
    modeloclientes  = new DefaultTableModel(null,titulosclientes ); 
    
    
    sql="SELECT  * FROM clientes";
            
   
    
        try {
//             creo una variable de sentencia sql donde pondre mi consulta que sera = a cn.createStatement();
//                     
//                     le paso la conexion cn y creo la sentencia  con el metodo  create..... 
             Statement pst  = cn.createStatement();
            
             ResultSet resul =pst.executeQuery(sql);
             //comoo me devuelbe un conjunto de datos(selec*from ) uso resultset  
             //estableser resultado en la variable resul = a la ejecucion de la consulta con execute
             
            
                        //resulnext()  lee la siguiente fila(resul) pero con el while leera las filas mintras aiga (siguiente )
                      while(resul.next()){
                          
                    
                       
                       //seleciono datosy si posision  previamente echos ariba y los asicno  =    asu campo de la bd sonde se get 
                                datosclientes [0]=resul.getString("idclientes");
                                datosclientes [1]=resul.getString("nombre");
                                datosclientes [2]=resul.getString("edad");
                                datosclientes [3]=resul.getString("correo");
                                datosclientes [4]=resul.getString("sexo");
                                datosclientes[5] = resul.getString("dni");
//                                le asigno un valor que es que importe es igual a precio por cantidad 
                                
                                
                                //addrow añadir filas  de los datos anteriores
                                modeloclientes .addRow(datosclientes );
                                
                                
                                
                       }
                      //estableser modelo creado  el la tablallamada tabla
                      tablaclientes .setModel(modeloclientes );
                     
            
        } catch (Exception e) {
            
                  JOptionPane.showMessageDialog(null, "erooo de MOSTRARRRR"+e,"erorerrrr",JOptionPane.ERROR_MESSAGE);

            
            
        }
    
    
    
    
    
    
    
    
    
    
    
    }
  
       /////////////////// /////////////////////////////////////////////FINNNNNN PESTAÑA CLIENTESS//////////////////////////////////////////  
       /////////////////// /////////////////////////////////////////////FINNNNNN PESTAÑA CLIENTESS//////////////////////////////////////////

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    


    //con el boton registrarse que me aparesca la grafica de la clase registro
        public void calculartot(){
    
    double importe=0;
      double tot=0;
    
    
             double igv ;
             double Mneto ;
        
        
        for (int i = 0; i < tablaventas.getRowCount(); i++) {
            
           
            importe = importe    +           Double.parseDouble(modeloventas.getValueAt(i,3)        .toString());
            
             

        }

        // Utiliza un objeto DecimalFormat para redondear a dos decimales
DecimalFormat df = new DecimalFormat("#.00");

        tot=+importe;
        igv = tot *0.18;
       Mneto = igv+tot;
       
       
txttotal.setText(df.format(tot));
txtigv.setText(df.format(igv));
txtmontoneto.setText(df.format(Mneto));
       
       
       
       
       
       
    }
    
    
   
        
        
    
    

    
    
    
    
    
          
    
    private void limpiarlogin(){
    
        
            txtusuariologin.setText(null);
                txtclavelogin.setText(null);

    
    
    }

    




    //////// ////////////////////////////////////////////////////// FINNNN  PESTAÑA LOGINNN//////////////////////////////////////////

    
    
    
    
    
    

    
    
    
    

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscarcliente;
    private javax.swing.JButton btncalcular;
    private javax.swing.JButton btneliminarclientes;
    private javax.swing.JButton btneliminarproductos;
    private javax.swing.JButton btneliminarventa;
    private javax.swing.JButton btngenerarventa;
    private javax.swing.JButton btnguardarcliente;
    private javax.swing.JButton btnguardarlogin;
    private javax.swing.JButton btnguardarproductos;
    private javax.swing.JButton btninsertartablaventa;
    private javax.swing.JButton btnlimpiarcliente;
    private javax.swing.JButton btnlimpiarlogin;
    private javax.swing.JButton btnlimpiarproductos;
    private javax.swing.JButton btnlimpiarventa;
    private javax.swing.JButton btnregistro;
    private javax.swing.JComboBox<String> comboBoxProducto;
    private javax.swing.JComboBox<String> jComboBoxventaclientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane pestañaclientes;
    private javax.swing.JTable tablaclientes;
    private javax.swing.JTable tablaproductos;
    private javax.swing.JTable tablaventas;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextField txtcantidadproductos;
    private javax.swing.JTextField txtcantidadventa;
    private javax.swing.JPasswordField txtclavelogin;
    private javax.swing.JTextField txtcorreocliente;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtedadcliente;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txtigv;
    private javax.swing.JTextField txtmarcaproductos;
    private javax.swing.JTextField txtmontoneto;
    private javax.swing.JTextField txtnombrecliente;
    private javax.swing.JTextField txtnombreproductos;
    private javax.swing.JTextField txtprecioproductos;
    private javax.swing.JTextField txtprecioventa;
    private javax.swing.JTextField txtproductoventa;
    private javax.swing.JTextField txtsexocliente;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtusuariologin;
    // End of variables declaration//GEN-END:variables
}
