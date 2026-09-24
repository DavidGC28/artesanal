package com.krakedev.artesanal;



public class Cliente {

    // Atributos base de Cliente (puedes agregar los que tenga tu proyecto, como cedula, nombre, etc.)
    private String cedula;
    private String nombre;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}