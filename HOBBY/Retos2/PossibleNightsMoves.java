package Retos2;

import java.util.ArrayList;

public class PossibleNightsMoves {

	public static void main(String[] args) {
		
		int dimensions=8;
		
		int[][] tablero=new int[dimensions][dimensions];
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero.length; j++) {
				
				tablero[i][j]=0;
				
			}
			
		}
		
		cabalga(tablero, 0, 0, 1,1);
		
	}
	static int c=0;
	public static void cabalga(int[][] tablero,int fila,int columna,int n,int numSoluciones) {
		
		if(c<numSoluciones) {
			
			if(dime_ceros(tablero)==1) {
				
				c++;
				tablero[fila][columna]=n;
				imprimir(tablero);
				tablero[fila][columna]=0;
				
			}else {
				
				tablero[fila][columna]=n;
				
				ArrayList<String> s=dimeRamas(tablero, fila, columna);
				
				for (int i = 0; i < s.size(); i++) {
					
					int f=Integer.parseInt(Character.toString(s.get(i).charAt(0)));
					int c=Integer.parseInt(Character.toString(s.get(i).charAt(1)));
					
					cabalga(tablero, f, c, n+1,numSoluciones);
					
					
				}
				tablero[fila][columna]=0;
			}
			
		}
		
	}
	
	public static int dime_ceros(int[][] tablero) {
		int c=0;
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero.length; j++) {
				
				if(tablero[i][j]==0) {
					
					c++;
					
				}
				
			}
			
		}
		
		return c;
		
	}
	
	public static ArrayList<String> dimeRamas(int[][] tablero,int fila,int columna) {
		
		ArrayList<String> s=new ArrayList();
		
		if(fila+2<tablero.length&&columna+1<tablero.length) {
			
			if(tablero[fila+2][columna+1]==0) {
				
				s.add((fila+2)+""+(columna+1));
				
			}
			
		}
		if(fila+1<tablero.length&&columna+2<tablero.length) {
			
			if(tablero[fila+1][columna+2]==0) {
				
				s.add((fila+1)+""+(columna+2));
				
			}
			
		}
		if(fila-1>=0&&columna+2<tablero.length) {
			
			if(tablero[fila-1][columna+2]==0) {
				
				s.add((fila-1)+""+(columna+2));
				
			}
			
		}
		if(fila-2>=0&&columna+1<tablero.length) {
			
			if(tablero[fila-2][columna+1]==0) {
				
				s.add((fila-2)+""+(columna+1));
				
			}
			
		}
		if(fila-2>=0&&columna-1>=0) {
			
			if(tablero[fila-2][columna-1]==0) {
				
				s.add((fila-2)+""+(columna-1));
				
			}
			
		}
		if(fila-1>=0&&columna-2>=0) {
			
			if(tablero[fila-1][columna-2]==0) {
				
				s.add((fila-1)+""+(columna-2));
				
			}
			
		}
		if(fila+1<tablero.length&&columna-2>=0) {
			
			if(tablero[fila+1][columna-2]==0) {
				
				s.add((fila+1)+""+(columna-2));
				
			}
			
		}
		if(fila+2<tablero.length&&columna-1>=0) {
			
			if(tablero[fila+2][columna-1]==0) {
				
				s.add((fila+2)+""+(columna-1));
				
			}
			
		}
		
		return s;
		
	}
	
	public static void imprimir(int[][] tablero) {
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero.length; j++) {
				
				if(tablero[i][j]<10) {
					
					System.out.print(" "+tablero[i][j]+" ");
					
				}else {
					
					System.out.print(tablero[i][j]+" ");
					
				}
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
}
