/**
 * 
 */
package vetores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class Aula050_Atividade_Com_Array1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int[] valores = new int[7];
		
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um número na posição "+(i+1)+ ":");
			valores[i] = teclado.nextInt();
		}
		
		System.out.println(Arrays.toString(valores));
		
	}

}
