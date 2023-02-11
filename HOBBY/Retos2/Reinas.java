package Retos2;

public class Reinas {

	public static void main(String[] args) {
		
		int nReinas=8;
		
		int[][] tablero=new int[nReinas][nReinas];
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero.length; j++) {
				
				tablero[i][j]=0;
				
			}
			
		}
		
		meteReinas(tablero,0, nReinas);
		
	}
	
	public static void meteReinas(int[][] tablero,int columna,int nReinas) {
		
		if(dimeReinasMetidas(tablero)==nReinas) {
			
			for (int i = 0; i < tablero.length; i++) {
				
				for (int j = 0; j < tablero.length; j++) {
					
					System.out.print(tablero[i][j]+" ");
					
				}
				System.out.println();
			}
			System.out.println();
			
		}else {
			
			for (int i = 0; i < tablero.length; i++) {
				
				if(tablero[i][columna]==0) {
					
					if(se_puede(tablero,nReinas, i, columna)) {
						
						tablero[i][columna]=1;
						
						meteReinas(tablero, columna+1, nReinas);
						
						tablero[i][columna]=0;
						
					}
					
				}
				
			}
			
		}
		
	}
	
	public static int dimeReinasMetidas(int[][] tablero) {
		
		int c=0;
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero.length; j++) {
				
				if(tablero[i][j]==1) {
					
					c++;
					
				}
				
			}
			
		}
		
		return c;
		
	}

	public static boolean se_puede(int[][] tablero,int dimensions,int fila,int columna) {
		
		boolean t=true;
		
		//comprueba la vertical
		for (int i = 0; i < dimensions; i++) {
			
			if(tablero[i][columna]==1) {
				
				t=false;
				break;
			}
			
		}
		
		//comprueba la horizontal
		for (int i = 0; i < dimensions; i++) {
			
			if(tablero[fila][i]==1) {
				
				t=false;
				break;
			}
			
		}
		
		for (int i = 0; i < dimensions; i++) {
			
			if(fila+i<dimensions&&columna+i<dimensions) {
				
				if(tablero[fila+i][columna+i]==1) {
					
					t=false;
					break;
				}
				
			}else {
				
				break;
				
			}
			
		}
		
		for (int i = 0; i < dimensions; i++) {
			
			if(fila-i>=0&&columna-i>=0) {
				
				if(tablero[fila-i][columna-i]==1) {
					
					t=false;
					break;
				}
				
			}else {
				
				break;
				
			}
			
		}
		
		for (int i = 0; i < dimensions; i++) {
			
			if(fila-i>=0&&columna+i<dimensions) {
				
				if(tablero[fila-i][columna+i]==1) {
					
					t=false;
					break;
				}
				
			}else {
				
				break;
				
			}
			
		}
		
		for (int i = 0; i < dimensions; i++) {
			
			if(fila+i<dimensions&&columna-i>=0) {
				
				if(tablero[fila+i][columna-i]==1) {
					
					t=false;
					break;
				}
				
			}else {
				
				break;
				
			}
			
		}
		
		return t;
		
	}
	
}
