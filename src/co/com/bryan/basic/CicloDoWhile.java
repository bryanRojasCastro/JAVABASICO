package co.com.bryan.basic;

public class CicloDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  se ejecuta la iteracion siempre y cuando la condicion sea verdadera
		 *  de lo contrario sladra o no entrara la iteracion
		 * 
		 */
		int numero = 2;
		int cont = 1;
		do{	

			System.out.println(numero + "*" + cont  +"=" + numero *  cont);
			++cont;
		}while(cont <=10);
		
	}

}
