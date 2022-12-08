package proyectotickets;


import proyectotickets.*;

public class ProyectoTickets {
    
    boolean validacion = false;
    
    public static void main(String[] args) throws InterruptedException {
        
        //Creo las matrices donde se almacenaran los tickets
        String[][] matriz = new String[15][15];
        String[][] vendidas = new String[15][15];
        String[][] novendidas = new String[15][15];
        
        //Instancio las clases para poder llamar a los metodos y funciones
        Pantallas login = new Pantallas();
        EntradasTotales entradas = new EntradasTotales();
        EntradasVendidasNoVendidas escenario = new EntradasVendidasNoVendidas();
        Menu menu = new Menu();
        
        //Creo la matriz general y le habilito tickets para poder vender en puerta
        matriz = entradas.generadorMatriz();
        vendidas = escenario.entradasVendidas(matriz);
        novendidas = escenario.entradasNoVendidas(matriz);
        //mVendidas.mostrarvendidas(vendidas);
        
        //Valido el Login del usuario
        if(login.getValidacion()){
            menu.menu(vendidas, novendidas);
        }else{
            System.out.println("");
            System.out.println("");
            System.out.println("Se vencieron los intentos de inicio de sesion!!!");
            System.out.println("");
            System.out.println("");
            login.mensajesalida();
        }
    }
    
}
