/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Experto;

import Controlador.DTOCliente;
import Excepciones.NoClienteExcepcion;
import Interfaces.Cliente;
import Persistencia.Criterio;
import Persistencia.Fachada;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class ExpertoCliente implements Experto {

    private ArrayList<DTOCliente> VectorDTOCliente = new ArrayList();

    public ExpertoCliente() {
    }

    public ArrayList<DTOCliente> buscarCliente(String nombre) throws NoClienteExcepcion {
        List<Cliente> clientes;
        Criterio c1 = Fachada.getInstancia().crearCriterio("Nombre", "=", nombre);
        System.out.println("Antes de la busqueda");
        clientes = Fachada.getInstancia().buscar(Cliente.class, c1);
        for (Cliente cliente : clientes) {
        System.out.println("Nombre: " + clientes.get(0).getNombre() + "\n");
        System.out.println("Apellido: " + clientes.get(0).getApellido() + "\n");
        System.out.println("dni: " + clientes.get(0).getdni() + "\n");
        System.out.println("celular: " + clientes.get(0).getCelular() + "\n");
        }
        return VectorDTOCliente;
    }

    public boolean confirmar() {
        return true;
    }
}
