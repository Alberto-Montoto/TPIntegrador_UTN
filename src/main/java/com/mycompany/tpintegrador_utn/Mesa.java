
package com.mycompany.tpintegrador_utn;

import java.util.Date;

public class Mesa {
    
    private int id_mesa;
    private Cliente cuit;
    private Incidente id_incidente;
    private Date fecha_ingreso;

    public Mesa(int id_mesa, Cliente cuit, Incidente id_incicente, Date fecha_ingreso) {
        this.id_mesa = id_mesa;
        this.cuit = cuit;
        this.id_incidente = id_incicente;
        this.fecha_ingreso = fecha_ingreso;
    }

    public Mesa() {
    }

    public int getId_mesa() {
        return id_mesa;
    }

    public void setId_mesa(int id_mesa) {
        this.id_mesa = id_mesa;
    }

    public Cliente getCuit() {
        return cuit;
    }

    public void setCuit(Cliente cuit) {
        this.cuit = cuit;
    }

    public Incidente getId_incicente() {
        return id_incidente;
    }

    public void setId_incicente(Incidente id_incicente) {
        this.id_incidente = id_incicente;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    
}
