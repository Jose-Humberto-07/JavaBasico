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
		
		//geralmente o resto da divis�o � usado
		//para saber se o n�mero � �mpa ou par.
		//o s�mbolo usado para saber o resto da divis�o �? %
		
		System.out.println("Digite um n�mero: ");
		n = teclado.nextDouble();
		
		if (n % 2 == 0 ) {
			System.out.println("O n�mero "+n+" � par");
		}else {
			if(n % 2 != 0) {
				System.out.println("O n�mero "+n+" � �mpar");
			}
		}
	}

}
