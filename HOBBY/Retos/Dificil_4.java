package Retos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Dificil_4 {

	public static void main(String[] args) {
		
		Scanner sc1=new Scanner(System.in);
		
		int num_abejas=sc1.nextInt();
		
		ArrayList<String> abejas=new ArrayList();
		
		for (int i = 0; i < num_abejas; i++) {
			
			Scanner sc2=new Scanner(System.in);
			
			String abeja=sc2.nextLine();
			
			abejas.add(abeja);
			
		}
		
		ArrayList<ArrayList<Double>> centros=new ArrayList();
		
		double distancia=0;
		int tiempo=0;
		
		for (int t = 0; t <10; t++) {
			
			centros.add(dime_centro(abejas,t));
			tiempo=t;
			
			if(t==0==false) {
				
				if(dime_distancia(centros.get(t))>=distancia) {
					
					tiempo-=1;
					
					break;
					
				}
				
				distancia=dime_distancia(centros.get(t));
				
			}
			
			distancia=dime_distancia(centros.get(t));
			
		}
		
		System.out.println("Distancia minima: "+distancia+" en t="+tiempo);
		
	}

	public static ArrayList<Double> dime_centro(ArrayList<String> a,int t) {
		
		int x=0;
		int y=0;
		int z=0;
		
		for (int i = 0; i < a.size(); i++) {
			
			x=x+dime_x(a,i,t);
			y=y+dime_y(a,i,t);
			z=z+dime_z(a,i,t);
			
		}
		ArrayList<Double> d=new ArrayList();
		d.add(((double)x/a.size()));
		d.add(((double)y/a.size()));
		d.add(((double)z/a.size()));
		
		return d;
		
	}
	
	public static int dime_x(ArrayList<String> a,int i,int t) {
		
		String[] s=a.get(i).split(" ");
		
		ArrayList<String> s2=new ArrayList();
		
		for (int j = 0; j < s.length; j++) {
			
			if(s[j].equalsIgnoreCase(" ")==false) {
				
				s2.add(s[j]);
				
			}
			
		}
		
		int n=Integer.parseInt(s2.get(0));
		
		n+=dime_vx(a, i, t)*t;
		
		return n;
		
	}
	public static int dime_y(ArrayList<String> a,int i,int t) {
		
		String[] s=a.get(i).split(" ");
		
		ArrayList<String> s2=new ArrayList();
		
		for (int j = 0; j < s.length; j++) {
			
			if(s[j].equalsIgnoreCase(" ")==false) {
				
				s2.add(s[j]);
				
			}
			
		}
		
		int n=Integer.parseInt(s2.get(1));
		
		n+=dime_vy(a, i, t)*t;
		
		return n;
		
	}
	public static int dime_z(ArrayList<String> a,int i,int t) {
		
		String[] s=a.get(i).split(" ");
		
		ArrayList<String> s2=new ArrayList();
		
		for (int j = 0; j < s.length; j++) {
			
			if(s[j].equalsIgnoreCase(" ")==false) {
				
				s2.add(s[j]);
				
			}
			
		}
		
		int n=Integer.parseInt(s2.get(2));
		
		n+=dime_vz(a, i, t)*t;
		
		return n;
		
	}
	public static int dime_vx(ArrayList<String> a,int i,int t) {
		
		String[] s=a.get(i).split(" ");
		
		ArrayList<String> s2=new ArrayList();
		
		for (int j = 0; j < s.length; j++) {
			
			if(s[j].equalsIgnoreCase(" ")==false) {
				
				s2.add(s[j]);
				
			}
			
		}
		
		return Integer.parseInt(s2.get(3));
		
	}
	public static int dime_vy(ArrayList<String> a,int i,int t) {
		
		String[] s=a.get(i).split(" ");
		
		ArrayList<String> s2=new ArrayList();
		
		for (int j = 0; j < s.length; j++) {
			
			if(s[j].equalsIgnoreCase(" ")==false) {
				
				s2.add(s[j]);
				
			}
			
		}
		
		return Integer.parseInt(s2.get(4));
		
	}
	public static int dime_vz(ArrayList<String> a,int i,int t) {
		
		String[] s=a.get(i).split(" ");
		
		ArrayList<String> s2=new ArrayList();
		
		for (int j = 0; j < s.length; j++) {
			
			if(s[j].equalsIgnoreCase(" ")==false) {
				
				s2.add(s[j]);
				
			}
			
		}
		
		return Integer.parseInt(s2.get(5));
		
	}
	public static double dime_distancia(ArrayList<Double> d) {
		
		double x=Math.pow(d.get(0), 2);
		double y=Math.pow(d.get(1), 2);
		double z=Math.pow(d.get(2), 2);
		
		double distancia=Math.pow(x+y+z,0.5);
		
		return distancia;
		
	}
}
