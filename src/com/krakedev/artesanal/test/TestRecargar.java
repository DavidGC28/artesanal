package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class TestRecargar {

	public static void main(String[] args) {
		
		
		boolean resultado = false;
		
		Maquina rubia = new Maquina("Pilsener", "Cerveza Fria", 0.02, 800);
		
		System.out.println("---------ESTADO INICIAL-------------");
		rubia.imprimir();
		
		System.out.println("---------primera recarga-------------");
	
		resultado = rubia.recargarCerveza(300);
		
		System.out.println("Recarga correcta: " + resultado);
		rubia.imprimir();
	}
}
