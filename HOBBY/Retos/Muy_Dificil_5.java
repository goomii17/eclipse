package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Muy_Dificil_5 {

	public static void main(String[] args) {
		
		//Introducir mensaje en inglés u otro idioma
		Scanner sc1=new Scanner(System.in);
		String mensaje=sc1.nextLine();
		
		//Traducir mensaje a morse
		String telegrama=traduce(mensaje);
		
		//busca el numero de distintos mensajes escritos en morse con el mismo
		//numero de letras que el mensaje, sumando cuando encuentra uno a la
		//variable estatica c
		busca_posibilidades(dimeCombinacionesValidas(), "",0, 0, telegrama, telegrama.length(),mensaje.length());
		
		//Imprime solucion
		System.out.println("\n"+c);
		
	}

	//Metodo para traduir el mensaje a morse
	public static String traduce(String s) {
		
		String morse="";
		
		for (int i = 0; i < s.length(); i++) {
			
			morse=morse+dime_correspondiente(s.charAt(i));
			
		}
		
		return morse;
		
	}
	
	public static String dime_correspondiente(char c) {
		
		switch (c) {
		case 'a':
			return ".-";
		case 'b':
			return "-...";
		case 'c':
			return "-.-.";
		case 'd':
			return "-..";
		case 'e':
			return ".";
		case 'f':
			return "..-.";
		case 'g':
			return "--.";
		case 'h':
			return "....";
		case 'i':
			return "..";
		case 'j':
			return ".---";
		case 'k':
			return "-.-";
		case 'l':
			return ".-..";
		case 'm':
			return "--";
		case 'n':
			return "-.";
		case 'o':
			return "---";
		case 'p':
			return ".--.";
		case 'q':
			return "--.-";
		case 'r':
			return ".-.";
		case 's':
			return "...";
		case 't':
			return "-";
		case 'u':
			return "..-";
		case 'v':
			return "...-";
		case 'w':
			return ".--";
		case 'x':
			return "-..-";
		case 'y':
			return "-.--";
		case 'z':
			return "--..";
		default:
			return null;
		}
		
	}
	
	//Crea las combinaciones posibles con . y - (30) usando recursividad
	public static ArrayList<ArrayList<String>> crea_combs(ArrayList<String> temporal,ArrayList<String> elementos,int r,ArrayList<ArrayList<String>> perms) {
		
		if(temporal.size()==r) {
			
			ArrayList<String> aux=new ArrayList();
			
			for (int i = 0; i <temporal.size(); i++) {
				
				aux.add(temporal.get(i));
				
			}
			
			perms.add(aux);
			
		}else {
			
			for (int i = 0; i < elementos.size(); i++) {
				
				temporal.add(elementos.get(i));
				
				if(temporal.size()<=r) {
					
					crea_combs(temporal, elementos, r, perms);
					
					temporal.remove(temporal.size()-1);
				}
				
			}
		}
		
		return perms;
		
	}

	//Compara si una combinacion es valida comparandola con las 4 que no se usan
	public static boolean sonIguales(ArrayList<String> noValida,ArrayList<String> comb) {
		
		boolean t=true;
		
		for (int i = 0; i < noValida.size(); i++) {
			
			if(noValida.get(i)!=comb.get(i)) {
				
				t=false;
				break;
				
			}
			
		}
		
		return t;
		
	}

	//Devuelve las 26 combinaciones validas para las 26 letras usando
	//el metodo anterior
	public static ArrayList<String> dimeCombinacionesValidas() {
		
		ArrayList<String> combinacionesValidas=new ArrayList();
		
		ArrayList<String> elementos=new ArrayList();
		
		elementos.add(".");
		elementos.add("-");
		
		ArrayList<String> noValida1=new ArrayList();
		
		noValida1.add(".");
		noValida1.add(".");
		noValida1.add("-");
		noValida1.add("-");
		
		ArrayList<String> noValida2=new ArrayList();
		
		noValida2.add(".");
		noValida2.add("-");
		noValida2.add(".");
		noValida2.add("-");
		
		ArrayList<String> noValida3=new ArrayList();
		
		noValida3.add("-");
		noValida3.add("-");
		noValida3.add("-");
		noValida3.add(".");
		
		ArrayList<String> noValida4=new ArrayList();
		
		noValida4.add("-");
		noValida4.add("-");
		noValida4.add("-");
		noValida4.add("-");
		
		for (int i = 1; i <= 4; i++) {
			
			ArrayList<ArrayList<String>> perms=crea_combs(new ArrayList<String>(), elementos, i, new ArrayList<ArrayList<String>>());
			
			for (int j = 0; j < perms.size(); j++) {
				
				if(i==4) {
					
					if(!sonIguales(noValida1, perms.get(j))&&!sonIguales(noValida2, perms.get(j))&&!sonIguales(noValida3, perms.get(j))&&!sonIguales(noValida4, perms.get(j))) {
						
						String aux="";
						
						for (int k = 0; k < perms.get(j).size(); k++) {
							
							aux=aux+perms.get(j).get(k);
							
						}
						
						combinacionesValidas.add(aux);
						
					}
					
				}else {
					
					String aux2="";
					
					for (int k = 0; k < perms.get(j).size(); k++) {
						
						aux2=aux2+perms.get(j).get(k);
						
					}
					
					combinacionesValidas.add(aux2);
					
				}
				
			}
			
		}
		
		return combinacionesValidas;
		
	}
	
	//Busca las combinacines con el numero de letras del mensaje
	//inicial que son iguales al mensaje traducido usando recursividad
	static int c=0;
	public static void busca_posibilidades(ArrayList<String> combVals,String temp,int suma,int letras_usadas,String telegrama,int tamaño,int max_letras) {
		
		if(temp.length()==tamaño&&temp.equals(telegrama)) {
			
			c++;
			
		}else {
			
			for (int i = 0; i < combVals.size(); i++) {
				
				suma=suma+combVals.get(i).length();
				
				if(suma<=tamaño) {
					
					temp=temp+combVals.get(i);
					
					letras_usadas++;
					
					if(letras_usadas<=max_letras) {
						
						busca_posibilidades(combVals, temp, suma, letras_usadas, telegrama, tamaño, max_letras);
						
					}
					
					letras_usadas--;
					
					temp=temp.substring(0,temp.length()-combVals.get(i).length());
					
				}
				
				suma=suma-combVals.get(i).length();
				
			}
			
		}
		
	}
	
}
