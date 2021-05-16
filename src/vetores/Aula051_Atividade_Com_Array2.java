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
public class Aula051_Atividade_Com_Array2 {

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
		
		//soma elementos
		int somaElementos = 0;
		for (int x = 0; x < valores.length; x++) {
			somaElementos += valores[x];
			
		}
		System.out.println("A soma dos elementos é: "+somaElementos);
		
		//multiplicação de elementos
		int produto = 0;
		for (int x = 0; x < valores.length; x++) {
			 produto = valores[x] * x;
			System.out.println("A multiplicação do índice pelo o elemento: "+valores[x]+" * "+x+" = "+produto);
			
		}
		
		//media aritmética
		double soma = somaElementos;
		double media = soma / 7;
		System.out.println("A média aritmética é "+media);
		
		//	System.out.println(Arrays.toString(valores));
		
	}

}
