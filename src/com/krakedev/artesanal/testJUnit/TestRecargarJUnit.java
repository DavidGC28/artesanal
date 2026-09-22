package com.krakedev.artesanal.testJUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import com.krakedev.artesanal.Maquina;

public class TestRecargarJUnit {

	@Test
	public void testRecargaExitosa() {
	
		Maquina rubia = new Maquina ("Pilsener","Cerveza",null, 0.02,8000);
		
		boolean resultado = rubia.recargarCerveza(3000);
		assertTrue(resultado);
		assertEquals(3000, rubia.getCapacidadActual(), 0.0001);
	}		
		@Test
		public void testDesborde() {
		
			Maquina negra = new Maquina ("Pilsener","Cerveza",null, 0.02,8000);
			
			boolean resultado = negra.recargarCerveza(5000);
			assertTrue(resultado);
			assertEquals(4000, negra.getCapacidadActual(), 0.0001);
	}
}
