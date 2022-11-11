/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;


public class Profesor extends Persona {

    String correo;
    double salario;
    
    public Profesor() {
    }

    public Profesor(int cedula, String nombre, String apellido1, String apellido2, String correo, double salario, boolean estado) {
        super(cedula, nombre, apellido1, apellido2, estado);
        this.correo = correo;
        this.salario = salario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
    
}
