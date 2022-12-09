
package proyectotickets;


public class MostrarNoVendidas {
    
    public MostrarNoVendidas() {
        
    }
    
    public void getMostrarNoVendidas(String novendidas[][]){
        
        mostrarnovendidas(novendidas);
        
    }
    
    //Este metodo muestra en pantalla los tickets disponibles para comprar en puerta
    private void mostrarnovendidas(String novendidas[][]) {
        Pantallas pantallas= new Pantallas();
        	
		int j = 0;
                        
		pantallas.titulo();
		for (int i=0;i<=14;i++) {
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
