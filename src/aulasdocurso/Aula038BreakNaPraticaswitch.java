/**
 * 
 */
package aulasdocurso;

/**
 * @author humbe
 *
 */
public class Aula038BreakNaPraticaswitch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break no for
		
		labelForI: for (int i = 1; i <= 10; i++) {
			if (i == 6)
				break;
			System.out.println(i);
			for (int j = 1; j <= 10; j++) {
				System.out.println("O valor de i = "+i+" e O valor de J é = "+j);
				if (j == 9 && i == 3)
					break labelForI;
			}
		}
	}

}
