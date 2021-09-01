/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.dao;

import com.trabajo_final.model.Usuarios;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 *
 * @author yo
 */
public interface UsuariosRepository extends Repository<Usuarios,java.lang.String> {
    List<Usuarios>findAll();
    Usuarios findById(String username);
    void delete(Usuarios u);
    Usuarios save(Usuarios u);
    @Query("Select u From Usuarios u WHERE u.username=?1 and u.clave=?2")
    Usuarios lisataUsuarios(String username,String clave);
}
