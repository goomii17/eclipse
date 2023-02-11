package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class Muy_Dificil_4 {

	public static void main(String[] args) {
		
		//ArrayList para las soluciones de todos los casos
		ArrayList<ArrayList<String>> soluciones=new ArrayList();
		
		//Introducir numero de casos
		Scanner sc0=new Scanner(System.in);
		int casos=sc0.nextInt();
		
		for (int a = 0; a < casos; a++) {
			
			//ArrayList para todas la combinaciones de cada cancion
			ArrayList<ArrayList<String>> todas=new ArrayList();
			
			//Introducir numero de canciones
			Scanner sc1=new Scanner(System.in);
			int num_canciones=sc1.nextInt();
			
			for (int i = 0; i < num_canciones; i++) {
				
				//Introducir canciones
				Scanner sc2=new Scanner(System.in);
				String cancion=sc2.nextLine();
				
				cancion=cancion.toUpperCase();
						
				todas.add(separa_en_subcadenas(subs,cancion.length(),cancion,0,1));
				
				c=1;
				subs=new ArrayList();
				
			}
			
			//ArrayList para las soluciones de cada caso
			ArrayList<String> soluciones_temporales=new ArrayList();
			
			for (int i = 0; i < todas.size(); i++) {
				ArrayList<String> temporal=new ArrayList();
				for (int j = 0; j < todas.get(i).size(); j++) {
					
					if(revisaSubstring(todas, todas.get(i).get(j), i)) {
						
						temporal.add(todas.get(i).get(j));
						
					}
					
				}
				
				if(temporal.size()==0) {
					
					soluciones_temporales.add(":(");
					
				}else {
					
					soluciones_temporales.add(dime_mas_pequeño(temporal));
					
				}
				
			}
			
			soluciones.add(soluciones_temporales);
			
		}
		
		//Imprimir las soluciones finales
		for (int i = 0; i < soluciones.size(); i++) {
			
			System.out.println("CASE "+(i+1)+":");
			
			for (int j = 0; j < soluciones.get(i).size(); j++) {
				
				System.out.println(soluciones.get(i).get(j));
				
			}
			
		}
		
	}
	
	static int c=1;
	static ArrayList<String> subs=new ArrayList();
	
	//Metodo para separar cada cancion en todas sus subcadenas posibles con recursividad
	public static ArrayList<String> separa_en_subcadenas(ArrayList<String> subs,int tamaño,String s,int b_index,int e_index) {
		
		if(e_index<=tamaño) {
			
			subs.add(s.substring(b_index,e_index));
			
			separa_en_subcadenas(subs,tamaño, s, b_index, e_index+1);
			
			separa_en_subcadenas(subs,tamaño, s,b_index+1, c);
			
		}else {
			
			c++;
			
		}
		
		return subs;
		
	}
	
	//Metodo para comprobar si una subcadena esta en el resto de canciones
	public static boolean revisaSubstring(ArrayList<ArrayList<String>> todas,String s,int index) {
		
		boolean t=true;
		
		for (int i = 0; i < todas.size(); i++) {
			
			for (int j = 0; j < todas.get(i).size(); j++) {
				
				if(i!=index) {
					
					if(todas.get(i).contains(s)) {
						
						t=false;
						
					}
					
				}else {
					
					break;
					
				}
				
			}
			
		}
		
		return t;
		
	}
	
	//Metodo para escoger la subcadena mas corta
    public static String dime_mas_pequeño(ArrayList<String> s) {
    	
    	String mas_p=s.get(0);
    	
    	ArrayList<String> duda=new ArrayList();
    	
    	for (int i = 1; i < s.size(); i++) {
			
    		if(s.get(i).length()<mas_p.length()) {
    			
    			if(duda.size()!=0) {
    				
        			if(duda.get(0).length()>s.get(i).length()) {
        				
        				duda=new ArrayList();
        				
        			}
    				
    			}
    			
    			mas_p=s.get(i);
    			
    		}else {
    			
    			if(s.get(i).length()==mas_p.length()) {
    				
    				if(duda.contains(mas_p)==false||duda.size()==0) {
    					
    					duda.add(mas_p);
    					
    				}
    				
    				duda.add(s.get(i));
    				
    			}
    			
    		}
    		
		}
    	
    	boolean d=false;
    	for (int i = 0; i < duda.size(); i++) {
			
    		if(mas_p==duda.get(i)) {
    			
    			d=true;
    			
    		}
    		
		}
    	
    	if(duda.size()!=0&&d==true) {
    		
    		mas_p=dime_primera_alfafeticamente(duda, 0);
    		
    	}
    	
    	return mas_p;
    	
    }
	
    //Metodo para escoger la subcadena alfabeticamente
    public static String dime_primera_alfafeticamente(ArrayList<String> s,int index) {
    	
    	String str=s.get(0);
    	
    	ArrayList<String> duda=new ArrayList();
    	
    	for (int i = 1; i < s.size(); i++) {
			
    		if(index!=s.get(i).length()) {
    			
        		char l=s.get(i).charAt(index);
        		
        		if(l==str.charAt(index)) {
        			
        			if(duda.size()==0&&!duda.contains(s.get(i))) {
        				
        				duda.add(str);
        				
        			}
        			
        			if(!duda.contains(s.get(i))) {
        				
        			duda.add(s.get(i));
        			
        			}
        			
        		}else if(l<str.charAt(index)) {
        			
        			str=s.get(i);
        			
        		}
    			
    		}
    		
		}
    	
    	if(duda.size()>0) {
    		
    		str=dime_primera_alfafeticamente(duda, index+1);
    		
    	}
    	
		return str;
    	
    }
    
}
