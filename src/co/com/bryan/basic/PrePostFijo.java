package co.com.bryan.basic;

public class PrePostFijo {

	public static void main(String[] args) {
		/*
		 * postfijjo x++ o x-- (primero utiliza y despues incremet) print 5
		 * 
		 * realiza su operacion despues de dicha accion
		 * 
		 *prefijo ++x o --x primero incrementa despues utiliza print 6
		 *
		 *prefijo realiza primero su operacion antes de hacer cualquier cosa
		 *
		 */
		
		//postfijo
		int x = 5;
		System.out.println(x++);
		//prefijo
		System.out.println(--x);
		
	}

}
