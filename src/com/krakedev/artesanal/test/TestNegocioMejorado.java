package com.krakedev.artesanal.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.NegocioMejorado;

public class TestNegocioMejorado {

    @Test
    public void testGenerarCodigoFormatoYRango() {
        NegocioMejorado negocio = new NegocioMejorado();
        String codigo = negocio.generarCodigo();

        
        assertNotNull(codigo, "El código generado no debe ser nulo");

       
        assertTrue(codigo.startsWith("M-"), "El código debe comenzar con 'M-'");

       
        String numeroStr = codigo.substring(2);
        int numero = Integer.parseInt(numeroStr);

        assertTrue(numero >= 1 && numero <= 100, "El número generado debe estar entre 1 y 100");
    }
}