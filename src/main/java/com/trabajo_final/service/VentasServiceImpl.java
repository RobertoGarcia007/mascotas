/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.dao.VentasRepository;
import com.trabajo_final.model.Ventas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentasServiceImpl implements VentasService {
    @Autowired
    private VentasRepository repositorio;
    @Override
    public List<Ventas> listadoCompleto() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findAll();
    }

    @Override
    public Ventas listadoVentaUnica(int codigoventa) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findById(codigoventa);
    
    }

    @Override
    public Ventas altaVenta(Ventas v) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(v);
    }

    @Override
    public Ventas eliminarVentas(int codigoventa) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Ventas v = repositorio.findById(codigoventa);
        
           if(v!=null){
             repositorio.delete(v);
           }
          return v; 
    }

    @Override
    public Ventas modificarVentas(Ventas v) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         return repositorio.save(v);
    }
    
}
