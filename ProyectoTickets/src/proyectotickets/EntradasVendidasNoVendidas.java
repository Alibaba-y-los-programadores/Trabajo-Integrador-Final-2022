/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectotickets;

public class EntradasVendidasNoVendidas {

    private String novendidas[][];
    private String vendidas[][];

    public EntradasVendidasNoVendidas() {
    }

    public EntradasVendidasNoVendidas(String[][] novendidas, String[][] vendidas) {
        this.novendidas = novendidas;
        this.vendidas = vendidas;
    }

    public String[][] getNovendidas() {
        return novendidas;
    }

    public void setNovendidas(String[][] novendidas) {
        this.novendidas = novendidas;
    }

    public String[][] getVendidas() {
        return vendidas;
    }

    public void setVendidas(String[][] vendidas) {
        this.vendidas = vendidas;
    }

    // Este subproceso genera aleatoriamente las entradas vendidas considerando una venta de 96% al momento de usar el programa. 
    public String[][] entradasVendidas(String matriz[][]) {
        
        vendidas = new String[15][15];
         this.setVendidas(vendidas);
        int i;
        int j;
        int simulador;
        for (i = 0; i <= 14; i++) {
            for (j = 0; j <= 14; j++) {
                simulador = (int) Math.round(Math.random() * 30);
                // Esta condiciï¿½n permite simular una venta de 96%. 
                if (simulador < 29) {
                    // se genera la matriz de entradas vendidas, para realizar el registro
                    this.vendidas[i][j] = matriz[i][j];
                    System.out.print(this.vendidas[i][j]+" ");
                } else {
                    this.vendidas[i][j] = "      ";
                     System.out.print(this.vendidas[i][j]+" ");
                }
            }
                    System.out.println("");
        }
 
        return vendidas;
    }

    // Este subproceso genera aleatoriamente las entradas vendidas considerando una venta de 96% al momento de usar el programa. 
    public String[][] entradasNoVendidas(String matriz[][]) {
        
         novendidas = new String[15][15];
         this.setNovendidas(novendidas);
        int i;
        int j;
        for (i = 0; i <= 14; i++) {
            for (j = 0; j <= 14; j++) {
                // Esta condiciï¿½n permite simular una venta de 96%. 
                if ("      ".equals(vendidas[i][j])) {
                    // Se genera la matriz de entradas noVendidas, entradas disponibles para la venta.
                    this.novendidas[i][j] = matriz[i][j];
                     System.out.print(this.novendidas[i][j]+" ");
                } else {
                    this.novendidas[i][j] = "      ";
                           System.out.print(this.novendidas[i][j]+" ");
                }
            }
            System.out.println("");
        }
        return novendidas;
    }

}
