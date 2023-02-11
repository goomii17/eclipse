package Aplicable;

import java.util.ArrayList;

public class PermConRep {

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
		
		int r_en_r=8;
		
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

}
