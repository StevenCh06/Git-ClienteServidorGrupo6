/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectofinal;

import java.util.ArrayList;


public class ManejoDatos {
    
    //Almacena estudiantes
    public ArrayList<Estudiante> estudiante = new ArrayList<>();
    Estudiante xestudiante = new Estudiante(123, "Wendy", "Badilla", "Carvajal", 21, 2, "No", false);

    //Almacena profesores
    public ArrayList<Profesor> profesor = new ArrayList<>();
    Profesor xprofesor = new Profesor(147, "Steven", "Chacon", "Camacho", "st@gmail.com", 1000, false);
    
    //Almacena cocineros
    public ArrayList<Cocinero> cocinero = new ArrayList<>();
    Cocinero xcocinero = new Cocinero(789, "Maria", "Ramirez", "Zuñiga", 2500, true);
    
    public ManejoDatos() {
        estudiante.add(xestudiante);
        profesor.add(xprofesor);
        cocinero.add(xcocinero);
    }

    public ArrayList<Estudiante> getEstudiante() {
        return estudiante;
    }

    public ArrayList<Profesor> getProfesor() {
        return profesor;
    }

    public ArrayList<Cocinero> getCocinero() {
        return cocinero;
    }
    
    
}
