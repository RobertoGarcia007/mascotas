/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.model.Usuarios;
import java.util.List;

/**
 *
 * @author yo
 */
public interface UsuariosService {
    List<Usuarios>listadoCompleto();
    Usuarios listadoUsuarioUnica(String username);
    Usuarios eliminarUsuarios(String username);
    Usuarios altaUsuarios(Usuarios u);
    Usuarios modificarUsuarios(Usuarios u);  
    Usuarios validacionUser(String username,String clave);
}
