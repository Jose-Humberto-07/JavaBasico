/**
 * 
 */
package vetores;

/**
 * @author humbe
 *
 */
public class Aula048_Manipulando_Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] meuArray = new int[10];
		meuArray[0] = 10;
		meuArray[1] = 20;
		meuArray[2] = 30;
		meuArray[3] = 30;
		meuArray[4] = 30;
		meuArray[5] = 30;
		meuArray[6] = 30;
		meuArray[7] = 30;
		meuArray[8] = 30;
		meuArray[9] = 30;
		int soma = 0;
		
		for (int i = 0; i < 9; i++) {
			soma += meuArray[i];
		}
		
		System.out.println("A soma dos elementos de todas as posições é "+soma);
		
	}

}
