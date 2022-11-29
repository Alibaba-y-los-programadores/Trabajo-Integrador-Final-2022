package proyectotickets;


public class generadorCodigos {
    // Este subproceso genera las entradas totales con el cï¿½digo alfanumï¿½rico 
	public static void generadorCodigos(String matriz[][]) {
            generadorCodigos generadorCodigos = new generadorCodigos();
		private String codigoletras;
		private String codigonums;
		private String codigotickets;
		private int dimletras;
		int i;
		int j;
		int k;
		private int letraaleatoria;
		private String letras;
		private int numaleatorio;
		private String nums;
		private int totalentradas;
		// creamos 2 array que contienen los caracteres a generar
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
					letraaleatoria = (int)
                                                Math.round(Math.random()*dimletras);
					// Se concatenan 3 letras aleatorias
					codigoletras = codigoletras.concat(letras.substring(letraaleatoria,letraaleatoria+1));
					numaleatorio = (int)
                                                Math.floor(Math.random()*9);
					// Se concatenan 3 numeros aleatorios 
					codigonums = codigonums.concat(nums.substring(numaleatorio,numaleatorio+1));
				}
				// Se concatenan 3 letras y 3 numeros para el cï¿½digo final. 
				codigotickets = codigoletras.concat(codigonums);
				matriz[i][j] = codigotickets;
			}
		}
	}
}
