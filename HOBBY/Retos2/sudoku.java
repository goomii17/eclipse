package Retos2;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class sudoku {

	public static void main(String[] args) {
		
		timer2 t=new timer2();
		
		String[] lineas=new String[9];
		
		lineas[0]="000000000";
		lineas[1]="000000000";
		lineas[2]="000000000";
		lineas[3]="000000000";
		lineas[4]="000000000";   //CEROS 81
		lineas[5]="000000000";
		lineas[6]="000000000";
		lineas[7]="000000000";
		lineas[8]="000000000";
		
		int[][] sudoku=dime_sudoku(lineas);
		
		int numSoluciones=1;
		
		t.set_inicio();
		
		solve(sudoku,numSoluciones);
		
		t.set_fin();
		
		System.out.println(t.dime_tiempo());
		
	}

	static int c=0;
	
	public static void solve(int[][] sudoku,int numSoluciones) {
		
		if(c<numSoluciones) {
			
			ArrayList<String> ramas=new ArrayList();
			
			if(!resuelto(sudoku)) {
				
				ramas=dimeRamasNext(sudoku);
				
			}else {
				
				imprimir(sudoku);
				
				c++;
				
			}
			
			for (int i = 0; i < ramas.size(); i++) {
				
				int n=Integer.parseInt(Character.toString(ramas.get(i).charAt(0)));
				int f=Integer.parseInt(Character.toString(ramas.get(i).charAt(1)));
				int c=Integer.parseInt(Character.toString(ramas.get(i).charAt(2)));
				
				sudoku[f][c]=n;
				solve(sudoku,numSoluciones);
				sudoku[f][c]=0;
				
			}
			
		}
		
	}
	
	public static ArrayList<String> dimeRamasNext(int[][] sudoku){
		
		ArrayList<String> s=new ArrayList();
		
		String pos=dimePosNext(sudoku);
		
		int f=Integer.parseInt(Character.toString(pos.charAt(0)));
		int c=Integer.parseInt(Character.toString(pos.charAt(1)));
		
		for (int i = 1; i < 10; i++) {
			
			if(se_puede(sudoku, i, f, c)) {
				
				s.add(i+""+f+""+c);
				
			}
			
		}
		
		return s;
		
	}
	
	public static String dimePosNext(int[][] sudoku) {
		
		String s="";
		
		for (int i = 0; i < sudoku.length; i++) {
			
			for (int j = 0; j < sudoku.length; j++) {
				
				if(sudoku[i][j]==0) {
					
					s=s+i;
					s=s+j;
					return s;
					
				}
				
			}
			
		}
		
		return s;
		
	}
	
	public static void imprimir(int[][] sudoku) {
		
		for (int i = 0; i < sudoku.length; i++) {
			
			for (int j = 0; j < sudoku.length; j++) {
				
				System.out.print(sudoku[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static boolean resuelto(int[][] sudoku) {
		
		for (int i = 0; i < sudoku.length; i++) {
			
			for (int j = 0; j < sudoku.length; j++) {
				
				if(sudoku[i][j]==0) {
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean se_puede(int[][] sudoku,int num,int fila,int columna) {
		
		boolean t_f=true;
		
		for (int j = 0; j < 9; j++) {
			
			if(j==columna==false) {
				
				if(num==sudoku[fila][j]) {
					
					t_f=false;
					
				}
				
			}

		}
		
		for (int i = 0; i < 9; i++) {
			
			if(i==fila==false) {
				
				if(num==sudoku[i][columna]) {
					
					t_f=false;
					
				}
				
			}

			
		}
		String posicion = null;
		if (fila<=2 && fila>=0) {
			
			if(columna<=2 && columna>=0) {
				
				posicion="00";
				
			}
			if(columna<=5 && columna>=3) {
				
				posicion="03";
				
			}
			if(columna<=8 && columna>=6) {
				
				posicion="06";
				
			}
			
		}else {
			
			if (fila<=5 && fila>=3) {
				
				if(columna<=2 && columna>=0) {
					
					posicion="30";
					
				}
				if(columna<=5 && columna>=3) {
					
					posicion="33";
					
				}
				if(columna<=8 && columna>=6) {
					
					posicion="36";
					
				}
				
			}else {
				
				if (fila<=8 && fila>=6) {
					
					if(columna<=2 && columna>=0) {
						
						posicion="60";
						
					}
					if(columna<=5 && columna>=3) {
						
						posicion="63";
						
					}
					if(columna<=8 && columna>=6) {
						
						posicion="66";
						
					}
				}
			}
			
		}
		
		int inicio_i=Integer.parseInt(Character.toString(posicion.charAt(0)));
		int inicio_j=Integer.parseInt(Character.toString(posicion.charAt(1)));
		
		int fin_i=inicio_i+3;
		int fin_j=inicio_j+3;
		
		for (int i=inicio_i; i < fin_i; i++) {
			
			for (int j=inicio_j; j < fin_j; j++) {
				
				if(i==fila==false&&j==columna==false) {
					
					if(num==sudoku[i][j]) {
						
						t_f=false;
						
					}
					
				}
				
			}
			
		}
		
		return t_f;
		
	}
	
	public static int[][] dime_sudoku(String[] l){
		
		int[][] sudoku=new int[9][9];
		
		String[] lineas=l;
		
		for (int i = 0; i < 9; i++) {
			
			String fila=lineas[i];
			
			for (int j = 0; j < 9; j++) {
				
				sudoku[i][j]=Integer.parseInt(Character.toString(fila.charAt(j)));
				
			}
			
		}
		
		return sudoku;
		
	}
	
}
class timer2{

	static LocalDateTime i;
	static LocalDateTime j;
	static double nanos;
	static String tiempo="";
	
	public void set_inicio(){
		
		i=LocalDateTime.now();		
		
	}
	
	public void set_fin(){
		
		j=LocalDateTime.now();		
		
	}
	public double dime_segs_tot() {
		
		nanos=Duration.between(i, j).toNanos();
		
		return (double)nanos/1000000000;
		
	}
	public String dime_tiempo() {
	
		int horas = 0,mins = 0;
		
		nanos=Duration.between(i, j).toNanos();
		
		double segs=(double)nanos/1000000000;
		
		if(segs>=3600) {
			
			horas=(int) segs/3600;
			
			segs=segs-horas*3600;
			
		}

		if(segs>=60) {
			
			mins=(int) (segs/60);
			
			segs=segs-mins*60;
			
		}
		
		tiempo=horas+" hrs : "+mins+" mins : "+segs+" segs";
				
		return tiempo;
		
	}
	
}