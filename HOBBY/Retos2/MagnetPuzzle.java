package Retos2;

import java.util.ArrayList;

public class MagnetPuzzle {

	public static void main(String[] args) {
		
		String[] lineas=new String[5];
		
		lineas[0]="LRLRTT";
		lineas[1]="LRLRBB";
		lineas[2]="TTTTLR";
		lineas[3]="BBBBTT";
		lineas[4]="LRLRBB";
		
		int [] top= {1,-1,-1,2,1,-1};
		int [] bottom= {2,-1,-1,2,-1,3};
		int [] left= {2,3,-1,-1,-1};
		int [] right= {-1,-1,-1,1,-1};
		
		String[][] plantilla=dime_plantilla(lineas);
		
		solvePuzzle(plantilla, lineas[0].length(),top,bottom,left,right);
		
	}
	
	public static void solvePuzzle(String[][] plantilla, int ancho,int [] t,int [] b,int [] l,int [] r) {
		
		if(cumpleCondiciones(plantilla, ancho, t, b, l, r)) {
			
			imprimir(plantilla, ancho);
			
		}else {
			
			ArrayList<String> ramas=dimeRamas(plantilla, ancho);
			
			for (int i = 0; i < ramas.size(); i++) {
				
				plantilla=meteIman(plantilla, ramas.get(i));
				
				solvePuzzle(plantilla, ancho,t,b,l,r);
				
				String s1=Character.toString(ramas.get(i).charAt(0));
				int f1=Integer.parseInt(Character.toString(ramas.get(i).charAt(1)));
				int c1=Integer.parseInt(Character.toString(ramas.get(i).charAt(2)));
				int f2=Integer.parseInt(Character.toString(ramas.get(i).charAt(3)));
				int c2=Integer.parseInt(Character.toString(ramas.get(i).charAt(4)));
				String s2=Character.toString(ramas.get(i).charAt(5));
				
				if(f1==f2) {
					
					plantilla[f1][c1]="L";
					plantilla[f2][c2]="R";
					
				}else {
					
					plantilla[f1][c1]="T";
					plantilla[f2][c2]="B";
					
				}
				
			}
			
		}
		
	}
		
	public static boolean cumpleCondiciones(String[][] plantilla,int ancho,int [] t,int [] b,int [] l,int [] r) {
		
		//Comprobar si esta completo
		for (int i = 0; i < plantilla.length; i++) {
			
			for (int j = 0; j < ancho; j++) {
				
				if(!plantilla[i][j].equalsIgnoreCase("+")&&!plantilla[i][j].equalsIgnoreCase("-")&&!plantilla[i][j].equalsIgnoreCase("X")) {
					
					return false;
					
				}
				
			}
			
		}
		
		//Comprobar columnas
		for (int i = 0; i < ancho; i++) {
			
			int pos=0;
			int neg=0;
			for (int j = 0; j < plantilla.length; j++) {
				
				if(plantilla[j][i].equalsIgnoreCase("+")) {
					
					pos++;
					
				}else if(plantilla[j][i].equalsIgnoreCase("-")) {
					
					neg++;
					
				}
				
			}
			
			if(t[i]!=-1) {
				
				if(pos!=t[i]) {
					
					return false;
					
				}
				
			}
			
			if(b[i]!=-1) {
				
				if(neg!=b[i]) {
					
					return false;
					
				}
				
			}
			
		}
		
		//Comprobar filas
		for (int i = 0; i < plantilla.length; i++) {
			
			int pos=0;
			int neg=0;
			for (int j = 0; j < ancho; j++) {
				
				if(plantilla[i][j].equalsIgnoreCase("+")) {
					
					pos++;
					
				}else if(plantilla[i][j].equalsIgnoreCase("-")) {
					
					neg++;
					
				}
				
			}
			
			if(l[i]!=-1) {
				
				if(pos!=l[i]) {
					
					return false;
					
				}
				
			}
			
			if(r[i]!=-1) {
				
				if(neg!=r[i]) {
					
					return false;
					
				}
				
			}
			
		}
		
		return true;
		
	}

	public static ArrayList<String> dimeRamas(String[][] s,int ancho) {
		
		ArrayList<String> iman=new ArrayList();
		
		boolean salir=false;
		for (int i = 0; i < s.length; i++) {
			
			for (int j = 0; j < ancho; j++) {
				
				String str=Integer.toString(i)+Integer.toString(j);
				
				if(s[i][j].equalsIgnoreCase("T")) {
					
					str=str+Integer.toString(i+1)+Integer.toString(j);
					
					if(sePuede1(s, ancho, str)) {
						
						iman.add("+"+str+"-");
						
					}
					
					if(sePuede2(s, ancho, str)) {
						
						iman.add("-"+str+"+");
						
					}
					
					iman.add("X"+str+"X");
					
					salir=true;
					
				}else if(s[i][j].equalsIgnoreCase("L")){
					
					str=str+Integer.toString(i)+Integer.toString(j+1);
					
					if(sePuede1(s, ancho, str)) {
						
						iman.add("+"+str+"-");
						
					}
					
					if(sePuede2(s, ancho, str)) {
						
						iman.add("-"+str+"+");
						
					}
					
					iman.add("X"+str+"X");
					salir=true;
					
				}
				
				if(salir) {break;}
			}
			if(salir) {break;}
		}
		
		return iman;
		
	}
	
	public static boolean sePuede1(String[][] s,int ancho, String iman) {
		
		int fpos=Integer.parseInt(Character.toString(iman.charAt(0)));
		int cpos=Integer.parseInt(Character.toString(iman.charAt(1)));
		int fneg=Integer.parseInt(Character.toString(iman.charAt(2)));
		int cneg=Integer.parseInt(Character.toString(iman.charAt(3)));
		
		if(fpos-1>=0) {
			
			if(s[fpos-1][cpos].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(fpos+1<s.length) {
			
			if(s[fpos+1][cpos].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(fneg-1>=0) {
			
			if(s[fneg-1][cneg].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		if(fneg+1<s.length) {
			
			if(s[fneg+1][cneg].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		if(cpos-1>=0) {
			
			if(s[fpos][cpos-1].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(cpos+1<ancho) {
			
			if(s[fpos][cpos+1].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(cneg-1>=0) {
			
			if(s[fneg][cneg-1].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		if(cneg+1<ancho) {
			
			if(s[fneg][cneg+1].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean sePuede2(String[][] s,int ancho, String iman) {
		
		int fneg=Integer.parseInt(Character.toString(iman.charAt(0)));
		int cneg=Integer.parseInt(Character.toString(iman.charAt(1)));
		int fpos=Integer.parseInt(Character.toString(iman.charAt(2)));
		int cpos=Integer.parseInt(Character.toString(iman.charAt(3)));
		
		if(fpos-1>=0) {
			
			if(s[fpos-1][cpos].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(fpos+1<s.length) {
			
			if(s[fpos+1][cpos].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(fneg-1>=0) {
			
			if(s[fneg-1][cneg].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		if(fneg+1<s.length) {
			
			if(s[fneg+1][cneg].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		if(cpos-1>=0) {
			
			if(s[fpos][cpos-1].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(cpos+1<ancho) {
			
			if(s[fpos][cpos+1].equalsIgnoreCase("+")) {
				
				return false;
				
			}
			
		}
		
		if(cneg-1>=0) {
			
			if(s[fneg][cneg-1].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		if(cneg+1<ancho) {
			
			if(s[fneg][cneg+1].equalsIgnoreCase("-")) {
				
				return false;
				
			}
			
		}
		
		return true;
		
	}
	
	public static String[][] meteIman(String[][] s, String iman){
		
		String s1=Character.toString(iman.charAt(0));
		int f1=Integer.parseInt(Character.toString(iman.charAt(1)));
		int c1=Integer.parseInt(Character.toString(iman.charAt(2)));
		int f2=Integer.parseInt(Character.toString(iman.charAt(3)));
		int c2=Integer.parseInt(Character.toString(iman.charAt(4)));
		String s2=Character.toString(iman.charAt(5));
		
		s[f1][c1]=s1;
		s[f2][c2]=s2;
		
		return s;
		
	}

	public static void imprimir(String[][] plantilla,int ancho) {
		
		for (int i = 0; i < plantilla.length; i++) {
			
			for (int j = 0; j < ancho; j++) {
				
				System.out.print(plantilla[i][j]);
				
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static String[][] dime_plantilla(String[] l){
		
		String[][] maze=new String[l.length][l[0].length()];
		
		for (int i = 0; i < l.length; i++) {
			
			String fila=l[i];
			
			for (int j = 0; j < l[0].length(); j++) {
				
				maze[i][j]=(Character.toString(fila.charAt(j)));
				
			}
			
		}
		
		return maze;
		
	}
	
}
