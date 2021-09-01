/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author yo
 */
@Entity
@Table(name="usuarios")

public class Usuarios {
    @Id   
    private String username;
    private String clave;
    private String nombre;
    private String apellidos;
    private int telefonocon;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTelefonocon() {
        return telefonocon;
    }

    public void setTelefonocon(int telefonocon) {
        this.telefonocon = telefonocon;
    }

   
    
    
    
    
}
