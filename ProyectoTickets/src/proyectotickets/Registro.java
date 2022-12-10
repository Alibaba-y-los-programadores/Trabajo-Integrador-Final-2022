package proyectotickets;

import java.util.Scanner;

// Este subproceso sirve para realizar el checking 
// Se pide el ingreso manual del codigo a verificar, Si existe el codigo, aparecería una leyenda con codigo valido. Se sobreescribe dicha posicion con [].
public class Registro {

    private String boletoregistrado;
    private boolean codigodet;
    private String codigodev;
    private int columna;
    private boolean condicion;
    private boolean condicionvendido;
    private int fila;
    private String opcion;

    private final Scanner entrada = new Scanner(System.in);

    public Registro() {
        
    }
    
    public void getRegistro(String vendidas[][], String novendidas[][]){
        registro(vendidas, novendidas);
    }

    private Registro(String boletoregistrado, boolean codigodet, String codigodev, int columna, boolean condicion, boolean condicionvendido, int fila, String opcion) {
        this.boletoregistrado = boletoregistrado;
        this.codigodet = codigodet;
        this.codigodev = codigodev;
        this.columna = columna;
        this.condicion = condicion;
        this.condicionvendido = condicionvendido;
        this.fila = fila;
        this.opcion = opcion;
    }

    private int getColumna() {
        return columna;
    }

    private int getFila() {
        return fila;
    }

    private void registro(String vendidas[][], String novendidas[][]){
        
        LimpiarPantalla limpiar = new LimpiarPantalla();
        MostrarVendidas mostrarVendidas = new MostrarVendidas();

        // Se le pedira que ingrese el codigo a verificar.Debe ser ingresado manualmente. Si existe el codigo, apareceria una leyenda con codigo valido. Se sobreescribe dicha posicion con ].
        System.out.println("");
        condicion = true;
        while(condicion == true){
            System.out.print("                                        - Ingrese el codigo del ticket: ");
            // Esta variable almacena el codigo de ticket que el agente verificador ingrese manualmente. 
            codigodev = entrada.nextLine().toUpperCase();
            codigodet = false;
            condicionvendido = false;
            for(int i = 0; i <= 14; i++){
                for(int j = 0; j <= 14; j++){
                    boletoregistrado = codigodev.concat("] ");
                    // Esta condicion compara el ticket ingresado con cada elemento de la matriz de tickets vendidos
                    if(vendidas[i][j].equals(codigodev)){
                        condicion = false;
                        fila = i;
                        columna = j;
                        // Cuando el ticket ingresado coincide con un elemento de la matriz, la variable codigoDet pasa a ser verdadera
                        codigodet = true;
                        vendidas[i][j] = vendidas[i][j].concat("] ");
                    }
                    if(vendidas[i][j].equals(boletoregistrado)){
                        // Esta condicion evalua si un ticket ya fue ingresado anteriormente. 
                        condicionvendido = true;
                    }
                }
            }
       limpiar.limpiarPantalla();
       mostrarVendidas.getMostrarVendidas(vendidas);
       
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
                System.out.println("");
                System.out.print("                                        Opcion: ");
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
            }while (!(opcion.equals("1") || opcion.equals("2"))); 
        
        }
    }
}
