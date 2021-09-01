/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.dao.UsuariosRepository;
import com.trabajo_final.model.Usuarios;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yo

 */
@Service
public class UsuariosServiceImpl implements UsuariosService  {
    @Autowired
    private UsuariosRepository repositorio;
    
    @Override
    public List<Usuarios> listadoCompleto() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findAll();
    }

    @Override
    public Usuarios listadoUsuarioUnica(String username) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findById(username);
    }

    @Override
    public Usuarios eliminarUsuarios(String username) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
         Usuarios u = repositorio.findById(username);
        
           if(u!=null){
             repositorio.delete(u);
           }
          return u; 
    }

    @Override
    public Usuarios altaUsuarios(Usuarios u) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(u);
    }

    @Override
    public Usuarios modificarUsuarios(Usuarios u) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return repositorio.save(u);
    }

    @Override
    public Usuarios validacionUser(String username,String clave) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        return  repositorio.lisataUsuarios(username,clave);
    
    }
    
}
