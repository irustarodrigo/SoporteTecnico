/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

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


public class Tecnico {
    private String nomApe;
    private String dni;
    private Especialidad especialidad;
    private String telefono;
    private String contacto;
    private boolean estado;
    
    
}
