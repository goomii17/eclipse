package Retos2;

import java.util.ArrayList;
import java.util.Scanner;

public class Encriptador {

	public static void main(String[] args) {
		
		//ArrayList para la solucion de cada caso
		ArrayList<Integer> soluciones=new ArrayList();
		
		boolean t=true;
		
		while(t) {
			
			//Introducir mensaje a codificar 
			Scanner sc1=new Scanner(System.in);
			String s=sc1.nextLine().toLowerCase();
			
			//Sacar el desplazamiento indicado
			int desp=dimeDesplazamiento('p', s.charAt(0));
			
			//Codificar el mensaje
			String codificada=codifica(s, desp);
			
			//Si el mensaje significa fin termina el programa
			if(codificada.equals("fin")) {
				
				break;
				
			}
			
			//Añade el numero de vocales del mensaje traducido
			soluciones.add(dimeVocales(codificada));
			
		}
		
		for (int i = 0; i < soluciones.size(); i++) {
			
			System.out.println(soluciones.get(i));
			
		}
		
	}

	//Codifica un mensaje con un determinado desplazamiento
	public static String codifica(String s,int desp) {
		
		String codificada="";
		
		for (int i = 1; i < s.length(); i++) {
			
			if(dimePosicion(s.charAt(i))==-1) {
				
				codificada=codificada+s.charAt(i);
				
			}else {
				
				codificada=codificada+dimeCharCorrespondiente(dimePosicion(s.charAt(i))+desp);
				
			}
			
		}
		
		return codificada;
		
	}
	
	//Devuelve el numero de vocales de un mensaje
	public static int dimeVocales(String s) {
		
		int c=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				
				c++;
				
			}
			
		}
		
		return c;
		
	}
	
	//Saca el desplazamiento indicado
	public static int dimeDesplazamiento(char l1,char l2) {
		
		int n=dimePosicion(l1)-dimePosicion(l2);
		
		return n;
		
	}
	
	//Devuelve el char correspondiente para la posicion indicada
	//con el desplazamiento ya incluido
	public static char dimeCharCorrespondiente(int n) {
		
		if(n>25) {
			
			n-=26;
			
		}else if(n<0) {
			
			n+=26;
			
		}
		
		switch (n) {
		case 0:
			
			return 'a';
		case 1:
			
			return 'b';
		case 2:
			
			return 'c';
		case 3:
			
			return 'd';
		case 4:
			
			return 'e';
		case 5:
			
			return 'f';
		case 6:
			
			return 'g';
		case 7:
			
			return 'h';
		case 8:
			
			return 'i';
		case 9:
		
			return 'j';
		case 10:
			
			return 'k';
		case 11:
			
			return 'l';
		case 12:
			
			return 'm';
		case 13:
			
			return 'n';
		case 14:
			
			return 'o';
		case 15:
			
			return 'p';
		case 16:
			
			return 'q';
		case 17:
			
			return 'r';
		case 18:
			
			return 's';
		case 19:
		
			return 't';
		case 20:
			
			return 'u';
		case 21:
			
			return 'v';
		case 22:
			
			return 'w';
		case 23:
			
			return 'x';
		case 24:
			
			return 'y';
		case 25:
			
			return 'z';

		default:
			return 'º';
		}
		
	}
	
	//Devuelve la posicion de un char para luego
	//sumarle el desplazamiento
	public static int dimePosicion(char c) {
		
		switch (c) {
		case 'a':
			
			return 0;
		case 'b':
			
			return 1;
		case 'c':
			
			return 2;
		case 'd':
			
			return 3;
		case 'e':
			
			return 4;
		case 'f':
			
			return 5;
		case 'g':
			
			return 6;
		case 'h':
			
			return 7;
		case 'i':
			
			return 8;
		case 'j':
			
			return 9;
		case 'k':
			
			return 10;
		case 'l':
			
			return 11;
		case 'm':
			
			return 12;
		case 'n':
			
			return 13;
		case 'o':
			
			return 14;
		case 'p':
			
			return 15;
		case 'q':
			
			return 16;
		case 'r':
			
			return 17;
		case 's':
			
			return 18;
		case 't':
			
			return 19;
		case 'u':
			
			return 20;
		case 'v':
			
			return 21;
		case 'w':
			
			return 22;
		case 'x':
			
			return 23;
		case 'y':
			
			return 24;
		case 'z':
			
			return 25;

		default:
			return -1;
		}
		
	}
	
}
