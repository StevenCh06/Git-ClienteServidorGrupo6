/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

public class Cocinero extends Persona{

    double salario;
    
    public Cocinero() {
    }

    public Cocinero(int cedula, String nombre, String apellido1, String apellido2, double salario, boolean estado) {
        super(cedula, nombre, apellido1, apellido2, estado);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
