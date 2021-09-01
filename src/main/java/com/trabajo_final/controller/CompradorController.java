/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.controller;

import com.trabajo_final.model.Comprador;
import com.trabajo_final.service.CompradorService;
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
@RequestMapping("/comprador")
public class CompradorController {
     @Autowired
    CompradorService serviceC;
    @GetMapping("")
    public List<Comprador> listadoC(){
         return serviceC.listadoCompleto();
    }
    @GetMapping(path="/{dni}")
    public Comprador registroUnicoC(@PathVariable ("dni") String dni){
         return serviceC.listadoCompradorUnica(dni);
    }
     @PostMapping("")
    public Comprador agregarC(@RequestBody Comprador c){
         return serviceC.altaComprador(c);
    }
    @PutMapping(path="/{dni}")
    public Comprador editarU(@RequestBody Comprador c, @PathVariable ("dni") String dni){
        
        c.setDni(dni);
        return serviceC.modificarComprador(c);
        
    }
    @DeleteMapping(path="/{dni}")
     public Comprador deleteU( @PathVariable ("dni") String dni){
         
         return serviceC.eliminarComprador(dni);
     }
}
