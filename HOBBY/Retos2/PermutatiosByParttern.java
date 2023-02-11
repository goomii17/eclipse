package Retos2;

import java.util.ArrayList;

public class PermutatiosByParttern {

	public static void main(String[] args) {
		
		String pattern="1??0?101";
		
		ArrayList<Integer> positions=new ArrayList();
		
		for (int i = 0; i < pattern.length(); i++) {
			
			if(pattern.charAt(i)=='?') {
				
				positions.add(i);
				
			}
			
		}
		
		generatePermutations(positions.size(), "");
		
		for (int i = 0; i < permutations.size(); i++) {
			
			System.out.println(metePermutacion(positions, pattern, permutations.get(i)));
			
		}
		
	}

	public static String metePermutacion(ArrayList<Integer> positions,String patt,String p) {
		
		String s="";
		
		int last=0;
		
		for (int i = 0; i < positions.size(); i++) {
			
			s=s+patt.substring(last,positions.get(i));
			
			s=s+p.charAt(i);
			
			last=positions.get(i)+1;
			
		}
		
		if(s.length()!=patt.length()) {
			
			s=s+patt.substring(last);
			
		}
		
		return s;
		
	}
	
	static ArrayList<String> permutations=new ArrayList();
	
	public static void generatePermutations(int size,String s) {
		
		if(s.length()==size) {
			
			permutations.add(s);
			
		}
		
		for (int i = 0; i < 2; i++) {
			
			if(s.length()<=size) {
				
				s=s+Integer.toString(i);
				
				generatePermutations(size, s);
				
				s=s.substring(0,s.length()-1);
				
			}
			
		}
		
	}
	
}
