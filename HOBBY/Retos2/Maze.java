package Retos2;

import java.util.ArrayList;

public class Maze {

	public static void main(String[] args) {
		
		String[] lineas=new String[4];
		
		lineas[0]="1111";
		lineas[1]="1101";
		lineas[2]="0101";
		lineas[3]="1111";   //CEROS 81
		
		int[][] maze=dime_maze(lineas);
		
		minPath=new int[lineas.length][lineas[0].length()];
		
		maxPath=new int[lineas.length][lineas[0].length()];
		
		escape(lineas.length,lineas[0].length(),maze, 0, 0, 0, 3, 3);
		
		System.out.println("Shortest path: "+minMoves+"\n");
		
		imprimir(minPath,lineas.length,lineas[0].length());
		
		System.out.println("Longest path: "+maxMoves+"\n");
		
		imprimir(maxPath,lineas.length,lineas[0].length());
		
		System.out.println(difPath+" caminos diferentes");
		
	}
	
	static int[][] minPath;
	static int minMoves=Integer.MAX_VALUE;
	
	static int[][] maxPath;
	static int maxMoves=Integer.MIN_VALUE;
	
	static int difPath=0;
	
	public static void escape(int largo,int ancho,int[][] maze,int fila,int columna,int numPasos,int fend,int cend) {
		
		if(fila==fend&&columna==cend) {
			
			difPath++;
			
			if(numPasos<minMoves) {
				
				minMoves=numPasos;
				
				for (int i = 0; i < largo; i++) {
					
					for (int j = 0; j < ancho; j++) {
						
						minPath[i][j]=maze[i][j];
						
					}
					
				}
				minPath[fila][columna]=3;
			}
			
			if(numPasos>maxMoves) {
				
				maxMoves=numPasos;
				
				for (int i = 0; i < largo; i++) {
					
					for (int j = 0; j < ancho; j++) {
						
						maxPath[i][j]=maze[i][j];
						
					}
					
				}
				maxPath[fila][columna]=3;
			}
			
		}else {
			
			ArrayList<String> s=dimeRamas(maze,largo,ancho, fila, columna);
			
			for (int i = 0; i < s.size(); i++) {
				
				int f=Integer.parseInt(Character.toString(s.get(i).charAt(0)));
				int c=Integer.parseInt(Character.toString(s.get(i).charAt(1)));
				
				maze[fila][columna]=2;
				
				escape(largo,ancho,maze, f, c, numPasos+1, fend, cend);
				
				maze[fila][columna]=1;
				
			}
			
		}
		
	}
	
	public static ArrayList<String> dimeRamas(int[][] maze,int largo,int ancho,int fila,int columna){
		
		ArrayList<String> s=new ArrayList();
		
		//buscar por arriba
		if(fila-1>=0) {
			
			if(maze[fila-1][columna]==1) {
				
				s.add((fila-1)+""+columna);
				
			}
			
		}
		
		//buscar por abajo
		if(fila+1<largo) {
			
			if(maze[fila+1][columna]==1) {
				
				s.add((fila+1)+""+columna);
				
			}
			
		}
		
		//buscar por izq
		if(columna-1>=0) {
			
			if(maze[fila][columna-1]==1) {
				
				s.add(fila+""+(columna-1));
				
			}
			
		}
		
		//buscar por derecha
		if(columna+1<ancho) {
			
			if(maze[fila][columna+1]==1) {
				
				s.add(fila+""+(columna+1));
				
			}
			
		}
		
		return s;
	}
	
	public static void imprimir(int[][] maze,int largo,int ancho) {
		
		for (int i = 0; i < largo; i++) {
			
			for (int j = 0; j < ancho; j++) {
				
				System.out.print(maze[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static int[][] dime_maze(String[] l){
		
		int[][] maze=new int[l.length][l[0].length()];
		
		for (int i = 0; i < l.length; i++) {
			
			String fila=l[i];
			
			for (int j = 0; j < l[0].length(); j++) {
				
				maze[i][j]=Integer.parseInt(Character.toString(fila.charAt(j)));
				
			}
			
		}
		
		return maze;
		
	}
	
}
