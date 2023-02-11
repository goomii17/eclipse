package Retos2;

import java.util.ArrayList;

import Aplicable.CRONO;

public class Tetris {

	public static void main(String[] args) {
		
		CRONO c=new CRONO();
		
		String[] l=new String[8];
		
		l[0]="00000000";
		l[1]="00000000";
		l[2]="00000000";
		l[3]="00000000";
		l[4]="00000000";   //CEROS 81
		l[5]="00000000";
		l[6]="00000000";
		l[7]="00000000";
		
		char[][] tablero=dime_tablero(l);
		
		ArrayList<char[][]> figuras=dimeFiguras(false);
		
		c.set_inicio();
		
		solveTetris(tablero, figuras);
		
		c.set_fin();
	
		System.out.println(c.dime_tiempo());
		
	}
	
	static ArrayList<char[][]> soluciones=new ArrayList();
	
	static long n=0;
	
	public static void solveTetris(char[][] tablero,ArrayList<char[][]> figuras) {
		
		if(n<1) {
			
			if(dimeHuecos(tablero)==0) {
				
				System.out.println("Solucion: "+(n+1));
				imprimir(tablero);
				n++;
				
			}else if(!mal(tablero)) {
				
				ArrayList<String> ramas=dimeRamas(tablero, figuras);
				
				for (int i = 0; i < ramas.size(); i++) {
					
					char c=ramas.get(i).charAt(0);
					
					String posicionFig=ramas.get(i);
					
					if(!esta(tablero, c)) {
						
						tablero=meteFigura(tablero, posicionFig, c);
						
						solveTetris(tablero, figuras);
						
						tablero=quitaFigura(tablero, c);
						
					}
					
				}
				
			}
			
		}
		
	}

	public static boolean mal(char[][] tablero) {
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero[0].length; j++) {
				
				if(tablero[i][j]=='0') {
					
					if(ceroSolo(tablero, i, j)) {
						
						return true;
						
					}
					
				}
				
			}
			
		}
		
		return false;
		
	}
	
	public static boolean ceroSolo(char[][] tablero,int f,int c) {
		
		int n=0;
		
		if(f-1>=0) {
			
			if(tablero[f-1][c]!='0') {
				
				n++;
				
			}
			
		}else {
			
			n++;
			
		}
		
		if(f+1<tablero.length) {
			
			if(tablero[f+1][c]!='0') {
				
				n++;
				
			}
			
		}else {
			
			n++;
			
		}
		
		if(c-1>=0) {
			
			if(tablero[f][c-1]!='0') {
				
				n++;
				
			}
			
		}else {
			
			n++;
			
		}
		
		if(c+1<tablero.length) {
			
			if(tablero[f][c+1]!='0') {
				
				n++;
				
			}
			
		}else {
			
			n++;
			
		}
		
		if(n<4) {
			
			return false;
			
		}
		
		return true;
		
	}
	
	public static ArrayList<String> dimeRamas(char[][] tablero,ArrayList<char[][]> figuras) {
		
		ArrayList<String> s=new ArrayList();
		
		for (int a = 0; a < figuras.size(); a++) {
			
			boolean found=false;
			
			for (int f = 0; f < tablero.length; f++) {
				
				for (int c = 0; c < tablero[0].length; c++) {
					
					char ch = 0;
					
					for (int i = 0; i < figuras.get(a)[0].length; i++) {
						
						if(figuras.get(a)[0][i]!='0') {
							
							ch=figuras.get(a)[0][i];
							
							break;
							
						}
						
					}
					
					String str="";
					
					str=str+ch;
					
					boolean t=false;
					
					for (int i = f; i < f+figuras.get(a).length; i++) {
						
						for (int j = c; j < c+figuras.get(a)[0].length; j++) {
							
							try {
								
								if(figuras.get(a)[i-f][j-c]!='0'&&tablero[i][j]=='0') {
									
									str=str+Integer.toString(i)+Integer.toString(j);
									
								}
								
							} catch (Exception e) {
								t=true;
								str="";
								break;
							}
							
						}
						if(t) {break;}
					}
					
					if(str.length()==(dimeUnos(figuras.get(a))*2)+1) {
						
						s.add(str);
						
						found=true;
						
						break;
						
					}
					
				}
				if(found) {break;}
			}
			
		}
		
		return s;
		
		
	}

	public static char[][] meteFigura(char[][] tablero,String s,char n) {
		
		for (int i = 1; i < s.length(); i+=2) {
			
			tablero[Integer.parseInt(Character.toString(s.charAt(i)))][Integer.parseInt(Character.toString(s.charAt(i+1)))]=n;
			
		}
		
		return tablero;
		
	}

	public static char[][] quitaFigura(char[][] tablero,char c) {
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero[0].length; j++) {
				
				if(tablero[i][j]==c) {
					
					tablero[i][j]='0';
					
				}
				
			}
			
		}
		
		return tablero;
		
	}

	public static ArrayList<char[][]> dimeFiguras(boolean al){
		
		char[][] figura1={{'1','1'},
                          {'1','0'},		         
                          {'1','1'}};
		 
	    char[][] figura2={{'0','2','2','2'},
                          {'2','2','0','0'}};
		
	    char[][] figura3={{'0','3','3'},
                          {'3','3','0'},
                          {'0','3','0'}};
	    
     	char[][] figura4=new char[5][1];

	    for (int i = 0; i < figura4.length; i++) {
		
		figura4[i][0]='4';
		
	    }
	    
	    char[][] figura5={{'0','5','0'},
                          {'5','5','5'},
                          {'0','5','0'}};
	    
	    char[][] figura6={{'0','6'},
                          {'0','6'},
                          {'0','6'},
                          {'6','6'}};
	    
	    char[][] figura7={{'7','7','7'},
                          {'7','7','0'}};
	    
		char[][] figura8={{'0','8','8'},
                          {'8','8','0'},		         
                          {'8','0','0'}};
	    
	    char[][] figura9={{'0','0','9'},
                          {'9','9','9'},
                          {'9','0','0'}};

	    char[][] figura10={{'0','0','A'},
                           {'A','A','A'},
                           {'0','0','A'}};
	         
		char[][] figura11={{'B','B'},
                           {'B','B'}};

	    char[][] figura12={{'0','0','C'},
	                       {'0','0','C'},
	                       {'C','C','C'}};
   
	    char[][] figura13={{'0','D','0','0'},
                           {'D','D','D','D'}};
	    
	    ArrayList<char[][]> fgs=new ArrayList();

		fgs.add(figura1);
		fgs.add(figura2);
		fgs.add(figura3);
		fgs.add(figura4);
		fgs.add(figura5);
		fgs.add(figura6);
		fgs.add(figura7);
		fgs.add(figura8);
		fgs.add(figura9);
		fgs.add(figura10);
		fgs.add(figura11);
		fgs.add(figura12);
		fgs.add(figura13);

		ArrayList<char[][]> figuras=new ArrayList();
		
		ArrayList<Integer> poss=dimeAleatorios();
		
		if(al) {
			
			for (int i = 0; i < fgs.size(); i++) {
				
				ArrayList<char[][]> a=dimeGemelos(fgs.get(poss.get(i)));
				
				for (int j = 0; j < a.size(); j++) {
					
					figuras.add(a.get(j));
					
				}
				
			}
			
		}else {
			
			for (int i = 0; i < fgs.size(); i++) {
				
				ArrayList<char[][]> a=dimeGemelos(fgs.get(i));
				
				for (int j = 0; j < a.size(); j++) {
					
					figuras.add(a.get(j));
					
				}
				
			}
			
		}
		
		imprimeArray(figuras);
		
		return figuras;
		
	}

	public static ArrayList<Integer> dimeAleatorios(){
		
		ArrayList<Integer> poss=new ArrayList();
		
		boolean t=true;
		
		while(t) {
			
			int n=(int) (Math.random()*13);
			
			boolean a=true;
			
			for (int i = 0; i < poss.size(); i++) {
				
				if(n==poss.get(i)) {
					
					a=false;
					break;
					
				}
				
			}
			
			if(a) {
				
				poss.add(n);
				
			}
			
			if(poss.size()==13) {
				
				break;
				
			}
			
		}
		
		return poss;
		
	}
	
	public static ArrayList<char[][]> dimeGemelos(char[][] figura){
		
		ArrayList<char[][]> s=new ArrayList();
		s.add(figura);
		char[][] f=figura;
		
		for (int i = 0; i < 4; i++) {
			
			boolean t0=true;
			f=gira(f);
			for (int j = 0; j < s.size(); j++) {
				
				if(sonIguales(s.get(j), f)) {
					
					t0=false;
					break;
					
				}
				
			}
			
			if(t0) {
				
				s.add(f);
				
			}
			
		}
		
		f=torna(figura);
		boolean t=true;
		for (int i = 0; i < s.size(); i++) {
			
			if(sonIguales(f, s.get(i))) {
				
				t=false;
				break;
				
			}
			
		}
		
		if(t) {
			
			s.add(f);
			
		}
		
		for (int i = 0; i < 4; i++) {
			
			boolean t1=true;
			f=gira(f);
			for (int j = 0; j < s.size(); j++) {
				
				if(sonIguales(s.get(j), f)) {
					
					t1=false;
					break;
					
				}
				
			}
			
			if(t1) {
				
				s.add(f);
				
			}
			
		}
		
		return s;
		
	}
	
	public static char[][] gira(char[][] figura){
		
		ArrayList<String> lines=new ArrayList();
		
		for (int j = 0; j < figura[0].length; j++) {
			String str="";
			for (int i = figura.length-1; i >=0 ; i--) {
				
				str=str+figura[i][j];
				
			}
			lines.add(str);
		}
		
		return dimeFigura(lines);
		
	}

	public static char[][] torna(char[][] figura){
		
		ArrayList<String> lines=new ArrayList();
		
		for (int j = 0; j < figura.length; j++) {
			String str="";
			for (int i = figura[0].length-1; i >=0 ; i--) {
				
				str=str+figura[j][i];
				
			}
			lines.add(str);
		}
		
		return dimeFigura(lines);
		
	}
	
	public static boolean esta(char[][] tablero, char c) {
		
		for (int i = 0; i < tablero.length; i++) {
			
			for (int j = 0; j < tablero[0].length; j++) {
				
				if(tablero[i][j]==c) {
					
					return true;
					
				}
				
			}
			
		}
		return false;
	}

	public static boolean estaSol(ArrayList<char[][]> a,char[][] f2) {
		
		for (int i = 0; i < a.size(); i++) {
			
			if(sonIguales(f2, a.get(i))) {
				
				return true;
				
			}
			
		}
		
		return false;
		
	}
	
	public static boolean sonIguales(char[][] f1,char[][] f2) {
		
		if(f1.length==f2.length&&f1[0].length==f2[0].length) {
			
			for (int i = 0; i < f1.length; i++) {
				
				for (int j = 0; j < f1[0].length; j++) {
					
					if(f1[i][j]!=f2[i][j]) {
						
						return false;
						
					}
					
				}
				
			}
			return true;
		}else {
			
			return false;
			
		}
		
	}
	
	public static char[][] dime_tablero(String[] l){
		
		char[][] t=new char[l.length][l[0].length()];
		
		for (int i = 0; i < l.length; i++) {
			
			String fila=l[i];
			
			for (int j = 0; j < l[0].length(); j++) {
				
				t[i][j]=fila.charAt(j);
				
			}
			
		}
		
		return t;
		
	}

	public static int dimeUnos(char[][] figura) {
		int c=0;
		for (int i = 0; i < figura.length; i++) {
			
			for (int j = 0; j < figura[0].length; j++) {
				
				if(figura[i][j]!='0') {
					
					c++;
					
				}
				
			}
			
		}
		
		return c;
		
	}

	public static int dimeHuecos(char[][] figura) {
		int c=0;
		for (int i = 0; i < figura.length; i++) {
			
			for (int j = 0; j < figura[0].length; j++) {
				
				if(figura[i][j]=='0') {
					
					c++;
					
				}
				
			}
			
		}
		
		return c;
		
	}
	
	public static char[][] dimeFigura(ArrayList<String> s){
		
		char[][] f=new char[s.size()][s.get(0).length()];
		
		for (int i = 0; i < s.size(); i++) {
			
			for (int j = 0; j < s.get(i).length(); j++) {
				
				f[i][j]=s.get(i).charAt(j);
				
			}
			
		}
		
		return f;
		
	}

	public static void imprimir(char[][] f) {
		
		for (int i = 0; i < f.length; i++) {
			
			for (int j = 0; j < f[0].length; j++) {
				
				System.out.print(f[i][j]+" ");
				
			}
			System.out.println();
		}
		System.out.println();
		
	}
	
	public static void imprimeArray(ArrayList<char[][]> c) {
		
		for (int i = 0; i < c.size(); i++) {
			
			imprimir(c.get(i));
			
		}
		
		System.out.println();
		
	}
}
