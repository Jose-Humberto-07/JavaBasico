/**
 * 
 */
package vetores;
import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class Aula046ArraysUnidimensionais2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		
		//forma normal de se declarar um Array
		int[] meuArray = new int[5];
		
		
		//declarando Array colocando os valores das posições
		int[] meuArrayDois = {1, 2, 3, 4, 5};
		
		
		int[] array = {78, 20, 56, 89,1};
		//System.out.printf( "Índice", "Valores");
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.println( "ìndice: "+i+" VSalor: "+array[i]);
		}
	}

}
