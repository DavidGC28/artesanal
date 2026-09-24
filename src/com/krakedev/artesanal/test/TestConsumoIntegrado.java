package com.krakedev.artesanal.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.krakedev.artesanal.Cliente;
import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.NegocioMejorado;

public class TestConsumoIntegrado {

    @Test
    public void testValidarConsumoCompleto() {
        NegocioMejorado negocio = new NegocioMejorado();

 
        negocio.agregarMaquina("Golden Ale", "Cerveza artesanal rubia", 0.05);
        negocio.registrarCliente("David Guamán", "1712345678"); 
        negocio.cargarMaquinas(); 

       
        String codigoMaquina = negocio.getMaquinas().get(0).getCodigo();
        Maquina maquinaInicial = negocio.recuperarMaquina(codigoMaquina);
        
        double capacidadInicial = maquinaInicial.getCapacidadActual(); 
        int cantidadAServir = 400;

       
        double valorRetornado = negocio.consumirCerveza(1, codigoMaquina, cantidadAServir);

      

        
        assertEquals("El valor retornado del servicio debe ser correcto", 20.0, valorRetornado, 0.01);

     
        Cliente clienteActualizado = negocio.buscarClientePorCodigo(1);
        assertNotNull("El cliente debe existir", clienteActualizado);
        assertEquals("El total consumido del cliente debe actualizarse acumulativamente", 20.0, clienteActualizado.getTotalConsumido(), 0.01);

       
        Maquina maquinaActualizada = negocio.recuperarMaquina(codigoMaquina);
        double capacidadEsperada = capacidadInicial - cantidadAServir;
        assertEquals("La capacidad de la máquina debe haberse reducido tras servir la cerveza", capacidadEsperada, maquinaActualizada.getCapacidadActual(), 0.01);
    }
}