package Aplicable;
import java.util.*;
public class prubing {
	static int[][] s;
	public static void main(String Args[]) {

		Scanner sc = new Scanner(System.in);
		
		  String[] lineas=new String[9];

		  lineas[0]="070020050";
		  lineas[1]="003000000";
		  lineas[2]="000030900";
		  lineas[3]="000000000";
		  lineas[4]="400000090";   //MUY DIFICIL 64
		  lineas[5]="000170003";
		  lineas[6]="005000007";
		  lineas[7]="300086000";
		  lineas[8]="001000000";
		  
		  s=convert(lineas);
		  
		  solve();
		
		  System.out.println(dimePos());
		  
	}
	
	public static ArrayList<String> dimePos() {

		  ArrayList<String> pos=new ArrayList();
		  int f=-1;
		  int c=-1;
		  boolean b=false;
		  for (int i = 0; i < s.length; i++) {
			
			  for (int j = 0; j < s.length; j++) {
				
				  if(s[i][j]==0) {
					
					  f=i;
					  c=j;
					  b=true;
					  break;
				  }
				  
			}
			  if(b)break;
		}
		 
		  if(f!=-1&&c!=-1) {
			
			  
		        for (int k=1; k<10; k++) {

			          if (sePuede(s, f, c, k)) {

			            pos.add(f+""+c+""+k);
			            
			          }
			          
			        }
		  
		  }
		  
		  return pos;
		}
	
	public static boolean completed() {

		  for (int i=0; i<9; i++) {

		    for (int j=0; j<9; j++) {

		      if (s[i][j]==0) {

		        return false;
		      }
		    }
		  }
		  return true;
		}
	public static int[][] convert(String[] l) {
		  int[][] s=new int[9][9];
		  for (int i=0; i<9; i++) {

		    for (int j=0; j<9; j++) {

		      s[i][j]=Integer.parseInt(Character.toString(l[i].charAt(j)));
		    }
		  }
		  return s;
		}
	public static void prints() {

		  for (int i=0; i<9; i++) {

		    for (int j=0; j<9; j++) {

		      System.out.print(s[i][j]);
		    }
		    System.out.println();
		  }
		  System.out.println();
		}
	public static boolean sePuede(int[][] s, int f, int c, int n) {
		  //COmprobar fila
		  for (int i=0; i<9; i++) {

		    if (i!=c) {

		      if (s[f][i]==n) {

		        return false;
		      }
		    }
		  }
		  //Comprobar columna
		  for (int i=0; i<9; i++) {

		    if (i!=f) {

		      if (s[i][c]==n) {

		        return false;
		      }
		    }
		  }

		  //Comprobar bloque

		  int bc;
		  int bf;

		  if (c<3) {
		    bc=0;
		  } else if (c<6) {
		    bc=3;
		  } else {

		    bc=6;
		  }

		  if (f<3) {
		    bf=0;
		  } else if (f<6) {
		    bf=3;
		  } else {

		    bf=6;
		  }

		  for (int i=bf; i<bf+3; i++) {

		    for (int j=bc; j<bc+3; j++) {

		      if (!(i==f&&j==c)) {

		        if (s[i][j]==n) {

		          return false;
		        }
		      }
		    }
		  }
		  return true;
		}
	public static void solve() {
		
		  if (completed()) {

		    prints();
		    
		  } else {

		    ArrayList<String> pos=dimePos();

		    for (int i=0; i<pos.size(); i++) {
		      
		      int f=Integer.parseInt(Character.toString(pos.get(i).charAt(0)));
		      int c=Integer.parseInt(Character.toString(pos.get(i).charAt(1)));
		      int k=Integer.parseInt(Character.toString(pos.get(i).charAt(2)));
		      
		      s[f][c]=k;
		      
		      solve();
		      
		      s[f][c]=0;
		      
		    }
		    
		  }
		}
	
}


