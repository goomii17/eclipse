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
		Dimension tama�op=mipantalla.getScreenSize();
		
		setSize(tama�op.width/2,tama�op.height/2);
		setLocation(tama�op.width/4,tama�op.height/4);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
	}

}