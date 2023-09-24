package main;

//import coleccionClientes.arrayListClientes;
import coleccionClientes.arrayListClientes;
// import coleccionPrendas.arrayCarrito;
import coleccionPrendas.arrayListPrendas;
//import rentar.metodoRentar;

public class Main {

    public static void main(String[] args){

        System.out.println("BIENVENIDO");
        //metodoRentar rentar = new metodoRentar();
       // rentar.operacionRentar();
       arrayListClientes rentar = new arrayListClientes();
        rentar.operacionRentar();

        //arrayListPrendas pre = new arrayListPrendas();
        //pre.operacionImprimirPrendas();
       // arrayCarrito carrito = new arrayCarrito();
        //carrito.llenarCarrito();


    }



}
