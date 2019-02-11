package co.com.bryan.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

public class CondicionIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * IF SIMPLE
		 * IF ANIDADO -DOBLE
		 * IF MULTIPLE
		 * 
		 */
		int x = 4;
		
		// if simple
		
		if (x >= 18) {
			System.out.println("if fimple");
		}
		
		//if doble
		if (x == 16) {
			System.out.println("Ingresa");
		}else{
			System.out.println("madure");
		}
		
		//if anindadp
		
		if (x >= 6) {
			System.out.println("primeras acciones");
			if (x == 6) {
				System.out.println("segundas acciones");
			}else{
				System.out.println("X no es 6");
			}
		}else{
			System.out.println("X no es 6 de nuevo");
		}
		

	}

}
