/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.dao;

import com.trabajo_final.model.Ventas;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author yo
 */
public interface VentasRepository extends Repository<Ventas,Integer> {
   List<Ventas>findAll();
   Ventas findById(int codigoventa);
   void delete(Ventas v);
   Ventas save(Ventas v);
}
