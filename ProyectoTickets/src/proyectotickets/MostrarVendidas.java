
package proyectotickets;

public class MostrarVendidas {
    private int i;
    private int j;
    

    public MostrarVendidas() {
    }

    public MostrarVendidas(int i, int j) {
        this.i = i;
        this.j = j;
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
    
    
    public void mostrarvendidas(String vendidas[][]) {
        Pantallas pantallas= new Pantallas();
        	
		j = 0;
                this.setJ(j);
                        
                        
		pantallas.titulo();
		for (i=0;i<=14;i++) {
			if ((j<=15)) {
				if (vendidas[i][0].length()<=8) {
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
}