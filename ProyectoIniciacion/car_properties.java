package MiPaquete;

public class car_properties {
	
	private String color;
	
	private String motor;
	
	private String tubo_escape;
	
	private String alerones;
	
	private String amortiguadores;
	
    private int precio_color;
	
	private int precio_motor;
	
	private int precio_tubo_escape;
	
	private int precio_alerones;
	
	private int precio_amortiguadores;
	
	private int precio_total;
	
	
	public car_properties() {
		
		color="Rojo mate";
		
		precio_color=1600;
		
		motor="Simple";
		
		precio_motor=4000;
		
		tubo_escape="Pequeño";
		
		precio_tubo_escape=1400;
		
		alerones="Sin alerones";
		
		precio_alerones=0;
		
		amortiguadores="Sin amortiguadores";
		
		precio_amortiguadores=0;
		
		precio_total=precio_color+precio_motor+precio_tubo_escape+precio_alerones+precio_amortiguadores;
		
		
	}
	
	
	public void set_color(String color_cochazo) {

		color=color_cochazo;
		
	}
	public String dime_color(){
		
		return color;
		
	}
	public int dime_precio_color() {
		
		if(color.equalsIgnoreCase("Blanco")) {
			
			precio_color=precio_color+200;
			
			return precio_color=precio_color+200;	
				
			}else if(color.equalsIgnoreCase("Negro")) {
				
				precio_color=precio_color+300;
				
				return precio_color=precio_color+300;
				
			}else if(color.equalsIgnoreCase("Fuego")){
				
				precio_color=precio_color+400;
				
				return precio_color=precio_color+400;
				
			}else return precio_color;				
	}
	public void set_motor(String motor_cochazo) {
		
		motor=motor_cochazo;
		
	}
	public String dime_motor(){
		
		return motor;
		
	}
	public int dime_precio_motor() {
		if(motor.equalsIgnoreCase("Avanzado")) {
			
			precio_motor=precio_motor+1000;
			
			return precio_motor=precio_motor+1000;	
				
			}else if(motor.equalsIgnoreCase("Potente")) {
				
				precio_motor=precio_motor+3000;
				
				return precio_motor=precio_motor+3000;
				
			}else if(motor.equalsIgnoreCase("Infernal")){
				
				precio_motor=precio_motor+6000;
				
				return precio_motor=precio_motor+6000;
				
			}else return precio_motor;
	}
	public void set_tubo_escape(String tubo_escape_cochazo) {
		
		tubo_escape=tubo_escape_cochazo;
		
	}
	public String dime_tubo_escape(){
		
		return tubo_escape;
		
	}
	public int dime_precio_tubo_escape() {
		if(tubo_escape.equalsIgnoreCase("Mediano")) {
			
			precio_tubo_escape=precio_tubo_escape+700;
			
			return precio_tubo_escape=precio_tubo_escape+700;	
				
			}else if(tubo_escape.equalsIgnoreCase("Grande")) {
				
				precio_tubo_escape=precio_tubo_escape+1100;
				
				return precio_tubo_escape=precio_tubo_escape+1100;
				
			}else if(tubo_escape.equalsIgnoreCase("Triple")){
				
				precio_tubo_escape=precio_tubo_escape+1800;
				
				return precio_tubo_escape=precio_tubo_escape+1800;
				
			}else return precio_tubo_escape;
	}
	public void set_alerones(String alerones_cochazo) {
		
		alerones=alerones_cochazo;
		
	}
	public String dime_alerones(){
		
		return alerones;
		
	}
	public int dime_precio_alerones() {
		if(alerones.equalsIgnoreCase("Con")) {
			
			precio_alerones=precio_alerones+1500;
			
			return precio_alerones=precio_alerones+1500;	
				
			}else return precio_alerones;
	}
	public void set_amortiguadores(String amortiguadores_cochazo) {
		
		amortiguadores=amortiguadores_cochazo;
		
	}
	public String dime_amortiguadores(){
		
		return amortiguadores;
		
	}
	public int dime_precio_amortiguadores() {
		if(amortiguadores.equalsIgnoreCase("Duros")) {
			
			precio_amortiguadores=precio_amortiguadores+800;
			
			return precio_amortiguadores=precio_amortiguadores+800;	
				
			}else if(amortiguadores.equalsIgnoreCase("Suaves")) {
				
				precio_amortiguadores=precio_amortiguadores+1300;
				
				return precio_amortiguadores=precio_amortiguadores+1300;
				
			}else if(amortiguadores.equalsIgnoreCase("Almohada")){
				
				precio_amortiguadores=precio_amortiguadores+300;
				
				return precio_amortiguadores=precio_amortiguadores+300;
				
			}else return precio_amortiguadores;
	}
	public int dime_precio_total(){
		
		return precio_total;
		
	}
	
	
}
