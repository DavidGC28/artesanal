package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestAgregarMaquina {

    @Test
    public void testAgregarMaquina() {
        NegocioMejorado negocio = new NegocioMejorado();

        
        assertEquals(0, negocio.getMaquinas().size());

        
        negocio.agregarMaquina("IPA", "Cerveza artesanal amarga", 0.05);

        
        assertEquals(1, negocio.getMaquinas().size());

       
        Maquina m = negocio.getMaquinas().get(0);
        assertEquals("IPA", m.getNombreCerveza());
        assertNotNull(m.getCodigo());
        assertTrue(m.getCodigo().startsWith("M-"));
    }
}
