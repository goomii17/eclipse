package Hackathon;

import java.util.ArrayList;

public class prueba {

	public static void main(String[] args) {
		
		ArrayList<String> n_elementos=new ArrayList();
		
		n_elementos.add("1");
		n_elementos.add("2");
		n_elementos.add("3");
		n_elementos.add("4");
		n_elementos.add("5");
		n_elementos.add("6");
		n_elementos.add("7");
		n_elementos.add("8");
		n_elementos.add("9");
		
		int r_en_r=9;
		
		ArrayList<ArrayList<String>> perms=crea_combs(new ArrayList<String>(),n_elementos, r_en_r, new ArrayList<ArrayList<String>>());
		
		System.out.println(perms.size());
		
//		for (int i = 0; i < perms.size(); i++) {
//			
//			System.out.println(perms.get(i));
//			
//		}
		
	}
	
	public static ArrayList<ArrayList<String>> crea_combs(ArrayList<String> temporal,ArrayList<String> elementos,int r,ArrayList<ArrayList<String>> perms) {
		
		if(temporal.size()==r) {
			
			ArrayList<String> aux=new ArrayList();
			
			for (int i = 0; i <temporal.size(); i++) {
				
				aux.add(temporal.get(i));
				
			}
			
			perms.add(aux);
			System.out.println(aux);
		}else{
			
			for (int i = 0; i < elementos.size(); i++) {
				
				temporal.add(elementos.get(i));
				
				if(temporal.size()<=r) {
					
					if(ok(temporal,r)) {
						
						crea_combs(temporal, elementos, r, perms);
						
					}
					
					temporal.remove(temporal.size()-1);
				}
				
			}
		}
		
		return perms;
		
	}

	public static boolean ok(ArrayList<String> t,int r_r) {

		if(t.size()>3) {
			
			ArrayList<String> aux=new ArrayList();
			
			for (int i = 0; i < t.size(); i++) {
				
				aux.add(t.get(i));
				
			}
			int size=r_r-aux.size();
			for (int i = 0; i < size; i++) {
				
				aux.add("0");
				
			}
			
			int sum=Integer.parseInt(aux.get(0))+Integer.parseInt(aux.get(1))+Integer.parseInt(aux.get(2));
			
			ArrayList<String> cm=new ArrayList();
			
			cm.add(aux.get(0)+aux.get(1)+aux.get(2));
			cm.add(aux.get(3)+aux.get(4)+aux.get(5));
			cm.add(aux.get(6)+aux.get(7)+aux.get(8));
			cm.add(aux.get(0)+aux.get(3)+aux.get(6));
			cm.add(aux.get(1)+aux.get(4)+aux.get(7));
			cm.add(aux.get(2)+aux.get(5)+aux.get(8));
			cm.add(aux.get(0)+aux.get(4)+aux.get(8));
			cm.add(aux.get(2)+aux.get(4)+aux.get(6));
			
			for (int i = 0; i < cm.size(); i++) {
				
				if(!estaVacia(cm.get(i))) {
					
					if(!estaCompleta(cm.get(i))) {
						
						int s=0;
						for (int j = 0; j < 3; j++) {
							
							s+=Integer.parseInt(Character.toString(cm.get(i).charAt(j)));
							
							if(s>sum) {
								
								return false;
								
							}
							
						}
						
					}else {
						
						if(Integer.parseInt(Character.toString(cm.get(i).charAt(0)))+Integer.parseInt(Character.toString(cm.get(i).charAt(1)))+Integer.parseInt(Character.toString(cm.get(i).charAt(2)))!=sum) {
							
							return false;
							
						}
						
					}
					
				}
				
			}
			
		}
		
		return true;
		
	}
	
	public static boolean estaCompleta(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)=='0') {
				
				return false;
				
			}
			
		}
		return true;
	}
	
	public static boolean estaVacia(String s) {
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!='0') {
				
				return false;
				
			}
			
		}
		return true;
	}
	
}

