package HACKING;

public class digito2 extends Thread{

	static long permutaciones=0;
	static String contraseñareal=null;
	static String contraseña_adivinada=null;
	
	digito2(String contraseñareal){
		
		super();
		
		this.contraseñareal=contraseñareal;
		
	}
	
	public void run() {
		
		String intento=null;
		
       caracteres[] digito=new caracteres[104];
        
       digito[0]=new caracteres('0');
       digito[1]=new caracteres('1');
       digito[2]=new caracteres('2');
       digito[3]=new caracteres('3');
       digito[4]=new caracteres('4');
       digito[5]=new caracteres('5');
       digito[6]=new caracteres('6');
       digito[7]=new caracteres('7');
       digito[8]=new caracteres('8');
       digito[9]=new caracteres('9');
       digito[10]=new caracteres('a');
       digito[11]=new caracteres('b');
       digito[12]=new caracteres('c');
       digito[13]=new caracteres('d');
       digito[14]=new caracteres('e');
       digito[15]=new caracteres('f');
       digito[16]=new caracteres('g');
       digito[17]=new caracteres('h');
       digito[18]=new caracteres('i');
       digito[19]=new caracteres('j');
       digito[20]=new caracteres('k');
       digito[21]=new caracteres('l');
       digito[22]=new caracteres('m');
       digito[23]=new caracteres('n');
       digito[24]=new caracteres('ñ');
       digito[25]=new caracteres('o');
       digito[26]=new caracteres('p');
       digito[27]=new caracteres('q');
       digito[28]=new caracteres('r');
       digito[29]=new caracteres('s');
       digito[30]=new caracteres('t');
       digito[31]=new caracteres('u');
       digito[32]=new caracteres('v');
       digito[33]=new caracteres('w');
       digito[34]=new caracteres('x');
       digito[35]=new caracteres('y');
       digito[36]=new caracteres('z');
       digito[37]=new caracteres('A');
       digito[38]=new caracteres('B');
       digito[39]=new caracteres('C');
       digito[40]=new caracteres('D');
       digito[41]=new caracteres('E');
       digito[42]=new caracteres('F');
       digito[43]=new caracteres('G');
       digito[44]=new caracteres('H');
       digito[45]=new caracteres('I');
       digito[46]=new caracteres('J');
       digito[47]=new caracteres('K');
       digito[48]=new caracteres('L');
       digito[49]=new caracteres('M');
       digito[50]=new caracteres('N');
       digito[51]=new caracteres('Ñ');
       digito[52]=new caracteres('O');
       digito[53]=new caracteres('P');
       digito[54]=new caracteres('Q');
       digito[55]=new caracteres('R');
       digito[56]=new caracteres('S');
       digito[57]=new caracteres('T');
       digito[58]=new caracteres('U');
       digito[59]=new caracteres('V');
       digito[60]=new caracteres('W');
       digito[61]=new caracteres('X');
       digito[62]=new caracteres('Y');
       digito[63]=new caracteres('Z');
       digito[64]=new caracteres(' ');
       digito[65]=new caracteres('<'); 
       digito[66]=new caracteres('>'); 
       digito[67]=new caracteres(','); 
       digito[68]=new caracteres(';'); 
       digito[69]=new caracteres('.'); 
       digito[70]=new caracteres(':'); 
       digito[71]=new caracteres('-'); 
       digito[72]=new caracteres('_');
       digito[73]=new caracteres('´'); 
       digito[74]=new caracteres('¨'); 
       digito[75]=new caracteres('{'); 
       digito[76]=new caracteres('ç'); 
       digito[77]=new caracteres('}'); 
       digito[78]=new caracteres('`');
       digito[79]=new caracteres('^'); 
       digito[80]=new caracteres('['); 
       digito[81]=new caracteres('+'); 
       digito[82]=new caracteres('*'); 
       digito[83]=new caracteres(']'); 
       digito[84]=new caracteres('¡');
       digito[85]=new caracteres('¿'); 
       digito[86]=new caracteres('='); 
       digito[87]=new caracteres(')'); 
       digito[88]=new caracteres('('); 
       digito[89]=new caracteres('/');
       digito[90]=new caracteres('&'); 
       digito[91]=new caracteres('¬'); 
       digito[92]=new caracteres('%'); 
       digito[93]=new caracteres('$');
       digito[94]=new caracteres('~'); 
       digito[95]=new caracteres('·'); 
       digito[96]=new caracteres('#');
       digito[97]=new caracteres('"'); 
       digito[98]=new caracteres('@');
       digito[99]=new caracteres('!'); 
       digito[100]=new caracteres('|');
       digito[101]=new caracteres('º'); 
       digito[102]=new caracteres('ª');
       digito[103]=new caracteres('?');
		

        
		for(int i=0;i<digito.length;i++) {
			
			for(int j=0;j<digito.length;j++) {
			
			intento=Character.toString(digito[i].dime_caracter())+Character.toString(digito[j].dime_caracter());
			
			permutaciones++;
			
			if(intento.equals(contraseñareal)) {

				contraseña_adivinada=intento;
				
				break;
				
			}
			}
		}
		}
	
	public String dime_contraseña() {
		
		return contraseña_adivinada;
		
	}
	
	public long dime_permutaciones() {
		
		return permutaciones;
		
	}
	
	public void reiniciar_permutaciones() {
		
		permutaciones=0;
		
	}
	
	public void reiniciar_hilo() {
		
		contraseña_adivinada=null;
		
	}
	
	
	
}
