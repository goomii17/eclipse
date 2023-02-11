package MiPaquete;
import java.util.*;
public class Comprar_coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car_properties Cochazo=new car_properties();
		
		boolean repetir_todo=true;
		boolean repetir_y=true;
		boolean repetir1=true;
		boolean repetir2=true;
		boolean repetir3=true;
		boolean repetir4=true;
		boolean repetir5=true;
		boolean repetir6=true;
		
		while (repetir_todo==true) {
		
		System.out.println("COCHE de NOOBS\nColor: " + Cochazo.dime_color()+
				
				"\nMotor: "+Cochazo.dime_motor() + "\nTubo de escape: " + Cochazo.dime_tubo_escape() +
				
				"\nAlerones: " + Cochazo.dime_alerones() + "\nAmortiguadores: " + Cochazo.dime_amortiguadores() + 
				
				"\nPrecio: " + Cochazo.dime_precio_total());
		
		System.out.println("");
		System.out.println("Si desea comprar el coche para NOOBS pulsa x.");
		System.out.println("Si desea comprar un coche Personalizado pulsa o.");
		System.out.println("Si desea comprar un coche random pulsa y.");
	
		Scanner sc1=new Scanner(System.in);
		
		String eleccion1="";
		
		while ((eleccion1.equalsIgnoreCase("x"))==false&&(eleccion1.equalsIgnoreCase("o"))==false&&(eleccion1.equalsIgnoreCase("y"))==false) {
			
			eleccion1=sc1.nextLine();
			
		if((eleccion1.equalsIgnoreCase("x"))==false&&(eleccion1.equalsIgnoreCase("o"))==false&&(eleccion1.equalsIgnoreCase("y"))==false) {
				
				System.out.println("Te has equivocado amigo,intentelo de nuevo");}
			
		}
		
		if(eleccion1.equalsIgnoreCase("x")) {
			
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
			System.out.println("Gracias por su compra!");
			
			System.out.println("-" + Cochazo.dime_precio_total() + "$");
			System.out.println("\nSi desea realizar otra compra pulse r, si desea salir, pulse cualquier otra tecla");
			
			Scanner sc11=new Scanner(System.in);
			String respuesta_rpt3=sc11.nextLine();
			
			if(respuesta_rpt3.equalsIgnoreCase("r")) {
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
			
		}else {	
			
			repetir_todo=false;
			repetir_y=false;
			
		}
			
		}else if(eleccion1.equalsIgnoreCase("o")) {
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
			
			System.out.println("Has elegido la opcion: Coche Personalizado");			
			System.out.println("Comencemos con el color:");
			System.out.println("Rojo mate: 1600$ (escriba rojo mate)");
			System.out.println("Blanco brillante: 1800$ (escriba blanco)");
			System.out.println("Negro brillante con calaveras: 1900$ (escriba negro)");
			System.out.println("Rojo fuego: 2000$ (escriba fuego)");
			
			while(repetir1==true) {
				
				Scanner sc2=new Scanner(System.in);
				
				String eleccion_color=sc2.nextLine();
				
			if((eleccion_color.equalsIgnoreCase("rojo mate")==false)&&(eleccion_color.equalsIgnoreCase("blanco")==false)&&(eleccion_color.equalsIgnoreCase("negro")==false)&&(eleccion_color.equalsIgnoreCase("fuego")==false)) {
			
				System.out.println("Nombre no válido, porfavor, pruebe de nuevo");
               	
			}else {
				
				repetir1=false;
				
				Cochazo.set_color(eleccion_color);
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
			}
			}
			
            System.out.println("Ahora, elija motor:");
			System.out.println("Sencillo: 4000$ (escriba sencillo)");
			System.out.println("Avanzado: 5000$ (escriba avanzado)");
			System.out.println("Potente: 7000$ (escriba potente)");
			System.out.println("Infernal: 10000$ (escriba infernal)");
			
			while (repetir2==true) {
			
			Scanner sc3=new Scanner(System.in);
			
			String eleccion_motor=sc3.nextLine();
			
			if ((eleccion_motor.equalsIgnoreCase("Sencillo")==false)&&(eleccion_motor.equalsIgnoreCase("Avanzado")==false)&&(eleccion_motor.equalsIgnoreCase("Potente")==false)&&(eleccion_motor.equalsIgnoreCase("Infernal")==false)) {
			
				System.out.println("Nombre no válido, porfavor, pruebe de nuevo");

			}else {
				
				repetir2=false;
				
				Cochazo.set_motor(eleccion_motor);
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
			}
			}
			
            System.out.println("Ahora, elija tubo de escape:");
			System.out.println("Pequeño: 1400$ (escriba pequeño)");
			System.out.println("Mediano: 2100$ (escriba mediano)");
			System.out.println("Grande: 2500$ (escriba grande)");
			System.out.println("Triple: 3200$ (escriba triple)");
			
			while (repetir3==true) {
				
				Scanner sc4=new Scanner(System.in);
				
				String eleccion_tubo_escape=sc4.nextLine();
			
			if ((eleccion_tubo_escape.equalsIgnoreCase("Pequeño")==false)&&(eleccion_tubo_escape.equalsIgnoreCase("Mediano")==false)&&(eleccion_tubo_escape.equalsIgnoreCase("Grande")==false)&&(eleccion_tubo_escape.equalsIgnoreCase("Triple")==false)) {
			
				System.out.println("Nombre no válido, porfavor, pruebe de nuevo");

			}else {
				repetir3=false;
				
				Cochazo.set_tubo_escape(eleccion_tubo_escape);
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
			}
			}

            System.out.println("Ahora, elija alerones:");
			System.out.println("Sin alerones: 0$ (escriba sin)");
			System.out.println("Con alerones : 1500$ (escriba con)");
			
			while (repetir4==true) {
				
				Scanner sc5=new Scanner(System.in);
				
				String eleccion_alerones=sc5.nextLine();
				
			if ((eleccion_alerones.equalsIgnoreCase("Sin")==false)&&(eleccion_alerones.equalsIgnoreCase("Con")==false)){
			
				System.out.println("Nombre no válido, porfavor, pruebe de nuevo");

			}else {
				
				repetir4=false;
				
				Cochazo.set_alerones(eleccion_alerones);
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
			}
			}
			
            System.out.println("Ahora, elija amortiguadores:");
			System.out.println("Sin amortiguadores: 0$ (escriba sin amortiguadores)");
			System.out.println("Amortiguadores duros: 800$ (escriba duros)");
			System.out.println("Amortiguadores suaves: 1300$ (escriba suaves)");
			System.out.println("Amortiguadores Almohada: 300$ (escriba almohada)");
			
			while (repetir5==true) {
				
				Scanner sc6=new Scanner(System.in);
				
				String eleccion_amortiguadores=sc6.nextLine();
			
			if ((eleccion_amortiguadores.equalsIgnoreCase("Sin amortiguadores")==false)&&(eleccion_amortiguadores.equalsIgnoreCase("Duros")==false)&&(eleccion_amortiguadores.equalsIgnoreCase("Suaves")==false)&&(eleccion_amortiguadores.equalsIgnoreCase("Almohada")==false)) {
			
				System.out.println("Nombre no válido, porfavor, pruebe de nuevo");

			}else {
				
				repetir5=false;
				
				Cochazo.set_amortiguadores(eleccion_amortiguadores);
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
			}
			}
			final int precio_final=Cochazo.dime_precio_alerones()+Cochazo.dime_precio_amortiguadores()+Cochazo.dime_precio_color()+Cochazo.dime_precio_motor()+Cochazo.dime_precio_tubo_escape();
			System.out.println("El coche que ha personlizado tiene:");
			System.out.println("Color: "+ Cochazo.dime_color());
			System.out.println("Motor: "+ Cochazo.dime_motor());
			System.out.println("Tubo de escape: "+ Cochazo.dime_tubo_escape());
			System.out.println("Alerones: "+ Cochazo.dime_alerones() + " alerones");
			System.out.println("Amortiguadores: "+ Cochazo.dime_amortiguadores());
			System.out.println("\nPRECIO: " + precio_final + "$");
			
			System.out.println("\nSi desea confirmar su compra, escriba 'confirmar'. ");
			System.out.println("En caso de que quiera volver a empezar, escriba 'v'.");
			
			while (repetir6==true) {
				
				Scanner sctotal1=new Scanner(System.in);
				String repetir_todo_o=sctotal1.nextLine();
			
				if ((repetir_todo_o.equalsIgnoreCase("Confirmar")==false)&&(repetir_todo_o.equalsIgnoreCase("v"))==false){
					
					System.out.println("Nombre no valido, porfavor, intentelo de nuevo.");
					
				}else {
					
					repetir6=false;
					
					if(repetir_todo_o.equalsIgnoreCase("Confirmar")) {
						
						System.out.println("-" + precio_final + "$");
						System.out.println("Gracias por su compra!");
						
						repetir_todo=false;
						
						System.out.println("\nSi desea realizar otra compra pulse r, si desea salir, pulse cualquier otra tecla");
						
						Scanner sc8=new Scanner(System.in);
						String respuesta_rpt1=sc8.nextLine();
						
						if(respuesta_rpt1.equalsIgnoreCase("r")) {
							
							try {
					            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
					        } catch (Exception e) {
					            /*No hacer nada*/
					        }
							
							Comprar_coche.main(null);
						
					}else {	
						
						repetir_todo=false;
						
					}
			
					}else {	

						try {
				            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
				        } catch (Exception e) {
				            /*No hacer nada*/
				        }
						
						Comprar_coche.main(null);
				
					}
					
				}
			}
				
		}else if(eleccion1.equalsIgnoreCase("y")) {
			
			while(repetir_y==true) {
			
			try {
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } catch (Exception e) {
	            /*No hacer nada*/
	        }
			
			System.out.println("Al pulsar enter se generara un coche con propiedades aleatorias.");
			
			Scanner sc8=new Scanner(System.in);
			
			String nada=sc8.nextLine();

			int numr1=(int)Math.round(Math.random()*100);
			int numr2=(int)Math.round(Math.random()*100);
			int numr3=(int)Math.round(Math.random()*100);
			int numr4=(int)Math.round(Math.random()*100);
			int numr5=(int)Math.round(Math.random()*100);
			
			if(numr1<=25) {
				
				Cochazo.set_color("Rojo");
				
			}else if(numr1<=50) {
				
				Cochazo.set_color("Blanco");
				
			}else if(numr1<=75) {
				
				Cochazo.set_color("Negro");
				
			}else {
				
				Cochazo.set_color("Fuego");
				
			}
			
			if(numr2<=25) {
				
				Cochazo.set_motor("Sencillo");
				
			}else if(numr2<=50) {
				
				Cochazo.set_motor("Avanzado");
				
			}else if(numr2<=75) {
				
				Cochazo.set_motor("Potente");
				
			}else {
				
				Cochazo.set_motor("Infernal");
				
			}
			
			if(numr3<=25) {
				
				Cochazo.set_tubo_escape("Pequeño");
				
			}else if(numr3<=50) {
				
				Cochazo.set_tubo_escape("Mediano");
				
			}else if(numr3<=75) {
				
				Cochazo.set_tubo_escape("Grande");
				
			}else {
				
				Cochazo.set_tubo_escape("Triple");
				
			}
			
			if(numr4<=50) {
				
				Cochazo.set_alerones("Sin");
				
			}else{
				
				Cochazo.set_alerones("Con");
				
			}
			
			if(numr5<=25) {
				
				Cochazo.set_amortiguadores("Sin amortiguadores");
				
			}else if(numr5<=50) {
				
				Cochazo.set_amortiguadores("Duros");
				
			}else if(numr5<=75) {
				
				Cochazo.set_amortiguadores("Suaves");
				
			}else {
				
				Cochazo.set_amortiguadores("Almohada");
				
			}
			
			final int precio_final=Cochazo.dime_precio_alerones()+Cochazo.dime_precio_amortiguadores()+Cochazo.dime_precio_color()+Cochazo.dime_precio_motor()+Cochazo.dime_precio_tubo_escape();
			System.out.println("El coche aleatorio tiene:");
			System.out.println("Color: "+ Cochazo.dime_color());
			System.out.println("Motor: "+ Cochazo.dime_motor());
			System.out.println("Tubo de escape: "+ Cochazo.dime_tubo_escape());
			System.out.println("Alerones: "+ Cochazo.dime_alerones());
			System.out.println("Amortiguadores: "+ Cochazo.dime_amortiguadores());
			System.out.println("\nPRECIO: " + precio_final + "$");
			
			System.out.println("\nSi desea comprar este coche, pulse c.Si desea volver a empezar, pulse cualquier otra tecla");
			
			Scanner sc9=new Scanner(System.in);
			String respuesta_y=sc9.nextLine();
			
			if(respuesta_y.equalsIgnoreCase("c")) {
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
				System.out.println("-" + precio_final + "$");
				System.out.println("Gracias por su compra!");
				
				repetir_todo=false;
				repetir_y=false;
				
				System.out.println("\nSi desea realizar otra compra pulse r, si desea salir, pulse cualquier otra tecla");
				
				Scanner sc10=new Scanner(System.in);
				String respuesta_rpt2=sc10.nextLine();
				
				if(respuesta_rpt2.equalsIgnoreCase("r")) {
					
					try {
			            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			        } catch (Exception e) {
			            /*No hacer nada*/
			        }
					
					Comprar_coche.main(null);
				
			}else {	
				
				repetir_todo=false;
				
			}
				
			}else {
				
				try {
		            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
		        } catch (Exception e) {
		            /*No hacer nada*/
		        }
				
				Comprar_coche.main(null);
				
			}
	
		}
		}
		
	}
	
	}
}	