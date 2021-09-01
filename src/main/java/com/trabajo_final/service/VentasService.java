/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trabajo_final.service;

import com.trabajo_final.model.Ventas;
import java.util.List;

/**
 *
 * @author yo
 */
public interface VentasService {
    List<Ventas>listadoCompleto();
    Ventas listadoVentaUnica(int codigoventa);
    Ventas eliminarVentas(int codigoventa);
    Ventas altaVenta(Ventas v);
    Ventas modificarVentas(Ventas v);
}
