/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.model.Mascotas;
import java.util.List;
/**
 *
 * @author yo
 */
public interface MascotasService {
    List<Mascotas>listadoCompleto();
    Mascotas listadoMacotaUnica(int id);
    Mascotas eliminarMascotas(int id);
    Mascotas altaMascotas(Mascotas m);
    Mascotas modificarMascotas(Mascotas m);   
    List<String>listaTipos();
    List<Mascotas>listaTipoMascotas(String tipo);

}
