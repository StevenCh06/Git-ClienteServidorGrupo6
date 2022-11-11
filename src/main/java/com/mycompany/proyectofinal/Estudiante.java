/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

public class Estudiante extends Persona{

    public Estudiante() {
    }

    private int edad;
    private int grupo;
    private String beca;

    public Estudiante(int cedula, String nombre, String apellido1, String apellido2, int edad, int grupo, String beca, boolean estado) {
        super(cedula, nombre, apellido1, apellido2, estado);
        this.edad = edad;
        this.grupo = grupo;
        this.beca = beca;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getGrupo() {
        return grupo;
    }

    public void setGrupo(int grupo) {
        this.grupo = grupo;
    }

    public String isBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }
    
}
