package Aplicable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class CONVERSOR_HEXADECIMAL {

	public static void main(String[] args) {
		
		boolean todo,error,bucle1,bucle2;
		
		String respuesta,respuesta2,num_hex,numero_hexadecimal,num_dec,numero_decimal,numero_binario;
		
		todo=true;
		
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
		
		while (todo) {
			
			num_dec="";
			num_dec="";
			num_hex="";
			numero_decimal="";
			numero_hexadecimal="";
			numero_binario="";
			error=false;
			bucle1=true;
			bucle2=true;
			
			System.out.println("\n·Decimal->Hexadecimal: pulse 1");
			System.out.println("·Hexadecimal->Decimal: pulse 2");
			
			Scanner sc1=new Scanner(System.in);
			
			respuesta=sc1.nextLine();
			
			switch (respuesta) {
			
			case "1":
				
				while(bucle1) {
					
					System.out.println("\nIntroduzca numero decimal:    (Max 1000 cifras)");
					
					Scanner sc3=new Scanner (System.in);
					
					num_dec=sc3.nextLine();
					
					if(num_dec.length()>1000) {
						
						System.out.println("\nDemasiado grande.");
						
					}else {
						
						if (es_decimal(num_dec)) {
							
							bucle1=false;
							
							numero_binario=convierte_a_binario_d(num_dec);
							
							numero_hexadecimal=convierte_a_hexadecimal_b(numero_binario);
							
							if(num_dec.length()>18) {
								
							System.out.println("\n"+num_dec+"\n Convertido en hexadecimal -> \n"+numero_hexadecimal);
							
							}else {
								
							System.out.println("\n"+num_dec+" Convertido en hexadecimal -> "+numero_hexadecimal);	
								
							}
							
							System.out.println("\n(Binario intermedio: "+numero_binario+" )");
							
							System.out.println("\nCifras decimal: "+num_dec.length());
							System.out.println("Cifras hexadecimal: "+numero_hexadecimal.length());
						}else {
							
							System.out.println("\nValor no válido.");
							
						}
						
					}

				}			
				
				break;
				
			case "2":
				
				while(bucle2) {
					
					System.out.println("\nIntroduzca numero hexadecimal:   (Max 1000 cifras)");
					
					Scanner sc4=new Scanner (System.in);
					
					num_hex=sc4.nextLine();
					
					if(num_hex.length()>1000) {
						
						System.out.println("\nDemasiado grande.");
						
					}else {
						
						if (es_hexa(num_hex)) {
							
							bucle2=false;
							
							numero_binario=convierte_a_binario_h(num_hex);
							
							numero_decimal=convierte_a_decimal(numero_binario);

							if(num_hex.length()+numero_decimal.length()>50) {
							
							System.out.println("\n"+num_hex+"\n Convertido en decimal -> \n"+numero_decimal);
							
							}else {
								
							System.out.println("\n"+num_hex+" Convertido en decimal -> "+numero_decimal);	
								
							}
							
							System.out.println("\n(Binario intermedio: "+numero_binario+" )");
							
							System.out.println("\nCifras hexadecimal: "+num_hex.length());
							System.out.println("Cifras decimal: "+numero_decimal.length());
							
						}else {
							
							System.out.println("\nValor no válido.");
							
						}
						
					}

				}
				
				break;
				
			default:
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
				System.out.println("\nRespuesta no válida.");
				error=true;
				break;
				
			}
			
			if(error==false) {

				System.out.println("\nSi desea salir escriba salir");
				System.out.println("Si desea seguir, pulse Enter");
				
				Scanner sc2=new Scanner(System.in);
				
				respuesta2=sc2.nextLine();
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
				if (respuesta2.equalsIgnoreCase("salir")) {
					
					todo=false;
					
				}
				
			}
			
		}
		
		
	}

	
	
	
	
	
	
	
	
	
	
	public static boolean es_decimal(String num_d) {	
		
		int comp=0;
		boolean t_f=false;
		
		if(num_d.equalsIgnoreCase("")) {
			
			t_f=false;
			
		}else {
			
			for (int i = 0; i <num_d.length(); i++) {
				
				for (int j = 0; j < 10; j++) {
					
					if(Character.toString(num_d.charAt(i)).equalsIgnoreCase(Integer.toString(j))) {
						
						comp++;
						
					}
					
				}
			}
			
			if(comp==num_d.length()) {
				
				t_f=true;
				
			}
			
		}
		
		return t_f;
		
	}
	public static boolean es_binario(String num_b) {
		
		int comp=0;
		boolean t_f=false;
		String cifra;
		
		for (int i = 0; i <num_b.length(); i++) {
			
			cifra=Character.toString(num_b.charAt(i));
			
			if(cifra.equalsIgnoreCase("1")||cifra.equalsIgnoreCase("0")) {
				
				comp++;
				
			}
			
		}
		
		if(comp==num_b.length()) {
			
			t_f=true;
			
		}
		
		if(num_b.equalsIgnoreCase("")) {
			
			t_f=false;
			
		}
		
		return t_f;
		
	}
	
	public static boolean es_hexa(String hexa) {
		
		int contador=0;
		
		boolean t_f=false;
		
		char[] c=new char[16];
		
		c[0]='0';
		c[1]='1';
		c[2]='2';
		c[3]='3';
		c[4]='4';
		c[5]='5';
		c[6]='6';
		c[7]='7';
		c[8]='8';
		c[9]='9';
		c[10]='A';
		c[11]='B';
		c[12]='C';
		c[13]='D';
		c[14]='E';
		c[15]='F';
		
		for (int i = 0; i < hexa.length(); i++) {
			
			for (int j = 0; j < c.length; j++) {
				
				if(Character.toString(hexa.charAt(i)).equalsIgnoreCase(Character.toString(c[j]))) {
					
					contador++;
					
				}
				
			}
			
		}
		
		if(contador==hexa.length()) {
			
			t_f=true;
			
		}
		
		return t_f;
		
	}
	
	public static String convierte_a_decimal(String num_bin) {

		BigInteger numero_decimal=new BigInteger("0");
		BigInteger añadido=new BigInteger("2");
		int contador=num_bin.length()-1;
		
		for (int i = 0; i < num_bin.length(); i++) {
			
			if(num_bin.charAt(i)=='1') {
				
				
				numero_decimal=numero_decimal.add(añadido.pow(contador));
				
			}
			
			contador--;
			
		}
		
		return (numero_decimal).toString();

	}
	
	public static String convierte_a_binario_d(String num_dec) {
		
	boolean bucle1=true;
	
	String numero_binario="";

	BigDecimal bd=new BigDecimal(num_dec);
	BigInteger bi =new BigInteger(num_dec);
	BigDecimal resto;
	
	ArrayList<Character> cifra=new ArrayList<>();
	
	
	while(bucle1) {
		
		if(bd.toString().equalsIgnoreCase("0")) {
			
			cifra.add('0');
			break;
		}
		if(bd.toString().equalsIgnoreCase("1")) {
			
			cifra.add('1');
			break;
		}
		if(bd.toString().equalsIgnoreCase("2")||bd.toString().equalsIgnoreCase("2.0")) {
			
			cifra.add('0');
			cifra.add('1');
			break;
		}
		if(bd.toString().equalsIgnoreCase("3")||bd.toString().equalsIgnoreCase("3.0")) {

			cifra.add('1');
			
			cifra.add('1');
					
			break;
			
		}
		
		bi=bi.divide(new BigInteger("2"));
		bd=bd.divide(new BigDecimal("2"));
	    resto=bd.subtract(new BigDecimal(bi.toString()));
		
	    bd=new BigDecimal(bi.toString());
	    
	    if(resto.toString().equalsIgnoreCase("0")) {
	    	
	    	cifra.add('0');
	    	
	    }else {
	    	
	    	cifra.add('1');
	    	
	    }
	    
	}
    
	char[] c=new char[cifra.size()];
	int contador=0;
	for (int i = cifra.size()-1; i >= 0; i--) {;
		
		c[contador]=cifra.get(i);
		
		contador++;
		
	}
	
	for (int i = 0; i < c.length; i++) {
		
		numero_binario=numero_binario+c[i];
		
	}

	int l=numero_binario.length();
	
	for (int i = 0; i < l; i++) {
		
		if(Character.toString(numero_binario.charAt(0)).equalsIgnoreCase("0")) {
			
			numero_binario=numero_binario.substring(1,numero_binario.length());
			
		}else {
			
			break;
			
		}
		
	}
	
	return numero_binario;
	
	}
	
	public static String convierte_a_hexadecimal_b(String binario) {
		
		String hexa="";
		
		String cuarteto;
		
		int contador_cuarteto=0;
		
		String[] h=new String[16];
		
		h[0]="0";
		h[1]="1";
		h[2]="2";
		h[3]="3";
		h[4]="4";
		h[5]="5";
		h[6]="6";
		h[7]="7";
		h[8]="8";
		h[9]="9";
		h[10]="A";
		h[11]="B";
		h[12]="C";
		h[13]="D";
		h[14]="E";
		h[15]="F";
		
		String[] b=new String[16];
		
		b[0]="0000";
		b[1]="0001";
		b[2]="0010";
		b[3]="0011";
		b[4]="0100";
		b[5]="0101";
		b[6]="0110";
		b[7]="0111";
		b[8]="1000";
		b[9]="1001";
		b[10]="1010";
		b[11]="1011";
		b[12]="1100";
		b[13]="1101";
		b[14]="1110";
		b[15]="1111";
		
		for (int i = 0; i < binario.length(); i++) {
			
			if(Character.toString(binario.charAt(0))=="0") {
				
				binario=binario.substring(1,binario.length());
				
			}else {
				
				break;
				
			}
			
		}
		
		for (int i = 0; i < 4; i++) {
			
			if(binario.length()%4==0) {
				
				break;
				
			}else {
				
				binario="0"+binario;
				
			}
			
		}
		
		for (int i = 0; i < binario.length()/4; i++) {
			
			cuarteto=binario.substring(contador_cuarteto,contador_cuarteto+4);
			
			contador_cuarteto+=4;
			
			for (int j = 0; j < b.length; j++) {
				
				if(cuarteto.equalsIgnoreCase(b[j])) {
					
					hexa=hexa+h[j];
					
				}
				
			}
			
		}
		
		return hexa;
		
	}
	
	public static String convierte_a_binario_h(String hexa) {
		
		String bin="";
		
		String cifra;
		
		int contador_cuarteto=0;
		
		String[] h=new String[16];
		
		h[0]="0";
		h[1]="1";
		h[2]="2";
		h[3]="3";
		h[4]="4";
		h[5]="5";
		h[6]="6";
		h[7]="7";
		h[8]="8";
		h[9]="9";
		h[10]="A";
		h[11]="B";
		h[12]="h";
		h[13]="D";
		h[14]="E";
		h[15]="F";
		
		String[] b=new String[16];
		
		b[0]="0000";
		b[1]="0001";
		b[2]="0010";
		b[3]="0011";
		b[4]="0100";
		b[5]="0101";
		b[6]="0110";
		b[7]="0111";
		b[8]="1000";
		b[9]="1001";
		b[10]="1010";
		b[11]="1011";
		b[12]="1100";
		b[13]="1101";
		b[14]="1110";
		b[15]="1111";
		
		for (int i = 0; i < hexa.length(); i++) {
			
			if(Character.toString(hexa.charAt(0))=="0") {
				
				hexa=hexa.substring(1,hexa.length());
				
				System.out.println(hexa);
				
			}else {
				
				break;
				
			}
			
		}
		
		for (int i = 0; i < hexa.length(); i++) {
			
			cifra=Character.toString(hexa.charAt(i));
			
			for (int j = 0; j < h.length; j++) {
				
				if(cifra.equalsIgnoreCase(h[j])) {
					
					bin=bin+b[j];
					
				}
				
			}
			
		}
		
		int l=bin.length();
		
		for (int i = 0; i < l; i++) {
			
			if(Character.toString(bin.charAt(0)).equalsIgnoreCase("0")) {
				
				bin=bin.substring(1,bin.length());
				
			}else {
				
				break;
				
			}
			
		}
		
		return bin;
		
	}
	
}
