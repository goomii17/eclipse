package MiPaquete;

import javax.swing.*;

public class SegundaInteraccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pregunta1=JOptionPane.showInputDialog("Cansado de estar solo en casa?");
		
		
		String pregunta2=JOptionPane.showInputDialog("Cansado de viciarte al minecra tol dia?");

		String exclamacion=JOptionPane.showInputDialog("No sufras mas, tan solo con escribir tus"
				+ " datos bancarios, recibiras un  "
				+ "viaje a las maldivas con todo pagado , en un espacio libre de coronavirus para que puedas disfrutar al maximo");
		
		System.out.println("Genial, tu datos bancarios son " + exclamacion + " les daremos un buen uso");
	}

}
