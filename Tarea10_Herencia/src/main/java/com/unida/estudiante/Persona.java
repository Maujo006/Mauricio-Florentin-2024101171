/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unida.estudiante;

/**
 *
 * @author laboratorioasu
 */
public class Persona {
    protected String nombre;
    protected String cedula;
    protected String celular;
    protected String email;
    
    public Persona(String nombre, String cedula, String celular, String email) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.email = email;
        
    }
    @Override
    public String toString() {
        return "Nombre: " + nombre + "| Cedula: " + cedula + "| Celular: " + celular + "| Email: " + email;
    }
}
