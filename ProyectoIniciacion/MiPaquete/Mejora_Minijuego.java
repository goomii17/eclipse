package MiPaquete;

import java.util.*;

public class Mejora_Minijuego {
	
	public static void main(String Args[]) {
		
		boolean repetir=true;
		
		System.out.println("BIENVENIDO A MI PRIMER MINIJUEGO");
		
		System.out.println("Tienes 10 intentos para adivinar un numero del 1 al 1000");
		
		System.out.println("MUCHA SUERTE");
		
		while(repetir==true) {
			int contador=0;
			
			double num1=(Math.random()*1000);
			
			num1=(Math.round(num1));
			
			double num2=-1;
			
			while (!(num1==num2)) {
				
				if(contador==10){
					
					System.out.println("PERDISTE jajaja pringi");
					System.out.println("No has acertado por " + (Math.round(num1-num2)) + " numeros. (El numero era el " + Math.round(num1) + ")");
					System.out.println("Si quieres volver a intentarlo pulsa 1");
					System.out.println("Sino, pulsa 2, y ve a llorar a tu casa");
					
					Scanner sc2=new Scanner(System.in);
					
					int respuesta1=sc2.nextInt();
							
					if (respuesta1==1) {
						
						contador=0;
						
						try {
				            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				        } catch (Exception e) {
				            /*No hacer nada*/
				        }
						
						System.out.println("BIENVENIDO DE NUEVO");
						
						System.out.println("Ya sabes, tienes 10 intentos para adivinar un numero del 1 al 1000");
						
						System.out.println("MUCHA SUERTE");
						
					}else if(respuesta1==2) {
						
						repetir=false;
						
					}

				}
				
				Scanner sc1=new Scanner (System.in);
				
				num2=sc1.nextDouble();
				
				if(num1==num2) {
					
					System.out.println("Has acertado!! Enhorabuena");
					System.out.println("Lo has logrado en " + (contador+1) + " intentos");
					System.out.println("Si quieres volver a jugar pulsa 1");
					System.out.println("Sino, pulsa 2, y retirate con una victoria");
                    
					Scanner sc3=new Scanner(System.in);
					
					int respuesta2=sc3.nextInt();
							
					if (respuesta2==1) {
						
						contador=0;
						
						try {
				            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				        } catch (Exception e) {
				            /*No hacer nada*/
				        }
						
                        System.out.println("BIENVENIDO DE NUEVO");
						
						System.out.println("Ya sabes, tienes 10 intentos para adivinar un numero del 1 al 1000");
						
						System.out.println("MUCHA SUERTE");
						
					}else if(respuesta2==2) {
						
						repetir=false;
						
					}
					
			
				}else {
					
					if (contador==6) {
						
						System.out.println("Te quedan tres intentos, mira haber!");
						
					}
					
					if(num2<num1){
						
						contador++;
						
						if (!(contador==10)) {
							
							System.out.println("Creo que te has quedado corto...");
							
						}
					
					}else {
						
						contador++;
						
						if (!(contador==10)) {
							
							System.out.println("Creo que te has pasado...");
							
						}
						
						
						
						
					}	
				}
				
			}
			
		}
		

		
	}

}
