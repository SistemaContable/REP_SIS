/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Colecciones;

import Clases_Auxiliares.Conexion;
import Objetos.Tarea;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Banegas Rodrigo
 */
public class Tareas {
    private String tabla;
    private Conexion r_con;    
    
    public Tareas(Conexion con){
        tabla="tarea";
        r_con=con;
        r_con.Connection();
    }
    
    public Vector<Vector<String>> getDescripcionTareas(){        
         Vector<Vector<String>>v = new Vector();         
         try{
            String consulta="select tar_descripcion from "+tabla;
            Statement st = r_con.getStatement();
            ResultSet rs = st.executeQuery(consulta);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numeroColumnas = rsmd.getColumnCount();                                                
            while(rs.next()){
                Vector<String> arregloAux=new Vector();
                for(int i=0;i<numeroColumnas;i++){
                    arregloAux.add(rs.getString(i+1));                                        
                }
                v.add(arregloAux);                
            }                                  
         }
         catch(Exception e){System.out.println(e.getMessage());
                            e.printStackTrace();
                            return null;
         }
         return v;             
    }
    
    
    public Vector<Vector<String>> getTablaTareas(){        
         Vector<Vector<String>>v = new Vector();         
         try{
            String consulta="select * from "+tabla;
            Statement st = r_con.getStatement();
            ResultSet rs = st.executeQuery(consulta);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numeroColumnas = rsmd.getColumnCount();                                                
            while(rs.next()){
                Vector<String> arregloAux=new Vector();
                for(int i=0;i<numeroColumnas;i++){
                    arregloAux.add(rs.getString(i+1));                                        
                }
                v.add(arregloAux);                
            }                                  
         }
         catch(Exception e){System.out.println(e.getMessage());
                            e.printStackTrace();
                            return null;
         }
         return v;             
    }
    
    
    public void insertar(Tarea t){
        try {
            PreparedStatement consultaAlta;
            String alta="insert into "+tabla+" values (?,?)";
            consultaAlta=r_con.getConn().prepareStatement(alta);
            
            consultaAlta.setInt(1, t.getId());
            consultaAlta.setString(2, t.gerDescripcion());
            
            consultaAlta.executeUpdate();// insert update delete
                                            
        
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
