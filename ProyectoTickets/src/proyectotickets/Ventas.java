package proyectotickets;

import java.util.Scanner;
import proyectotickets.MostrarVendidas;
import proyectotickets.MostrarNoVendidas;


public class Ventas {

    private int cantcompra;
    private int cantdisponible;
    private boolean condicion;
    private int contadorpalcoderecho;
    private int contadorpalcoizquierdo;
    private int contadorreservados;
    private int contadorvip;
    private int opcion;
    private String ticketsventa[];
    private boolean venta;
    private int zona;

    private final Scanner entrada = new Scanner(System.in);

    public Ventas() {
        
    }
    
    public void getVentas(String vendidas[][], String noVendidas[][]){
        
        ventas(vendidas, noVendidas);
        
    }

    private Ventas(int cantcompra, int cantdisponible, boolean condicion, int contadorpalcoderecho, int contadorpalcoizquierdo, int contadorreservados, int contadorvip, int opcion, String[] ticketsventa, boolean venta, int zona) {
        this.cantcompra = cantcompra;
        this.cantdisponible = cantdisponible;
        this.condicion = condicion;
        this.contadorpalcoderecho = contadorpalcoderecho;
        this.contadorpalcoizquierdo = contadorpalcoizquierdo;
        this.contadorreservados = contadorreservados;
        this.contadorvip = contadorvip;
        this.opcion = opcion;
        this.ticketsventa = ticketsventa;
        this.venta = venta;
        this.zona = zona;
    }

    // Este subproceso permite realizar la venta de entradas comprobando la disponibilidad por zona 
    private void ventas(String vendidas[][], String noVendidas[][]) {
        MostrarVendidas  mVendidas = new MostrarVendidas();
        MostrarNoVendidas mNoVendidas = new MostrarNoVendidas();
        MostrarNoVendidas mnVendidas = new MostrarNoVendidas();
        Cobro cobro = new Cobro();
        LimpiarPantalla limpiar = new LimpiarPantalla();
        ticketsventa = new String[225];
        condicion = true;
        // todo el proceso de ventas se repetira mientras no se explicite salir del programa. 
        while (condicion == true) {
            opcion = 0;
            limpiar.limpiarPantalla();
            // Se invoca al metodo de getMostrarNoVendidas y se muestra la matriz con las entradas disponibles a la venta.
            mNoVendidas.getMostrarNoVendidas(noVendidas);
            // Contador de entradas en palco izquierdo
            contadorpalcoizquierdo = 0;
            // contador de entradas en zona de reservados
            contadorreservados = 0;
            // contador  de entradas  en zona vip
            contadorvip = 0;
            // Contador de entradas en palco derecho
            contadorpalcoderecho = 0;
            // Este bucle recorre toda la matriz de entradas no Vendidas y cuenta la cantidad de entradas disponible para cada zona 
            for (int i = 0; i <= 14; i++) {
                for (int j = 0; j <= 14; j++) {
                    if (!noVendidas[i][j].equals("      ")) {
                        // palco izquierdo desde columna 0 hasta columna 3
                        if (j <= 3) {
                            contadorpalcoizquierdo = contadorpalcoizquierdo + 1;
                        } else {
                            // zona de reservados : columna 4
                            if (j >= 4 && j <= 5) {
                                contadorreservados = contadorreservados + 1;
                            } else {
                                // zona vip desde columna 5 hasta columna 9
                                if (j >= 6 && j <= 9) {
                                    contadorvip = contadorvip + 1;
                                } else {
                                    // palco derecho desde columna 10 hasta columna 14
                                    contadorpalcoderecho = contadorpalcoderecho + 1;
                                }
                            }
                        }
                    }
                }
            }
            // Se muestra en pantalla la cantidad de tickets que tenemos por zona
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("                                              *=========================================*");
            System.out.println("                                               *   TICKETS DISPONIBLES PARA LA VENTA   *");
            System.out.println("                                              *=========================================*");
            System.out.println("                                                1.- Palco izquierdo        : " + contadorpalcoizquierdo);
            System.out.println("                                                2.- Zona reservada         : " + contadorreservados);
            System.out.println("                                                3.- Zona vip               : " + contadorvip);
            System.out.println("                                                4.- Palco derecho          : " + contadorpalcoderecho);
            System.out.println("                                                5.- Salir.");
            System.out.println("");
            System.out.print("                                                Ingrese la zona donde desea vender: ");
            // el verificador ingresara la zona por teclado de acuerdo a lo que el cliente le pida. 
            zona = entrada.nextInt();
            System.out.print("                                                Ingrese la cantidad de tickets que desea vender: ");
            // Este bucle obliga al verificador a ingresar una zona correcta. 
            do {
                // Condicional multiple para vender los tickets de acuerdo a la zona requerida 
                switch (zona) {
                    case 1 -> {
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorpalcoizquierdo;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (int l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (int i = 0; i <= 14; i++) {
                                    for (int j = 0; j <= 3; j++) {
                                        if (!noVendidas[i][j].equals("      ") & venta == true) {
                                            // Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
                                            vendidas[i][j] = noVendidas[i][j];
                                            ticketsventa[l] = noVendidas[i][j];
                                            // el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
                                            noVendidas[i][j] = "      ";
                                            venta = false;
                                        }
                                    }
                                }
                            }
                        }
                        cobro.cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                    }
                    case 2 -> {
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorreservados;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (int l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (int i = 0; i <= 14; i++) {
                                    for (int j = 4; j <= 5; j++) {
                                        if (!noVendidas[i][j].equals("      ") & venta == true) {
                                            // Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
                                            vendidas[i][j] = noVendidas[i][j];
                                            ticketsventa[l] = noVendidas[i][j];
                                            // el ticket vendido automaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
                                            noVendidas[i][j] = "      ";
                                            venta = false;
                                        }
                                    }
                                }
                            }
                        }
                        cobro.cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                    }
                    case 3 -> {
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorvip;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (int l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (int i = 0; i <= 14; i++) {
                                    for (int j = 6; j <= 9; j++) {
                                        if (!noVendidas[i][j].equals("      ") & venta == true) {
                                            // Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
                                            vendidas[i][j] = noVendidas[i][j];
                                            ticketsventa[l] = noVendidas[i][j];
                                            // el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
                                            noVendidas[i][j] = "      ";
                                            venta = false;
                                        }
                                    }
                                }
                            }
                        }
                        cobro.cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                    }
                    case 4 -> {
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorpalcoderecho;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (int l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (int i = 0; i <= 14; i++) {
                                    for (int j = 10; j <= 14; j++) {
                                        if (!noVendidas[i][j].equals("      ") & venta == true) {
                                            // Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
                                            vendidas[i][j] = noVendidas[i][j];
                                            ticketsventa[l] = noVendidas[i][j];
                                            // el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
                                            noVendidas[i][j] = "      ";
                                            venta = false;
                                        }
                                    }
                                }
                            }
                        }
                        cobro.cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                    }
                    case 5 -> {
                        opcion = 2;
                        condicion = false;
                    }
                    default -> limpiar.limpiarPantalla();
                }
                
            }while(!(zona == 1 || zona == 2 || zona == 3 || zona == 4 || zona == 5));
            
            while (opcion != 1 && opcion != 2) {
                System.out.println("");
                System.out.println("                                                      ¿Que desea hacer?");
                System.out.println("                                                      1. Seguir vendiendo.");
                System.out.println("                                                      2. Regresar al menu principal.");
                System.out.println("");
                System.out.print("                                                      Opcion: ");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    condicion = true;
                }
                // Esta condicion permite regresar al menu principal 
                if (opcion == 2) {
                    condicion = false;
                    limpiar.limpiarPantalla();
                }
            }
        }
    }
}
