package Retos;

import java.util.Scanner;

import HACKING.caracteres;

public class Medio_2 {

	public static void main(String[] args) {
		
		boolean estan_todas=true;
		
		System.out.println("Introduce el numero de frases");
		
		Scanner sc1=new Scanner(System.in);
		int num_frases=sc1.nextInt();
		
		String[] frase=new String[num_frases];
		
		String[] abc=new String[26];
		
		    abc[0]="z";
	        abc[1]="a";
	        abc[2]="b";
	        abc[3]="c";
	        abc[4]="d";
	        abc[5]="e";
	        abc[6]="f";
	        abc[7]="g";
	        abc[8]="h";
	        abc[9]="i";
	        abc[10]="j";
	        abc[11]="k";
	        abc[12]="l";
	        abc[13]="m";
	        abc[14]="n";
	        abc[15]="o";
	        abc[16]="p";
	        abc[17]="q";
	        abc[18]="r";
	        abc[19]="s";
	        abc[20]="t";
	        abc[21]="u";
	        abc[22]="v";
	        abc[23]="w";
	        abc[24]="x";
	        abc[25]="y";
	        
	        boolean[] esta1=new boolean[26];
	        
	        esta1[0]=false;
	        esta1[1]=false;
	        esta1[2]=false;
	        esta1[3]=false;
	        esta1[4]=false;
	        esta1[5]=false;
	        esta1[6]=false;
	        esta1[7]=false;
	        esta1[8]=false;
	        esta1[9]=false;
	        esta1[10]=false;
	        esta1[11]=false;
	        esta1[12]=false;
	        esta1[13]=false;
	        esta1[14]=false;
	        esta1[15]=false;
	        esta1[16]=false;
	        esta1[17]=false;
	        esta1[18]=false;
	        esta1[19]=false;
	        esta1[20]=false;
	        esta1[21]=false;
	        esta1[22]=false;
	        esta1[23]=false;
	        esta1[24]=false;
	        esta1[25]=false;
		
		for (int i = 0; i < num_frases; i++) {
			
			System.out.println("Introduzca frase"+" "+(i+1));
			
			Scanner sc2=new Scanner(System.in);
			
			frase[i]=sc2.nextLine();
			
		}
		
		for (int k = 0; k < frase.length; k++) {
			
			for (int j = 0; j < frase[k].length(); j++) {
				
				for (int i = 0; i < abc.length; i++) {
					
					if(Character.toString(frase[k].charAt(j)).equalsIgnoreCase(abc[i])) {
						
						esta1[i]=true;
						
					}
					
				}
				
			}
			
			for (int i = 0; i < esta1.length; i++) {
				
				if(esta1[i]==false) {
					
					estan_todas=false;
					
				}
				
			}
			
			if(estan_todas) {
				
				System.out.println(k+1+" Es un pangrama");
				
			}else {
				
				System.out.println(k+1+" No es un pangrama");
				
			}
			
			for (int i = 0; i < esta1.length; i++) {
				
				esta1[i]=false;
				
			}
			
			estan_todas=true;
			
		}
		
	}

}
