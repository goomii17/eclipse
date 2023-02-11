package Aplicable;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class CREA_SUDOKUS {

	public static void main(String[] args) {
		
		CRONO c=new CRONO();
		
		boolean dandole=true,error;
		
		String[] lineas=new String[9];
		
		lineas[0]="400700500";
		lineas[1]="300800001";
		lineas[2]="700900008";
		lineas[3]="060030010";
		lineas[4]="090070050";   //DIFICIL
		lineas[5]="080010790";
		lineas[6]="002006900";
		lineas[7]="005000030";
		lineas[8]="000004200";
		
		int[][] s=dime_sudoku(lineas);
		
		ArrayList<String> nums=dime_nums(s);
		
		c.set_inicio();
		
		while(dandole) {
		
			error=false;
			
		ArrayList<String> a=new ArrayList();
		
		int[][] sudoku=new int[9][9];
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				sudoku[i][j]=0;
				
			}
			
		}
		for (int i = 0; i < nums.size(); i++) {
			
			a.add(nums.get(i));
			
		}
		
		sudoku=mete_a(sudoku,a);
		int veces=dime_ceros(sudoku);
			
			for (int i = 0; i < veces-9; i++) {
				
				ArrayList<String> s1=dime_posibilidades(sudoku);
				
				if(s1.size()==0==false) {
					
					int al=(int)(Math.random()*(s1.size()));
					int num=Integer.parseInt(Character.toString(s1.get(al).charAt(0)));
					int fila=Integer.parseInt(Character.toString(s1.get(al).charAt(1)));
					int columna=Integer.parseInt(Character.toString(s1.get(al).charAt(2)));
					
					a.add(Integer.toString(num)+Integer.toString(fila)+Integer.toString(columna));
					sudoku=mete_a(sudoku,a);
					
				}else {
					
					error=true;
					break;
				}
				
			}
			
			if(!error) {
				
				System.out.println("DONE!!!");
				System.out.println();
				
				c.set_fin();
				
				for (int i = 0; i < 9; i++) {
					
					for (int j = 0; j < 9; j++) {
						System.out.print(sudoku[i][j]+" ");
					}
					
					System.out.println();
					 
				}
				System.out.println();
				System.out.println(c.dime_tiempo());
				break;
				
			}
			
		}
		
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
	
	public static int[][] mete_a(int[][] s,ArrayList<String> a){
		
		for (int i = 0; i < a.size(); i++) {
			
			int num=Integer.parseInt(Character.toString(a.get(i).charAt(0)));
			int fila=Integer.parseInt(Character.toString(a.get(i).charAt(1)));
			int columna=Integer.parseInt(Character.toString(a.get(i).charAt(2)));
			
			s[fila][columna]=num;
			
		}
		
		return s;
		
	}
	public static ArrayList<Integer> dime_al(){
		
		boolean metiendo=true;
		
		ArrayList<Integer> a=new ArrayList();
		
		for (int i = 0; i < 10; i++) {
			
			while(metiendo) {
				
				int c=0;
				int num=(int)(Math.random()*9)+1;
				
				for (int j = 0; j < a.size(); j++) {
					
					if(num==a.get(j)) {
						
						c++;
						
					}
					
				}
				
				if(c==0==false) {
					a.add(num);
					break;
					
				}
				
			}
			
		}
		
		return a;
		
	}
	public static ArrayList<String> dime_posibilidades(int[][] sudoku){
		
		ArrayList<String> s=new ArrayList();
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				int num=sudoku[i][j];
				
				if(num==0) {
					
					for (int k = 1; k < 10; k++) {
						
						if(se_puede(sudoku,k,i,j)) {
							
							s.add(Integer.toString(k)+Integer.toString(i)+Integer.toString(j));
							
						}
						
					}
					
				}
				
			}
		}
		
		return s;
		
	}
	public static int dime_ceros(int[][] s) {
		
		int c=0;
		for (int i = 0; i < s.length; i++) {
			
			for (int j = 0; j < s.length; j++) {
				
				if(s[i][j]==0) {
					
					c++;
					
				}
				
			}
			
		}
		
		return c;
		
	}
	public static ArrayList<String> dime_nums(int[][] s){
		
		ArrayList<String> nums=new ArrayList();
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				if(s[i][j]==0==false) {
					
					nums.add(Integer.toString(s[i][j])+Integer.toString(i)+Integer.toString(j));
					
				}
				
			}
			
		}
		
		return nums;
		
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