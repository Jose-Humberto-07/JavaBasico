/**
 * 
 */
package matrizes;

import java.util.Scanner;
import java.util.Random;

/**
 * @author humbe
 *
 */
public class Aula054_Arrays_Multidimensionais2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int[][] n = new int[2][2]; n[0][0] = 1000; System.out.println(n[0][0]);
		 */
		Random matrizRandom = new Random();
		Scanner teclado = new Scanner (System.in);
		int[][] matriz = new int[3][2];
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.println("Digite o valor na posição ["+(l+1)+" , "+(c+1)+"]: ");
				matriz[l][c] = matrizRandom.nextInt(100);
			}
		}
		
		
		
		for (int l = 0; l < 3; l++) {
			for (int c = 0; c < 2; c++) {
				System.out.print(matriz[l][c] + " ");
			}
			System.out.println("");
		}
		
		
	}

}
