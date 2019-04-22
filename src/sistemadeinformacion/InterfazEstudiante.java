/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemadeinformacion;

import com.placeholder.*;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.*;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class InterfazEstudiante extends javax.swing.JFrame {

     Connection miConexion;
     PlaceHolder miHolder;
    /**
     * Creates new form InterfazEstudiante
     */
    public InterfazEstudiante(String nombre,String apellido,String user) {
        eti_bienvenida=new javax.swing.JLabel();
        initComponents();
        this.setLocationRelativeTo(null);
        eti_bienvenida.setText(nombre+" "+apellido);
        Usuario=user;
        mostrarMaterias();
        mostrarMateriasN();
        mostrarTodasMaterias();
        holder();
        setVisible(true);
    }
    
    public void holder()
    {
        miHolder=new PlaceHolder(campoBuscar,"nombre de la materia");
        miHolder=new PlaceHolder(campoBuscarT,"nombre de la materia");
        miHolder=new PlaceHolder(campoBuscar1,"nombre de la materia");
         
    }
    
    public void mostrarMaterias()
    {
        
         try
        {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaMaterias.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
            Statement miStatement=miConexion.createStatement();
            
            String sql="SELECT materia.nombre,docentes.nombre FROM materia INNER JOIN relacionadora ON materia.codigo=relacionadora.codigo INNER JOIN estudiantes ON estudiantes.usuario=relacionadora.usuario INNER JOIN docentes ON docentes.usuario=materia.usuario WHERE relacionadora.usuario=?";
            ps=miConexion.prepareStatement(sql);
            ps.setString(1,Usuario);
            //ps.setString(1,Usuario);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            
            int cantidadColumnas=rsMd.getColumnCount();
            
            
            modelo.addColumn("Nombre de la materia ");
            modelo.addColumn("Nombre docente");
            
            
            while(rs.next()){
                   Object[] filas=new Object[cantidadColumnas];
            
                  for(int i=0;i<cantidadColumnas;i++)
                     {
                         filas[i]=rs.getObject(i+1);
                     }
                 modelo.addRow(filas);
            }
          
        }catch(SQLException e)
        {
            System.out.println("error "+Usuario);
        }
    }
    
   public void mostrarMateriasN()
   {
         try
        {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaMateriasN.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
            Statement miStatement=miConexion.createStatement();
            
            String sql="SELECT materia.nombre FROM materia INNER JOIN relacionadora ON materia.codigo=relacionadora.codigo INNER JOIN estudiantes ON estudiantes.usuario=relacionadora.usuario INNER JOIN docentes ON docentes.usuario=materia.usuario WHERE relacionadora.usuario=?";
            ps=miConexion.prepareStatement(sql);
            ps.setString(1,Usuario);
            //ps.setString(1,Usuario);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadColumnas=rsMd.getColumnCount();
            modelo.addColumn("Nombre materia ");
            while(rs.next()){
                   Object[] filas=new Object[cantidadColumnas];
            
                  for(int i=0;i<cantidadColumnas;i++)
                     {
                         filas[i]=rs.getObject(i+1);
                     }
                 modelo.addRow(filas);
            }
          
        }catch(SQLException e)
        {
            System.out.println("error "+Usuario);
        }
       
   }
    
    public void mostrarTodasMaterias()
    {
          try
        {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaTodasM.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
            Statement miStatement=miConexion.createStatement();
            
            String sql="SELECT materia.nombre,docentes.nombre,Aula FROM materia INNER JOIN docentes ON materia.usuario=docentes.usuario";
            ps=miConexion.prepareStatement(sql);
           
           
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            
            int cantidadColumnas=rsMd.getColumnCount();
            
            
            modelo.addColumn("Nombre de la materia");
            modelo.addColumn("Nombre del docente");
            modelo.addColumn("Aula");
            
            
            while(rs.next()){
                   Object[] filas=new Object[cantidadColumnas];
            
                  for(int i=0;i<cantidadColumnas;i++)
                     {
                         filas[i]=rs.getObject(i+1);
                     }
                 modelo.addRow(filas);
            }
           
        }catch(SQLException e)
        {
            System.out.println("error "+Usuario);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        eti_bienvenida = new javax.swing.JLabel();
        tablaPanel = new javax.swing.JTabbedPane();
        panelMisCursos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaterias = new javax.swing.JTable();
        botonEliminarC = new javax.swing.JButton();
        campoBuscar = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaPracticas = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        botonBuscar = new javax.swing.JButton();
        eti_tusCursos = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        AreaDescripcion = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        eti_codigo_materia = new javax.swing.JLabel();
        campoCodigoM = new javax.swing.JTextField();
        botonUnirse = new javax.swing.JButton();
        panelSubirTrabajos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoRutaArchivo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        campoTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        escogerArchivo = new javax.swing.JButton();
        campoTam = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botonEnviar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaTrabAnter = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablaMateriasN = new javax.swing.JTable();
        campoBuscarT = new javax.swing.JTextField();
        botonBuscarT = new javax.swing.JButton();
        panelCursosPlataf = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaTodasM = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        campoBuscar1 = new javax.swing.JTextField();
        botonBuscar1 = new javax.swing.JButton();
        userEs = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_bienvenida.setFont(new java.awt.Font("Tahoma", 1, 9)); // NOI18N
        eti_bienvenida.setForeground(new java.awt.Color(240, 240, 240));
        getContentPane().add(eti_bienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 150, 20));

        tablaPanel.setForeground(new java.awt.Color(102, 102, 255));
        tablaPanel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tablaPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaPanelMouseClicked(evt);
            }
        });

        panelMisCursos.setBackground(new java.awt.Color(0, 204, 153));
        panelMisCursos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMaterias.setBackground(new java.awt.Color(102, 255, 204));
        tablaMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre materia", "Docente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaMaterias);

        panelMisCursos.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 280, 150));

        botonEliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminar2.png"))); // NOI18N
        botonEliminarC.setText("Eliminar");
        botonEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarCActionPerformed(evt);
            }
        });
        panelMisCursos.add(botonEliminarC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));
        panelMisCursos.add(campoBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 170, 20));

        tablaPracticas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Titulo", "Archivo", "Fecha inicio", "Tamaño", "fecha limite"
            }
        ));
        jScrollPane3.setViewportView(tablaPracticas);

        panelMisCursos.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 370, 150));

        jPanel5.setBackground(new java.awt.Color(0, 255, 153));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Practicas del docente");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 160, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/descargar1.png"))); // NOI18N
        jButton1.setText("Descargar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, -1, -1));

        panelMisCursos.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 380, 240));

        jPanel6.setBackground(new java.awt.Color(0, 255, 153));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        botonBuscar.setText("Buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
        jPanel6.add(botonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, 30));

        eti_tusCursos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        eti_tusCursos.setText("Tus cursos");
        jPanel6.add(eti_tusCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, -1, -1));

        panelMisCursos.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 280, 240));

        jLabel9.setText("Descripcion");
        panelMisCursos.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 10, -1, -1));

        AreaDescripcion.setBackground(new java.awt.Color(204, 204, 255));
        AreaDescripcion.setColumns(20);
        AreaDescripcion.setRows(5);
        jScrollPane7.setViewportView(AreaDescripcion);

        panelMisCursos.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 30, 130, 220));

        tablaPanel.addTab("Mis Cursos", panelMisCursos);

        jPanel1.setBackground(new java.awt.Color(0, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        eti_codigo_materia.setText("Codigo de la materia:");
        jPanel1.add(eti_codigo_materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, -1));

        campoCodigoM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCodigoMActionPerformed(evt);
            }
        });
        jPanel1.add(campoCodigoM, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 140, -1));

        botonUnirse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/unir1.png"))); // NOI18N
        botonUnirse.setText("Unirse");
        botonUnirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnirseActionPerformed(evt);
            }
        });
        jPanel1.add(botonUnirse, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 110, -1, -1));

        tablaPanel.addTab("Unirse a la materia", jPanel1);

        panelSubirTrabajos.setBackground(new java.awt.Color(0, 204, 153));
        panelSubirTrabajos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Lista Cursos");
        panelSubirTrabajos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));
        panelSubirTrabajos.add(campoRutaArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 130, -1));

        jPanel2.setBackground(new java.awt.Color(59, 255, 160));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Subir trabajo");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));
        jPanel2.add(campoTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, 230, -1));

        jLabel4.setText("Titulo:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane5.setViewportView(jTextArea1);

        jPanel2.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 230, 90));

        jLabel5.setText("Descripcion:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, -1, -1));

        escogerArchivo.setText("...");
        escogerArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escogerArchivoActionPerformed(evt);
            }
        });
        jPanel2.add(escogerArchivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 60, 20));

        campoTam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoTamActionPerformed(evt);
            }
        });
        jPanel2.add(campoTam, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 70, -1));

        jLabel6.setText("Archivo:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        botonEnviar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/enviar1.png"))); // NOI18N
        botonEnviar.setText("Enviar");
        jPanel2.add(botonEnviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        panelSubirTrabajos.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 330, 260));

        jPanel3.setBackground(new java.awt.Color(59, 255, 160));
        jPanel3.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTrabAnter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Titulo", "Archivo", "Tamaño", "Fecha "
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane6.setViewportView(tablaTrabAnter);

        jPanel3.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 210, 160));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("trabajos Anteriores");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 120, -1));

        panelSubirTrabajos.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 230, 260));

        jPanel4.setBackground(new java.awt.Color(59, 255, 160));
        jPanel4.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMateriasN.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Nombre materia"
            }
        ));
        jScrollPane4.setViewportView(tablaMateriasN);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 220, 180));
        jPanel4.add(campoBuscarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 130, -1));

        botonBuscarT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        botonBuscarT.setText("Buscar");
        botonBuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarTActionPerformed(evt);
            }
        });
        jPanel4.add(botonBuscarT, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        panelSubirTrabajos.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 240, 260));

        tablaPanel.addTab("Trabajos", panelSubirTrabajos);

        panelCursosPlataf.setBackground(new java.awt.Color(0, 204, 153));
        panelCursosPlataf.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaTodasM.setBackground(new java.awt.Color(102, 255, 204));
        tablaTodasM.setBorder(new javax.swing.border.MatteBorder(null));
        tablaTodasM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre de la materia", "Docente", "Aula"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tablaTodasM);

        panelCursosPlataf.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 540, 190));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(240, 240, 240));
        jLabel10.setText("Todos los cursos de la plataforma");
        panelCursosPlataf.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 240, -1));

        campoBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoBuscar1ActionPerformed(evt);
            }
        });
        panelCursosPlataf.add(campoBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 240, -1));

        botonBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar1.png"))); // NOI18N
        botonBuscar1.setText("Buscar");
        botonBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscar1ActionPerformed(evt);
            }
        });
        panelCursosPlataf.add(botonBuscar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, 120, -1));

        tablaPanel.addTab("Todos los cursos", panelCursosPlataf);

        getContentPane().add(tablaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 830, 310));

        userEs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user1.png"))); // NOI18N
        getContentPane().add(userEs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 20, 20));

        fondo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/loginCopia1.jpg"))); // NOI18N
        fondo.setText("Accediste como estudiante");
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tablaPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaPanelMouseClicked

    private void botonUnirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnirseActionPerformed

        try{
            //1 Crear Conexion
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");
            // 2 preparar la consulta
            PreparedStatement miSentencia=miConexion.prepareStatement("INSERT INTO relacionadora (usuario,codigo) VALUES (?,?)");
            //3 establecer parametros de la consulta
            miSentencia.setString(1,Usuario);
            miSentencia.setString(2,campoCodigoM.getText().trim());
            miSentencia.executeUpdate();
            mostrarMaterias();
            JOptionPane.showMessageDialog(this,"Te as unido al curso");
        }catch(Exception error)
        {
            JOptionPane.showMessageDialog(this,"Pida la clave al docente o al tutor");
        }

    }//GEN-LAST:event_botonUnirseActionPerformed

    private void campoCodigoMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCodigoMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCodigoMActionPerformed

    private void botonEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarCActionPerformed
        
        eliminarM();
        
    }//GEN-LAST:event_botonEliminarCActionPerformed

    public void eliminarM()
    {
         try {
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");  
            int fila=tablaMaterias.getSelectedRow();
            String usuario=tablaMaterias.getValueAt(fila,0).toString();
            System.out.print(usuario);
            String sql="DELETE FROM relacionadora INNER JOIN materia ON materia.codigo=relacionadora.codigo WHERE materia.nombre=? AND relacionadora.usuario=?";
            PreparedStatement miSentencia=miConexion.prepareStatement(sql);
            miSentencia.setString(1,usuario);
            
            miSentencia.executeUpdate();
            mostrarMaterias();
           
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,"Seleccione una fila");
        }
        
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void escogerArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escogerArchivoActionPerformed
        
        JFileChooser buscador=new JFileChooser();
        buscador.showOpenDialog(buscador);
        try{
            String direccion=buscador.getSelectedFile().getAbsolutePath();
            campoRutaArchivo.setText(direccion);
            File fichero = new File(direccion);
            String tamArch=" "+fichero.length();
            campoTam.setText(tamArch);
            FileInputStream archivo=new FileInputStream(direccion);
            DataInputStream entrada= new DataInputStream(archivo);
            
            BufferedReader buffer=new BufferedReader(new InputStreamReader(entrada));
            String lineas;
            while((lineas=buffer.readLine())!=null){
                lineas=buffer.readLine();
	        
	        System.out.println(lineas);
                
            }
            entrada.close();
        }catch(Exception e){
            
        
        }
        
    }//GEN-LAST:event_escogerArchivoActionPerformed

    private void campoTamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoTamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoTamActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
       
        String campo=campoBuscar.getText().trim();
        
          try
        {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaMaterias.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
            Statement miStatement=miConexion.createStatement();
            
            String sql="SELECT materia.nombre,docentes.nombre FROM materia INNER JOIN relacionadora ON materia.codigo=relacionadora.codigo INNER JOIN estudiantes ON estudiantes.usuario=relacionadora.usuario INNER JOIN docentes ON docentes.usuario=materia.usuario WHERE relacionadora.usuario=? AND materia.nombre=?";
            ps=miConexion.prepareStatement(sql);
            ps.setString(1,Usuario);
            ps.setString(2,campo);
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            
            int cantidadColumnas=rsMd.getColumnCount();
            
            
            modelo.addColumn("Nombre de la materia ");
            modelo.addColumn("Nombre docente");
            
            
            while(rs.next()){
                   Object[] filas=new Object[cantidadColumnas];
            
                  for(int i=0;i<cantidadColumnas;i++)
                     {
                         filas[i]=rs.getObject(i+1);
                     }
                 modelo.addRow(filas);
            }
           System.out.println("ejecute "+Usuario);
        }catch(SQLException e)
        {
            System.out.println("error "+Usuario);
        }
        
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void campoBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoBuscar1ActionPerformed

    private void botonBuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarTActionPerformed
      
        String campo=campoBuscarT.getText().trim();
 
         try
        {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaMateriasN.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
            Statement miStatement=miConexion.createStatement();
            
            String sql="SELECT materia.nombre FROM materia INNER JOIN relacionadora ON materia.codigo=relacionadora.codigo INNER JOIN estudiantes ON estudiantes.usuario=relacionadora.usuario INNER JOIN docentes ON docentes.usuario=materia.usuario WHERE relacionadora.usuario=? AND materia.nombre=?";
            ps=miConexion.prepareStatement(sql);
            ps.setString(1,Usuario);
            ps.setString(2,campo);
            rs=ps.executeQuery();
            ResultSetMetaData rsMd=rs.getMetaData();
            int cantidadColumnas=rsMd.getColumnCount();
            modelo.addColumn("Nombre materia ");
            while(rs.next()){
                   Object[] filas=new Object[cantidadColumnas];
            
                  for(int i=0;i<cantidadColumnas;i++)
                     {
                         filas[i]=rs.getObject(i+1);
                     }
                 modelo.addRow(filas);
            }
          
        }catch(SQLException e)
        {
            System.out.println("error "+Usuario);
        }
        
    }//GEN-LAST:event_botonBuscarTActionPerformed

    private void botonBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscar1ActionPerformed
        
        String campo=campoBuscar1.getText().trim();
        try
        {
            DefaultTableModel modelo=new DefaultTableModel();
            tablaTodasM.setModel(modelo);
            
            PreparedStatement ps=null;
            ResultSet rs=null;
            miConexion=DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto_sis2","root","");   
         // 2 creae objeto statement
            Statement miStatement=miConexion.createStatement();
            
            String sql="SELECT materia.nombre,docentes.nombre,Aula FROM materia INNER JOIN docentes ON materia.usuario=docentes.usuario WHERE materia.nombre=?";
            ps=miConexion.prepareStatement(sql);
            ps.setString(1,campo);
           
            rs=ps.executeQuery();
            
            ResultSetMetaData rsMd=rs.getMetaData();
            
            int cantidadColumnas=rsMd.getColumnCount();
            
            
            modelo.addColumn("Nombre de la materia");
            modelo.addColumn("Nombre del docente");
            modelo.addColumn("Aula");
            
            
            while(rs.next()){
                   Object[] filas=new Object[cantidadColumnas];
            
                  for(int i=0;i<cantidadColumnas;i++)
                     {
                         filas[i]=rs.getObject(i+1);
                     }
                 modelo.addRow(filas);
            }
           
        }catch(SQLException e)
        {
            System.out.println("error "+Usuario);
        }
        
        
    }//GEN-LAST:event_botonBuscar1ActionPerformed

    
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
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazEstudiante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       /* java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazEstudiante().setVisible(true);
            }
        });*/
    }
    
    public void ejecutar()
    {
         
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               // new InterfazEstudiante().setVisible(true);
            }
        });
       
    }
    private String Usuario;
    private String Nombre;
    private String Apellidos;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDescripcion;
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonBuscar1;
    private javax.swing.JButton botonBuscarT;
    private javax.swing.JButton botonEliminarC;
    private javax.swing.JButton botonEnviar;
    private javax.swing.JButton botonUnirse;
    private javax.swing.JTextField campoBuscar;
    private javax.swing.JTextField campoBuscar1;
    private javax.swing.JTextField campoBuscarT;
    private javax.swing.JTextField campoCodigoM;
    private javax.swing.JTextField campoRutaArchivo;
    private javax.swing.JTextField campoTam;
    private javax.swing.JTextField campoTitulo;
    private javax.swing.JButton escogerArchivo;
    private javax.swing.JLabel eti_bienvenida;
    private javax.swing.JLabel eti_codigo_materia;
    private javax.swing.JLabel eti_tusCursos;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel panelCursosPlataf;
    private javax.swing.JPanel panelMisCursos;
    private javax.swing.JPanel panelSubirTrabajos;
    private javax.swing.JTable tablaMaterias;
    private javax.swing.JTable tablaMateriasN;
    private javax.swing.JTabbedPane tablaPanel;
    private javax.swing.JTable tablaPracticas;
    private javax.swing.JTable tablaTodasM;
    private javax.swing.JTable tablaTrabAnter;
    private javax.swing.JLabel userEs;
    // End of variables declaration//GEN-END:variables
}
