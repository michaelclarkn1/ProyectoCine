
package Formularios;

import Menú.Menu;
import Paneles.ListPeliculasPanel;
import Peliculas.Horarios;
import Peliculas.MiSeleccion;
import Peliculas.Pelicula;
import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListPeliculas extends javax.swing.JFrame {

    public ListPeliculas() {
        initComponents();
        ListPeliculasPanel back = new ListPeliculasPanel();
        this.add(back,BorderLayout.CENTER);
       
        this.pack();
    }
    
   @Override
    public Image getIconImage(){
        Image icono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icono.png"));
       
        return icono;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        cmbPeliculas = new javax.swing.JComboBox();
        lblImagen = new javax.swing.JLabel();
        cmbHoras = new javax.swing.JComboBox();
        lblTitulo = new javax.swing.JLabel();
        lblEstreno = new javax.swing.JLabel();
        lblDuracion = new javax.swing.JLabel();
        lblGenero = new javax.swing.JLabel();
        lblClasif = new javax.swing.JLabel();
        horaActual = new javax.swing.JLabel();
        lblSala = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblCodHorario = new javax.swing.JLabel();

        setTitle("Peliculas en la Cartelera");
        setIconImage(getIconImage());
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Listado de Peliculas en la Cartelera");

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setText("Hacer Compra");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmbPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPeliculasActionPerformed(evt);
            }
        });
        cmbPeliculas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbPeliculasFocusLost(evt);
            }
        });

        cmbHoras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cmbHorasMouseReleased(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbHorasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cmbHorasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cmbHorasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cmbHorasMousePressed(evt);
            }
        });
        cmbHoras.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbHorasItemStateChanged(evt);
            }
        });
        cmbHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbHorasActionPerformed(evt);
            }
        });
        cmbHoras.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                cmbHorasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                cmbHorasFocusLost(evt);
            }
        });

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(255, 255, 255));

        lblEstreno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblEstreno.setForeground(new java.awt.Color(255, 255, 0));

        lblDuracion.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblDuracion.setForeground(new java.awt.Color(255, 255, 255));

        lblGenero.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblGenero.setForeground(new java.awt.Color(255, 255, 255));

        lblClasif.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lblClasif.setForeground(new java.awt.Color(255, 255, 255));

        horaActual.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        horaActual.setForeground(new java.awt.Color(255, 255, 255));

        lblSala.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Sala:");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horario:");

        lblCodHorario.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(lblClasif, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                            .addComponent(lblGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblDuracion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)))
                                .addComponent(lblEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblSala, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblCodHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jButton2)))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(horaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSala, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbPeliculas)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbHoras)
                        .addComponent(jLabel3)
                        .addComponent(lblCodHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEstreno, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblClasif, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-777)/2, (screenSize.height-480)/2, 777, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            ArrayList <Horarios> todos=Menu.getTodosHorarios();
            
           if(!todos.isEmpty()){
            Calendar actual=Calendar.getInstance();
            horaActual.setText(actual.get(Calendar.DAY_OF_MONTH)+"/"+actual.get(Calendar.MONTH)+
                    "/"+actual.get(Calendar.YEAR)+" Hora: "+actual.get(Calendar.HOUR)+":"+actual.get(Calendar.MINUTE));
            
          
              lblSala.setText(null);  
              lblCodHorario.setText(null);  
              ArrayList<Pelicula> peliculas= Menu.getPeliculas();  
              
              for(Pelicula x: peliculas){
                 ArrayList<String>horas= horariosActivos(x.getTitulo(),todos);
                 if(!horas.isEmpty()){               
                      cmbPeliculas.addItem(x.getTitulo());
                 }
              }  
            }
            else{
                 JOptionPane.showMessageDialog(null, "No hay peliculas en la cartelera"); 
                 this.setVisible(false);
            }
            
        } catch (FileNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "Error"); 
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        actualizar();
      
        JFrame compra=new TotalCompra((String)cmbPeliculas.getSelectedItem(),(String)cmbHoras.getSelectedItem(),
        Integer.parseInt(lblSala.getText()),Integer.parseInt( lblCodHorario.getText()));
        Menu.mipelicula=null; 
       
        String horas[]=new String[cmbHoras.getItemCount()];
        for(int x=0;x<cmbHoras.getItemCount();x++){
            horas[x]=cmbHoras.getItemAt(x).toString();
        } 
        
        Menu.mipelicula= new MiSeleccion(lblTitulo.getText(),horas,lblGenero.getText(),lblDuracion.getText(),lblClasif.getText());
        compra.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cmbPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPeliculasActionPerformed
        // TODO add your handling code here:
        ArrayList <Horarios> todos;
        try {
            todos = Menu.getTodosHorarios();
                        
            if(!todos.isEmpty()){
              String nombre=(String) cmbPeliculas.getSelectedItem();
              cmbHoras.removeAllItems();
              
              ArrayList<String>horas= horariosActivos(nombre,todos);
             
                 if(!horas.isEmpty()){                                          
                   for(String y: horas){
                     cmbHoras.addItem(y);  
                    }
                 }
               Pelicula peli=Menu.getPeliNombre((String)cmbPeliculas.getSelectedItem());
              
                if(peli!=null){
                  ImageIcon icon = new ImageIcon(peli.getImagen());          
                  Image img = icon.getImage().getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH);   
                 
                   Calendar actual=Calendar.getInstance();
                   Calendar modif = Calendar.getInstance(); 
                   modif.setTime( peli.getFecha());
                   
                   int dias=(actual.get(Calendar.DAY_OF_YEAR) - modif.get(Calendar.DAY_OF_YEAR));
                    
                   if(dias>=0&&dias<=7){
                      lblEstreno.setText("ESTRENO");
                   }
                   else{
                        lblEstreno.setText("");
                   }
                      
                  lblImagen.setIcon( new ImageIcon(img) );
                  lblTitulo.setText("TITULO: "+peli.getTitulo());
                  lblClasif.setText("CLASIFICACION: "+peli.getClasi().toString());
                  lblGenero.setText("GENERO: "+peli.getGenero().toString());
                  int dura=peli.getHoras()*60+peli.getMinutos();
                  lblDuracion.setText("DURACION: "+dura+ " Minutos");
                  
                actualizar();
               }   
                 
            }   
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error"); 
        }
            
                
    }//GEN-LAST:event_cmbPeliculasActionPerformed

    private void cmbPeliculasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbPeliculasFocusLost
     
    }//GEN-LAST:event_cmbPeliculasFocusLost

    private void cmbHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbHorasActionPerformed
        // TODO add your handling code here:
    
     
    }//GEN-LAST:event_cmbHorasActionPerformed

    private void cmbHorasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbHorasMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cmbHorasMouseClicked

    private void cmbHorasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbHorasMouseEntered
       
      
    }//GEN-LAST:event_cmbHorasMouseEntered

    private void cmbHorasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbHorasMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbHorasMouseExited

    private void cmbHorasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbHorasItemStateChanged
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cmbHorasItemStateChanged

    private void cmbHorasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbHorasMousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbHorasMousePressed

    private void cmbHorasMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbHorasMouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbHorasMouseReleased

    private void cmbHorasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbHorasFocusLost
         // TODO add your handling code here:
     if(cmbPeliculas.getItemCount()!=0) {
        actualizar();
      }
        
    }//GEN-LAST:event_cmbHorasFocusLost

    private void cmbHorasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_cmbHorasFocusGained
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cmbHorasFocusGained

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ListPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ListPeliculas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbHoras;
    private javax.swing.JComboBox cmbPeliculas;
    private javax.swing.JLabel horaActual;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblClasif;
    private javax.swing.JLabel lblCodHorario;
    private javax.swing.JLabel lblDuracion;
    private javax.swing.JLabel lblEstreno;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblSala;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
   
    private ArrayList<String>  horariosActivos(String nombre, ArrayList<Horarios> todos) {
       ArrayList<String> horas=new ArrayList<>();
        for(Horarios x:todos){
            if(x.getTit().equalsIgnoreCase(nombre)){                
                int cont=0;
                for(boolean a[]:x.getSillas()){
                   for(boolean b:a){
                       if(b){
                           cont++;
                       }
                   }
                 }
              if(cont!=0) {
                  horas.add(x.getCodHorario()+" "+x.getCodSala()+" "+"---"+x.getInicio().getHours()+":"+x.getInicio().getMinutes());
              } 
               
            }
        }
        return horas;
    }
    
    private void actualizar(){
        String sala=cmbHoras.getSelectedItem().toString();
        Scanner sc = new Scanner(sala);
        lblCodHorario.setText(String.valueOf(sc.nextInt())); //Este es el codigo del horario
        lblSala.setText(String.valueOf(sc.nextInt())); //Este es el codigo de la sala
    }
     
}