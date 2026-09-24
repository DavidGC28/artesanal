package com.krakedev.artesanal;

import java.util.ArrayList;

// SI LA CLASE CLIENTE O MAQUINA ESTÁN EN OTRO PAQUETE, IMPORTALAS ASÍ:
// import com.krakedev.artesanal.entidades.Cliente;
// import com.krakedev.artesanal.entidades.Maquina;

public class NegocioMejorado {

    private ArrayList<Maquina> maquinas;
    private ArrayList<Cliente> clientes;

    public NegocioMejorado() {
        this.maquinas = new ArrayList<>();
    }

    public String generarCodigo() {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        return "M-" + numeroAleatorio;
    }

    public boolean agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
        String codigo = generarCodigo();

        if (recuperarMaquina(codigo) != null) {
            return false;
        }

        Maquina nuevaMaquina = new Maquina(codigo, nombreCerveza, descripcion, precioPorMl);
        this.maquinas.add(nuevaMaquina);
        return true;
    }

    public void cargarMaquinas() {
        for (int i = 0; i < maquinas.size(); i++) {
            Maquina maquina = maquinas.get(i);
            maquina.llenarMaquina();
        }
    }

    public Maquina recuperarMaquina(String codigo) {
        for (int i = 0; i < maquinas.size(); i++) {
            Maquina maquinaEncontrada = maquinas.get(i);
            if (maquinaEncontrada.getCodigo().equals(codigo)) {
                return maquinaEncontrada;
            }
        }
        return null;
    }

    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}