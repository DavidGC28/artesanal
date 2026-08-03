package com.krakedev.artesanal.testJUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import com.krakedev.artesanal.Maquina;

public class TestLlenarJunit {
	
	@Test
	public void testLlenar() {
		
		Maquina rubia = new Maquina("M001", "Pilsener", "Cerveza", 0.02, 800);
		rubia.llenarMaquina();
		
		
		assertEquals(600.0, rubia.getCapacidadActual(), 0.0001);
	}
}