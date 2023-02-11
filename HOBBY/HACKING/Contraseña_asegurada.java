package HACKING;

import java.util.Scanner;

public class Contraseña_asegurada extends Thread{

	public static void main(String[] args) {
		
        caracteres[] digito=new caracteres[104];
        
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
        digito[37]=new caracteres('A');
        digito[38]=new caracteres('B');
        digito[39]=new caracteres('C');
        digito[40]=new caracteres('D');
        digito[41]=new caracteres('E');
        digito[42]=new caracteres('F');
        digito[43]=new caracteres('G');
        digito[44]=new caracteres('H');
        digito[45]=new caracteres('I');
        digito[46]=new caracteres('J');
        digito[47]=new caracteres('K');
        digito[48]=new caracteres('L');
        digito[49]=new caracteres('M');
        digito[50]=new caracteres('N');
        digito[51]=new caracteres('Ñ');
        digito[52]=new caracteres('O');
        digito[53]=new caracteres('P');
        digito[54]=new caracteres('Q');
        digito[55]=new caracteres('R');
        digito[56]=new caracteres('S');
        digito[57]=new caracteres('T');
        digito[58]=new caracteres('U');
        digito[59]=new caracteres('V');
        digito[60]=new caracteres('W');
        digito[61]=new caracteres('X');
        digito[62]=new caracteres('Y');
        digito[63]=new caracteres('Z');
        digito[64]=new caracteres(' ');
        digito[65]=new caracteres('<'); 
        digito[66]=new caracteres('>'); 
        digito[67]=new caracteres(','); 
        digito[68]=new caracteres(';'); 
        digito[69]=new caracteres('.'); 
        digito[70]=new caracteres(':'); 
        digito[71]=new caracteres('-'); 
        digito[72]=new caracteres('_');
        digito[73]=new caracteres('´'); 
        digito[74]=new caracteres('¨'); 
        digito[75]=new caracteres('{'); 
        digito[76]=new caracteres('ç'); 
        digito[77]=new caracteres('}'); 
        digito[78]=new caracteres('`');
        digito[79]=new caracteres('^'); 
        digito[80]=new caracteres('['); 
        digito[81]=new caracteres('+'); 
        digito[82]=new caracteres('*'); 
        digito[83]=new caracteres(']'); 
        digito[84]=new caracteres('¡');
        digito[85]=new caracteres('¿'); 
        digito[86]=new caracteres('='); 
        digito[87]=new caracteres(')'); 
        digito[88]=new caracteres('('); 
        digito[89]=new caracteres('/');
        digito[90]=new caracteres('&'); 
        digito[91]=new caracteres('¬'); 
        digito[92]=new caracteres('%'); 
        digito[93]=new caracteres('$');
        digito[94]=new caracteres('~'); 
        digito[95]=new caracteres('·'); 
        digito[96]=new caracteres('#');
        digito[97]=new caracteres('"'); 
        digito[98]=new caracteres('@');
        digito[99]=new caracteres('!'); 
        digito[100]=new caracteres('|');
        digito[101]=new caracteres('º'); 
        digito[102]=new caracteres('ª');
        digito[103]=new caracteres('?');
        
		boolean todo=true;

		cronometro_antiquado crono=new cronometro_antiquado();      //instanciar objeto tipo cronometro
		
		while(todo) {
			
			boolean nomas=true;
			boolean adivinada=false;
			boolean intento1=false;
			boolean intento2=false;
			boolean intento3=false;
			boolean intento4=false;
			boolean intento5=false;
			boolean intento6=false;
			boolean intento7=false;
			boolean intento8=false;
			String intento1d=null;
			String intento2d=null;
			String intento3d=null;
			String intento4d=null;
			String intento5d=null;
			String intento6d=null;
			String intento7d=null;
			String intento8d=null;
			String contraseñareal=null;
			long permutaciones=0;
			
			while(nomas==true) {
				
			permutaciones=0;
				
			System.out.println("\n  Introduce contraseña:          (Max 8 digitos)");
			
			Scanner sc1=new Scanner(System.in);
			contraseñareal=sc1.nextLine();
			
			if((contraseñareal.length()>8)==false) {break;}
			
			System.out.println("\n  He dicho menos de 8 digitos melon. Prueba otra vez:");
			
			}
			
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
			System.out.println("\n  Hackeando contraseña.......");
						
			crono.set_tiempo();
			
			try {
			crono.start();
			}catch (Exception e){}
			
			if(adivinada==false) {
				
			for(int i=0;i<digito.length;i++) {
				
				for(int j=0;j<digito.length;j++) {
							
					for(int k=0;k<digito.length;k++) {
							
						for(int l=0;l<digito.length;l++) {	
							
							for(int m=0;m<digito.length;m++) {
								
								for(int n=0;n<digito.length;n++) {
									
									for(int ñ=0;ñ<digito.length;ñ++) {
									
										for(int o=0;o<digito.length;o++) {
											
											intento1d=Character.toString(digito[o].dime_caracter());
											
											permutaciones++;
											
											if(intento1d.equals(contraseñareal)) {
												
												intento1=true;
												adivinada=true;
												break;
												
											}
											
											intento2d=Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
													
											if(intento2d.equals(contraseñareal)) {
												
												intento2=true;
												adivinada=true;
												break;
												
											}
											intento3d=Character.toString(digito[n].dime_caracter())+Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
											
											if(intento3d.equals(contraseñareal)) {
												
												intento3=true;
												adivinada=true;
												break;
												
											}
											
											intento4d=Character.toString(digito[m].dime_caracter())+Character.toString(digito[n].dime_caracter())+Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
											
											if(intento4d.equals(contraseñareal)) {
												
												intento4=true;
												adivinada=true;
												break;
												
											}
											
											intento5d=Character.toString(digito[l].dime_caracter())+Character.toString(digito[m].dime_caracter())+Character.toString(digito[n].dime_caracter())+Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
											
											if(intento5d.equals(contraseñareal)) {
												
												intento5=true;
												adivinada=true;
												break;
												
											}
											
											intento6d=Character.toString(digito[k].dime_caracter())+Character.toString(digito[l].dime_caracter())+Character.toString(digito[m].dime_caracter())+Character.toString(digito[n].dime_caracter())+Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
											
											if(intento6d.equals(contraseñareal)) {
												
												intento6=true;
												adivinada=true;
												break;
												
											}
											
											intento7d=Character.toString(digito[j].dime_caracter())+Character.toString(digito[k].dime_caracter())+Character.toString(digito[l].dime_caracter())+Character.toString(digito[m].dime_caracter())+Character.toString(digito[n].dime_caracter())+Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
											
											if(intento7d.equals(contraseñareal)) {
												
												intento7=true;
												adivinada=true;
												break;
												
											}
											
											intento8d=Character.toString(digito[i].dime_caracter())+Character.toString(digito[j].dime_caracter())+Character.toString(digito[k].dime_caracter())+Character.toString(digito[l].dime_caracter())+Character.toString(digito[m].dime_caracter())+Character.toString(digito[n].dime_caracter())+Character.toString(digito[ñ].dime_caracter())+Character.toString(digito[o].dime_caracter());
											
											if(intento8d.equals(contraseñareal)) {
												
												intento8=true;
												adivinada=true;
												break;
												
											}
												
										}

								if(adivinada) {break;}
								
							}

							if(adivinada) {break;}
							
						}
						
						if(adivinada) {break;}
						
					}
					
					if(adivinada) {break;}
							
				  }
					
				  if(adivinada) {break;}
				
				}

				if(adivinada) {break;}
				
			}
				
			if(adivinada) {break;}
		}
			
				
	}
			
		if(adivinada) {
			
			try {
			crono.interrupt();
			}catch(Exception e){
			}
			
			if(intento1) {
				
				System.out.println("\n   La contraseña es: " + intento1d);
				
			}
			if(intento2) {
				
				System.out.println("\n   La contraseña es: " + intento2d);
				
			}
			if(intento3) {
				
				System.out.println("\n  La contraseña es: " + intento3d);
				 
			}
			if(intento4) {
				
				System.out.println("\n  La contraseña es: " + intento4d);
				
			}
			if(intento5) {
				
				System.out.println("\n  La contraseña es: " + intento5d);
				
			}
			if(intento6) {
				
				System.out.println("\n  La contraseña es: " + intento6d);
				
			}
			if(intento7) {
				
				System.out.println("\n  La contraseña es: " + intento7d);
				
			}
			if(intento8) {
				
				System.out.println("\n  La contraseña es: " + intento8d);
				
			}
			
			int horas=(crono.dime_tiempo()/10)/3600;
			double horasst=(((double)(crono.dime_tiempo()/10))/3600);
			int minutos=(int) ((horasst-horas)*60);
			double minutosst=(horasst-horas)*60;
			int segundos=(int) ((minutosst-minutos)*60);
			
			if(crono.dime_tiempo()>=60) {
							
				System.out.println("\n  Tardo: " + horas + " horas, " + minutos + " minutos, " + segundos + " segundos en analizar " + (double)permutaciones/1000000 + " MILLONES de combinaciones");
		
			}else if(crono.dime_tiempo()<=10){
			
				System.out.println("\n  Tardo: " + (double)crono.dime_tiempo()/10 + " segundos en analizar " + ((double)permutaciones/1000000) + " MILLONES de combinaciones");
			
		}else {
			
			System.out.println("\n  Tardo: " + crono.dime_tiempo()/10 + " segundos y " + (((double)crono.dime_tiempo()-crono.dime_tiempo())*10) + " decimas en analizar " + (double)permutaciones/1000000 + " MILLONES de combinaciones");
			
		}
			System.out.println("\n  Velocidad de commutacion: " + (int) (permutaciones/((double)crono.dime_tiempo()/10)) + " combinaciones/segundo");
			
		}else {
			
			System.out.println("\n  Fallo al adivinar");
			
		}
		
		}
		
	}

}

