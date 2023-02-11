package Aplicable;

import java.util.ArrayList;

public class lista_sudokus {

	public static void main(String[] args) {
		
		String[] lineas=new String[9];
		
		
		lineas[0]="080576200";
		lineas[1]="000402000";
		lineas[2]="000039548";
		lineas[3]="630900852";   //FACIL 39
		lineas[4]="090200370";
		lineas[5]="800050694";
		lineas[6]="257603489";
		lineas[7]="308700025";
		lineas[8]="040000006";
		
		lineas[0]="004608500";
		lineas[1]="000007629";
		lineas[2]="600025847";
		lineas[3]="093702065";
		lineas[4]="075000080";   //FACIL 39
		lineas[5]="268004003";
		lineas[6]="006809702";
		lineas[7]="080030406";
		lineas[8]="002070358";
		
		lineas[0]="500086000";
		lineas[1]="002701600";
		lineas[2]="071000250";
		lineas[3]="910020070";
		lineas[4]="300145006";   //FACIL 45
		lineas[5]="060090024";
		lineas[6]="053000460";
		lineas[7]="008903500";
		lineas[8]="200510007";
		
		lineas[0]="058064000";
		lineas[1]="609000040";
		lineas[2]="002370068";
		lineas[3]="087000050";
		lineas[4]="003800700";   //MEDIO 48
		lineas[5]="500407002";
		lineas[6]="870046000";
		lineas[7]="000253800";
		lineas[8]="020080004";
		
		lineas[0]="405000100";
		lineas[1]="000703000";
		lineas[2]="000000843";
		lineas[3]="001000000";
		lineas[4]="000070356";   //DIFICIL 53
		lineas[5]="700360004";
		lineas[6]="000600281";
		lineas[7]="170402000";
		lineas[8]="620030000";
		
		lineas[0]="400700500";
		lineas[1]="300800001";
		lineas[2]="700900008";
		lineas[3]="060030010";
		lineas[4]="090070050";   //DIFICIL 55
		lineas[5]="080010790";
		lineas[6]="002006900";
		lineas[7]="005000030";
		lineas[8]="000004200";
		
		lineas[0]="005300000";
		lineas[1]="800000020";
		lineas[2]="070010500";
		lineas[3]="400005300";
		lineas[4]="010070006";   //DIFICIL 58
		lineas[5]="003200080";
		lineas[6]="060500009";
		lineas[7]="004000030";
		lineas[8]="000009700";
	
		lineas[0]="001000000";
		lineas[1]="002030004";
		lineas[2]="000500607";
		lineas[3]="500140000";
		lineas[4]="070000020";   //DIFICIL 59
		lineas[5]="000078009";
		lineas[6]="807009000";
		lineas[7]="400060300";
		lineas[8]="000000500";
		
		lineas[0]="800000000";
		lineas[1]="003600000";
		lineas[2]="070090200";
		lineas[3]="050007000";
		lineas[4]="000045700";   //EL MAS DIFICIL 60
		lineas[5]="000100030";
		lineas[6]="001000068";
		lineas[7]="008500010";
		lineas[8]="090000400";
		
		lineas[0]="070020050";
		lineas[1]="003000000";
		lineas[2]="000030900";
		lineas[3]="000000000";
		lineas[4]="400000090";   //MUY DIFICIL 64
		lineas[5]="000170003";
		lineas[6]="005000007";
		lineas[7]="300086000";
		lineas[8]="001000000";
		
		lineas[0]="000431000";
		lineas[1]="008000400";
		lineas[2]="030000010";
		lineas[3]="200000005";
		lineas[4]="300060009";   //PI (chessking)
		lineas[5]="900000002";
		lineas[6]="070000060";
		lineas[7]="009000500";
		lineas[8]="000853000";
		
		lineas[0]="100400700";
		lineas[1]="020050080";
		lineas[2]="003006009";
		lineas[3]="010040070";
		lineas[4]="002005008";   //Diabolical
		lineas[5]="900300600";
		lineas[6]="700008002";
		lineas[7]="800200900";
		lineas[8]="090070010";
		
		lineas[0]="000000000";
		lineas[1]="000000000";
		lineas[2]="000000000";
		lineas[3]="000000000";
		lineas[4]="000100000";   //Miracle 1 (knight king and cons)
		lineas[5]="000000200";
		lineas[6]="000000000";
		lineas[7]="000000000";
		lineas[8]="000000000";
		
		lineas[0]="000000000";
		lineas[1]="000000000";
		lineas[2]="000040000";
		lineas[3]="003000000";
		lineas[4]="000000000";   //Miracle 2 (knight king and cons)
		lineas[5]="000000000";
		lineas[6]="000000000";
		lineas[7]="000000000";
		lineas[8]="000000000";
		
		lineas[0]="000000000";
		lineas[1]="000000000";
		lineas[2]="000000000";
		lineas[3]="000000000";
		lineas[4]="000000000";   //CEROS 81
		lineas[5]="000000000";
		lineas[6]="000000000";
		lineas[7]="000000000";
		lineas[8]="000000000";
		
		ArrayList<String> vals=new ArrayList();
		
		vals.add("H -1,+1");
		vals.add("Li +1");
		vals.add("Na +1");
		vals.add("K +1");
		vals.add("Rb +1");
		vals.add("Cs +1");
		vals.add("Be +2");
		vals.add("Mg +2");
		vals.add("Ca +2");
		vals.add("Sr +2");
		vals.add("Ba +2");
		vals.add("Ti +2,+3,+4");
		vals.add("V +2,+3,+4,+5");
		vals.add("Cr +2,+3,+6");
		vals.add("Mn +2,+3,+4,+6,+7");
		vals.add("Fe +2,+3");
		vals.add("Co +2,+3");
		vals.add("Ni +2,+3");
		vals.add("Pd +2,+4");
		vals.add("Pt +2,+4");
		vals.add("Cu +1,+2");
		vals.add("Ag +1");
		vals.add("Au +1,+3");
		vals.add("Zn +2");
		vals.add("Cd +2");
		vals.add("Hg +1,+2");
		vals.add("B -3,+3");
		vals.add("Al +3");
		vals.add("C -4,+2,+4");
		vals.add("Si -4,+4");
		vals.add("Sn +2,+4");
		vals.add("Pb +2,+4");
		vals.add("N -3,+1,+2,+3,+4,+5");
		vals.add("P -3,+3,+5");
		vals.add("As -3,+3,+5");
		vals.add("Sb -3,+3,+5");
		vals.add("O -2,-1");
		vals.add("S -2,+2,+4,+6");
		vals.add("Se -2,+2,+4,+6");
		vals.add("Te -2,+2,+4,+6");
		vals.add("F -1");
		vals.add("Cl -1,+1,+3,+5,+7");
		vals.add("Br -1,+1,+3,+5,+7");
		vals.add("I -1,+1,+3,+5,+7");
		
	}
	
}
