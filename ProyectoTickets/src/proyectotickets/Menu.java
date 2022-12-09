
package proyectotickets;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import proyectotickets.*;


public class Menu {
    private String opcion;
    private boolean salir;
    
    private Scanner entrada = new Scanner(System.in); 

    public Menu() {
        
    }
    
    public void getMenu(String vendidas[][], String novendidas[][]){
        menu(vendidas, novendidas);
    }

    private Menu(String opcion , boolean salir ) {
        this.opcion = opcion;
        this.salir = salir;
    }

    private String getOpcion() {
        return opcion;
    }

    private void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    private boolean isSalir() {
        return salir;
    }

    private void setSalir(boolean salir) {
        this.salir = salir;
    }
    
    
    
    
    // Este subproceso de menu permite el ingreso a las 2 funcionalidades principales del programa
	private void menu(String vendidas[][], String novendidas[][]){
            Pantallas pantallas = new Pantallas();
            MostrarVendidas mVendidas = new MostrarVendidas();
            Registro checking = new Registro();
            Ventas venta = new Ventas();
            LimpiarPantalla limpiar = new LimpiarPantalla();
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
                                limpiar.limpiarPantalla();
				System.out.println(""); // no hay forma directa de borrar la consola en Java
				// se invoca al subproceso mostrarVendidas y se muestra la matriz con las entradas vendidas 
				mVendidas.getMostrarVendidas(vendidas);
				// Se invoca al subproceso de registro y se realiza el cheking de entradas
				checking.getRegistro(vendidas, novendidas);
			}
			if (opcion.equals("2")) {
				// se invoca al subproceso de ventas
				venta.getVentas(vendidas, novendidas);
			}
			if (opcion.equals("3")) {
				System.out.println("                                        3.- Salir.");
                                limpiar.limpiarPantalla();
				salir = true;
				pantallas.mensajesalida();
			}
		}
	}
}
