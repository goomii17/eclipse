package HACKING;

public class cronometro_antiquado extends Thread{
	
    public void set_tiempo() {
    	
    	tiempo=0;
    	
    }
	
    private int tiempo=1; 
    
    public void run() {
    	
            for(int i=0; i>-1; i++) {
            	
                    try {
                            Thread.sleep(100);
                    } catch (InterruptedException e) {

                    }
                    
                    tiempo++;
            }
            
    }
    
    public int dime_tiempo() {
    	
            return tiempo;
            
    }
    


}
