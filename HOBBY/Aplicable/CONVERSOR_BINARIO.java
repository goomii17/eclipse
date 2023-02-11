package Aplicable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
public class CONVERSOR_BINARIO {

	public static void main(String[] args) {
		
		boolean todo,error,bucle1,bucle2;
		
		String respuesta,respuesta2,num_bin,numero_binario,num_dec,numero_decimal;
		
		todo=true;
		
		try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            /*No hacer nada*/
        }
		
		while (todo) {
			
			num_dec="";
			num_dec="";
			num_bin="";
			numero_decimal="";
			numero_binario="";
			error=false;
			bucle1=true;
			bucle2=true;
			
			System.out.println("\n·Decimal->Binario: pulse 1");
			System.out.println("·Binario->Decimal: pulse 2");
			
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
							
							numero_binario=convierte_a_binario(num_dec);
							
							if(num_dec.length()>18) {
								
							System.out.println("\n"+num_dec+"\n Convertido en binario -> \n"+numero_binario);
							
							}else {
								
							System.out.println("\n"+num_dec+" Convertido en binario -> "+numero_binario);	
								
							}
							
							System.out.println("\nCifras decimal: "+num_dec.length());
							System.out.println("Cifras binario: "+numero_binario.length());
						}else {
							
							System.out.println("\nValor no válido.");
							
						}
						
					}

				}			
				
				break;
				
			case "2":
				
				while(bucle2) {
					
					System.out.println("\nIntroduzca numero binario:   (Max 1000 cifras)");
					
					Scanner sc4=new Scanner (System.in);
					
					num_bin=sc4.nextLine();
					
					if(num_bin.length()>1000) {
						
						System.out.println("\nDemasiado grande.");
						
					}else {
						
						if (es_binario(num_bin)) {
							
							bucle2=false;
							
							numero_decimal=convierte_a_decimal(num_bin);

							if(num_bin.length()+numero_decimal.length()>50) {
							
							System.out.println("\n"+num_bin+"\n Convertido en decimal -> \n"+numero_decimal);
							
							}else {
								
							System.out.println("\n"+num_bin+" Convertido en decimal -> "+numero_decimal);	
								
							}
							System.out.println("\nCifras binario: "+num_bin.length());
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
	
	public static String convierte_a_binario(String num_dec) {
		
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
	
	return numero_binario;
	
	}
}
