
package com.mycompany.tpintegrador_utn;


public class Servicio {
    
    private int id_servivio;
    private String descripcion;
    private Tecnico id_tecnico;
    private Incidente id_incidente;

    public Servicio(int id_servivio, String descripcion, Tecnico id_tecnico, Incidente id_incidente) {
        this.id_servivio = id_servivio;
        this.descripcion = descripcion;
        this.id_tecnico = id_tecnico;
        this.id_incidente = id_incidente;
    }

    public Servicio() {
    }

    public int getId_servivio() {
        return id_servivio;
    }

    public void setId_servivio(int id_servivio) {
        this.id_servivio = id_servivio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Tecnico getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Tecnico id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public Incidente getId_incidente() {
        return id_incidente;
    }

    public void setId_incidente(Incidente id_incidente) {
        this.id_incidente = id_incidente;
    }
    
    
}
