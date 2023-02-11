package JuegosDeMesa;
import java.util.concurrent.TimeUnit;
public class TicTacBoom {

	public static void main(String[] args) {
		
		int max=120;
        int min=10;
		long tiempo=Math.round(Math.random()*max);
		int i=0;
		
		if(tiempo<min) {
			
			tiempo=min;
			
		}
		
		while(i<tiempo){
			
			System.out.println("Sonido.start");
			
			for(i=0;i<tiempo;i++) {
				
				try {
					TimeUnit.SECONDS.sleep(1);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
			System.out.println("Sonido.finish");
			
			System.out.println("Sonido.boom");
			
		}
		
	}

}
