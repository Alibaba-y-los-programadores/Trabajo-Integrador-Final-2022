/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotickets;

import java.util.Scanner;

/**
 *
 * @author matia
 */
public class Cobro {
    
    Scanner entrada = new Scanner(System.in); 
    
    // Este subproceso permite la facturacion de las entradas vendidas en puerta 
	public void cobro_ticket(int cantcompra, int cantdisponible, String ticketsventa[], int zona) {
		double descuento;
		int l;
		boolean rta;
		double subtotal;
		double totalcompra;
		double totaldesc;
		int valorentrada;
		System.out.println("");
		// si la cantidad requerida para la compra es mayor a los tickets disponibles no se procede a la venta.
		if (cantcompra>cantdisponible) {
			System.out.println("                                                El numero de entradas solicitadas supera al numero de entradas disponibles. ");
		} else {
			// si la venta es correcta, se mostraria en pantalla los tickets vendidos para la zona correspondiente. 
			switch (zona) {
			case 1 -> System.out.print("                                                TICKETS VENDIDOS EN PALCO IZQUIERDO: ");
			case 2 -> System.out.print("                                                TICKETS VENDIDOS EN ZONA DE RESERVADOS: ");
			case 3 -> System.out.print("                                                TICKETS VENDIDOS EN ZONA VIP: ");
			case 4 -> System.out.print("                                                TICKETS VENDIDOS EN PALCO DERECHO: ");
			}
			// Este bucle muestra las entradas asignadas en la ultima venta listas para facturar. 
			for (l=0;l<=cantcompra-1;l++) {
				System.out.print("["+ticketsventa[l]+"] ");
			}
			System.out.println("");
			// Valor pre definido de la entrada
			valorentrada = 2000;
			// subtotal
			subtotal = valorentrada*cantcompra;
			System.out.println("");
			System.out.println("                                                     *=============================*");
			System.out.println("                                                      *   F A C T U R A C I O N   *");
			System.out.println("                                                     *=============================*");
			System.out.println("                                                Facturar la siguiente cantidad: "+cantcompra+" Entradas");
			rta = false;
			do {
				System.out.print("                                                Ingrese el % de descuento: ");
				descuento = Double.parseDouble(entrada.nextLine());
				if (descuento>=0 && descuento<=100) {
					rta = true;
				} else {
					System.out.println("                                                Debe ingresar un valor entre 0 y 100!!! ");
					System.out.println("");
				}
			} while (rta!=true);
			// descuento a aplicar
			totaldesc = (subtotal*descuento)/100;
			totalcompra = subtotal-totaldesc;
			System.out.println("                                                --------------------------------");
			System.out.println("                                                Importe  total               : "+subtotal);
			System.out.println("                                                Descuento realizado          : "+totaldesc);
			System.out.println("                                                Total a pagar                : "+totalcompra);
			System.out.println("");
		}
	}
}
