/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author RodrigoI
 */
public class Conexion {
    private static final String URL = "jdbc:mariadb://localhost/";
    private static final String BD ="serviciotecnico";
    private static final String USER = "root";
    private static final String PASS = "";
    private static Connection con;
    
    private Conexion(){}
    
    public static Connection getConection(){
        if (con==null){
            try {
                Class.forName("org.mariadb.jdbc.Driver");
                con=DriverManager.getConnection(URL+BD,USER,PASS);
                
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null,"Error cargando drivers" );
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error conectando a la base de datos");
            }
                      
        }
        return con;
    }
}

