package com.krakedev.artesanal.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestValidarDuplicados {

    @Test
    public void testAgregarMaquinaExito() {
        NegocioMejorado negocio = new NegocioMejorado();
       
        boolean resultado = negocio.agregarMaquina("IPA", "Cerveza amarga", 0.05);
        
        assertTrue(resultado);
    }

    @Test
    public void testAgregarMaquinaDuplicada() {
        NegocioMejorado negocio = new NegocioMejorado();

      
        Maquina maquinaExistente = new Maquina("M-50", "Stout", "Cerveza negra", 0.06);
        negocio.getMaquinas().add(maquinaExistente);

      
        boolean existe = negocio.recuperarMaquina("M-50") != null;
        assertTrue(existe);
    }
}