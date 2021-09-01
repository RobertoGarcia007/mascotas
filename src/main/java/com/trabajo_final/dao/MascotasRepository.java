/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.dao;

import com.trabajo_final.model.Mascotas;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 *
 * @author yo
 */
public interface MascotasRepository extends Repository<Mascotas,Integer>{
    List<Mascotas>findAll();
    Mascotas findById(int id);
    void delete(Mascotas m);
    Mascotas save(Mascotas m);
    @Query("select DISTINCT tipo from Mascotas m")
        List<String>listaTipos();
    @Query("select m from Mascotas m Where m.tipo = ?1")
        List<Mascotas>listaTipoMascotas(String tipo);
}
