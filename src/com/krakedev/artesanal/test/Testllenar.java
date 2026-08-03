package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;




public class Testllenar {

	public static void main(String[] args) {
		
		Maquina rubia = new Maquina("Pilsener","Cerveza Fria", 0.02, 800);
		rubia.imprimir();
		rubia.llenarMaquina();
		rubia.imprimir();
		
		Maquina negra = new Maquina("Club","Cerveza buena",0.03);
		negra.imprimir();
		negra.llenarMaquina();
		negra.imprimir();

	}

}
