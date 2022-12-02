
package proyectotickets;


public class MostrarNoVendidas {
    private int i;
    private int j;
    

    public MostrarNoVendidas() {
    }

    public MostrarNoVendidas(int i, int j) {
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
    
    
    public void mostrarnovendidas(String novendidas[][]) {
        Pantallas pantallas= new Pantallas();
        	
		j = 0;
                this.setJ(j);
                        
                        
		pantallas.titulo();
		for (i=0;i<=14;i++) {
			if ((j<=15)) {
				if (novendidas[i][0].length()<=8) {
					System.out.print(" ");
				}
			}
			for (j=0;j<=14;j++) {
				
				if (novendidas[i][j].length()==8) {
					System.out.print("[");
					System.out.print(novendidas[i][j]+"  ");
				} else {
					if ((i<=13) && (j<=13)) {
						if (novendidas[i][j+1].length()==8) {
							System.out.print(novendidas[i][j]+"   ");
						} else {
							System.out.print(novendidas[i][j]+"    ");
						}
					} else {
						System.out.print(novendidas[i][j]+"    ");
					}
				}
			}
			System.out.println("");
		}
	}
}
