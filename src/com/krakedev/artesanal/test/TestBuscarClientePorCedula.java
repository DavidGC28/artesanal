package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestBuscarClientePorCedula {

    @Test
    public void testBuscarClienteExistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        
    
        negocio.registrarCliente("Carlos Andrade", "1720001122");

        Cliente encontrado = negocio.buscarClientePorCedula("1720001122");

        assertNotNull(encontrado);
        assertEquals("Carlos Andrade", encontrado.getNombre());
        assertEquals("1720001122", encontrado.getCedula());
    }

    @Test
    public void testBuscarClienteNoExistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        
        
        negocio.registrarCliente("Carlos Andrade", "1720001122");

        Cliente encontrado = negocio.buscarClientePorCedula("9999999999");

        assertNull(encontrado);
    }
}