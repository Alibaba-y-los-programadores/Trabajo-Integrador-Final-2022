/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import proyectotickets.Menu;
import proyectotickets.MostrarVendidas;
import proyectotickets.Pantallas;
import proyectotickets.Registrar;

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
        Registrar registrar = new Registrar();
        //registrar.registrar();

        MostrarVendidas mostrarvendidas = new MostrarVendidas();
        String[][] matriz = new String[3][3];

        matriz[0][0] = "Marta";
        matriz[0][1] = "Luis";
        matriz[0][2] = "Nacho";
        matriz[1][0] = "Juancho";
        matriz[1][1] = "Anabel";
        matriz[1][2] = "Julio";
        matriz[2][0] = "María";
        matriz[2][1] = "David";
        matriz[2][2] = "Gema";
        
        mostrarvendidas.mostrarvendidas(matriz);
        
  
    }
}
