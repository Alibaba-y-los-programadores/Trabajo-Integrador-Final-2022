package proyectotickets;

import java.io.IOException;
import java.util.Scanner;

public class ProyectoTickets {
    
    // Este es un programa que permite el checking y venta de entradas en puerta el día del concierto por un agente verificador.
	// DESCRIPCIÓN DEL CONTEXTO:
	// El programa se comenzará a utilizar cuando inicie el checking de un concierto, registrando los tickets de las personas que ingresan, se permite la venta de entradas
	// La capacidad del concierto es de 225 personas, con tres zonas: Palco izquierdo, Zona Vip y Palco Derecho, además de una zona reservada. 
	// DESCRIPCIÓN DEL PROGRAMA: 
	// 1.- Para poder acceder al programa, el agente verificador ingresa con usuario y contraseña. 
	// 2.- En la pantalla de menú, el agente verificador tiene tres opciones: 
	// a)Registrar las entradas de las personas que llegan al concierto 
	// b)Realizar nuevas ventas de entradas comprobando la disponibilidad de la zona requerida.
	// Al realizar una venta se realiza la facturaciï¿½n de las entradas vendidas, se permite el ingreso manual de descuento, si hubiera. 
	// c) Salir del programa
	// ALCANCE DEL PROGRAMA:
	// La capacidad de entradas y las zonas son valores estï¿½ticos y solo se permite su modificación desde el código.
	// El presente programa se usa exclusivamente el día del checking al momento del ingreso, esto implica que las entradas ya fueron vendidas en una instancia previa
	// Por lo tanto se realiza una generación de tickets con una venta del 96% al momento de usar el programa. 
	// No se permite la generación de nuevas entradas; el programa se limita al aforo contemplado y previsto para el espectáculo.
	

    /*
        TAREAS A REALIZAR:
    
    1. AGARRAR LA FUNCION O PORCION DE CODIGO QUE LES CORRESPONDE Y CORTARLA DE LA CLASE Proyecto Tikets.
    2. CREAR UNA NUEVA CLASE EN EL PAQUETE proyectotikets Y PEGAR EL CODIGO.
    3. CAMBIAR LOS MODIFICADORES DE ACCESO DE CADA VARIABLE COLOCANDOLAS AL INICIO DE LA CLASE.
    4. CREAR EL CONSTRUCTOR VACÍO DE LA CLASE Y EL CONSTRUCTOR QUE CONTIENE TODOS LAS VARIABLES.
    4.1 EN CASO DE QUE TENGAN VARIOS METODOS Y CADA METODO TIENE DIFERENTES VARIABLES, ENTONCES A LA HORA DE CREAR EL CONSTRUCTOR SOLO LO CREAN CON LAS VARIABLES QUE TENIAN EN ESE METODO.
    5. CREAR LOS METODOS GETTER AND SETTER DE CADA VARIABLE.
    6. MODIFICAR CADA LLAMADO O CAMBIO DE LAS VARIABLES POR EL this.setNombreVariable(nombreVariable);.
    7.PROBAR EL CODIGO CREANDO UN OBJETO EN LA CLASE PruebaMain Y LLAMAR A SUS METODOS.
    */
    

	// Este subproceso genera las entradas totales con el cï¿½digo alfanumï¿½rico 
	/*public static void entradastotales(String matriz[][]) {
		String codigoletras;
		String codigonums;
		String codigotickets;
		int dimletras;
		int i;
		int j;
		int k;
		int letraaleatoria;
		String letras;
		int numaleatorio;
		String nums;
		int totalentradas;
		// creamos 2 arreglos que contienen los caracteres a generar
		letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		// Obtenemos el mero total de letras 
		dimletras = letras.length();
		nums = "0123456789";
		// Este bucle crea los cï¿½digos aleatorios de TODAS las entradas generadas para el concierto.
		for (i=0;i<=14;i++) {
			// Se considera una matriz de 15x5 es decir 225 entradas totales. 
			for (j=0;j<=14;j++) {
				codigoletras = "";
				codigonums = "";
				for (k=0;k<=2;k++) {
					// Se Busca un nï¿½mero al azar entre el 1 y el nï¿½mero de letras 
                                        int numeroRandom = (int)(Math.random()*101);
					letraaleatoria = Math.floor(Math.random()*dimletras);
					// Se concatenan 3 letras aleatorias
					codigoletras = codigoletras.concat(letras.substring(letraaleatoria,letraaleatoria+1));
					numaleatorio = Math.floor(Math.random()*9);
					// Se concatenan 3 numeros aleatorios 
					codigonums = codigonums.concat(nums.substring(numaleatorio,numaleatorio+1));
				}
				// Se concatenan 3 letras y 3 numeros para el cï¿½digo final. 
				codigotickets = codigoletras.concat(codigonums);
				matriz[i][j] = codigotickets;
			}
		}
	}

	// Este subproceso genera aleatoriamente las entradas vendidas considerando una venta de 96% al momento de usar el programa. 
	public static void entradasvendidas(String matriz[][], String vendidas[][], String novendidas[][]) {
		int i;
		int j;
		int simulador;
		for (i=0;i<=14;i++) {
			for (j=0;j<=14;j++) {
				simulador = Math.floor(Math.random()*30);
				// Esta condiciï¿½n permite simular una venta de 96%. 
				if (simulador<29) {
					// se genera la matriz de entradas vendidas, para realizar el registro
					vendidas[i][j] = matriz[i][j];
					novendidas[i][j] = "      ";
				} else {
					vendidas[i][j] = "      ";
					// Se genera la matriz de entradas noVendidas, entradas disponibles para la venta.
					novendidas[i][j] = matriz[i][j];
				}
			}
		}
		System.out.println("");
	}

	// Este subproceso mostrarï¿½ la matriz con las entradas vendidas cada vez que lo llamemos
	public static void mostrarvendidas(String vendidas[][]) {
		int i;
		int j;
		j = 0;
		titulo();
		for (i=0;i<=14;i++) {
			if ((j<=15)) {
				if (vendidas[i][0].length()<8) {
					System.out.print(" ");
				}
			}
			for (j=0;j<=14;j++) {
				// Cada vez que se registra una entrada se agrega 00 Adelante, esta condicion mantiene los elementos alineados.
				if (vendidas[i][j].length()==8) {
					System.out.print("[");
					System.out.print(vendidas[i][j]+"  ");
				} else {
					if ((i<=13) && (j<=13)) {
						if (vendidas[i][j+1].length()==8) {
							System.out.print(vendidas[i][j]+"   ");
						} else {
							System.out.print(vendidas[i][j]+"    ");
						}
					} else {
						System.out.print(vendidas[i][j]+"    ");
					}
				}
			}
			System.out.println("");
		}
	}

	// Este subproceso sirve para realizar el checking 
	// Se pedirï¿½ el ingreso manual del cï¿½digo a verifica, Si existe el cï¿½digo, aparecerï¿½ una leyenda con cï¿½digo vï¿½lido. Se sobreescribe dicha posiciï¿½n con 00.
	public static void registro(String vendidas[][], SIN_TIPO novendidas) throws IOException {
		String boletoregistrado;
		boolean codigodet;
		String codigodev;
		int columna;
		boolean condicion;
		boolean condicionvendido;
		int fila;
		int i;
		int j;
		String opcion;
		// Se le pedirï¿½ que ingrese el cï¿½digo a verificar.Debe ser ingresado manualmente. Si existe el cï¿½digo, aparecerï¿½ una leyenda con cï¿½digo vï¿½lido. Se sobreescribe dicha posiciï¿½n con 00.
		// Hecho por Denise
		System.out.println("");
		// por si en algun momento se quiere mostrar la posiciï¿½n
		condicion = true;
		while (condicion==true) {
			System.out.print("                                        - Ingrese el cï¿½digo del ticket");
			// Esta variable almacena el cï¿½digo de ticket que el agente verificador ingrese manualmente. 
			codigodev = bufEntrada.readLine();
			// con esta funciï¿½n se arregla el error de de 
			codigodev = codigodev.toUpperCase();
			codigodet = false;
			condicionvendido = false;
			for (i=0;i<=14;i++) {
				for (j=0;j<=14;j++) {					boletoregistrado = codigodev.concat(",)) "),;
					// Esta condiciï¿½n compara el ticket ingresado con cada elemento de la matriz de tickets vendidos
					if ((vendidas[i][j].equals(codigodev))) {
						// por si en algun momento se quiere mostrar la posiciï¿½n
						fila = i;
						// por si en algun momento se quiere mostrar la posiciï¿½n
						columna = j;
						// Cuando el ticket ingresado coincide con un elemento de la matriz, la variable codigoDet pasa a ser verdadera
						codigodet = true;
						vendidas[i][j] = vendidas[i][j].concat(",)) "),;
					}
					if (vendidas[i][j].equals(boletoregistrado)) {
						// Esta condicion evalï¿½a si un ticket ya fue ingresado anteriormente. 
						condicionvendido = true;
					}
				}
			}
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			mostrarvendidas(vendidas);
			// Las siguientes condiciones evaluan si el ticket ingresado es vï¿½lido, si no es vï¿½lido o si ya fue registrado. 
			if (codigodet==true) {
				System.out.println("");
				System.out.println("                                      *==========================================*");
				System.out.println("                                       * El Ticket ingresado  E S   V ï¿½ L I D O *");
				System.out.println("                                      *==========================================*");
				System.out.println("");
			} else {
				if (condicionvendido==true) {
					System.out.println("");
					System.out.println("                                      *========================================================*");
					System.out.println("                                       * El Ticket ingresado  Y A  F U E  R E G I S T R A D O *");
					System.out.println("                                      *=========================================================*");
					System.out.println("");
				} else {
					System.out.println("");
					System.out.println("                                      *================================================*");
					System.out.println("                                       * El Ticket ingresado  N O   E S   V ï¿½ L I D O *");
					System.out.println("                                      *================================================*");
					System.out.println("");
				}
			}
			// Este bucle permite la opciï¿½n de registrar mas tickets o regresar al menï¿½ principal.
			do {
				System.out.println("                                        ï¿½Desea seguir registrando boletos?");
				System.out.println("                                        1.- Si.");
				System.out.println("                                        2.- No.");
				System.out.print("                                        ");
				opcion = bufEntrada.readLine();
				if (opcion.equals("2")) {
					condicion = false;
				} else {
					if (opcion.equals("1")) {
						condicion = true;
					} else {
						System.out.println("");
						System.out.println("                                      *================================================*");
						System.out.println("                                          * Ingresï¿½ una opciï¿½n  N O   V ï¿½ L I D A *");
						System.out.println("                                      *================================================*");
						System.out.println("");
					}
				}
			} while (!(opcion.equals("1") || opcion.equals("2")));
		}
	}

	// Este subproceso mostrarï¿½ los tickets disponibles para la venta cada vez que se lo invoque 
	public static void mostrarnovendidas(String novendidas[][]) {
		int i;
		int j;
		int opcion;
		titulo();
		// Este bucle recorre todos los elementos de la matriz noVendidas y las muestra en pantalla
		for (i=0;i<=14;i++) {
			for (j=0;j<=14;j++) {
				System.out.print(novendidas[i][j]+"    ");
			}
			System.out.println("");
		}
	}

	// Este subproceso permite realizar la venta de entradas comprobando la disponibilidad por zona 
	public static void ventas(String novendidas[][], String vendidas[][]) throws IOException {
		int cantcompra;
		int cantdisponible;
		boolean condicion;
		int contadorpalcoderecho;
		int contadorpalcoizquierdo;
		int contadorreservados;
		int contadorvip;
		int i;
		int j;
		int l;
		int opcion;
		String ticketsventa[];
		boolean venta;
		int zona;
		ticketsventa = new String[225];
		condicion = true;
		// todo el proceso de ventas se repetirï¿½ mientras no se explicite salir del programa. 
		while (condicion==true) {
			opcion = 0;
			mostrarvendidas(vendidas);
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			// Se invoca al SubProceso de noVendidas y se muestra la matriz con las entradas disponibles a la venta.
			mostrarnovendidas(novendidas);
			// Contador de entradas en palco izquierdo
			contadorpalcoizquierdo = 0;
			// contador de entradas en zona de reservados
			contadorreservados = 0;
			// contador  de entradas  en zona vip
			contadorvip = 0;
			// Contador de entradas en palco derecho
			contadorpalcoderecho = 0;
			// Este bucle recorre toda la matriz de entradas no Vendidas y cuenta la cantidad de entradas disponible para cada zona 
			for (i=0;i<=14;i++) {
				for (j=0;j<=14;j++) {
					if (!novendidas[i][j].equals("      ")) {
						// palco izquierdo desde columna 0 hasta columna 3
						if (j<=3) {
							contadorpalcoizquierdo = contadorpalcoizquierdo+1;
						} else {
							// zona de reservados : columna 4
							if (j>=4 && j<=5) {
								contadorreservados = contadorreservados+1;
							} else {
								// zona vip desde columna 5 hasta columna 9
								if (j>=6 && j<=9) {
									contadorvip = contadorvip+1;
								} else {
									// palco derecho desde columna 10 hasta columna 14
									contadorpalcoderecho = contadorpalcoderecho+1;
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
			System.out.println("                                                1.- Palco izquierdo        : "+contadorpalcoizquierdo);
			System.out.println("                                                2.- Zona reservada         : "+contadorreservados);
			System.out.println("                                                3.- Zona vip               : "+contadorvip);
			System.out.println("                                                4.- Palco derecho          : "+contadorpalcoderecho);
			System.out.println("                                                5.- Salir.");
			System.out.println("");
			System.out.print("                                                Ingrese la zona dï¿½nde desea vender: ");
			// el verificador ingresarï¿½ la zona por teclado decuerdo a lo que el cliente le pida. 
			zona = Integer.parseInt(bufEntrada.readLine());
			System.out.print("                                                Ingrese la cantidad de tickets que desea vender:");
			// Este bucle obliga al verificador a ingresar una zona correcta. 
			do {
				// Condicional multiple para vender los tickets de acuerdo a la zona requerida 
				switch (zona) {
				case 1:
					cantcompra = Integer.parseInt(bufEntrada.readLine());
					// se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
					cantdisponible = contadorpalcoizquierdo;
					// se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
					if (cantdisponible>=cantcompra) {
						// Este bucle permite la asignaciï¿½n de entradas segun la cantidad requerida para venta. 
						for (l=0;l<=cantcompra-1;l++) {
							venta = true;
							for (i=0;i<=14;i++) {
								for (j=0;j<=3;j++) {
									if (!novendidas[i][j].equals("      ")&venta==true) {
										// Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
										vendidas[i][j] = novendidas[i][j];
										ticketsventa[l] = novendidas[i][j];
										// el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
										novendidas[i][j] = "      ";
										venta = false;
									}
								}
							}
						}
					}
					cobro_ticket(cantcompra,cantdisponible,ticketsventa,zona);
					// variable donde se almacena la cantidad de entradas a vender 
					break;
				case 2:
					cantcompra = Integer.parseInt(bufEntrada.readLine());
					// se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
					cantdisponible = contadorreservados;
					// se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
					if (cantdisponible>=cantcompra) {
						// Este bucle permite la asignaciï¿½n de entradas segun la cantidad requerida para venta. 
						for (l=0;l<=cantcompra-1;l++) {
							venta = true;
							for (i=0;i<=14;i++) {
								for (j=4;j<=5;j++) {
									if (!novendidas[i][j].equals("      ")&venta==true) {
										// Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
										vendidas[i][j] = novendidas[i][j];
										ticketsventa[l] = novendidas[i][j];
										// el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
										novendidas[i][j] = "      ";
										venta = false;
									}
								}
							}
						}
					}
					cobro_ticket(cantcompra,cantdisponible,ticketsventa,zona);
					// variable donde se almacena la cantidad de entradas a vender 
					break;
				case 3:
					cantcompra = Integer.parseInt(bufEntrada.readLine());
					// se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
					cantdisponible = contadorvip;
					// se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
					if (cantdisponible>=cantcompra) {
						// Este bucle permite la asignaciï¿½n de entradas segun la cantidad requerida para venta. 
						for (l=0;l<=cantcompra-1;l++) {
							venta = true;
							for (i=0;i<=14;i++) {
								for (j=6;j<=9;j++) {
									if (!novendidas[i][j].equals("      ")&venta==true) {
										// Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
										vendidas[i][j] = novendidas[i][j];
										ticketsventa[l] = novendidas[i][j];
										// el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
										novendidas[i][j] = "      ";
										venta = false;
									}
								}
							}
						}
					}
					cobro_ticket(cantcompra,cantdisponible,ticketsventa,zona);
					// variable donde se almacena la cantidad de entradas a vender 
					break;
				case 4:
					cantcompra = Integer.parseInt(bufEntrada.readLine());
					// se almacena la cantidad de tickets disponibles de la zona requerida en la variable cantDisponible
					cantdisponible = contadorpalcoderecho;
					// se verifica que la cantidad de entradas disponibles sea mayor a la requerida 
					if (cantdisponible>=cantcompra) {
						// Este bucle permite la asignaciï¿½n de entradas segun la cantidad requerida para venta. 
						for (l=0;l<=cantcompra-1;l++) {
							venta = true;
							for (i=0;i<=14;i++) {
								for (j=10;j<=14;j++) {
									if (!novendidas[i][j].equals("      ")&venta==true) {
										// Cada vez que se vende una entrada se la mueva a la matriz de entradas vendidas 
										vendidas[i][j] = novendidas[i][j];
										ticketsventa[l] = novendidas[i][j];
										// el ticket vendido autmaticamente es reescrito con caracteres vacios dentro de la matriz de entradas no Vendidas
										novendidas[i][j] = "      ";
										venta = false;
									}
								}
							}
						}
					}
					cobro_ticket(cantcompra,cantdisponible,ticketsventa,zona);
					break;
				case 5:
					opcion = 2;
					condicion = false;
					break;
				default:
					System.out.println(""); // no hay forma directa de borrar la consola en Java
					mostrarnovendidas(novendidas);
				}
			} while (!(zona==1 || zona==2 || zona==3 || zona==4 || zona==5));
			while (opcion!=1 && opcion!=2) {
				System.out.println("");
				System.out.println("                                                            ï¿½Quï¿½ desea hacer?");
				System.out.println("                                                            1. Seguir vendiendo.");
				System.out.println("                                                            2. Regresar al menï¿½ principal.");
				System.out.print("                                        ");
				opcion = Integer.parseInt(bufEntrada.readLine());
				if (opcion==1) {
					condicion = true;
				}
				// Esta condiciï¿½n permite regresar al menï¿½ principï¿½l 
				if (opcion==2) {
					condicion = false;
					System.out.println(""); // no hay forma directa de borrar la consola en Java
				}
			}
		}
	}

	

	// proceso principal del programa
	public static void main(String args[]) throws InterruptedException {
		String matriz[][];
		String novendidas[][];
		boolean validacion;
		String vendidas[][];
		// se definen las variables globales que se usan por referencia en todo el programa.
		validacion = false;
		ingresousuario(validacion);
		if (validacion) {
			System.out.println(""); // no hay forma directa de borrar la consola en Java
			vendidas = new String[15][15];
			novendidas = new String[15][15];
			matriz = new String[15][15];
			entradastotales(matriz);
			entradasvendidas(matriz,vendidas,novendidas);
			// Antes de ingresar al menï¿½ se genera internamente las entradas totales, vendidas y disponibles para la venta.
			menu(vendidas,novendidas);
		} else {
			System.out.println("");
			System.out.println("                                                Se vencieron los intentos de inicio de sesiï¿½n. ");
			System.out.println("");
			Thread.sleep(2*1000);
			mensajesalida();
		}
	}*/
}
