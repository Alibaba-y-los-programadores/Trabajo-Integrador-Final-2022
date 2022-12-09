package proyectotickets;

import proyectotickets.*;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProyectoTickets {
    
    boolean validacion = false;
    
    public static void main(String[] args){
        
        //Creo las matrices donde se almacenaran los tickets
        String[][] matriz = new String[15][15];
        String[][] vendidas = new String[15][15];
        String[][] novendidas = new String[15][15];
        
        //Instancio las clases para poder llamar a los metodos y funciones
        Pantallas login = new Pantallas();
        EntradasTotales entradas = new EntradasTotales();
        EntradasVendidasNoVendidas escenario = new EntradasVendidasNoVendidas();
        Menu menu = new Menu();
        LimpiarPantalla limpiar = new LimpiarPantalla();
        
        //Creo la matriz general y le habilito tickets para poder vender en puerta
        matriz = entradas.getMatriz();
        vendidas = escenario.entradasVendidas(matriz);
        novendidas = escenario.entradasNoVendidas(matriz);
        
        //Valido el Login del usuario
        if(login.getValidacion()){
            limpiar.limpiarPantalla();
            menu.menu(vendidas, novendidas);
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Se vencieron los intentos de inicio de sesion!!!");
            System.out.println("");
            System.out.println("");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(ProyectoTickets.class.getName()).log(Level.SEVERE, null, ex);
            }
            limpiar.limpiarPantalla();
            login.mensajesalida();
        }
    }
}
