/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.model.Comprador;
import java.util.List;

/**
 *
 * @author yo
 */
public interface CompradorService {
     List<Comprador>listadoCompleto();
    Comprador listadoCompradorUnica(String dni);
    Comprador eliminarComprador(String dni);
    Comprador altaComprador(Comprador c);
    Comprador modificarComprador(Comprador c);   
}
