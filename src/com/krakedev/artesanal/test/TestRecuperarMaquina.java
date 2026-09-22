package com.krakedev.artesanal.test;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestRecuperarMaquina {

    @Test
    public void testRecuperarMaquinaExistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        
  
        negocio.agregarMaquina("Golden Ale", "Cerveza rubia", 0.04);
        
        
        String codigoGenerado = negocio.getMaquinas().get(0).getCodigo();

       
        Maquina maquinaRecuperada = negocio.recuperarMaquina(codigoGenerado);

        assertNotNull(maquinaRecuperada);
        assertEquals(codigoGenerado, maquinaRecuperada.getCodigo());
        assertEquals("Golden Ale", maquinaRecuperada.getNombreCerveza());
    }

    @Test
    public void testRecuperarMaquinaNoExistente() {
        NegocioMejorado negocio = new NegocioMejorado();
        
       
        negocio.agregarMaquina("Stout", "Cerveza negra", 0.06);

       
        Maquina maquinaRecuperada = negocio.recuperarMaquina("M-999");

     
        assertNull(maquinaRecuperada);
    }
}