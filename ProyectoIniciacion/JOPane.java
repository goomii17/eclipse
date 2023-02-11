package MiPaquete;
import javax.swing.*;
import java.util.*;
import java.awt.*;
public class JOPane {

	public static void main(String[] args) {
		
		miVentana ventana1=new miVentana();

		
	}

}

class miVentana extends JFrame{
	
	public miVentana(){
		
		Toolkit mipantalla=Toolkit.getDefaultToolkit();
		Dimension tamañop=mipantalla.getScreenSize();
		
		setSize(tamañop.width/2,tamañop.height/2);
		setLocation(tamañop.width/4,tamañop.height/4);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}