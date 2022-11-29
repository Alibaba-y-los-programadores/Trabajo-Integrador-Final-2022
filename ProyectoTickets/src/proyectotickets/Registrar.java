
package proyectotickets;

import java.util.Scanner;



public class Registrar {
    private int opcion;
    private boolean condicion;
    
    Scanner entrada= new Scanner(System.in);
    
    public Registrar(){
        
    }
    
    public Registrar(int opcion,boolean condicion){
     this.opcion=opcion;   
     this.condicion=condicion;
    }
    

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public boolean isCondicion() {
        return condicion;
    }

    public void setCondicion(boolean condicion) {
        this.condicion = condicion;
    }


    
    
    // Este bucle permite la opción de registrar mas tickets o regresar al menú principal.
		
		

     do {

            System.out.println("                                        ï¿Desea seguir registrando boletos?");
            System.out.println("                                        1.- Si.");
            System.out.println("                                        2.- No.");
            System.out.print("                                        ");
            opcion=entrada.nextInt();
            this.setOpcion(opcion);
            if (opcion==2) {
                condicion = false;
                this.setCondicion(condicion);
            } else {
                    if (opcion==1) {
                        condicion = true;
                         this.setCondicion(condicion);
                    } else {
                        System.out.println("");
                        System.out.println("                                      *================================================*");
                        System.out.println("                                          * Ingrese una opcion  N O   V A L I D A *");
                        System.out.println("                                      *================================================*");
                        System.out.println("");
                    }
            }

    } while (!(opcion == 1 || opcion == 2));
        
}