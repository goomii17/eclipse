package Retos;

import java.util.ArrayList;
import java.util.Scanner;

public class prueba_2 {

	public static void main(String[] args) {
		
		String temp="...--.---";
		
		String compv=".-.";
		
		temp=temp+compv;
		
		System.out.println(temp);
		
		temp=temp.substring(0,temp.length()-compv.length());
		
		System.out.println(temp);
		
	}
	
}
