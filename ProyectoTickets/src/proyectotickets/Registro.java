package proyectotickets;

// Este subproceso sirve para realizar el checking 
import java.util.Scanner;

// Se pide el ingreso manual del codigo a verifica, Si existe el codigo, aparecería una leyenda con codigo valido. Se sobreescribe dicha posicion con 00.
public class Registro {

    private String boletoregistrado;
    private boolean codigodet;
    private String codigodev;
    private int columna;
    private boolean condicion;
    private boolean condicionvendido;
    private int fila;
    private int i;
    private int j;
    private String opcion;

    Scanner entrada = new Scanner(System.in);

    public Registro() {
    }

    public Registro(String boletoregistrado, boolean codigodet, String codigodev, int columna, boolean condicion, boolean condicionvendido, int fila, int i, int j, String opcion) {
        this.boletoregistrado = boletoregistrado;
        this.codigodet = codigodet;
        this.codigodev = codigodev;
        this.columna = columna;
        this.condicion = condicion;
        this.condicionvendido = condicionvendido;
        this.fila = fila;
        this.i = i;
        this.j = j;
        this.opcion = opcion;
    }

    public String getBoletoregistrado() {
        return boletoregistrado;
    }

    public void setBoletoregistrado(String boletoregistrado) {
        this.boletoregistrado = boletoregistrado;
    }

    public boolean isCodigodet() {
        return codigodet;
    }

    public void setCodigodet(boolean codigodet) {
        this.codigodet = codigodet;
    }

    public String getCodigodev() {
        return codigodev;
    }

    public void setCodigodev(String codigodev) {
        this.codigodev = codigodev;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }

    public boolean isCondicionvendido() {
        return condicionvendido;
    }

    public void setCondicionvendido(boolean condicionvendido) {
        this.condicionvendido = condicionvendido;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
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

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public void registro(String vendidas[][], String novendidas[][]) {

        // Se le pedira que ingrese el codigo a verificar.Debe ser ingresado manualmente. Si existe el codigo, apareceria una leyenda con codigo valido. Se sobreescribe dicha posicion con 00.

        System.out.println("");
        // por si en algun momento se quiere mostrar la posiciïón
        condicion = true;
        while (condicion == true) {
            System.out.print("                                        - Ingrese el código del ticket");
            // Esta variable almacena el codigo de ticket que el agente verificador ingrese manualmente. 
            codigodev = entrada.nextLine();
            // con esta funcion se arregla el error de de 
            codigodev = codigodev.toUpperCase();
            codigodet = false;
            condicionvendido = false;
            for (i = 0; i <= 14; i++) {
                for (j = 0; j <= 14; j++) {
                    boletoregistrado = codigodev.concat(",)) ");
                    // Esta condicion compara el ticket ingresado con cada elemento de la matriz de tickets vendidos
                    if ((vendidas[i][j].equals(codigodev))) {
                        // por si en algun momento se quiere mostrar la posicion
                        fila = i;
                        // por si en algun momento se quiere mostrar la posiciï¿½n
                        columna = j;
                        // Cuando el ticket ingresado coincide con un elemento de la matriz, la variable codigoDet pasa a ser verdadera
                        codigodet = true;
                        vendidas[i][j] = vendidas[i][j].concat(",)) ");
                    }
                    if (vendidas[i][j].equals(boletoregistrado)) {
                        // Esta condicion evalua si un ticket ya fue ingresado anteriormente. 
                        condicionvendido = true;
                    }
                }
            }
        }
       System.out.println(""); // no hay forma directa de borrar la consola en Java
           
       MostrarVendidas mostrarVendidas = new MostrarVendidas();
       
       mostrarVendidas.mostrarvendidas(vendidas);
            // Las siguientes condiciones evaluan si el ticket ingresado es valido, si no es valido o si ya fue registrado. 
            if (codigodet == true) {
                System.out.println("");
                System.out.println("                                      *==========================================*");
                System.out.println("                                       * El Ticket ingresado  E S   V A L I D O *");
                System.out.println("                                      *==========================================*");
                System.out.println("");
            } else {
                if (condicionvendido == true) {
                    System.out.println("");
                    System.out.println("                                      *========================================================*");
                    System.out.println("                                       * El Ticket ingresado  Y A  F U E  R E G I S T R A D O *");
                    System.out.println("                                      *=========================================================*");
                    System.out.println("");
                } else {
                    System.out.println("");
                    System.out.println("                                      *================================================*");
                    System.out.println("                                       * El Ticket ingresado  N O   E S   V A L I D O *");
                    System.out.println("                                      *================================================*");
                    System.out.println("");
                }
            }
            // Este bucle permite la opcion de registrar mas tickets o regresar al menu principal.
            do {
                System.out.println("                                        ¿Desea seguir registrando boletos?");
                System.out.println("                                        1.- Si.");
                System.out.println("                                        2.- No.");
                System.out.print("                                        ");
                opcion = entrada.nextLine();
                if (opcion.equals("2")) {
                    condicion = false;
                } else {
                    if (opcion.equals("1")) {
                        condicion = true;
                    } else {
                        System.out.println("");
                        System.out.println("                                      *================================================*");
                        System.out.println("                                          * Ingrese una opcion  N O   V A L I D A *");
                        System.out.println("                                      *================================================*");
                        System.out.println("");
                    }
                }
            } while (!(opcion.equals("1") || opcion.equals("2"))); 
        
    }
}
