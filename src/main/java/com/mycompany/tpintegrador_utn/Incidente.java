
package com.mycompany.tpintegrador_utn;


public class Incidente {
    
    private int id_incidente;
    private String descripcion;
    private String tipo;

    public Incidente() {
    }

    public Incidente(int id_incidente, String descripcion, String tipo) {
        this.id_incidente = id_incidente;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getId_incidente() {
        return id_incidente;
    }

    public void setId_incidente(int id_incidente) {
        this.id_incidente = id_incidente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
