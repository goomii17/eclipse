package MiPaquete;

public class Rec_2 {

	public static void main(String[] args) {
		
		String[] s= {"0","1","2","3","4","5"};
		
		String e_b="3";
		
		muestraArray(s,0,e_b);
		
	}

	public static void muestraArray(String[] s,int index,String e_b) {
		
		if(index<s.length) {
			
			if(e_b==s[index]) {
				
				System.out.println(s[index]);
				
			}
			
			muestraArray(s,index+1,e_b);
			
		}
		
	}
	
}
