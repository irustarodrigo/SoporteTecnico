/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoDatos;

import java.sql.Connection;

/**
 *
 * @author RodrigoI
 */
public class TecnicoData {
 private Connection con=null;
 
 public TecnicoData(){
     con=Conexion.getConection();
 }
    
    
    
}
