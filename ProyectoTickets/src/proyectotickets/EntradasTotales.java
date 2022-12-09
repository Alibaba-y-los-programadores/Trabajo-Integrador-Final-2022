package proyectotickets;

// Este clase genera las entradas totales con el codigo alfanumerico 
public class EntradasTotales {

    private String matriz;
    private String codigoletras;
    private String codigonums;
    private String codigotickets;
    private int dimletras;
    private int letraaleatoria;
    private String letras;
    private int numaleatorio;
    private String nums;
    private int totalentradas;

    public EntradasTotales() {
        
    }

    private EntradasTotales(String codigoletras, String codigonums, String codigotickets, int dimletras, int letraaleatoria, String letras, int numaleatorio, String nums, int totalentradas, String matriz) {
        this.codigoletras = codigoletras;
        this.codigonums = codigonums;
        this.codigotickets = codigotickets;
        this.dimletras = dimletras;
        this.letraaleatoria = letraaleatoria;
        this.letras = letras;
        this.numaleatorio = numaleatorio;
        this.nums = nums;
        this.totalentradas = totalentradas;
        this.matriz = matriz;
    }

    public String[][] getMatriz() {
        return generadorMatriz();
    }

    private void setDimletras(int dimletras) {
        this.dimletras = dimletras;
    }

    private String entradasTotales() {
        codigoletras = "";
        codigonums = "";
        
        // creamos 2 string que contienen los caracteres a generar
        this.letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Obtenemos el numero total de letras 
        this.dimletras = this.letras.length();
        this.setDimletras(this.dimletras-1);
        this.nums = "0123456789";
        for (int k = 0; k <= 2; k++) {
            // Se Busca un numero al azar entre el 1 y el numero de letras 
            int numeroRandom = (int) (Math.random() * 101);
            this.letraaleatoria = (int) Math.round(Math.random() * this.dimletras);
            // Se concatenan 3 letras aleatorias
            this.codigoletras = this.codigoletras.concat(this.letras.substring(this.letraaleatoria, this.letraaleatoria + 1));
            this.numaleatorio = (int) Math.round(Math.random() * 9);
            // Se concatenan 3 numeros aleatorios 
            this.codigonums = this.codigonums.concat(this.nums.substring(this.numaleatorio, this.numaleatorio + 1));
        }
        // Se concatenan 3 letras y 3 numeros para el codigo final. 
        this.codigotickets = this.codigoletras.concat(this.codigonums);
        return this.codigotickets;
    }
    
 // Este metodo genera las entradas totales con el codigo alfanumerico 
    private String[][] generadorMatriz() {
        String[][] matriz = new String[15][15];
        // Este bucle crea los codigos aleatorios de TODAS las entradas generadas para el concierto.
        for (int i = 0; i <= 14; i++) {
            // Se considera una matriz de 15x15 es decir 225 entradas totales. 
            for (int j = 0; j <= 14; j++) {
                matriz[i][j] = entradasTotales();
            }
        }
        return matriz;
    }
}