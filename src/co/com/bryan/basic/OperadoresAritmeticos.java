package co.com.bryan.basic;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *se resuelven primero los operadores con mayor precedencia
		 *en caso de tener igual precedencia se resuelven 
		 *de izq a derecha
		 */
			
		/* Precedencia
		 * ()
		 * multiplicacion divsion modulo
		 * 
		 * suma resta
		 * 
		 */
			
		int suma = (5 + 5) + 25;
		double operacionLarga = 10/5+6-2+3*8*1-12/2+9-7*4;
		
		System.out.println(operacionLarga);
	}

}
