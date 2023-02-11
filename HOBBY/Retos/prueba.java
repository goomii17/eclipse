package Retos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class prueba {
	
    public static void main(String [] args)  {
    	
    	String a=" Y";
    	
    	String b=" D";
 
    	
    	ArrayList<String> s=new ArrayList();
    	
    	s.add("IM");
    	s.add("IM");
    	s.add("EE");
    	s.add("AN");
    	s.add("NN");
    	s.add(" N");
    	s.add(" Y");
    	s.add("YO");
    	s.add("OU");
    	s.add("U ");
    	s.add(" D");
    	s.add("DO");
    	
    	System.out.println(dime_primera_alfafeticamente(s, 0));
    	
    }
    
    public static String dime_mas_pequeño(ArrayList<String> s) {
    	
    	String mas_p=s.get(0);
    	
    	ArrayList<String> duda=new ArrayList();
    	
    	for (int i = 1; i < s.size(); i++) {
			
    		if(s.get(i).length()<mas_p.length()) {
    			
    			mas_p=s.get(i);
    			
    		}else {
    			
    			if(s.get(i).length()==mas_p.length()) {
    				
    				duda.add(mas_p);
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
    		System.out.println(duda);
    		str=dime_primera_alfafeticamente(duda, index+1);
    		
    	}
    	
		return str;
    	
    }
    
}