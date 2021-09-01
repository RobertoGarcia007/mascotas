/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.dao.CompradorRepository;
import com.trabajo_final.model.Comprador;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompradorServiceImpl implements CompradorService {
    @Autowired
    private CompradorRepository repositorio;
    @Override
    public List<Comprador> listadoCompleto() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findAll();
    }

    @Override
    public Comprador listadoCompradorUnica(String dni) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findById(dni);
    }

    @Override
    public Comprador eliminarComprador(String dni) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Comprador c = repositorio.findById(dni);
        
           if(c!=null){
             repositorio.delete(c);
           }
          return c; 
    }

    @Override
    public Comprador altaComprador(Comprador c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(c);
    }

    @Override
    public Comprador modificarComprador(Comprador c) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.save(c);
    }
    
}
