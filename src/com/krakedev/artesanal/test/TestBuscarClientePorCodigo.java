package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.NegocioMejorado;

public class TestBuscarClientePorCodigo {

    @Test
    public void testBuscarClientePorCodigoExistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        negocio.registrarCliente("Carlos Andrade", "1720001122"); // Genera código 1

        Cliente encontrado = negocio.buscarClientePorCodigo(1);

        assertNotNull(encontrado);
        assertEquals("Carlos Andrade", encontrado.getNombre());
        assertEquals(1, encontrado.getCodigo());
    }

    @Test
    public void testBuscarClientePorCodigoNoExistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        negocio.registrarCliente("Carlos Andrade", "1720001122");

        Cliente encontrado = negocio.buscarClientePorCodigo(99);

        assertNull(encontrado);
    }
}