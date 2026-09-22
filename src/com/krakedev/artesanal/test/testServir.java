package com.krakedev.artesanal.test;

import com.krakedev.artesanal.Maquina;

public class testServir {

	public static void main(String[] args) {
		
		
		Maquina rubia = new Maquina("Pilsener", "Cerveza Fria", null, 0.02, 800);

		System.out.println("---------ESTADO INICIAL-------------");
		rubia.imprimir();
		
		System.out.println("---------LLENAR MAQUINAL-------------");
		rubia.llenarMaquina();
		rubia.imprimir();
		
		System.out.println("---------SERVIR CERVEZA 100-------------");
		double precio;
		
		precio=rubia.servirCerveza(100);
			System.out.println("VALOR A PAGAR:"+precio);
			
			System.out.println("---------SERVIR CERVEZA 200-------------");
		
			precio=rubia.servirCerveza(200);
				System.out.println("VALOR A PAGAR:"+precio);
			
				System.out.println("---------SERVIR CERVEZA 200-------------");
				
				precio=rubia.servirCerveza(300);
					System.out.println("VALOR A PAGAR:"+precio);
		
				rubia.imprimir();
	}
}
