package fisics;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

public class ciclotron{

	public static void main(String[] args) {
		
		long alternaciones,velocidad;
		long alt=0;
		double campo,carga,masa,denominador,numerador,radio;
		
		CRONO cr=new CRONO();
		
		System.out.println("Si la particula es un proton esrciba proton, si es un electron, electron\n y si es otra pulse cualquier tecla");
		
		Scanner eop=new Scanner(System.in);
		
		String respuesta=eop.nextLine();
		
		if(respuesta.contentEquals("proton")) {
			
			masa=1.6749E-27;
			carga=1.6E-19;
			
		}else if(respuesta.equalsIgnoreCase("electron")) {
			
			masa=9.1E-31;
			carga=1.6E-19;
			
		}else {
			
			System.out.println("Introduce carga en C: ");
			
			Scanner sc1=new Scanner(System.in);
			
			carga=sc1.nextDouble()*1e-19;
			
			System.out.println("Introduce masa en kg: p+=1,6E-27, e-=9,1E-31)");
			
			Scanner sc2=new Scanner(System.in);
			
			masa=sc2.nextDouble()*1e-31;
			
		}
		
		System.out.println("Introduce campo en T: ");
		
		Scanner sc3=new Scanner(System.in);

		campo=sc3.nextDouble();
		
		System.out.println("Introduce radio del ciclotron en m: ");
		
		Scanner sc4=new Scanner(System.in);

		radio=sc3.nextDouble();
		
		numerador=(carga*campo);
		denominador=(masa*Math.PI);
		alternaciones=Math.round(numerador/denominador);
		velocidad=(long) ((numerador*radio)/masa);

		cr.set_inicio();
		
		for (int i = 0; i < alternaciones; i++) {
			
			alt=alt+1;
			
		}
		
		cr.set_fin();
		
		System.out.println("El tiempo tardado en relizar "+ alt +" alternaciones es: " + (double)cr.dime_nanos()/1000000000+ " segundos");
		System.out.println("para una particula con carga: "+carga+" , masa: "+masa+" y un campo magnetico de "+campo+" Teslas.");
		if(velocidad<3E8) {System.out.println("La velocidad de salida de la particula es: "+ velocidad+ " m/s");}else {
			
			System.out.println("Te has pasado my friend, has superado a C ");
			
		}
		
		System.out.println("El tiempo esperado es 1 segundo");

	}
	
}

class CRONO {

	static LocalDateTime i;
	static LocalDateTime j;
	static String tiempo="d";

	public CRONO() {
		
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
	public long dime_nanos() {	
		
		long  nan_tot=(long)Duration.between(i, j).toNanos();
		
		return nan_tot;
		
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
