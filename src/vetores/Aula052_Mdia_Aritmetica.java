/**
 * 
 */
package vetores;
import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Aula052_Mdia_Aritmetica {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		double[] num = new double[5];
		
		num[0] = 7;
		num[1] = 7;
		num[2] = 7;
		num[3] = 7;
		num[4] = 7;
		
		double soma = 0;
		for (int i = 0; i < num.length; i++) {
			soma += num[i];
		}
		double media = soma / 5;
		
		System.out.println("A média dos elementos mostrados na ela é "+media);
	}

}
