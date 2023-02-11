package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Medio_7 {

	public static void main(String[] args) {
		
		int filas;
		int columnas;
		
		ArrayList<String> palabras=new ArrayList();
		System.out.println("Introduce filas y ancho");
		Scanner sc1=new Scanner(System.in);
		
		String dimensions=sc1.nextLine();
		
		columnas=dime_filas(dimensions);
		filas=dime_ancho(dimensions);
		
		String[] lineas=new String[filas];
		System.out.println("Introduce una a una filas");
		for (int i = 0; i < filas; i++) {
			
			Scanner sc2=new Scanner(System.in);
			
			lineas[i]=sc2.nextLine();
			
		}
		
		char[][] chars=new char[filas][columnas];
		
		for (int i = 0; i < filas; i++) {
			
			String fila=lineas[i];
			
			for (int j = 0; j < columnas; j++) {
				
				chars[i][j]=fila.charAt(j);
				
			}
			
		}
		System.out.println("Introduce numero de palabras");
		Scanner sc3=new Scanner(System.in);
		
		int pals=sc1.nextInt();
		System.out.println("Introduce palabras una a una");
		for (int i = 0; i < pals; i++) {
			
			Scanner sc2=new Scanner(System.in);
			
			palabras.add(sc2.nextLine());
			
		}
		
		for (int i = 0; i < filas; i++) {
			
			for (int j = 0; j < columnas; j++) {
				
				System.out.print(chars[i][j]+" ");
				
			}
			System.out.println();
		}
		
		ArrayList<String> a=dime_todas(lineas,chars,filas,columnas);
		
		ArrayList<Integer> nums=new ArrayList();
		
		for (int i = 0; i < palabras.size(); i++) {
			int num=0;
			for (int j = 0; j < a.size(); j++) {
				
				num+=dime_cuantas(a.get(j),palabras.get(i));
				
			}
			
			nums.add(num);
			
		}
		
		for (int i = 0; i < palabras.size(); i++) {
			
			System.out.println(palabras.get(i)+" -> "+nums.get(i));
			
		}
		
	}

	public static ArrayList<String> dime_todas(String[] s,char[][] c,int filas, int columnas) {
		
		ArrayList<String> a=new ArrayList();
		
		int veces = 0;
		System.out.println(s[0].length());
		for (int i = 0; i < s.length; i++) {
			
			a.add(s[i]);
			a.add(da_la_vuelta(s[i]));
			
		}
		
		for (int i = 0; i < s[0].length(); i++) {
			String v="";
			for (int j = 0; j < s.length; j++) {
				
				v=v+s[j].charAt(i);
				
			}
			a.add(v);
			a.add(da_la_vuelta(v));
		}
		
		if(columnas>=filas) {
			
			veces=filas;
			
		}else {
			
			veces=columnas;
			
		}
		
		for (int i = 0; i < filas; i++) {
			
			String str="";
			
			for (int j = 0; j < veces; j++) {
				
				str=str+c[j+i][j];
				
			}
			a.add(str);
			a.add(da_la_vuelta(str));
			veces--;
		}
		
		if(columnas>=filas) {
			
			veces=filas;
			
		}else {
			
			veces=columnas;
			
		}
		
		for (int i = 1; i < filas+1; i++) {
			
			String str="";
			
			for (int j = 0; j < veces; j++) {
				
				str=str+c[j][j+i];
				
			}
			a.add(str);
			a.add(da_la_vuelta(str));
			veces--;
		}
		
		c=invierte_sopa(s,c);
		
		if(columnas>=filas) {
			
			veces=filas;
			
		}else {
			
			veces=columnas;
			
		}
		
		for (int i = 0; i < filas; i++) {
			
			String str="";
			
			for (int j = 0; j < veces; j++) {
				
				str=str+c[j+i][j];
				
			}
			a.add(str);
			a.add(da_la_vuelta(str));
			veces--;
		}
		
		if(columnas>=filas) {
			
			veces=filas;
			
		}else {
			
			veces=columnas;
			
		}
		
		for (int i = 1; i < filas+1; i++) {
			
			String str="";
			
			for (int j = 0; j < veces; j++) {
				
				str=str+c[j][j+i];
				
			}
			a.add(str);
			a.add(da_la_vuelta(str));
			veces--;
		}
		
		return a;
		
	}
	
	public static String da_la_vuelta(String s) {
		
		String l="";
		
		ArrayList<Character> c=new ArrayList();
		
		for (int i = 0; i < s.length(); i++) {
			
			c.add(s.charAt(i));
			
		}
		
		for(int i=s.length()-1;i>=0;i--) {
			
			l=l+c.get(i);
			
		}
		
		return l;
		
	}
	
	public static int dime_cuantas(String l,String p) {
		
		int n=0;
		
		ArrayList<String> partes=separa(l,p.length());
		
		for (int i = 0; i < partes.size(); i++) {
			
			if(partes.get(i).equals(p)) {
				
				n++;
				
			}
			
		}
		
		return n;
		
	}
	
	public static ArrayList<String> separa(String s,int size) {
		
		ArrayList<String> partes=new ArrayList();
		
		int inicio=0;
		int fin=s.length();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(i+size>s.length()==false) {
				
				partes.add(s.substring(i, i+size));
				
			}
			
		}
		
	return partes;	
		
	}
	
	public static char[][] invierte_sopa(String[] s,char[][] c){
		
		for (int i = 0; i < s.length; i++) {
			
			s[i]=da_la_vuelta(s[i]);
			
		}
		
		for (int i = 0; i < s.length; i++) {
			
			for (int j = 0; j < s[0].length(); j++) {
				
				c[i][j]=s[i].charAt(j);
				
			}
			
		}
		
		return c;
		
	}
	
	public static int dime_ancho(String s) {
		
		String[] parts=s.split(" ");
		
		ArrayList<String> a=new ArrayList();
		
		for (int i = 0; i < parts.length; i++) {
			
			if(parts[i].equalsIgnoreCase("")) {
				
				
				
			}else {
				
				a.add(parts[i]);
				
			}
			
		}
		
		return Integer.parseInt(a.get(0));
		
	}
	public static int dime_filas(String s) {
		
		String[] parts=s.split(" ");
		
		ArrayList<String> a=new ArrayList();
		
		for (int i = 0; i < parts.length; i++) {
			
			if(parts[i].equalsIgnoreCase("")) {
				
				
				
			}else {
				
				a.add(parts[i]);
				
			}
			
		}
		
		return Integer.parseInt(a.get(1));
		
	}
	
}
