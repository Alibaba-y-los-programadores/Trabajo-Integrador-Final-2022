package proyectotickets;

import java.io.IOException;
import java.util.Scanner;

public class Pantallas {
    
    public static void titulo() {
		System.out.println("");
		System.out.println("                                                 *=====================================*");
		System.out.println("                                                 *  E N T R A D A S   V E N D I D A S  *");
		System.out.println("                                                 *=====================================*");
		System.out.println("                             ______   _____   ______    ______    _   __    ___     ____     ____   ____ ");
		System.out.println("                            / ____/  / ___/  / ____/   / ____/   / | / /   /   |   / __ \\   /  _/  / __ \\");
		System.out.println("                           / __/     \\__ \\  / /       / __/     /  |/ /   / /| |  / /_/ /   / /   / / / /");
		System.out.println("                          / /___    ___/ / / /___    / /___    / /|  /   / ___ | / _, _/  _/ /   / /_/ / ");
		System.out.println("                         /_____/   /____/  \\____/   /_____/   /_/ |_/   /_/  |_|/_/ |_|  /___/   \\____/  ");
		System.out.println("           --__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--");
		System.out.println("           __--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__");
		System.out.println("");
		System.out.println(" ||---*--- PALCO IZQUIERDO ---*---||       * RESERVADO *  "+" ||*--*--*--* ZONA   V I P *--*--*--*|| "+"  ||  ---**---   PALCO   DERECHO    ---**---  ||");
		System.out.println("");
	}

	// Este subproceso permite el ingreso con usuario y contraseï¿½a al programa, lo realiza el agente verificador. 
	public static void ingresousuario(boolean validacion) throws IOException {
                Scanner entrada = new Scanner(System.in);
		int intentos;
		String usuario;
		String contrasenia;
                
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("        --__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--");
		System.out.println("        __--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__");
		System.out.println("");
		System.out.println("               :::        :::        :::::::::::        :::::::::           :::        :::::::::          ::: ");
		System.out.println("             :+: :+:      :+:            :+:            :+:    :+:        :+: :+:      :+:    :+:        :+: :+:");
		System.out.println("            +:+   +:+     +:+            +:+            +:+    +:+       +:+   +:+     +:+    +:+       +:+   +:+ ");
		System.out.println("           +#++:++#++:    +#+            +#+            +#++:++#+       +#++:++#++:    +#++:++#+       +#++:++#++:");
		System.out.println("           +#+     +#+    +#+            +#+            +#+    +#+      +#+     +#+    +#+    +#+      +#+     +#+   ");
		System.out.println("           #+#     #+#    #+#            #+#            #+#    #+#      #+#     #+#    #+#    #+#      #+#     #+#   ");
		System.out.println("           ###     ###    ########## ###########        #########       ###     ###    #########       ###     ###     ");
		System.out.println("");
		System.out.println("        --__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--");
		System.out.println("        __--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__");
		System.out.println("");
		System.out.println("                                       __   __   __   __   __                  __   __   __   __  __ ");
		System.out.println("                        |  _   _      |__) |__) /  \\ / _  |__)  /\\  |\\/|  /\\  |  \\ /  \\ |__) |_  (_  ");
		System.out.println("                   \\/   | (_) _)      |    | \\  \\__/ \\__) | \\  /--\\ |  | /--\\ |__/ \\__/ | \\  |__ __) ");
		System.out.println("                   /                                                                                     ");
		System.out.println("");
		System.out.println("");
		intentos = 3;
		// Este bucle nos mantiene en la pantalla principal hasta que se ingrese el usuario y contraseï¿½a correctos. 
		do {
			System.out.print("                                        Escriba un Usuario: ");
			usuario = entrada.nextLine();
			System.out.print("                                        Escriba una Contraseña: ");
			contrasenia = entrada.nextLine();
			intentos = intentos-1;
			if (usuario.equals("alibaba") && contrasenia.equals("alibaba123")) {
				System.out.println("                                        B I E N V E N I D O   A   S U  C A M P U S ");
				validacion = true;
			} else {
				System.out.println("");
				System.out.println("                                        Usuario o contrasenia INCONRRECTA, ¡VERIFIQUE SUS DATOS! ");
				System.out.println("");
				System.out.println("                                        Le restan "+intentos+" intentos");
				System.out.println("");
			}
		} while (!(validacion==true || intentos==0));
	}

	public static void diseniomenu() {
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("");
		System.out.println("");
		System.out.println("*_________________________________________________________________________________________________________*");
		System.out.println("    B i e n v e n i d o   a l    p r o g r a m a   d e   c h e c k i n g   y   v e n t a  Alí Babá V1.0 ");
		System.out.println("*=========================================================================================================*");
		System.out.println("");
		System.out.println("");
		System.out.println("                                        Elija una de las siguientes opciones:");
		System.out.println("");
		System.out.println("                                        1.- Verificación de tickets.");
		System.out.println("                                        2.- Venta de tickets. ");
		System.out.println("                                        3.- Salir.");
	}

	public static void mensajesalida() {
		System.out.println(""); // no hay forma directa de borrar la consola en Java
		System.out.println("");
		System.out.println("               :::        :::        :::::::::::        :::::::::           :::        :::::::::          ::: ");
		System.out.println("             :+: :+:      :+:            :+:            :+:    :+:        :+: :+:      :+:    :+:        :+: :+:");
		System.out.println("            +:+   +:+     +:+            +:+            +:+    +:+       +:+   +:+     +:+    +:+       +:+   +:+ ");
		System.out.println("           +#++:++#++:    +#+            +#+            +#++:++#+       +#++:++#++:    +#++:++#+       +#++:++#++:");
		System.out.println("           +#+     +#+    +#+            +#+            +#+    +#+      +#+     +#+    +#+    +#+      +#+     +#+   ");
		System.out.println("           #+#     #+#    #+#            #+#            #+#    #+#      #+#     #+#    #+#    #+#      #+#     #+#   ");
		System.out.println("           ###     ###    ########## ###########        #########       ###     ###    #########       ###     ###     ");
		System.out.println("        --__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--");
		System.out.println("        __--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__--__");
		System.out.println("                                       __   __   __   __   __                  __   __   __   __  __ ");
		System.out.println("                        |  _   _      |__) |__) /  \\ / _  |__)  /\\  |\\/|  /\\  |  \\ /  \\ |__) |_  (_  ");
		System.out.println("                   \\/   | (_) _)      |    | \\  \\__/ \\__) | \\  /--\\ |  | /--\\ |__/ \\__/ | \\  |__ __) ");
		System.out.println("                   /                                                                                     ");
		System.out.println("                                      L E S    A G R A D E C E   H A B E R  ");
		System.out.println("                                     U T I L I Z A D O        N U E S T R O S ");
		System.out.println("                                                 S E R V I C I O S  ");
		System.out.println("");
		System.out.println("                                                               [N]");
		System.out.println("                                                [G]      [J][U][A][N] ");
		System.out.println("                                             [P][A][B][L][O]   [T] ");
		System.out.println("                                                [B]      [R]    ");
		System.out.println("                                                [R]      [G] ");
		System.out.println("                                                [I]   [D][E][N][I][S][E]   ");
		System.out.println("                                          [A][L][E][X]            [E] ");
		System.out.println("                                          [N]   [L]               [B]  ");
		System.out.println("                                          [G]                  [M][A][T][I]");
		System.out.println("                                          [E]                     [S]   ");
		System.out.println("                                          [L]");
		System.out.println("");
		System.out.println("");
	}
}
