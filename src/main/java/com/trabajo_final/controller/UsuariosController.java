/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.controller;

import com.trabajo_final.model.Usuarios;
import com.trabajo_final.service.UsuariosService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author yo
 */
@CrossOrigin(origins="http://localhost:4200",maxAge =3600)
@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
    @Autowired
    UsuariosService serviceU;
    @GetMapping("")
    public List<Usuarios> listadoU(){
         return serviceU.listadoCompleto();
    }
    @GetMapping(path="/{username}")
    public Usuarios registroUnicoU(@PathVariable ("username") String username){
         return serviceU.listadoUsuarioUnica(username);
    }
    @GetMapping("/validacion/{username},{clave}")
    public Usuarios validacionU(@PathVariable ("username") String username
            ,@PathVariable ("clave") String clave){
        return serviceU.validacionUser(username,clave);
    }
    @PostMapping("")
    public Usuarios agregarU(@RequestBody Usuarios u){
         return serviceU.altaUsuarios(u);
    }
     @PutMapping(path="/{username}")
    public Usuarios editarU(@RequestBody Usuarios u, @PathVariable ("username") String username){
        
        u.setUsername(username);
        return serviceU.modificarUsuarios(u);
        
    }
    @DeleteMapping(path="/{username}")
     public Usuarios deleteU( @PathVariable ("username") String username){
         
         return serviceU.eliminarUsuarios(username);
     }
}
