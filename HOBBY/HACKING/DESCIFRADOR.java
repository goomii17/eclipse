package HACKING;

import java.time.*;
import java.util.*;

public class DESCIFRADOR {
	
	public static void main (String[] args) {
		
		boolean todo=true;
		
		while(todo) {
		
		String contraseñareal=null;
		String contraseña_adivinada=null;
		boolean nomas=true;
		boolean adivinada=false;
		long permutaciones=0;
		
		while(nomas==true) {
			
		System.out.println("\n  Introduce contraseña:          (Max 5 digitos)");
		
		Scanner sc1=new Scanner(System.in);
		contraseñareal=sc1.nextLine();              //Almaceno la contraseña real 
		
		if((contraseñareal.length()>5)==false) {break;}
		
		System.out.println("\n  He dicho menos de 5 digitos melon. Prueba otra vez:");
		
		}
		
		digito1 d1=new digito1(contraseñareal); 
		digito2 d2=new digito2(contraseñareal);     //Instancio los hilos pasandoles la contraseñareal
		digito3 d3=new digito3(contraseñareal);
		digito4 d4=new digito4(contraseñareal);
		digito4_1 d4_1=new digito4_1(contraseñareal);
		digito5 d5=new digito5(contraseñareal);
		digito5_1 d5_1=new digito5_1(contraseñareal);
		digito5_2 d5_2=new digito5_2(contraseñareal);
		
		cronometro crono=new cronometro();
		
		crono.set_inicio();                             //Empiezo el cronometro
		
		d1.start();
		d2.start();                                 //Comienzo a buscar
		d3.start();
		d4.start();
		d4_1.start();
		d5.start();
		d5_1.start();
		d5_2.start();
		
		
		for(int i=0;i>-1;i++){
			
			try {Thread.sleep(0,1);}catch(Exception e) {}
			
			if(d1.dime_contraseña()==null) {
				
				
				
			}else if(d1.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d1.dime_contraseña();
				adivinada=true;
				break;
				
			}
			
			if(d2.dime_contraseña()==null) {
				
				
				
			}else if(d2.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d2.dime_contraseña();
				adivinada=true;
				break;
				
			}
			
			if(d3.dime_contraseña()==null) {
				
				
				
			}else if(d3.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d3.dime_contraseña();
				adivinada=true;
				break;
			}
			
			if(d4.dime_contraseña()==null) {
				
				
				
			}else if(d4.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d4.dime_contraseña();
				adivinada=true;
				break;
			}
			
			if(d4_1.dime_contraseña()==null) {
				
				
				
			}else if(d4_1.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d4_1.dime_contraseña();
				adivinada=true;
				break;
			}
			
			if(d5.dime_contraseña()==null) {
				
				
				
			}else if(d5.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d5.dime_contraseña();
				adivinada=true;
				break;
			}
			
			if(d5_1.dime_contraseña()==null) {
				
				
				
			}else if(d5_1.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d5_1.dime_contraseña();
				adivinada=true;
				break;
			}
			
			if(d5_2.dime_contraseña()==null) {
				
				
				
			}else if(d5_2.dime_contraseña().equals(contraseñareal)) {
				
				contraseña_adivinada=d5_2.dime_contraseña();
				adivinada=true;
				break;
			}
			
		}
		
		if(adivinada) {
			
			try {
				d1.interrupt();
				d2.interrupt();
				d3.interrupt();
				d4.interrupt();
				d4_1.interrupt();
				d5.interrupt();
				d5_1.interrupt();
				d5_2.interrupt();
			crono.set_fin();
			}catch(Exception e){
			}
			
			permutaciones=d1.dime_permutaciones()+d2.dime_permutaciones()+d3.dime_permutaciones()+d4.dime_permutaciones()+d4_1.dime_permutaciones()+d5.dime_permutaciones()+d5_1.dime_permutaciones()+d5_2.dime_permutaciones();
			
			System.out.println("\n La contraseña es: " + contraseña_adivinada);
			
			System.out.println("Tiempo tardado: "+crono.dime_tiempo());
			
			System.out.println("\n  Velocidad de commutacion: " + (int) (permutaciones/((double)crono.dime_segundos())) + " combinaciones/segundo");
			
		}else {
			
			System.out.println("\n Fallo al adivinar");
			
		}
		
		d1.reiniciar_hilo();
		d1.reiniciar_permutaciones();
		d2.reiniciar_hilo();
		d2.reiniciar_permutaciones();
		d3.reiniciar_hilo();
		d3.reiniciar_permutaciones();
		d4.reiniciar_hilo();
		d4.reiniciar_permutaciones();
		d4_1.reiniciar_hilo();
		d4_1.reiniciar_permutaciones();
		d5.reiniciar_hilo();
		d5.reiniciar_permutaciones();
		d5_1.reiniciar_hilo();
		d5_1.reiniciar_permutaciones();
		d5_2.reiniciar_hilo();
		d5_2.reiniciar_permutaciones();

		}
		
	}
	
}
class cronometro {

	static LocalDateTime i;
	static LocalDateTime j;
	static String tiempo="d";

	public cronometro() {
		
	}

	public void set_inicio(){
		
		i=LocalDateTime.now();		
		
	}
	
	public void set_fin(){
		
		j=LocalDateTime.now();		
		
	}
	public long dime_segundos() {	
		
		long seg_tot=(long)Duration.between(i, j).toSeconds();
		
		return seg_tot;
		
	}
	public String dime_tiempo() {
		
		if(j.getDayOfMonth()-i.getDayOfMonth()==0) {
		
		int horas=j.minusHours(i.getHour()).getHour();
		int mins=j.minusMinutes(i.getMinute()).getMinute();
		double segs=j.minusSeconds(i.getSecond()).getSecond()+(double)j.minusNanos(i.getNano()).getNano()/1000000000;
		
		String tiempo=horas+" hrs : "+mins+" mins : "+segs+" segs";
		
		this.tiempo=tiempo;
		
		}else {
			
			LocalDateTime dia=i.plusDays(1).minusHours(i.getHour()).minusMinutes(i.getMinute()).minusSeconds(i.getSecond()).minusNanos(i.getNano());
			
			LocalDateTime resta=dia.minusHours(i.getHour()).minusMinutes(i.getMinute()).minusSeconds(i.getSecond()).minusNanos(i.getNano());
			
			LocalDateTime suma=dia.plusHours(j.getHour()).plusMinutes(j.getMinute()).plusSeconds(j.getSecond()).plusNanos(j.getNano());
			
			int days=j.getDayOfMonth()-i.getDayOfMonth()-1;
			int horas1=resta.getHour();
			int mins1=resta.getMinute();
			double segs1=resta.getSecond()+(double)resta.getNano()/1000000000;
			
			int horas2=suma.getHour();
			int mins2=suma.getMinute();
			double segs2=suma.getSecond()+(double)suma.getNano()/1000000000;
			
			int horas=horas1+horas2;
			int mins=mins1+mins2;
			double segs=segs1+segs2;

			String tiempo=days+" dias : "+horas+" hrs : "+mins+" mins : "+segs+" segs";
			
			this.tiempo=tiempo;
			
		}
		
		return tiempo;
		
	}
	
}
