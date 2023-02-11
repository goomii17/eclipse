package Aplicable;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class RESUELVE_SUDOKUS {
	
	public static void main(String[] args) {
		
		boolean todo=true;
		
		metodos m=new metodos();
		
		cronometro c=new cronometro();
		
		while(todo) {
			
			int[][] sudoku;
			
			String[] lineas=new String[9];
			
			lineas[0]="500086000";
			lineas[1]="002701600";
			lineas[2]="071000250";
			lineas[3]="910020070";
			lineas[4]="300145006";   //FACIL 45
			lineas[5]="060090024";
			lineas[6]="053000460";
			lineas[7]="008903500";
			lineas[8]="200510007";
			
//			boolean introduciendo=true;
//			
//			while(introduciendo) {
//				
//				for (int i = 0; i < lineas.length; i++) {
//					
//					boolean b=true;
//					
//					System.out.println("Escriba linea "+(i+1)+": ");
//					
//					while(b) {
//						
//						Scanner sc1=new Scanner(System.in);
//						
//						lineas[i]=sc1.nextLine();
//						
//						if(m.es_valida(lineas[i])) {
//							
//							break;
//							
//						}else {
//							
//							System.out.println("Linea no valida, introducela de nuevo: ");
//							
//						}
//						
//					}
//					
//				}
//				
//				try {
//		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//		        } catch (Exception e) {
//		            /*No hacer nada*/
//		        }
//				
//				sudoku=m.dime_sudoku(lineas);
//				
//				m.mete_lqp(sudoku);
//				if(m.se_puede(sudoku,2,8,4)) {
//					
//					System.out.println("SI");
//					
//				}
//				if(m.es_valido(lineas)) {
//					
//					break;
//					
//				}else {
//					
//					System.out.println("Sudoku no valido, empiece de nuevo");
//					
//				}
//				
//			}
			
			c.set_inicio();
			
			sudoku=m.resuelve(lineas);
			boolean terminado=true;
			for (int i = 0; i < 9; i++) {
				
				for (int j = 0; j < 9; j++) {
					
					if(sudoku[i][j]==0) {
						
						terminado=false;
						
					}
					
				}
				
			}
			
			if(!terminado) {
				
				System.out.println("CUIDADO, puede tardar\n");
				
				sudoku=m.resuelve_dificil(lineas);
				
				c.set_fin();
				
				for (int i = 0; i < 9; i++) {
					
					for (int j = 0; j < 9; j++) {
						System.out.print(sudoku[i][j]+" ");
					}
					
					System.out.println();
					 
				}
				
				System.out.println();
				
				System.out.println(c.dime_tiempo());
				
			}else {
			
				c.set_fin();
				
				for (int i = 0; i < 9; i++) {
					
					for (int j = 0; j < 9; j++) {
						System.out.print(sudoku[i][j]+" ");
					}
					
					System.out.println();
					 
				}
				
				System.out.println();
				
				System.out.println(c.dime_tiempo());
			
				System.out.println();
				
			}
			
			System.out.println("Enter -> siguiente sudoku");
			System.out.println("\"salir\" -> fin programa");
			
			Scanner sc2=new Scanner(System.in);
			
			String r=sc2.nextLine();
			
			if(r.equalsIgnoreCase("salir")) {
				
				break;
				
			}
			
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
		}
		
	}
		
}

class cronometro {

	static LocalDateTime i;
	static LocalDateTime j;
	static String tiempo="";
	
	public void set_inicio(){
		
		i=LocalDateTime.now();		
		
	}
	
	public void set_fin(){
		
		j=LocalDateTime.now();		
		
	}
	
	public String dime_tiempo() {
	
		int horas = 0,mins = 0;
		
		long nanos=Duration.between(i, j).toNanos();
		
		double segs=(double)nanos/1000000000;
		
		if(segs>60) {
			
			mins=(int) Math.floor(segs/60);
			
			segs=((double)(segs/60)-mins)*60;
			
		}
		if(segs>3600) {
			
			horas=(int) Math.floor(segs/3600);
			
			mins=(int) (((double)(segs/3600)-horas)*60);
			
			segs=((((double)(segs/3600)-horas)*60)-mins)*60;
			
		}
		
		tiempo=horas+" hrs : "+mins+" mins : "+segs+" segs";
				
		return tiempo;
		
	}
	
}
class metodos {
	
public static ArrayList<String> dime_segs(int[][] sudoku,int num) {
	
	ArrayList<String> a=dime_posibilidades(sudoku);
	
	ArrayList<String> s=new ArrayList();
	
	int contador;
	
	for (int i = 0; i < a.size(); i++) {
		
		contador=0;
		
		String p1=Character.toString(a.get(i).charAt(1))+Character.toString(a.get(i).charAt(2));
		
		for (int j = 0; j < a.size(); j++) {
			
			String p2=Character.toString(a.get(j).charAt(1))+Character.toString(a.get(j).charAt(2));
			
			if(p1.equalsIgnoreCase(p2)) {
				
				contador++;
				
			}
			
		}
		
		if(contador==num) {
			
			s.add(a.get(i));
			
		}
		
	}
	
	return s;
	
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
	
	public static boolean terminado(int [][] sudoku) {
		
		boolean fin=true;
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				int num=sudoku[i][j];
				
				if(num==0) {
					
					fin=false;
					
				}
				
			}
		}
		
		return fin;
		
		
	}
	
	public static boolean error(int [][] sudoku) {
		
		boolean error=false;
		
		int num_pos=0;
		
		int comp=0;
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				int num=sudoku[i][j];
				comp=0;
				
				if(num==0) {
					
					for (int k = 1; k < 10; k++) {
						
						if(se_puede(sudoku,k,i,j)) {
							num_pos++;
							comp++;
						}
						
					}
					
					if(comp==0) {
						
						error=true;
						
					}
					
					if(comp>8) {
						error=true;
					}
					
				}
				
			}
		}
		
		return error;
		
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
	
	public int[][] dime_sudoku(String[] l){
		
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
	public static int[][] mete_lqp(int[][] sudoku){
		
		boolean b=true;
		
		while(b) {
			
			ArrayList<String> s=dime_segs(sudoku,1);
			for (int i1 = 0; i1 < s.size(); i1++) {
				
				int num=Integer.parseInt(Character.toString(s.get(i1).charAt(0)));
				int fila=Integer.parseInt(Character.toString(s.get(i1).charAt(1)));
				int columna=Integer.parseInt(Character.toString(s.get(i1).charAt(2)));
				
				sudoku[fila][columna]=num;
				
			}
			if(s.size()==0) {break;}
		}
		
		return sudoku;
		
	}
	public static int[][] resuelve(String[] l){
		
        boolean todo=true;
		
		int[][] sudoku=new int[9][9];
		
		int c=0;
		
		ArrayList<String> news=new ArrayList();
		
		metodos m=new metodos();
		
		while(todo) {
			
			sudoku=m.dime_sudoku(l);
			
			sudoku=m.mete_lqp(sudoku);
			
			if(m.terminado(sudoku)) {
				System.out.println("Easy");
				break;
				
			}else {
				
				ArrayList<String> segs_2=m.dime_segs(sudoku, 2);
				
				if((c==segs_2.size())==false) {
					
					int num=Integer.parseInt(Character.toString(segs_2.get(c).charAt(0)));
					
					int fila=Integer.parseInt(Character.toString(segs_2.get(c).charAt(1)));
					
					int columna=Integer.parseInt(Character.toString(segs_2.get(c).charAt(2)));
					
					System.out.print("");
					
					sudoku[fila][columna]=num;
					
					sudoku=m.mete_lqp(sudoku);
					
					if(m.error(sudoku)) {
						
						System.out.print("");
						
					}else {
						
						System.out.print("");
						news.add(Integer.toString(num)+Integer.toString(fila)+Integer.toString(columna));
					}
					
					c++;
					
					
				}else {
					
					break;
					
				}
				
				}
			
		   }
		
		for (int i = 0; i < news.size(); i++) {
			
			int num=Integer.parseInt(Character.toString(news.get(i).charAt(0)));
			
			int fila=Integer.parseInt(Character.toString(news.get(i).charAt(1)));
			
			int columna=Integer.parseInt(Character.toString(news.get(i).charAt(2)));
			
			sudoku[fila][columna]=num;
			
		}
		
		sudoku=m.mete_lqp(sudoku);
		
		if(m.error(sudoku)) {
			
			System.out.print("");
			
		}
		
		return sudoku;
		
	}
	
	public int[][] resuelve_dificil(String[] lineas){
		
		boolean bucle=true;
		
		int[][] sudoku = null;
		
		long contador=0;
		
		while(bucle) {
			
			contador++;
			sudoku=dime_sudoku(lineas);
			
			sudoku=mete_lqp(sudoku);
			
			ArrayList<String> a=dime_segs(sudoku,2);
			
			ArrayList<ArrayList<String>> pp=new ArrayList();
			
			for (int i = 0; i < a.size(); i+=2) {
				
				ArrayList<String> temporal=new ArrayList();
				
				for (int j = 0; j < 2; j++) {
					
					temporal.add(a.get(i+j));
					
				}
				pp.add(temporal);
			}
			
			String[] probando=new String[pp.size()];
			
			for (int i = 0; i < pp.size(); i++) {
				
				String numyp=pp.get(i).get((int) Math.round(Math.random()*1));
				
				int num=Integer.parseInt(Character.toString(numyp.charAt(0)));
				
				int fila=Integer.parseInt(Character.toString(numyp.charAt(1)));
				
				int columna=Integer.parseInt(Character.toString(numyp.charAt(2)));
				
				sudoku[fila][columna]=num;
				
			}
			sudoku=mete_lqp(sudoku);
			
			if(terminado(sudoku)) {
				
				break;
				
			}
			if(contador==1000000) {			
				System.out.println("Revisa el sudoku y pruebe de nuevo");
				sudoku=new int[9][9];
				break;
			}
			
		}
		
		return sudoku;
		
	}
	
	public boolean es_valida(String s) {
		
		boolean t_f=true;
		
		if(s.length()==9) {
			
			int c=0;
			
			for (int i = 0; i < s.length(); i++) {
				
				for (int j = 0; j < 10; j++) {
					
					char ch=Integer.toString(j).charAt(0);
					
					if(s.charAt(i)==ch) {
						
						c++;
						
					}
					
				}
				
			}
			
			if(c==s.length()==false) {
				
				t_f=false;
				
			}
			
		}else {
			
			t_f=false;
			
		}
		
		return t_f;
		
	}
	
	public boolean es_valido(String[] s) {
		
		boolean t_f=true;
		
		int[][] sudoku=dime_sudoku(s);
		
		for (int i = 0; i < 9; i++) {
			
			for (int j = 0; j < 9; j++) {
				
				if((sudoku[i][j]==0)==false) {
					
					if(!se_puede(sudoku,sudoku[i][j],i,j)) {
						
						t_f=false;
						
					}
					
				}
				
			}
			
		}
		
		return t_f;
		
	}
}