package com.krakedev.artesanal;

import java.util.ArrayList;

public class NegocioMejorado {

    private ArrayList<Maquina> maquinas;
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private int ultimoCodigo = 0;

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

    public void registrarCliente(String nombre, String cedula) {
        ultimoCodigo++;
        
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setCodigo(ultimoCodigo);
        nuevoCliente.setNombre(nombre);
        nuevoCliente.setCedula(cedula);

        this.clientes.add(nuevoCliente);
    }

    public Cliente buscarClientePorCedula(String cedula) {
        if (cedula == null || this.clientes == null) {
            return null;
        }
        for (int i = 0; i < clientes.size(); i++) {
            Cliente clienteEncontrado = clientes.get(i);
            if (clienteEncontrado != null && clienteEncontrado.getCedula() != null) {
                if (clienteEncontrado.getCedula().equals(cedula)) {
                    return clienteEncontrado;
                }
            }
        }
        return null;
    }

    public Cliente buscarClientePorCodigo(int codigo) {
        if (this.clientes == null) {
            return null;
        }
        for (int i = 0; i < clientes.size(); i++) {
            Cliente clienteEncontrado = clientes.get(i);
            if (clienteEncontrado != null && clienteEncontrado.getCodigo() == codigo) {
                return clienteEncontrado;
            }
        }
        return null;
    }


    public void registrarConsumo(Cliente cliente, double valor) {
        if (cliente != null) {
        
            double totalActual = cliente.getTotalConsumido();
            cliente.setTotalConsumido(totalActual + valor);
        }
    }

 
    public double consumirCerveza(int codigoCliente, String codigoMaquina, int cantidad) {
        Maquina maquinaRecuperada = recuperarMaquina(codigoMaquina);
        Cliente clienteEncontrado = buscarClientePorCodigo(codigoCliente);

        if (maquinaRecuperada != null && clienteEncontrado != null) {
            double totalPagar = maquinaRecuperada.servirCerveza(cantidad);
            
          
            registrarConsumo(clienteEncontrado, totalPagar);
            
            return totalPagar;
        }

        return 0.0;
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

    public int getUltimoCodigo() {
        return ultimoCodigo;
    }

    public void setUltimoCodigo(int ultimoCodigo) {
        this.ultimoCodigo = ultimoCodigo;
    }
}