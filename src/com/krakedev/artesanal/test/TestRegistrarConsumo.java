package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRegistrarConsumo {

    @Test
    public void testAcumularConsumoCliente() {
        NegocioMejorado negocio = new NegocioMejorado();
        
        negocio.agregarMaquina("Stout", "Cerveza Negra", 0.10);
        negocio.registrarCliente("Carlos Andrade", "1720001122"); 
        negocio.cargarMaquinas();

        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

        
        negocio.consumirCerveza(1, codigoMaquina, 200);

       
        negocio.consumirCerveza(1, codigoMaquina, 300);

        Cliente c = negocio.buscarClientePorCodigo(1);

    
        assertEquals(50.0, c.getTotalConsumido(), 0.01);
    }
}