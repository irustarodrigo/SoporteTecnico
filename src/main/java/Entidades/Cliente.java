/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

@Entity
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idCliente;
    @Basic
    private String razonSocial;
    private String cuit;
    private String telefono;
    private String contacto;
    private Servicios servicio;
    private boolean estado;

   
}
