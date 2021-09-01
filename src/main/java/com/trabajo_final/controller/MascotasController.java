/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.controller;

import com.trabajo_final.model.Mascotas;
import com.trabajo_final.service.MascotasService;
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
@RequestMapping("/mascotas")
public class MascotasController {
    @Autowired
    MascotasService service;
     @GetMapping("")
     public List<Mascotas> listadomascota(){
         return service.listadoCompleto();
     }
     @GetMapping(path="/{id}")
     public Mascotas registroUnico(@PathVariable ("id") int id){
         return service.listadoMacotaUnica(id);
     }
     @PostMapping("")
     public Mascotas agregar(@RequestBody Mascotas m){
         return service.altaMascotas(m);
     }
     @PutMapping(path="/{id}")
    public Mascotas editar(@RequestBody Mascotas m, @PathVariable ("id") int id){
        
        m.setId(id);
        return service.modificarMascotas(m);
        
    }
     @DeleteMapping(path="/{id}")
     public Mascotas delete( @PathVariable ("id") int id){
         
         return service.eliminarMascotas(id);
     }
     @GetMapping("/tipos")
     public List<String>listaTipos(){
         return service.listaTipos();
     }
     @GetMapping(path="/mascota/{tipo}")
     public List<Mascotas>listaTipoMascotas(@PathVariable ("tipo") String tipo){
         return service.listaTipoMascotas(tipo);
     }
}
