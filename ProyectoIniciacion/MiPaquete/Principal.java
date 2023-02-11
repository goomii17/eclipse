package MiPaquete;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
        Array_caracteres[] digito=new Array_caracteres[10];
        
        digito[0]=new Array_caracteres('0');


        System.out.println(digito[0].dime_caracter());
		
        
		Clase_contraseñareal ccr=new Clase_contraseñareal();
		
		System.out.println(" Introduzca la contraseña:");
		
		Scanner sc1=new Scanner(System.in);
		
		ccr.set_cr(sc1.nextLine());
		
	}

}
