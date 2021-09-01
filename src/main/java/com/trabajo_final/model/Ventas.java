/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author yo
 */
@Entity
@Table(name="ventas")
public class Ventas {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int codigoventa;
    private String dnic;
    private int idmascota;
    private String fechaventa;

    public int getCodigoventa() {
        return codigoventa;
    }

    public void setCodigoventa(int codigoventa) {
        this.codigoventa = codigoventa;
    }

    public String getDnic() {
        return dnic;
    }

    public void setDnic(String dnic) {
        this.dnic = dnic;
    }

    public int getIdmascota() {
        return idmascota;
    }

    public void setIdmascota(int idmascota) {
        this.idmascota = idmascota;
    }

    public String getFechaventa() {
        return fechaventa;
    }

    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }
    
    
}
