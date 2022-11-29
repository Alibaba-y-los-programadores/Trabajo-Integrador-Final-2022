/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import proyectotickets.Menu;
import proyectotickets.Pantallas;


public class PruebaMain {
    public static void main(String[] args) {
        
        /*creamos un objeto nuevo de la clase Pantallas con el nombre pantallas
        ese nombre pantallas (en minuscula), puede ser cualquier nombre pero por convención se coloca de esta manera 
        class => NombreDeLaClase (Cada letra inicial de palabra en mayuscula) objeto => nombreObjeto (camelCase Primera palabra en minuscula las demas en Mayuscula)
        */
        Pantallas pantallas = new Pantallas();
        pantallas.mensajesalida();
        
        //creamos un objeto nuevo de la clase Menu con el nombre menu
        Menu menu = new Menu();
        
        //usando el objeto  menu podemos llamar a todos los metodos (funciones) que contiene la clase a la que pertenece. 
        menu.menu();
    }
}
