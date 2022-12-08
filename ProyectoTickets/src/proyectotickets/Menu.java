/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotickets;

import java.util.Scanner;
import proyectotickets.*;

/**
 *
 * @author matia
 */
public class Menu {
    private String opcion;
    private boolean salir;
    
    Scanner entrada = new Scanner(System.in); 

    public Menu() {
    }

    public Menu(String opcion , boolean salir ) {
        this.opcion = opcion;
        this.salir = salir;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public boolean isSalir() {
        return salir;
    }

    public void setSalir(boolean salir) {
        this.salir = salir;
    }
    
    
    
    
    // Este subproceso de menu permite el ingreso a las 2 funcionalidades principales del programa
	public void menu(String vendidas[][], String novendidas[][]){
            Pantallas pantallas = new Pantallas();
            MostrarVendidas mVendidas = new MostrarVendidas();
            Registro checking = new Registro();
		salir = false;
                this.setSalir(salir);
		while (salir==false) {
			pantallas.diseniomenu();
			System.out.println("");
			System.out.print("                                        Elija una opcion:");
			opcion = entrada.nextLine();
                        this.setOpcion(opcion);
			System.out.println("");
			if (opcion.equals("1")) {
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				// se invoca al subproceso mostrarVendidas y se muestra la matriz con las entradas vendidas 
				mVendidas.mostrarvendidas(vendidas);
				// Se invoca al subproceso de registro y se realiza el cheking de entradas
				checking.registro(vendidas, novendidas);
			}
			if (opcion.equals("2")) {
				// se invoca al subproceso de ventas
				//ventas(novendidas,vendidas);
			}
			if (opcion.equals("3")) {
				System.out.println("                                        3.- Salir.");
				salir = true;
				pantallas.mensajesalida();
			}
		}
	}
}
