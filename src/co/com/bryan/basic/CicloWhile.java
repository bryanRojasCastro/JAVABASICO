package co.com.bryan.basic;

public class CicloWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero = 2;
		int cont = 1;
		
		while (cont <= 10) {
			System.out.println(numero + "*" + cont  +"=" + numero *  cont);
			++cont;
		}
	}

}
