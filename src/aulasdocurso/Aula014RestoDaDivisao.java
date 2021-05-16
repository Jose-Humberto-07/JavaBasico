/**
 * 
 */
package aulasdocurso;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Aula014RestoDaDivisao {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double n;
		
		//geralmente o resto da divisão é usado
		//para saber se o número é ímpa ou par.
		//o símbolo usado para saber o resto da divisão é? %
		
		System.out.println("Digite um número: ");
		n = teclado.nextDouble();
		
		if (n % 2 == 0 ) {
			System.out.println("O número "+n+" é par");
		}else {
			if(n % 2 != 0) {
				System.out.println("O número "+n+" é ímpar");
			}
		}
	}

}
