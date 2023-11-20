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
import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
/**
 *
 * @author RodrigoI
 */
enum Especialidad{
    SO,
    SOFTWARE,
    HARDWARE,
    VIRUS,
    REDES
}
@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Tecnico implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idTecnico;
    @Basic
    private String nomApe;
    private String dni;
    private Especialidad especialidad;
    private String telefono;
    private String contacto;
    private boolean estado;

  
}
