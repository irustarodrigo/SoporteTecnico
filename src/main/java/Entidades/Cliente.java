/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author RodrigoI
 */
enum Servicios{
    ADMINISTRACIONREDES,
    MANTENIMIENTOSOFT,
    MANTENIMIENTOHARD,
    SOFTWAREGESTION,
    
    
    
}
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Cliente {
    private int idCliente;
    private String razonSocial;
    private String cuit;
    private String telefono;
    private String contacto;
    private Servicios servicio;
    private boolean estado;

   
}
