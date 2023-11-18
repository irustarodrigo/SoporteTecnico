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
public class IncidenteData {
    private Connection con=null;
    
    public IncidenteData(){
        con=Conexion.getConection();
        
    }
    
}
