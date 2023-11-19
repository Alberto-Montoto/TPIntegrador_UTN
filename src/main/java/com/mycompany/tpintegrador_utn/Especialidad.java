
package com.mycompany.tpintegrador_utn;


public class Especialidad {
    
    
    private int id_especialidad;
    private Tecnico id_tecnico;
    private String tpo;

    public Especialidad(int id_especialidad, Tecnico id_tecnico, String tpo) {
        this.id_especialidad = id_especialidad;
        this.id_tecnico = id_tecnico;
        this.tpo = tpo;
    }

    public Especialidad() {
    }

    public int getId_especialidad() {
        return id_especialidad;
    }

    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }

    public Tecnico getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Tecnico id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getTpo() {
        return tpo;
    }

    public void setTpo(String tpo) {
        this.tpo = tpo;
    }
    
    
}
