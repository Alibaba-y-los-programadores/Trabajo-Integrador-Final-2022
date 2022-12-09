
package proyectotickets;

import proyectotickets.Pantallas;

public class EntradasVendidasNoVendidas {

    private String novendidas[][];
    private String vendidas[][];

    public EntradasVendidasNoVendidas() {
        
    }

    private EntradasVendidasNoVendidas(String[][] novendidas, String[][] vendidas) {
        this.novendidas = novendidas;
        this.vendidas = vendidas;
    }

    public String[][] getNovendidas(String[][] novendidas) {
        return entradasNoVendidas(novendidas);
    }
    
    public String[][] getVendidas(String[][] vendidas) {
        return entradasVendidas(vendidas);
    }

    private void setNovendidas(String[][] novendidas) {
        this.novendidas = novendidas;
    }

    private void setVendidas(String[][] vendidas) {
        this.vendidas = vendidas;
    }

    // Este metodo genera aleatoriamente las entradas vendidas considerando una venta de 96% al momento de usar el programa. 
    private String[][] entradasVendidas(String matriz[][]) {
        
        vendidas = new String[15][15];
        this.setVendidas(vendidas);
        int i;
        int j;
        int simulador;
        for (i = 0; i <= 14; i++) {
            for (j = 0; j <= 14; j++) {
                simulador = (int) Math.round(Math.random() * 30);
                // Esta condicion permite simular una venta de 96%. 
                if (simulador < 29) {
                    // se genera la matriz de entradas vendidas, para realizar el registro
                    this.vendidas[i][j] = matriz[i][j];
                } else {
                    this.vendidas[i][j] = "      ";
                }
            }
        }
 
        return vendidas;
    }

    // Este metodo genera aleatoriamente las entradas vendidas considerando una venta de 96% al momento de usar el programa. 
    private String[][] entradasNoVendidas(String matriz[][]) {
        
         novendidas = new String[15][15];
         this.setNovendidas(novendidas);
        int i;
        int j;
        for (i = 0; i <= 14; i++) {
            for (j = 0; j <= 14; j++) {
                // Esta condicion permite simular una venta de 96%. 
                if ("      ".equals(vendidas[i][j])) {
                    // Se genera la matriz de entradas noVendidas, entradas disponibles para la venta.
                    this.novendidas[i][j] = matriz[i][j];
                } else {
                    this.novendidas[i][j] = "      ";
                }
            }
        }
        return novendidas;
    }
}
