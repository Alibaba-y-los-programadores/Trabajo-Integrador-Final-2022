
package proyectotickets;

public class MostrarVendidas {
    
    public MostrarVendidas() {
        
    }
    
    public void getMostrarVendidas(String vendidas[][]){
        
        mostrarvendidas(vendidas);
        
    }

    //Este metodo muestra en pantalla los tickets vendidos
    private void mostrarvendidas(String vendidas[][]) {
        Pantallas pantallas= new Pantallas();
        	
		int j = 0;
                        
		pantallas.titulo();
		for (int i=0;i<=14;i++) {
			if ((j<=15)) {
				if (vendidas[i][0].length()<=8) {
					System.out.print(" ");
				}
			}
			for (j=0;j<=14;j++) {
				// Cada vez que se registra una entrada se agrega [ Adelante, esta condicion mantiene los elementos alineados.
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
