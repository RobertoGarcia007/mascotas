/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.dao.MascotasRepository;
import com.trabajo_final.model.Mascotas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author yo
 */
@Service
public class MascotasServiceImpl implements MascotasService{
    @Autowired
    private MascotasRepository repositorio;
    
    
    @Override
    public List<Mascotas> listadoCompleto() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findAll();
    
    }
    
    @Override
    public Mascotas listadoMacotaUnica(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.findById(id);
    }
    
    @Override
    public Mascotas altaMascotas(Mascotas m) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return repositorio.save(m);
    
    }
    @Override
    public Mascotas modificarMascotas(Mascotas m) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return repositorio.save(m);
    }
    @Override
    public Mascotas eliminarMascotas(int id) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      
        Mascotas m = repositorio.findById(id);
        
           if(m!=null){
             repositorio.delete(m);
           }
          return m; 
    }

    @Override
    public List<String> listaTipos() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return  repositorio.listaTipos();
    }

    @Override
    public List<Mascotas> listaTipoMascotas(String tipo) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return repositorio.listaTipoMascotas(tipo);
                
    }
    

}
