
package com.mycompany.tpintegrador_utn;

import java.util.Date;


public class Solucion {
    
    
    private int id_solucion;
    private Cliente cuit;
    private Date fecha_solucion;
    private Tecnico id_tecnico;
    private String informe;

    public Solucion(int id_solucion, Cliente cuit, Date fecha_solucion, Tecnico id_tecnico, String informe) {
        this.id_solucion = id_solucion;
        this.cuit = cuit;
        this.fecha_solucion = fecha_solucion;
        this.id_tecnico = id_tecnico;
        this.informe = informe;
    }

    public Solucion() {
    }

    public int getId_solucion() {
        return id_solucion;
    }

    public void setId_solucion(int id_solucion) {
        this.id_solucion = id_solucion;
    }

    public Cliente getCuit() {
        return cuit;
    }

    public void setCuit(Cliente cuit) {
        this.cuit = cuit;
    }

    public Date getFecha_solucion() {
        return fecha_solucion;
    }

    public void setFecha_solucion(Date fecha_solucion) {
        this.fecha_solucion = fecha_solucion;
    }

    public Tecnico getId_tecnico() {
        return id_tecnico;
    }

    public void setId_tecnico(Tecnico id_tecnico) {
        this.id_tecnico = id_tecnico;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }
    
    
}
