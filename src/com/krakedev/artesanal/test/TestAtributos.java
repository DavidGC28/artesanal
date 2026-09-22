package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestAtributos {

	public static void main(String[] args) {
		
		Maquina rubia = new Maquina("Pilsener", "Cerveza Rubia", null, 0.50);
		
		rubia.imprimir();
		
		rubia.setNombreCerveza("Gold lion");
		rubia.setDescripcion("Cerveza rubia con notas maderadas");
		
		rubia.imprimir();
	}

}
