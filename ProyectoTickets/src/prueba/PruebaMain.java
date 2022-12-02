/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import proyectotickets.Menu;
import proyectotickets.MostrarVendidas;
import proyectotickets.Pantallas;
import proyectotickets.MostrarNoVendidas;
import proyectotickets.Registro;

public class PruebaMain {

    public static void main(String[] args) {

        /*creamos un objeto nuevo de la clase Pantallas con el nombre pantallas
        ese nombre pantallas (en minuscula), puede ser cualquier nombre pero por convención se coloca de esta manera 
        class => NombreDeLaClase (Cada letra inicial de palabra en mayuscula) objeto => nombreObjeto (camelCase Primera palabra en minuscula las demas en Mayuscula)
         */
        Pantallas pantallas = new Pantallas();
        //pantallas.mensajesalida();

        //creamos un objeto nuevo de la clase Menu con el nombre menu
        Menu menu = new Menu();

        //usando el objeto  menu podemos llamar a todos los metodos (funciones) que contiene la clase a la que pertenece. 
        //menu.menu();
        

        MostrarVendidas mostrarvendidas = new MostrarVendidas();
        String[][] vendidas = new String[15][15];
        for (int i = 0; i <= 14; i++) {
            // Se considera una matriz de 15x5 es decir 225 entradas totales. 
            for (int j = 0; j <= 14; j++) {
                vendidas[i][j] = "aaa111";
            }
        }
       // mostrarvendidas.mostrarvendidas(matriz);
        
        MostrarNoVendidas mostrarnovendidas = new MostrarNoVendidas();
        String[][] noVendidas = new String[15][15];
        for (int i = 0; i <= 14; i++) {
             
            for (int j = 0; j <= 14; j++) {
                noVendidas[i][j] = "vvvvvv";
            }
        }
        mostrarnovendidas.mostrarnovendidas(noVendidas);
        
        Registro registro = new Registro();
        
        registro.registro(vendidas, noVendidas);
        
        }
}
