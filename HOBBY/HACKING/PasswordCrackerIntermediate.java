package HACKING;

import java.util.Scanner;

public class PasswordCrackerIntermediate {

	public static void main(String[] args) {
		
        caracteres[] digito=new caracteres[37];
        
        digito[0]=new caracteres('0');
        digito[1]=new caracteres('1');
        digito[2]=new caracteres('2');
        digito[3]=new caracteres('3');
        digito[4]=new caracteres('4');
        digito[5]=new caracteres('5');
        digito[6]=new caracteres('6');
        digito[7]=new caracteres('7');
        digito[8]=new caracteres('8');
        digito[9]=new caracteres('9');
        digito[10]=new caracteres('a');
        digito[11]=new caracteres('b');
        digito[12]=new caracteres('c');
        digito[13]=new caracteres('d');
        digito[14]=new caracteres('e');
        digito[15]=new caracteres('f');
        digito[16]=new caracteres('g');
        digito[17]=new caracteres('h');
        digito[18]=new caracteres('i');
        digito[19]=new caracteres('j');
        digito[20]=new caracteres('k');
        digito[21]=new caracteres('l');
        digito[22]=new caracteres('m');
        digito[23]=new caracteres('n');
        digito[24]=new caracteres('ñ');
        digito[25]=new caracteres('o');
        digito[26]=new caracteres('p');
        digito[27]=new caracteres('q');
        digito[28]=new caracteres('r');
        digito[29]=new caracteres('s');
        digito[30]=new caracteres('t');
        digito[31]=new caracteres('u');
        digito[32]=new caracteres('v');
        digito[33]=new caracteres('w');
        digito[34]=new caracteres('x');
        digito[35]=new caracteres('y');
        digito[36]=new caracteres('z');
	
		boolean cracking=true;
		int empezando=0;
		boolean todo=true;
		boolean adivinada=false;
		String intento = null;
		
		while(todo) {
			
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
			System.out.println("Introduce contraseña:");
			
			Scanner sc1=new Scanner(System.in);
			String contraseñareal=sc1.nextLine();
			
			int trolleo=(int) Math.round(Math.random()*10);
		
			for(int i=0;i<trolleo;i++) {
				
				System.out.println("Hackeando contraseña.......");
				
				try {
					Thread.sleep(trolleo*20);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		for(int i=0;i<digito.length;i++) {
			
			intento=Character.toString(digito[i].dime_caracter());
			
			if(intento.equals(contraseñareal)) {
				
				adivinada=true;
				break;
				
			}
			
		}
		if(adivinada==false) {
			
			for(int i=0;i<digito.length;i++) {
				
				for(int j=0;j<digito.length;j++) {
					
					intento=(Character.toString(digito[i].dime_caracter())+Character.toString(digito[j].dime_caracter()));
					
					if(intento.equals(contraseñareal)) {
						
						adivinada=true;
						break;
						
					}
					
				}

				if(adivinada) {break;}
				
			}

			
		}

		if(adivinada) {
			
			System.out.println("La contraseña es: " + intento);
			
		}else {
			
			System.out.println("Fallo al adivinar");
			
		}
		
		}
		
	}



}
