/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Interface;

import Clases_Auxiliares.Conexion;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JRViewer;
import net.sf.jasperreports.view.JasperViewer;
import Clases_Auxiliares.Validaciones;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.AttributeSet;
import javax.print.attribute.HashAttributeSet;
import javax.print.attribute.standard.PrinterName;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporter;
import net.sf.jasperreports.engine.export.JRPrintServiceExporterParameter;

/**
 *
 * @author Manolo
 */
public class GUI_Listado extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_A_Prod
     */
    private Conexion r_con = new Conexion();    
    private String consulta_Vigente;
    private String nombre_tabla ;//= "Articulos";
    private String nombre_reporte ;//= "rep_articulo.jrxml";
    private String campo_clave;// = "art_codigo";
    private String [] nombre_columnas;
    private String id_modulo_imp;
  
    
    public GUI_Listado() {
        initComponents();                 
        //Cargar_Tabla("SELECT * FROM "+nombre_tabla);
        jCheckBox1.setSelected(true);
        jLabel4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Listado");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/articulo.png"))); // NOI18N
        setInheritsPopupMenu(true);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setFocusable(false);
        jScrollPane1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setFocusable(false);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Listado:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/print.png"))); // NOI18N
        jButton2.setText("Imprimir Reporte");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/previsualizar.png"))); // NOI18N
        jButton3.setText("Visualizar Reporte");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });

        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setText("Todos los Valores");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setText("Único Valor");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setText(" Rango de Valores");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jTextField2.setNextFocusableComponent(jButton4);
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        jButton4.setText("Aplicar Filtro");
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Filtros:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("texto error");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox2)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jCheckBox3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jButton4))
                .addGap(171, 171, 171)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jCheckBox2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox1)
                            .addComponent(jCheckBox3)
                            .addComponent(jLabel2)))
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        r_con.cierraConexion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            //metodo de impresion anterior por JTable
            /**try {
                MessageFormat headerFormat = new MessageFormat(jLabel1.getText());
                MessageFormat footerFormat = new MessageFormat("- Página {0} -");
                jTable1.print(PrintMode.FIT_WIDTH, headerFormat, footerFormat);            
                } catch (PrinterException ex) { }
            **/
            
            JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(r_con.Consultar(consulta_Vigente));
            //localizo el reporte
            JasperReport report = JasperCompileManager.compileReport("src/Reportes/"+nombre_reporte);
            //cargo los datos
            JasperPrint print = JasperFillManager.fillReport(report, new HashMap(), resultSetDataSource);
            
            //vector con las impresoras del modulo de la base de datos
            Vector<Vector<String>>v = r_con.getContenidoTabla("SELECT * FROM impresoras WHERE imp_id_modulo = "+id_modulo_imp);
            //total impresoras disponibles
            PrintService [] impresoras = PrintServiceLookup.lookupPrintServices(null, null);
            //vector con las impresoras del modulo como objeto impresora (PrintService)
            Vector<PrintService>impresoras_modulo = new Vector();
            //objeto impresora en el que se imprime
            PrintService impresora = null;
            
            if (v.size()>0){
                String nombre_imp;                
                //caso en que sea una unica impresora por modulo
                if(v.size()==1){
                    nombre_imp=v.elementAt(0).firstElement();                    
                    AttributeSet aset = new HashAttributeSet();
                    aset.add(new PrinterName(nombre_imp, null));                   
                    impresoras = PrintServiceLookup.lookupPrintServices(null, aset);
                    impresora = impresoras[0];                   
                }
                
                //caso en que haya mas de una impresora por modulo
                if (v.size()>1){
                    //localizo con el simple nombre de la base de dato, el objeto impresora y los cargo
                    for (int i = 0; i < v.size(); i++) {
                        nombre_imp=v.elementAt(i).firstElement();
                        AttributeSet aset = new HashAttributeSet();
                        aset.add(new PrinterName(nombre_imp, null));
                        impresoras = PrintServiceLookup.lookupPrintServices(null, aset);
                        impresora = impresoras[0];
                        impresoras_modulo.add(impresora);                    
                    }
                    //paso las impresoras del modulo a un arreglo para poder mostrarlo en el Dialog
                    PrintService [] listado_impresoras = new PrintService[impresoras_modulo.size()];
                    for (int i = 0; i < impresoras_modulo.size(); i++) {
                        listado_impresoras[i]=impresoras_modulo.elementAt(i);
                    }
                    //muestro el listado de impresoras como objeto y se la asigno a la impresora a imprimir
                    impresora = (PrintService) JOptionPane.showInputDialog(null, "Hay mas de una impresora asignada a este modulo, eliga una para imprimir:",
                     "Imprimir Reporte", JOptionPane.QUESTION_MESSAGE, null, listado_impresoras, listado_impresoras[0]);
                    }
                
                //mando a imprimir el reporte en la impresora 
                if (impresora != null){
                    JRPrintServiceExporter jrprintServiceExporter = new JRPrintServiceExporter();
                    jrprintServiceExporter.setParameter(JRExporterParameter.JASPER_PRINT, print );
                    jrprintServiceExporter.setParameter(JRPrintServiceExporterParameter.PRINT_SERVICE, impresora );                   
                    jrprintServiceExporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PAGE_DIALOG, Boolean.TRUE);
                    jrprintServiceExporter.setParameter(JRPrintServiceExporterParameter.DISPLAY_PRINT_DIALOG, Boolean.FALSE);
                    jrprintServiceExporter.exportReport();
                }   
            }
            else{
                JOptionPane.showMessageDialog(null, "No hay Impresoras asignadas a este Modulo, "
                                              + "\npóngase en contacto con el Administrador de Impresoras.","Atención",JOptionPane.WARNING_MESSAGE);
            }
        } catch (JRException ex) {
            Logger.getLogger(GUI_Listado.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            // TODO add your handling code here:         
            
            JRResultSetDataSource resultSetDataSource = new JRResultSetDataSource(r_con.Consultar(consulta_Vigente));            
            //localizo el reporte
            JasperReport report = JasperCompileManager.compileReport("src/Reportes/"+nombre_reporte);
            //cargo los datos
            JasperPrint print = JasperFillManager.fillReport(report, new HashMap(), resultSetDataSource);
            
            //si se quiere pasar la conexion en lugar del resulset
            //print = JasperFillManager.fillReport(report, null,r_con.getConn());
           
            //creo un objeto Visor del Reporte
            JasperViewer jviewer = new JasperViewer(print,false);
            jviewer.setTitle("Reporte de Artículos."); 
            
            //quito el boton de imprimir del Visor
            JRootPane JRP = (JRootPane) jviewer.getComponent(0);           
            JLayeredPane JLP = (JLayeredPane) JRP.getComponent(1);
            JPanel JP = (JPanel) JLP.getComponent(0);
            JPanel JP2 = (JPanel) JP.getComponent(0);
            JRViewer JRV = (JRViewer) JP2.getComponent(0);
            JPanel JP3 = (JPanel) JRV.getComponent(0);            
            //COMPONENTE 0 es el Boton Guardar, el 1 el es de Imprimir
            JP3.getComponent(1).setEnabled(false);
            
            jviewer.setVisible(true); 
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }          
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        // TODO add your handling code here:
         if (jCheckBox1.isSelected()){
             jTextField1.setEnabled(false);
             jTextField2.setEnabled(false);
           
         }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox2.isSelected()){
             jTextField1.setEnabled(true);
             jTextField2.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        if (jCheckBox3.isSelected()){
            jTextField1.setEnabled(true);
            jTextField2.setEnabled(true);
        }
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Validaciones v = new Validaciones();
        if (jCheckBox1.isSelected()){
            jLabel4.setVisible(false);
            Cargar_Tabla("SELECT * FROM "+nombre_tabla);
        }
        
        if (jCheckBox2.isSelected()){
            if (!"".equals(jTextField1.getText())){
                if (v.isInt(jTextField1.getText())){
                    jLabel4.setVisible(false);
                    Cargar_Tabla("SELECT * FROM "+nombre_tabla+" WHERE "+campo_clave+" = "+jTextField1.getText());
                }
                else{
                    jLabel4.setVisible(true);
                    jTextField1.requestFocus();
                    jTextField1.selectAll();
                    jLabel4.setText("Ingrese un valor numerico.");
                }
            }
            else{ 
                jLabel4.setVisible(true);
                jTextField1.requestFocus();
                jLabel4.setText("Ingrese un valor numerico.");
            }
        }
        if (jCheckBox3.isSelected()){
            if (!"".equals(jTextField1.getText()) || !"".equals(jTextField2.getText())){
                if (v.isInt(jTextField1.getText()) && v.isInt(jTextField2.getText())){
                    jLabel4.setVisible(false);
                    Cargar_Tabla("SELECT * FROM "+nombre_tabla+" WHERE "+campo_clave+" >= "+jTextField1.getText()+" AND "+campo_clave+" <= "+jTextField2.getText());
                }
                else{
                    jLabel4.setVisible(true);
                    jTextField1.requestFocus();
                    jLabel4.setText("Ingrese valores numericos.");
                }
            }
            else{ 
                jLabel4.setVisible(true);
                jTextField1.requestFocus();
                jLabel4.setText("Ingrese valores numericos.");
            }
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
        Validaciones v = new Validaciones();
        if ("".equals(jTextField1.getText()) || !v.isInt(jTextField1.getText())){
           jLabel4.setVisible(true);
           jTextField1.requestFocus();
           jTextField1.selectAll();
           jLabel4.setText("Ingrese un valor numerico."); 
        }        
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
          // TODO add your handling code here:
        Validaciones v = new Validaciones();
        if ("".equals(jTextField2.getText()) || !v.isInt(jTextField2.getText())){
           jLabel4.setVisible(true);
           jTextField2.requestFocus();
           jTextField2.selectAll();
           jLabel4.setText("Ingrese un valor numerico.");         
        }  
    }//GEN-LAST:event_jTextField2FocusLost
       

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    
   public void Cargar_Tabla (String consulta){
        jLabel1.setText("Listado de "+nombre_tabla+": ");
        r_con.Connection();  
        DefaultTableModel modelo = new DefaultTableModel();
        jTable1.setModel(modelo);       
        //String [] nombre_columnas = {"Codigo Articulo","Descripcion Articulo","Proveedor Articulo","Precio Articulo","Stock Articulo","Codigo Tasa IVA"};                           
        modelo.setColumnIdentifiers(nombre_columnas);
        consulta_Vigente = consulta;
        Vector <Vector<String>> v = r_con.getContenidoTabla(consulta);
        for(Vector <String> a : v)
            modelo.addRow(a);
   }
   
   public void reiniciarJTable(JTable Tabla){
        DefaultTableModel modelo = (DefaultTableModel) Tabla.getModel();
        while(modelo.getRowCount()>0)modelo.removeRow(0);
 
        TableColumnModel modCol = Tabla.getColumnModel();
        while(modCol.getColumnCount()>0)modCol.removeColumn(modCol.getColumn(0));
    }

    public String getNombre_tabla() {
        return nombre_tabla;
    }

    public void setNombre_tabla(String nombre_tabla) {
        this.nombre_tabla = nombre_tabla;
    }

    public String getNombre_reporte() {
        return nombre_reporte;
    }

    public void setNombre_reporte(String nombre_reporte) {
        this.nombre_reporte = nombre_reporte;
    }

    public String getCampo_clave() {
        return campo_clave;
    }

    public void setCampo_clave(String campo_clave) {
        this.campo_clave = campo_clave;
    }

    public String[] getNombre_columnas() {
        return nombre_columnas;
    }

    public void setNombre_columnas(String[] nombre_columnas) {
        this.nombre_columnas = nombre_columnas;
    }

    public String getId_modulo_imp() {
        return id_modulo_imp;
    }

    public void setId_modulo_imp (String id_modulo_imp) {
        this.id_modulo_imp = id_modulo_imp;
    } 
   
   public String getConsultaTodosElementos (){
        return ("SELECT * FROM "+nombre_tabla);   
   }

}
