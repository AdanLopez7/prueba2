
package sistemadeinformacion;

import java.awt.event.KeyEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.sql.*;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author Adan
 */
public class InterfazRegistro extends javax.swing.JFrame {

    Connection miConexion;
    public InterfazRegistro() {
        initComponents();
         this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        eti_registro = new javax.swing.JLabel();
        eti_usuario = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campoContra = new javax.swing.JPasswordField();
        campoUsuario = new javax.swing.JTextField();
        campoCorreo = new javax.swing.JTextField();
        botonCrearCuenta = new javax.swing.JButton();
        SeleccionCombo = new javax.swing.JComboBox();
        campoApellido = new javax.swing.JTextField();
        eti_apellido = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        eti_nombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_registro.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        eti_registro.setForeground(new java.awt.Color(240, 240, 240));
        eti_registro.setText("REGISTRO");
        getContentPane().add(eti_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, 30));

        eti_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eti_usuario.setForeground(new java.awt.Color(240, 240, 240));
        eti_usuario.setText("Usuario:");
        getContentPane().add(eti_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, -1, -1));

        campoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraActionPerformed(evt);
            }
        });
        campoContra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoContraKeyTyped(evt);
            }
        });
        getContentPane().add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 220, 30));

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 220, 30));

        campoCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                campoCorreoFocusLost(evt);
            }
        });
        campoCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorreoActionPerformed(evt);
            }
        });
        getContentPane().add(campoCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 220, 30));

        botonCrearCuenta.setBackground(new java.awt.Color(0, 51, 255));
        botonCrearCuenta.setForeground(new java.awt.Color(240, 240, 240));
        botonCrearCuenta.setText("Crear cuenta");
        botonCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCrearCuentaActionPerformed(evt);
            }
        });
        getContentPane().add(botonCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 120, -1));

        SeleccionCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selec...", "Docente", "Estudiante" }));
        getContentPane().add(SeleccionCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 220, -1));
        getContentPane().add(campoApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 220, 30));

        eti_apellido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eti_apellido.setForeground(new java.awt.Color(240, 240, 240));
        eti_apellido.setText("Apellidos:");
        getContentPane().add(eti_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 20));
        getContentPane().add(campoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 220, 30));

        eti_nombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        eti_nombre.setForeground(new java.awt.Color(240, 240, 240));
        eti_nombre.setText("Nombre:");
        getContentPane().add(eti_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(240, 240, 240));
        jLabel1.setText("Tipo de usuario:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 466, 479));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void campoCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorreoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_campoCorreoActionPerformed

    private void botonCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCrearCuentaActionPerformed
        
        int i=SeleccionCombo.getSelectedIndex();
        if(i==0)
        {
            JOptionPane.showMessageDialog(this,"seleccione el tipo de usuario");
        }else
        {
            if(i==1)
            {
                insertarDocentesBBDD();
            }else
            {
                if(i==2)
                {
                    insertarEstudiantesBBDD();
                }
            }
        }
        
        
    }//GEN-LAST:event_botonCrearCuentaActionPerformed

            

    private void campoContraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoContraKeyTyped
        // TODO add your handling code here:
        char num = evt.getKeyChar(); 
        char letra = evt.getKeyChar();
             
              if((num < '0'|| num > '9') && (letra < 'a'|| letra > 'z')){
                  evt.consume();
               
              JOptionPane.showMessageDialog(null, "ingrese solo nuneros o letras minusculas", "Advertencia",JOptionPane.ERROR_MESSAGE );
              campoContra.setText("");
              campoContra.requestFocus();
          }
              //else JOptionPane.showMessageDialog(rootPane, "Bienvenido al sistema");
    }//GEN-LAST:event_campoContraKeyTyped

    //metodo para validar correo electronico
    public boolean isEmail(String correo){
    
        Pattern pat = null;
        Matcher mat = null;
        pat = Pattern.compile("^[\\w\\\\\\+]+(\\.[\\w\\\\]+)*@([A-Za-z0-9-]+\\.)+[A-Za-z](2,4)$)");
        mat =pat.matcher(correo);
        if (mat.find()){
            return true;
        }else{
            return false;
        }
    }
    private void campoCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoCorreoFocusLost
        // TODO add your handling code here:
        /*if(isEmail(campoCorreo.getText())){
          
        }else{
            JOptionPane.showMessageDialog(null,"Email no valido","Validar Email",JOptionPane.INFORMATION_MESSAGE);
            campoCorreo.requestFocus();
        }*/
        
        int correcto=0;
        String email=campoCorreo.getText().trim();
        for(int i=0;i<email.length();i++)
        {
            if(email.charAt(i)=='@')
            {
                correcto++;
            }
        }
        
        if(correcto!=1)
        {
            JOptionPane.showMessageDialog(null,"Email no valido","Validar Email",JOptionPane.INFORMATION_MESSAGE);
            campoCorreo.requestFocus();
            
        }else
        {
            System.out.println("correctos");
        }
    }//GEN-LAST:event_campoCorreoFocusLost

    private void campoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoContraActionPerformed


    public static void main(String args[]) {
      
      /*  java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });*/
    }
    
    public void insertarEstudiantesBBDD()
    {
        
        try{
         //1 Crear Conexion 
          miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 preparar la consulta
         PreparedStatement miSentencia=miConexion.prepareStatement("INSERT INTO estudiantes (nombre,apellidos,usuario,password,correo) VALUES (?,?,?,?,?)");
         //3 establecer parametros de la consulta
          miSentencia.setString(1,campoNombre.getText());
          miSentencia.setString(2,campoApellido.getText());
          miSentencia.setString(3,campoUsuario.getText());
          miSentencia.setString(4,campoContra.getText());
          miSentencia.setString(5,campoCorreo.getText());
          miSentencia.executeUpdate();
          JOptionPane.showMessageDialog(this,"GUARDADO");
        }catch(Exception error)
        {
            System.out.println("no se puede conectar a base de datos");
        }
        
    }
    
    public void insertarDocentesBBDD()
    {
        
         try{
         //1 Crear Conexion 
          miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 preparar la consulta
         PreparedStatement miSentencia=miConexion.prepareStatement("INSERT INTO docentes (nombre,apellidos,usuario,password,correo) VALUES (?,?,?,?,?)");
         //3 establecer parametros de la consulta
          miSentencia.setString(1,campoNombre.getText());
          miSentencia.setString(2,campoApellido.getText());
          miSentencia.setString(3,campoUsuario.getText());
          miSentencia.setString(4,campoContra.getText());
          miSentencia.setString(5,campoCorreo.getText());
         // miSentencia.setString(6,codigo.getText());
          miSentencia.executeUpdate();
          JOptionPane.showMessageDialog(this,"GUARDADO");
        }catch(Exception error)
        {
            System.out.println("no se puede conectar a base de datos");
        }
    }
    
    public void ejecutar()
    {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistro().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JComboBox SeleccionCombo;
    private javax.swing.JButton botonCrearCuenta;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel eti_apellido;
    private javax.swing.JLabel eti_nombre;
    private javax.swing.JLabel eti_registro;
    private javax.swing.JLabel eti_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
