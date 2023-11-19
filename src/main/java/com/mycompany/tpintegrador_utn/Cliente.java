
package com.mycompany.tpintegrador_utn;


public class Cliente {
    
    private int cuit;
    private String razon_social;

    public int getCuit() {
        return cuit;
    }

    public void setCuit(int cuit) {
        this.cuit = cuit;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public Cliente() {
    }
    
    public Cliente(int cuit, String razon_social) {
        this.cuit = cuit;
        this.razon_social = razon_social;
    }
    
    
}
