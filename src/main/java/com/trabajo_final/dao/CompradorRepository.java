/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.dao;

import com.trabajo_final.model.Comprador;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author yo
 */
public interface CompradorRepository extends Repository<Comprador,String>{
    List<Comprador>findAll();
    Comprador findById(String username);
    void delete(Comprador c);
    Comprador save(Comprador c);
}
