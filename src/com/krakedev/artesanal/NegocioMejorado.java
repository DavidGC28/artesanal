package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

    private ArrayList<Maquina> maquinas;

    public NegocioMejorado() {
        this.maquinas = new ArrayList<>();
    }

    public String generarCodigo() {
        int numeroAleatorio = (int) (Math.random() * 100) + 1;
        return "M-" + numeroAleatorio;
    }

    public void agregarMaquina(String nombreCerveza, String descripcion, double precioPorMl) {
        String codigo = generarCodigo();
        Maquina nuevaMaquina = new Maquina(codigo, nombreCerveza, descripcion, precioPorMl);
        this.maquinas.add(nuevaMaquina);
    }


    public void cargarMaquinas() {
        for (int i = 0; i < maquinas.size(); i++) {
            Maquina maquina = maquinas.get(i);
            maquina.llenarMaquina();
        }
    }

   
    public ArrayList<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(ArrayList<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
}