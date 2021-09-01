/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.controller;

import com.trabajo_final.model.Ventas;
import com.trabajo_final.service.VentasService;
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
@RequestMapping("/ventas")
public class VentasController {
    @Autowired
    VentasService servicioV;
    @GetMapping("")
      public List<Ventas> listadoV(){
         return servicioV.listadoCompleto();
      }
    @GetMapping(path="/{codigoventa}") 
      public Ventas registroUnicoV(@PathVariable ("codigoventa") int codigoventa){
          return servicioV.listadoVentaUnica(codigoventa);
      }
    
    @PostMapping("")
    public Ventas agregarV(@RequestBody Ventas v){
         return servicioV.altaVenta(v);
    }
    @PutMapping(path="/{codigoventa}")
    public Ventas editarV(@RequestBody Ventas v, @PathVariable ("codigoventa") int codigoventa){
        
        v.setCodigoventa(codigoventa);
        return servicioV.modificarVentas(v);
    }
    @DeleteMapping(path="/{codigoventa}")
     public Ventas deleteV( @PathVariable ("") int codigoventa){
         
         return servicioV.eliminarVentas(codigoventa);
     }
}
