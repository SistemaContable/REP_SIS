/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Contabilidad;

import Clases_Auxiliares.Conexion;
import Objetos.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Manolo
 */
public class GUI_Plan_Cuentas extends javax.swing.JInternalFrame {

    /**
     * Creates new form GUI_A_Prod
     */
    private Vector<Contabilidad.Cuenta2> vecChildren = new Vector<Contabilidad.Cuenta2>();
    private int cant_count=0;
    private DefaultTreeModel modelo1 = null;
    private DefaultMutableTreeNode root1 = null;
    private DefaultMutableTreeNode parent1 = null;
    private DefaultMutableTreeNode childnode = null;
    private int posLoad=0;
    
    private Conexion r_con;
    private Usuario usr;
    
    public GUI_Plan_Cuentas(Usuario u, Conexion con) {
        usr = u;
        r_con=con;     
        initComponents();
        inicializarArbol();
        cargarArbol();         
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
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTreeConta = new javax.swing.JTree();

        setBackground(new java.awt.Color(204, 204, 204));
        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestión Plan de Cuentas");
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/articulo.png"))); // NOI18N
        setInheritsPopupMenu(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Gestión del Plan de Cuentas:");

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton1.setText("Cancelar");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(36, 36, 36))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Título:");

        jTextField1.setToolTipText("");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Título");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Cuenta");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Tipo:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Numero:");

        jTextField2.setToolTipText("");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("ID:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("-");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(33, 33, 33)
                .addComponent(jRadioButton2)
                .addGap(128, 128, 128))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel3))
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTreeConta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTreeContaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(JTreeConta);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        r_con.cierraConexion();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTreeContaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTreeContaMouseClicked
      if(evt.getClickCount()==2){
        DefaultMutableTreeNode  node = (DefaultMutableTreeNode) JTreeConta.getLastSelectedPathComponent();
        Cuenta2 loadcuenta;
            if (node == null) //Nothing is selected.
            {
                return;
            }
            else{
                Object nodeInfo = node.getUserObject();
                loadcuenta = (Cuenta2) nodeInfo;
                this.jLabel6.setText(loadcuenta.getId());
                this.jTextField1.setText(loadcuenta.getDescrip());
                this.jTextField2.setText(loadcuenta.getCodCuenta());
                //JOptionPane.showMessageDialog(this, loadcuenta.getDescrip());
            }
      }
    }//GEN-LAST:event_JTreeContaMouseClicked
    
    private boolean camposNecesarios () {
       if ((jTextField1.getText().length()==0)) 
       {
            JOptionPane.showMessageDialog(null, "Complete todos los campos!","Atención",JOptionPane.WARNING_MESSAGE);
            return false;
       }
       return true;      
               
    }
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree JTreeConta;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

public void cargarArbol() {
        r_con.Connection();
        int count = 0;
        int aux = 1;
        Enumeration e = root1.breadthFirstEnumeration();
        while (e.hasMoreElements()) {
            parent1 = (DefaultMutableTreeNode) e.nextElement();
            if (count >= aux) {
                try {
                    Contabilidad.Cuenta2 objChildren = (Contabilidad.Cuenta2) parent1.getUserObject();
                    /**
                    //consigo los hijos de idparent (metodo anterior MAYOR tiempo de ejecucion)
                    vecChildren = getHijos(objChildren.Id);
                    for (int k = 0; k < vecChildren.size(); k++) {
                    Contabilidad.Cuenta2 hijo = (Contabilidad.Cuenta2) vecChildren.get(k);
                    hijo.setDescrip(hijo.getCodCuenta2()+"-"+hijo.getDescrip());
                    childnode = new DefaultMutableTreeNode(hijo);
                    modelo1.insertNodeInto(childnode, parent1, parent1.getChildCount());
                    }
                    **/
                    ResultSet res = r_con.Consultar("select id_cta,idpadre_cta,nombre_cta,cod_cta,orden_cta from sys_cuenta where idpadre_cta="+objChildren.Id);
                    while (res.next()) {
                        Contabilidad.Cuenta2 hijo = new Contabilidad.Cuenta2(res.getString(1), res.getString(2), res.getString(3),res.getString(4),res.getInt(5));
                        //hijo.setDescrip(hijo.getCodCuenta()+"-"+hijo.getDescrip());
                        childnode = new DefaultMutableTreeNode(hijo);
                        modelo1.insertNodeInto(childnode, parent1, parent1.getChildCount());                        
                    }
                    res.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GUI_Plan_Cuentas.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            //Pregunto si llego al fin.
            if (e.hasMoreElements() == false) {
                int toEle = totalElementos(root1.breadthFirstEnumeration());
                if (cant_count < toEle) {
                    aux = count;
                    count = -2;
                    e = root1.breadthFirstEnumeration();
                    cant_count = toEle;
                } else {
                    break;
                }
            }
            count++;
        }
        this.JTreeConta.setModel(modelo1);
        r_con.cierraConexion();
    }

   private void inicializarArbol() {
        Contabilidad.Cuenta2 obj = (Contabilidad.Cuenta2) getHijos("0").get(0);
        root1 = new DefaultMutableTreeNode(obj);
        modelo1 = new DefaultTreeModel(root1);
        Enumeration e = root1.breadthFirstEnumeration();
        parent1 = (DefaultMutableTreeNode) e.nextElement();
        Contabilidad.Cuenta2 objChildren = (Contabilidad.Cuenta2) parent1.getUserObject();
        
        //consigo los hijos de idparent
        vecChildren = getHijos(objChildren.Id);

        for (int k = 0; k < vecChildren.size(); k++) {
            cant_count++;
            Contabilidad.Cuenta2 hijo = (Contabilidad.Cuenta2) vecChildren.get(k);
            modelo1.insertNodeInto(new DefaultMutableTreeNode(hijo), parent1, parent1.getChildCount());
        }
    }

   public int totalElementos(Enumeration e) {
        int cont = 0;
        while (e.hasMoreElements()) {
            e.nextElement();
            cont++;
        }
        return cont;
    }

    /**
     * Return un vector con los hijos.
     * Id,Idparent,Descripcion,Order
     * @param Id
     * @return
     */
    public Vector getHijos (String Id) {
        r_con.Connection();
        Vector<Contabilidad.Cuenta2> data = new Vector<Contabilidad.Cuenta2>();
        try {            
            ResultSet res = r_con.Consultar("select id_cta,idpadre_cta,nombre_cta,cod_cta,orden_cta from sys_cuenta where idpadre_cta="+Id);

            while (res.next()) {
                data.addElement(new Contabilidad.Cuenta2(res.getString(1), res.getString(2), res.getString(3),res.getString(4),res.getInt(5)));
            }
            res.close();
        } catch (SQLException e) {
            System.out.println(e);
            r_con.cierraConexion();
        }
        r_con.cierraConexion();
        return data;
    }
   
    
    
public void setTitleLabel (String t){
        this.jLabel1.setText(t);
}

public void limpiarForm(){
    jTextField1.setText("");
}

}