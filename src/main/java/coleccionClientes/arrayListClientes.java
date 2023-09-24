package coleccionClientes;

import coleccionPrendas.arrayListPrendas;
import coleccionPrendas.prendas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayListClientes {

    public void operacionRentar() {
        ArrayList<clientes> listaClientes = new ArrayList<>();

        listaClientes.add(new clientes("Pedro", "A"));
        listaClientes.add(new clientes("Marìa", "Av Lopez Mateos 3"));
        listaClientes.add(new clientes("Dario", "Colonia La loma 43C"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre para poder rentar: ");
        String nomCliente = scanner.nextLine();

        clientes busqueda = new clientes(nomCliente, nomCliente);
        boolean existe = false;

        for (int i = 0; i < listaClientes.size(); i++) {
            clientes c = listaClientes.get(i);

            if (c.getNombre().equals(busqueda.getNombre())) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("El cliente es correcto");
            System.out.println("PRENDAS DISPONIBLES PARA RENTAR:");
            arrayListPrendas pre = new arrayListPrendas();
            pre.operacionImprimirPrendas();

        } else {
            System.out.println("El cliente es incorrecto, no puede rentar prendas");
        }
    }
}
