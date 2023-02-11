package Aplicable;
import java.time.*;
public class CRONO {

	static LocalDateTime i;
	static LocalDateTime j;
	static double nanos;
	static String tiempo="";
	
	public void set_inicio(){
		
		i=LocalDateTime.now();		
		
	}
	
	public void set_fin(){
		
		j=LocalDateTime.now();		
		
	}
	public double dime_segs_tot() {
		
		nanos=Duration.between(i, j).toNanos();
		
		return (double)nanos/1000000000;
		
	}
	public String dime_tiempo() {
	
		int horas = 0,mins = 0;
		
		nanos=Duration.between(i, j).toNanos();
		
		double segs=(double)nanos/1000000000;
		
		if(segs>=3600) {
			
			horas=(int) segs/3600;
			
			segs=segs-horas*3600;
			
		}

		if(segs>=60) {
			
			mins=(int) (segs/60);
			
			segs=segs-mins*60;
			
		}
		
		tiempo=horas+" hrs : "+mins+" mins : "+segs+" segs";
				
		return tiempo;
		
	}
	
}