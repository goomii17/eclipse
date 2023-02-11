package HACKING;

public class testeos {

	public static void main(String[] args) {

		int horas=(50/10)/3600;
		double horasst=(((double)(500/10))/3600);
		int minutos=(int) ((horasst-horas)*60);
		double minutosst=(horasst-horas)*60;
		int segundos=(int) ((minutosst-minutos)*60);
		double segundosst=(minutosst-minutos)*60;
		int milis=(int) ((segundosst-segundos)*1000);
		double milisst=(segundosst-segundos)*1000;
		int nanos=(int) ((milisst-milis)*1000);
		double nanosst=(milisst-milis)*1000;
		
		System.out.println(horas);
		System.out.println(horasst);
		System.out.println(minutos);
		System.out.println(minutosst);
		System.out.println(segundos);
		System.out.println(segundosst);
		System.out.println(milis);
		System.out.println(milisst);
		
	}
}
