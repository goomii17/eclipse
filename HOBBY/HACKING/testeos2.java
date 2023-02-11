package HACKING;

public class testeos2 {

	public static void main(String[] args) {

		cronometro_antiquado crono=new cronometro_antiquado();
		crono.start();
		
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	    long t_e_decimas=crono.dime_tiempo();
	    
	    System.out.println(t_e_decimas);
	    
	    System.exit(0);
	    
	}

}
