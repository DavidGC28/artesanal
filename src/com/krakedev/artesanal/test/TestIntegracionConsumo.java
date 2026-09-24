package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestIntegracionConsumo {

    @Test
    public void testConsumirCervezaIntegradoConRegistrarConsumo() {
        NegocioMejorado negocio = new NegocioMejorado();


        negocio.agregarMaquina("Red Ale", "Cerveza Roja", 0.08);
        negocio.registrarCliente("David Guamán", "1712345678"); 
        negocio.cargarMaquinas();

        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();

        
        double valorServido = negocio.consumirCerveza(1, codigoMaquina, 250);

      
        Cliente cliente = negocio.buscarClientePorCodigo(1);

        assertEquals(20.0, valorServido, 0.01);
        assertEquals(20.0, cliente.getTotalConsumido(), 0.01);
    }
}