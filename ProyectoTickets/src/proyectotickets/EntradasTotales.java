package proyectotickets;

// Este subproceso genera las entradas totales con el cï¿½digo alfanumï¿½rico 
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
    private int i;
    private int j;
    private int k;

    public EntradasTotales() {
        
    }

    public EntradasTotales(String codigoletras, String codigonums, String codigotickets, int dimletras, int letraaleatoria, String letras, int numaleatorio, String nums, int totalentradas, int i, int j, int k, String matriz) {
        this.codigoletras = codigoletras;
        this.codigonums = codigonums;
        this.codigotickets = codigotickets;
        this.dimletras = dimletras;
        this.letraaleatoria = letraaleatoria;
        this.letras = letras;
        this.numaleatorio = numaleatorio;
        this.nums = nums;
        this.totalentradas = totalentradas;
        this.i = i;
        this.j = j;
        this.k = k;
        this.matriz = matriz;
    }

    public String getMatriz() {
        generadorMatriz();
        return matriz;
    }

    public void setMatriz(String matriz) {
        this.matriz = matriz;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public String getCodigoletras() {
        return codigoletras;
    }

    public void setCodigoletras(String codigoletras) {
        this.codigoletras = codigoletras;
    }

    public String getCodigonums() {
        return codigonums;
    }

    public void setCodigonums(String codigonums) {
        this.codigonums = codigonums;
    }

    public String getCodigotickets() {
        return codigotickets;
    }

    public void setCodigotickets(String codigotickets) {
        this.codigotickets = codigotickets;
    }

    public int getDimletras() {
        return dimletras;
    }

    public void setDimletras(int dimletras) {
        this.dimletras = dimletras;
    }

    public int getLetraaleatoria() {
        return letraaleatoria;
    }

    public void setLetraaleatoria(int letraaleatoria) {
        this.letraaleatoria = letraaleatoria;
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getNumaleatorio() {
        return numaleatorio;
    }

    public void setNumaleatorio(int numaleatorio) {
        this.numaleatorio = numaleatorio;
    }

    public String getNums() {
        return nums;
    }

    public void setNums(String nums) {
        this.nums = nums;
    }

    public int getTotalentradas() {
        return totalentradas;
    }

    public void setTotalentradas(int totalentradas) {
        this.totalentradas = totalentradas;
    }

    public String entradasTotales() {
        codigoletras = "";
        codigonums = "";
        
        // creamos 2 string que contienen los caracteres a generar
        this.letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Obtenemos el numero total de letras 
        this.dimletras = this.letras.length();
        this.setDimletras(this.dimletras-1);
        this.nums = "0123456789";
        for (k = 0; k <= 2; k++) {
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
 // Este subproceso genera las entradas totales con el codigo alfanumerico 
    public String[][] generadorMatriz() {
        String[][] matriz = new String[15][15];
        // Este bucle crea los codigos aleatorios de TODAS las entradas generadas para el concierto.
        for (i = 0; i <= 14; i++) {
            // Se considera una matriz de 15x5 es decir 225 entradas totales. 
            for (j = 0; j <= 14; j++) {
                matriz[i][j] = entradasTotales();
                //System.out.print(matriz[i][j]);
            }//System.out.println(" ");
        }
        return matriz;
    }

}