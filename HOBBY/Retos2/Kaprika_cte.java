package Retos2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Kaprika_cte {

	public static void main(String[] args) {
		
		//ArrayList donde metere la solucion de cada caso
		ArrayList<Integer> soluciones=new ArrayList();
		
		//Introducir numero de casos
		Scanner sc1=new Scanner(System.in);
		int casos=sc1.nextInt();
		
		for (int i = 0; i < casos; i++) {
			
			//Introducir numero y darle formato (añadir ceros si es menor de 4 cifras)
			Scanner sc2=new Scanner(System.in);
			String n=formateaNumero(sc2.nextInt());
			
			if(n.equals("6174")) {
				
				soluciones.add(0);
				
			}else if(es_repdigit(n)){
				
				soluciones.add(8);
				
			}else {
				
				soluciones.add(cuentaIteraciones(n));
				
			}
			
			c=0;
			
		}
		
		for (int i = 0; i < casos; i++) {
			
			System.out.println(soluciones.get(i));
			
		}
		
	}

	static int c=0;
	
	//Cuenta las iteracinones necesarias para llegar a 6174
	public static int cuentaIteraciones(String num) {
		
		if(num.equals("6174")) {
			
			//termina la recursividad
			
		}else {
			
			int n=ordenaDescendente(num)-ordenaAscendente(num);
			
			c++;
			
			cuentaIteraciones(formateaNumero(n));
			
		}
		
		return c;
		
	}
	
	//ordena el numero de mayor a menor digito
	public static int ordenaDescendente(String s) {
		
		String[] cifras=new String[s.length()];
		
		for (int i = 0; i < cifras.length; i++) {
			
			cifras[i]=Character.toString(s.charAt(i));
			
		}
		
		Arrays.sort(cifras);
		
		String num="";
		
		for (int i = cifras.length-1; i >=0 ; i--) {
			
			num=num+cifras[i];
			
		}
		
		return Integer.parseInt(num);
		
	}
	
	//ordena el numero de menor a mayor digito
	public static int ordenaAscendente(String s) {
		
		String[] cifras=new String[s.length()];
		
		for (int i = 0; i < cifras.length; i++) {
			
			cifras[i]=Character.toString(s.charAt(i));
			
		}
		
		Arrays.sort(cifras);
		
		String num="";
		
		for (int i = 0; i < cifras.length; i++) {
			
			num=num+cifras[i];
			
		}
		
		return Integer.parseInt(num);
		
	}
	
	//Añade ceros al numero si es menor de 4 cifras
	public static String formateaNumero(int n) {
		
		String s=Integer.toString(n);
		
		if(s.length()<4) {
			
			for (int i = 0; i < 4; i++) {
				
				s="0"+s;
				if(s.length()==4) {break;}
				
			}
			
		}
		
		return s;
		
	}
	
	//comprueba si el numero tiene todas sus cifras iguales
	public static boolean es_repdigit(String s) {
		
		boolean t=true;
		
		char c=s.charAt(0);
		
		for (int i = 1; i < s.length(); i++) {
			
			if(s.charAt(i)!=c) {
				
				t=false;
				
			}
			
		}
		
		return t;
		
	}
	
}
