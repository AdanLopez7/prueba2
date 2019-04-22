
package sistemadeinformacion;
import com.placeholder.PlaceHolder;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Adan
 */
public class Login extends javax.swing.JFrame {

    Connection miConexion;
    PlaceHolder miHolder;
    public Login() {
        initComponents();
        holder();
         this.setLocationRelativeTo(null);
    }
    
    public void holder()
    {
        miHolder=new PlaceHolder(campoUsuario,"usuario");
         miHolder=new PlaceHolder(campoContra,"contraseña");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ete_usuario = new javax.swing.JLabel();
        ete_contra = new javax.swing.JLabel();
        campoUsuario = new javax.swing.JTextField();
        campoContra = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        botonIniciarSesion = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonRegistrarse = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA\n");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ete_usuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ete_usuario.setForeground(new java.awt.Color(255, 255, 255));
        ete_usuario.setText("Usuario:");
        getContentPane().add(ete_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        ete_contra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ete_contra.setForeground(new java.awt.Color(240, 240, 240));
        ete_contra.setText("Contraseña:");
        getContentPane().add(ete_contra, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });
        campoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoUsuarioKeyTyped(evt);
            }
        });
        getContentPane().add(campoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 170, -1));

        campoContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoContraActionPerformed(evt);
            }
        });
        getContentPane().add(campoContra, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 170, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(240, 240, 240));
        jLabel4.setText("SISTEMA UMSS");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 220, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user-2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 255));
        jLabel2.setText("¿Olvidaste tu contraseña?");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 160, -1));

        botonIniciarSesion.setBackground(new java.awt.Color(0, 51, 255));
        botonIniciarSesion.setForeground(new java.awt.Color(240, 240, 240));
        botonIniciarSesion.setText("Iniciar Sesion");
        botonIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(botonIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, 140, -1));

        jLabel3.setForeground(new java.awt.Color(240, 240, 240));
        jLabel3.setText("¿Eres nuevo?¡Registrate!");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        botonRegistrarse.setBackground(new java.awt.Color(0, 0, 255));
        botonRegistrarse.setForeground(new java.awt.Color(240, 240, 240));
        botonRegistrarse.setText("Registrate");
        botonRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(botonRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 140, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/login.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, -4, 410, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
       
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botonIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIniciarSesionActionPerformed
        
        conexionBBDD c=new conexionBBDD();
        c.conexionIniciarSesion();
        
    }//GEN-LAST:event_botonIniciarSesionActionPerformed

    private void botonRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegistrarseActionPerformed
        
        InterfazRegistro i=new InterfazRegistro();
        i.ejecutar();              
        
    }//GEN-LAST:event_botonRegistrarseActionPerformed

    private void campoContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoContraActionPerformed
        // TODO add your handling code here:
        //
    }//GEN-LAST:event_campoContraActionPerformed

    private void campoUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_campoUsuarioKeyTyped

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    private class conexionBBDD{
        
        
        public void conexionIniciarSesion()
        {
         try{
           
         //1 Crear Conexion 
          miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
          Statement miStatement=miConexion.createStatement();
         //3 ejecutar SQL
          ResultSet miResult=miStatement.executeQuery("SELECT * FROM estudiantes");
          while(miResult.next())
          {
              if(miResult.getString(3).equals(campoUsuario.getText())&&miResult.getString(4).equals(campoContra.getText()))
              {
                  
                 InterfazEstudiante e=new InterfazEstudiante(miResult.getString(1),miResult.getString(2),miResult.getString(3));
                 e.ejecutar();
                 return;
              }
              
          }
          
          iniciarSesionDocente();
          
        }catch(Exception e){
            
            
            
            System.out.println("no se conecto");
            
        }
         
         
         
      }
        
       
        
      public void iniciarSesionDocente()
      {
            try{
           
         //1 Crear Conexion 
          miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
          Statement miStatement=miConexion.createStatement();
         //3 ejecutar SQL
          ResultSet miResult=miStatement.executeQuery("SELECT * FROM docentes");
          while(miResult.next())
          {
              if(miResult.getString(3).equals(campoUsuario.getText())&&miResult.getString(4).equals(campoContra.getText()))
              {
                  
                InterfazDocente d=new InterfazDocente(miResult.getString(1),miResult.getString(2),miResult.getString(3));
                 
                 d.ejecutar();
               return; 
                  
              }
              
          }
          JOptionPane.showMessageDialog(null,"introduzca tu usuario");
          
        }catch(Exception e){
            
            
            
            System.out.println("no se conecto");
            
        }
        
      }
        
    }
    

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton botonIniciarSesion;
    private javax.swing.JButton botonRegistrarse;
    private javax.swing.JPasswordField campoContra;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JLabel ete_contra;
    private javax.swing.JLabel ete_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
