package coleccionPrendas;

import coleccionClientes.clientes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class arrayListPrendas {
    public void operacionImprimirPrendas() {

        ArrayList<prendas> listaPrendas = new ArrayList<>();

        listaPrendas.add(new prendas("0", "Gala", "Vestido", 500.50));
        listaPrendas.add(new prendas("1", "Gala", "Tacones", 3450.54));
        listaPrendas.add(new prendas("2", "Gala", "Blusa", 230.00));

        listaPrendas.add(new prendas("3", "Comùn", "Tenis", 1250.50));
        listaPrendas.add(new prendas("4", "Comùn", "Sombrero", 24));
        listaPrendas.add(new prendas("5", "Comùn", "Pantalon", 433.43));

        for (int i = 0; i < listaPrendas.size(); i++) {
            prendas p = listaPrendas.get(i);
            System.out.println("ID: " + p.id + " " + "Categoria: " + " " + p.categoriaPrenda + " " + "Nombre prenda: " + p.nombrePrenda + " " + "Precio: " + p.precioPrenda);
        }
        int seguir = 1;

        while (seguir == 1) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("**********Selecciona el id de la prenda que desea comprar: **********");
            int idAgregado = Integer.parseInt(scanner.nextLine());


            for (int i = 0; i < listaPrendas.size(); i++) {
                prendas p = listaPrendas.get(i);

                if (idAgregado == i) {
                    String q = p.id + p.categoriaPrenda + p.nombrePrenda + p.precioPrenda;
                    //System.out.println("Prenda agregada: " + "ID: " + p.id + "-" + "  " + "Categoria: " + p.categoriaPrenda + "-" + " " + "Nombre prenda: " + p.nombrePrenda + " " + "Precio: " + "-" + " " + p.precioPrenda);
                    System.out.println(q);
                    System.out.println("*****Desea agregar otra prenda a la lista? si es asì teclea 1, sino teclee 0 concluir seleccion*****");
                    seguir = scanner.nextInt();


                    } else if (seguir == 0) {
                    System.out.println("*****SELECCION CONCLUIDA*****");

                    }
                }
            }

        }
}

/*for (int q = 0; q < idAgregado; i++) {
        prendas k = listaPrendas.get(i);

        System.out.println("La lista es: "+ k);*/