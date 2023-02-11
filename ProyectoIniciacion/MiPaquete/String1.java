package MiPaquete;

public class String1 {

	public static void main(java.lang.String[] args) {	
		
		java.lang.String nombre="Sergio";
		
		int numero_letras=(nombre.length());
		
		System.out.println("Mi nombre es " + nombre);
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		
		System.out.println("La primera letra de mi nombre es la " + nombre.charAt(0) +".");
		
		System.out.println("La ultima letra de mi nombre es la " + nombre.charAt(numero_letras-1));
		
	}

}