/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author RodrigoI
 */
enum Dificultad {
    SIMPLE,
    MEDIA,
    COMPLEJO;
}


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Incidente {
private int idIncidente;
private Cliente cliente;
private Tecnico tecnico;
private Dificultad dificultad;
private LocalDate fechaRegistro;
private LocalDate fechaEstimada;
private boolean estado;




    
    
    
}
