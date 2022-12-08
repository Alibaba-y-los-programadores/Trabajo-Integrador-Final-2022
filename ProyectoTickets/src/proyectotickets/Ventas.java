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
    private int i;
    private int j;
    private int l;
    private int opcion;
    private String ticketsventa[];
    private boolean venta;
    private int zona;

    Scanner entrada = new Scanner(System.in);

    public Ventas() {
    }

    public Ventas(int cantcompra, int cantdisponible, boolean condicion, int contadorpalcoderecho, int contadorpalcoizquierdo, int contadorreservados, int contadorvip, int i, int j, int l, int opcion, String[] ticketsventa, boolean venta, int zona) {
        this.cantcompra = cantcompra;
        this.cantdisponible = cantdisponible;
        this.condicion = condicion;
        this.contadorpalcoderecho = contadorpalcoderecho;
        this.contadorpalcoizquierdo = contadorpalcoizquierdo;
        this.contadorreservados = contadorreservados;
        this.contadorvip = contadorvip;
        this.i = i;
        this.j = j;
        this.l = l;
        this.opcion = opcion;
        this.ticketsventa = ticketsventa;
        this.venta = venta;
        this.zona = zona;
    }

    public int getCantcompra() {
        return cantcompra;
    }

    public void setCantcompra(int cantcompra) {
        this.cantcompra = cantcompra;
    }

    public int getCantdisponible() {
        return cantdisponible;
    }

    public void setCantdisponible(int cantdisponible) {
        this.cantdisponible = cantdisponible;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public int getContadorpalcoderecho() {
        return contadorpalcoderecho;
    }

    public void setContadorpalcoderecho(int contadorpalcoderecho) {
        this.contadorpalcoderecho = contadorpalcoderecho;
    }

    public int getContadorpalcoizquierdo() {
        return contadorpalcoizquierdo;
    }

    public void setContadorpalcoizquierdo(int contadorpalcoizquierdo) {
        this.contadorpalcoizquierdo = contadorpalcoizquierdo;
    }

    public int getContadorreservados() {
        return contadorreservados;
    }

    public void setContadorreservados(int contadorreservados) {
        this.contadorreservados = contadorreservados;
    }

    public int getContadorvip() {
        return contadorvip;
    }

    public void setContadorvip(int contadorvip) {
        this.contadorvip = contadorvip;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public String[] getTicketsventa() {
        return ticketsventa;
    }

    public void setTicketsventa(String[] ticketsventa) {
        this.ticketsventa = ticketsventa;
    }

    public boolean isVenta() {
        return venta;
    }

    public void setVenta(boolean venta) {
        this.venta = venta;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    // Este subproceso permite realizar la venta de entradas comprobando la disponibilidad por zona 
    public void ventas(String vendidas[][], String noVendidas[][]) {
        MostrarVendidas  mVendidas = new MostrarVendidas();
        MostrarNoVendidas mNoVendidas = new MostrarNoVendidas();
        
        this.setCantcompra(cantcompra);
        this.setCantdisponible(cantdisponible);
        this.setCondicion(condicion);
        this.setContadorpalcoderecho(contadorpalcoderecho);
        this.setContadorpalcoizquierdo(contadorpalcoizquierdo);
        this.setContadorreservados(contadorreservados);
        this.setContadorvip(contadorvip);
        this.setI(i);
        this.setJ(j);
        this.setL(l);
        this.setOpcion(opcion);
        this.setTicketsventa(ticketsventa);
        this.setVenta(venta);
        this.setZona(zona);
        ticketsventa = new String[225];
        this.setTicketsventa(ticketsventa);
        condicion = true;
        this.setCondicion(condicion);
        // todo el proceso de ventas se repetira mientras no se explicite salir del programa. 
        while (condicion == true) {
            opcion = 0;
            mVendidas.mostrarvendidas(vendidas);
            System.out.println(""); // no hay forma directa de borrar la consola en Java
            // Se invoca al SubProceso de noVendidas y se muestra la matriz con las entradas disponibles a la venta.
            mNoVendidas.mostrarnovendidas(noVendidas);
            // Contador de entradas en palco izquierdo
            contadorpalcoizquierdo = 0;
            // contador de entradas en zona de reservados
            contadorreservados = 0;
            // contador  de entradas  en zona vip
            contadorvip = 0;
            // Contador de entradas en palco derecho
            contadorpalcoderecho = 0;
            // Este bucle recorre toda la matriz de entradas no Vendidas y cuenta la cantidad de entradas disponible para cada zona 
            for (i = 0; i <= 14; i++) {
                for (j = 0; j <= 14; j++) {
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
            System.out.println("                                              *=========================================*");
            // Se muestra en pantalla la cantidad de tickets que tenemos por zona
            System.out.println("                                               *   TICKETS DISPONIBLES PARA LA VENTA   *");
            System.out.println("                                              *=========================================*");
            System.out.println("                                                1.- Palco izquierdo        : " + contadorpalcoizquierdo);
            System.out.println("                                                2.- Zona reservada         : " + contadorreservados);
            System.out.println("                                                3.- Zona vip               : " + contadorvip);
            System.out.println("                                                4.- Palco derecho          : " + contadorpalcoderecho);
            System.out.println("                                                5.- Salir.");
            System.out.println("");
            System.out.print("                                                Ingrese la zona dï¿½nde desea vender: ");
            // el verificador ingresara la zona por teclado decuerdo a lo que el cliente le pida. 
            zona = entrada.nextInt();
            System.out.print("                                                Ingrese la cantidad de tickets que desea vender:");
            // Este bucle obliga al verificador a ingresar una zona correcta. 
            do {
                // Condicional multiple para vender los tickets de acuerdo a la zona requerida 
                switch (zona) {
                    case 1:
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorpalcoizquierdo;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (i = 0; i <= 14; i++) {
                                    for (j = 0; j <= 3; j++) {
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
                        //cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                        // variable donde se almacena la cantidad de entradas a vender 
                        break;
                    case 2:
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorreservados;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (i = 0; i <= 14; i++) {
                                    for (j = 4; j <= 5; j++) {
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
                        //cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                        // variable donde se almacena la cantidad de entradas a vender 
                        break;
                    case 3:
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorvip;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (i = 0; i <= 14; i++) {
                                    for (j = 6; j <= 9; j++) {
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
                        //cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                        // variable donde se almacena la cantidad de entradas a vender 
                        break;
                    case 4:
                        cantcompra = entrada.nextInt();
                        // se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
                        cantdisponible = contadorpalcoderecho;
                        // se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
                        if (cantdisponible >= cantcompra) {
                            // Este bucle permite la asignacion de entradas segun la cantidad requerida para venta. 
                            for (l = 0; l <= cantcompra - 1; l++) {
                                venta = true;
                                for (i = 0; i <= 14; i++) {
                                    for (j = 10; j <= 14; j++) {
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
                        //cobro_ticket(cantcompra, cantdisponible, ticketsventa, zona);
                        break;
                    case 5:
                        opcion = 2;
                        condicion = false;
                        break;
                    default:
                        System.out.println(""); // no hay forma directa de borrar la consola en Java
                    //mostrarnovendidas(noVendidas);
                }
            } while (!(zona == 1 || zona == 2 || zona == 3 || zona == 4 || zona == 5));
            while (opcion != 1 && opcion != 2) {
                System.out.println("");
                System.out.println("                                                            ¿Que desea hacer?");
                System.out.println("                                                            1. Seguir vendiendo.");
                System.out.println("                                                            2. Regresar al menu principal.");
                System.out.print("                                        ");
                opcion = entrada.nextInt();
                if (opcion == 1) {
                    condicion = true;
                }
                // Esta condicion permite regresar al menu principal 
                if (opcion == 2) {
                    condicion = false;
                    System.out.println(""); // no hay forma directa de borrar la consola en Java
                }
            }
        }
    }
}
