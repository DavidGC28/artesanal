package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumirCerveza {

    @Test
    public void testConsumirCervezaExito() {
        NegocioMejorado negocio = new NegocioMejorado();
        
       
        negocio.agregarMaquina("IPA", "Cerveza Fuerte", 0.10);
        negocio.registrarCliente("Carlos Andrade", "1720001122");
       
        negocio.cargarMaquinas();

        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

      
        double totalServido = negocio.consumirCerveza(1, codigoMaquina, 500);

        assertTrue(totalServido > 0);
        assertEquals(50.0, totalServido, 0.01);
    }
}
