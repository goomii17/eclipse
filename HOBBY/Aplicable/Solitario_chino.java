package Aplicable;

import java.util.ArrayList;

public class Solitario_chino {

	public static void main(String[] args) {
		
		String[] lineas=new String[9];
		
		lineas[0]="9911199";
		lineas[1]="9911199";
		lineas[2]="1111111";
		lineas[3]="1110111";
		lineas[4]="1111111";
		lineas[5]="9911199";
		lineas[6]="9911199";
		
		int[][] solitario=dime_solitario(lineas);
		
		solve(solitario,false);
		
		
	}
	
	static ArrayList<String> moves=new ArrayList();
	
	public static void solve(int[][] solitario,boolean centro) {
		
		if(dimeUnos(solitario)==1) {
			
			if(centro) {
				
				if(estaCentrado(solitario)) {
					
					imprimir(solitario);
					
					for (int i = 0; i < moves.size(); i++) {
						
						System.out.println(moves.get(i));
						
					}
					System.exit(0);
				}
				
			}else {
				
				imprimir(solitario);
				
				for (int i = 0; i < moves.size(); i++) {
					
					System.out.println(moves.get(i));
					
				}
				System.exit(0);
			}
			
		}else {
			
			ArrayList<String> ramas=dimeRamas(solitario);
			
			for (int i = 0; i < ramas.size(); i++) {
				
				int filaInicial=Integer.parseInt(Character.toString(ramas.get(i).charAt(0)));
				int columnaInicial=Integer.parseInt(Character.toString(ramas.get(i).charAt(1)));
				
				int filaComida=Integer.parseInt(Character.toString(ramas.get(i).charAt(2)));
				int columnaComida=Integer.parseInt(Character.toString(ramas.get(i).charAt(3)));
				
				int filaFinal=Integer.parseInt(Character.toString(ramas.get(i).charAt(4)));
				int columnaFinal=Integer.parseInt(Character.toString(ramas.get(i).charAt(5)));
				
				solitario[filaInicial][columnaInicial]=0;
				solitario[filaComida][columnaComida]=0;
				solitario[filaFinal][columnaFinal]=1;
				
				moves.add(filaInicial+""+columnaInicial+"->"+filaFinal+""+columnaFinal);
				
				solve(solitario,centro);
				
				solitario[filaInicial][columnaInicial]=1;
				solitario[filaComida][columnaComida]=1;
				solitario[filaFinal][columnaFinal]=0;
				
				moves.remove(moves.size()-1);
				
			}
			
		}
		
	}
	
	public static boolean estaCentrado(int[][] solitario) {
		
		if(solitario[3][3]==1) {
			
			return true;
			
		}
		return false;
	}
	
	public static int dimeUnos(int[][] solitario) {
		int c=0;
		for (int i = 0; i < solitario.length; i++) {
			
			for (int j = 0; j < solitario.length; j++) {
				
				if(solitario[i][j]==1) {
					
					c++;
					
				}
				
			}
			
		}
		
		return c;
		
	}
	
	public static ArrayList<String> dimeRamas(int[][] solitario){
		
		ArrayList<String> s=new ArrayList();
		
		for (int i = 0; i < solitario.length; i++) {
			
			for (int j = 0; j < solitario.length; j++) {
				
				if(solitario[i][j]==1) {
					
					ArrayList<String> p=dimeOps(solitario, i, j);
				
					for (int k = 0; k < p.size(); k++) {
						
						s.add(p.get(k));
						
					}
					
				}
				
			}
			
		}
		
		return s;
		
	}
	
	public static ArrayList<String> dimeOps(int[][] solitario,int fila,int columna){
		
		ArrayList<String> s=new ArrayList();
		
		//buscar por arriba
		if(fila-2>=0) {
			
			if(solitario[fila-2][columna]==0&&solitario[fila-1][columna]==1) {
				
				s.add(fila+""+columna+""+(fila-1)+""+columna+""+(fila-2)+""+columna);
				
			}
			
		}
		
		//buscar por abajo
		if(fila+2<solitario.length) {
			
			if(solitario[fila+2][columna]==0&&solitario[fila+1][columna]==1) {
				
				s.add(fila+""+columna+""+(fila+1)+""+columna+""+(fila+2)+""+columna);
				
			}
			
		}
		
		//buscar izquierda
		if(columna-2>=0) {
			
			if(solitario[fila][columna-2]==0&&solitario[fila][columna-1]==1) {
				
				s.add(fila+""+columna+""+fila+""+(columna-1)+""+fila+""+(columna-2));
				
			}
			
		}
		
		//buscar izquierda
		if(columna+2<solitario.length) {
			
			if(solitario[fila][columna+2]==0&&solitario[fila][columna+1]==1) {
				
				s.add(fila+""+columna+""+fila+""+(columna+1)+""+fila+""+(columna+2));
				
			}
			
		}
		
		return s;
	}
	
	public static void imprimir(int[][] solitario) {
		
		for (int i = 0; i < solitario.length; i++) {
			
			for (int j = 0; j < solitario.length; j++) {
				
				System.out.print(solitario[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] dime_solitario(String[] l){
		
		int[][] solitario=new int[7][7];
		
		String[] lineas=l;
		
		for (int i = 0; i < 7; i++) {
			
			String fila=lineas[i];
			
			for (int j = 0; j < 7; j++) {
				
				solitario[i][j]=Integer.parseInt(Character.toString(fila.charAt(j)));
				
			}
			
		}
		
		return solitario;
		
	}
	
}
