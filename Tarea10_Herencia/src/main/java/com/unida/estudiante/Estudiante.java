/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.unida.estudiante;

/**
 *
 * @author laboratorioasu
 */
public class Estudiante extends Persona {
    private final String matricula;
    private final String carrera;
    private final String materia;
    
    public Estudiante(String nombre, String cedula, String matricula, String carrera, String celular, String email, String materia) {
        super(nombre, cedula, celular, email);
        this.matricula = matricula;
        this.carrera = carrera;
        this.materia = materia;
    }
    @Override
    public String toString() {
        return super.toString() + " | Matricula: " + matricula + " | Carrera: " + carrera + " | Materia: " + materia;
    }
    public static void main(String[] args) {
        Estudiante e = new Estudiante( "Mauricio", "6286723", "2024101171", "Ing. Informatica", "Realme", "maujo006@gmail.com", "SOO-POO");
        System.out.println(e);          
    }
}
