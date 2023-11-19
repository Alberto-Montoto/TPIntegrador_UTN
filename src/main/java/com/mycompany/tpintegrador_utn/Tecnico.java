
package com.mycompany.tpintegrador_utn;


public class Tecnico {
 
    private int id_tecnico;
    private String nombre;
    private Especialidad id_especialidad;

    public Tecnico(int id_tecnico, String nombre, Especialidad id_especialidad) {
        this.id_tecnico = id_tecnico;
        this.nombre = nombre;
        this.id_especialidad = id_especialidad;
    }

    public Tecnico() {
    }

    public int getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(int id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Especialidad getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(Especialidad id_especialidad) {
        this.id_especialidad = id_especialidad;
    }
    
    
}
