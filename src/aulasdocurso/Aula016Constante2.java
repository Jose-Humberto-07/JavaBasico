/**
 * 
 */
package aulasdocurso;

import java.util.Scanner;
public class Aula016Constante2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//calcular a velocidade do som usando uma constante
		Scanner teclado = new Scanner(System.in);
		final double vsom = 340.28;
		System.out.println("Digite o espa�o de tempo em segundos: ");
		int tempo = teclado.nextInt();
		
		System.out.println("A dis�ncia seria de "+ tempo * vsom +" metros percorridos");
		
		System.out.println("");
		
		System.out.println("A dist�ncia  em KM "+(tempo * vsom) / 1000+" km percorridos.");
		
		
	}

}
