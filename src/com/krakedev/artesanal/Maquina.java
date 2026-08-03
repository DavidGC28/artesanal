package com.krakedev.artesanal;

public class Maquina {

	private String codigo; 
	private String nombreCerveza;
	private String descripcion;
	private double precio;
	private double capacidadMaxima;
	private double capacidadActual;

	
	public Maquina(String codigo, String nombreCerveza, double precio, double capacidadMaxima, double capacidadActual,
			String descripcion) {
		this.codigo = codigo;
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precio = precio;
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = capacidadActual;
	}


	public Maquina(String codigo, String nombreCerveza, String descripcion, double precio, double capacidadMaxima) {
		this.codigo = codigo;
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precio = precio;
		this.capacidadMaxima = capacidadMaxima;
		this.capacidadActual = 0; 
	}


	public Maquina(String codigo, String nombreCerveza, String descripcion, double precio) {
		this.codigo = codigo;
		this.nombreCerveza = nombreCerveza;
		this.descripcion = descripcion;
		this.precio = precio;
		this.capacidadMaxima = 1000;
		this.capacidadActual = 0;
	}

	
	public String getCodigo() {
		return codigo;
	}

	public String getNombreCerveza() {
		return nombreCerveza;
	}

	public void setNombreCerveza(String nombreCerveza) {
		this.nombreCerveza = nombreCerveza;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Double getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(Double capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public Double getCapacidadActual() {
		return capacidadActual;
	}

	public void setCapacidadActual(Double capacidadActual) {
		this.capacidadActual = capacidadActual;
	}

	public void imprimir() {
		String mensaje;

		mensaje = "Codigo: " + codigo + " | Nombre: " + nombreCerveza + " | Descripcion: " + descripcion + " | Precio: " + precio
				+ " | Capacidad Maxima: " + capacidadMaxima + " | Capacidad Actual: " + capacidadActual;

		System.out.println(mensaje);
	}

	public void llenarMaquina() {

		this.capacidadActual = this.capacidadMaxima - 200;
	}

	public boolean recargarCerveza(double cantidad) {
	
		double limitePermitido = capacidadMaxima - 200;

		if (capacidadActual + cantidad <= limitePermitido) {
			capacidadActual = capacidadActual + cantidad;
			return true;
		} else {
			return false;
		}
	}
		
	public double servirCerveza(double cantidad) {
		if (capacidadActual >= cantidad) {
			capacidadActual = capacidadActual - cantidad;
			double valor;
			valor = cantidad * precio;
			return valor;
		} else {
			return 0.0;
		}
	}
}