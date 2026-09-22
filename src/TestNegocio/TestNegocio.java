package TestNegocio;

import com.krakedev.artesanal.Maquina;
import com.krakedev.artesanal.Negocio;

public class TestNegocio {

    public static void main(String[] args) {
        
        Maquina nueva = new Maquina("Cerveza Club", "Cerveza fria", 0, 0.02, 8000, null);
        Negocio negocio1 = new Negocio("BENTO", nueva);
        
        System.out.println("Nombre: " + negocio1.getNombre());
      
        System.out.println("Maquina: " + negocio1.getMaquinaA().getNombreCerveza());
        
        Maquina m1 = negocio1.getMaquinaA();
        double capacidad = m1.getCapacidadMaxima();
        System.out.println("Capacidad máxima: " + capacidad);
        
    }

}