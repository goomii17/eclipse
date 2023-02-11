package Aplicable;
import java.io.*;
import java.time.Duration;
import java.util.*;
public class Valencias {

	public static void main(String Args[]) {
		
		CRONO c=new CRONO();
		
		ArrayList<String> vals=new ArrayList();
		
		vals.add("H -1,1");
		vals.add("Li 1");
		vals.add("Na 1");
		vals.add("K 1");
		vals.add("Rb 1");
		vals.add("Cs 1");
		vals.add("Be 2");
		vals.add("Mg 2");
		vals.add("Ca 2");
		vals.add("Sr 2");
		vals.add("Ba 2");
		vals.add("Ti 2,3,4");
		vals.add("V 2,3,4,5");
		vals.add("Cr 2,3,6");
		vals.add("Mn 2,3,4,6,7");
		vals.add("Fe 2,3");
		vals.add("Co 2,3");
		vals.add("Ni 2,3");
		vals.add("Pd 2,4");
		vals.add("Pt 2,4");
		vals.add("Cu 1,2");
		vals.add("Ag 1");
		vals.add("Au 1,3");
		vals.add("Zn 2");
		vals.add("Cd 2");
		vals.add("Hg 1,2");
		vals.add("B -3,3");
		vals.add("Al 3");
		vals.add("C -4,2,4");
		vals.add("Si -4,4");
		vals.add("Sn 2,4");
		vals.add("Pb 2,4");
		vals.add("N -3,1,2,3,4,5");
		vals.add("P -3,3,5");
		vals.add("As -3,3,5");
		vals.add("Sb -3,3,5");
		vals.add("O -2,-1");
		vals.add("S -2,2,4,6");
		vals.add("Se -2,2,4,6");
		vals.add("Te -2,2,4,6");
		vals.add("F -1");
		vals.add("Cl -1,1,3,5,7");
		vals.add("Br -1,1,3,5,7");
		vals.add("I -1,1,3,5,7");
		
		ArrayList<Integer> secuencia=dimeSecuencia(vals.size());
		
		System.out.println("Empieza el juego !!\n");
		
		c.set_inicio();
		
		int aciertos=0;
		
		for (int i = 0; i < vals.size(); i++) {
			
			String[] preg=vals.get(secuencia.get(i)).trim().split(" ");
			
			String elem=preg[0];
			
			String[] valencias=preg[1].trim().split(",");
			
			System.out.print("Valencias del "+elem+" : ");
			
			Scanner sc=new Scanner(System.in);
			
			String[] ans=remSp(sc.nextLine()).split(",");
			
			ArrayList<Integer> cogs=new ArrayList();
			
			int ac=0;
			
			for (int j = 0; j < ans.length; j++) {
				
				for (int j2 = 0; j2 < valencias.length; j2++) {
					
					if(!cogs.contains(j2)) {
						
						if(ans[j].equalsIgnoreCase(valencias[j2])) {
							
							ac++;
							
							cogs.add(j2);
							
						}
						
					}
					
				}
				
			}
			
			if(ac==valencias.length&&ans.length==valencias.length) {
				
				System.out.println("Enhorabuena!\n");
				
				aciertos++;
				
			}else {
				
				if(ans.length>valencias.length) {
					
					System.out.println("Ohh, has fallado "+ (ans.length-ac) +"/"+ans.length+ " valencias  ("+preg[1]+")\n");
					
				}else {
					
					System.out.println("Ohh, has acertado "+ ac +"/"+valencias.length+ " valencias  ("+preg[1]+")\n");
					
				}
				
			}
			
		}
		
		c.set_fin();
		
		String[] lastRecord=dimeRecord().split(" ");
		
		if(aciertos>=Integer.parseInt(lastRecord[0])&&c.dime_segs_tot()<Double.parseDouble(lastRecord[1])) {
			
			System.out.println("¡¡¡¡Has superado el record!!!!: ("+lastRecord[0]+"/"+vals.size()+ " aciertos en "+ convert(Double.parseDouble(lastRecord[1]))+")");
			
			setRecord(aciertos,c.dime_segs_tot());
			
			String[] newRecord=dimeRecord().split(" ");
			
			System.out.println("\nNuevo Record: "+newRecord[0]+"/"+vals.size()+ " aciertos en "+ c.dime_tiempo());
			
		}else {
			
			System.out.println("Ohh No has superado el record: ("+lastRecord[0]+"/"+vals.size()+ " aciertos en "+ convert(Double.parseDouble(lastRecord[1]))+")");
			
			System.out.println("Puntuacion: "+aciertos+"/"+vals.size()+ " aciertos en "+ c.dime_tiempo());
			
		}
		
	}
	
	public static String convert(double segs) {
		
		int horas = 0,mins = 0;
		
		if(segs>=3600) {
			
			horas=(int) segs/3600;
			
			segs=segs-horas*3600;
			
		}

		if(segs>=60) {
			
			mins=(int) (segs/60);
			
			segs=segs-mins*60;
			
		}
		
		String tiempo=horas+" hrs : "+mins+" mins : "+segs+" segs";
				
		return tiempo;
		
	}
	
	public static String remSp(String s) {
		
		ArrayList<Character> let=new ArrayList();
		
		for (int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i)!=' ') {
				
				let.add(s.charAt(i));
				
			}
			
		}
		
		String aux="";
		
		for (int i = 0; i < let.size(); i++) {
			
			aux=aux+let.get(i);
			
		}
		
		return aux;
		
	}
	
	public static ArrayList<Integer> dimeSecuencia(int n) {
		
		ArrayList<Integer> nums=new ArrayList();
		
		while(nums.size()!=n) {
			
			int al=(int) (Math.random()*n);
			
			if(nums.contains(al)==false) {
				
				nums.add(al);
				
			}
			
		}
		
		return nums;
		
	}
	
	public static String dimeRecord() {
		
		String s="";
		
		ArrayList<String> lines=new ArrayList();
		
		try {
			
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\usuario\\Desktop\\JAVA\\Ficheros\\RecordValencias.txt"));
			
			s=br.readLine();
			
			while(s!=null) {
				
				lines.add(s);
				
				s=br.readLine();
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return lines.get(lines.size()-1);
		
	}
	
	public static void setRecord(int ac,double time) {
		
//		File f=new File("C:\\Users\\usuario\\Desktop\\JAVA\\Ficheros\\RecordValencias.txt");
//		
//		f.delete();
		
		try {
			
			FileWriter file=new FileWriter("C:\\Users\\usuario\\Desktop\\JAVA\\Ficheros\\RecordValencias.txt",true);
			
			BufferedWriter bw=new BufferedWriter(file);
			
			PrintWriter printer=new PrintWriter(bw);
			
			printer.println(ac+" "+time);
			
			printer.flush();
			
			printer.close();
			
			bw.close();
			
			file.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}
