/**
 * 
 */
package aulasdocurso;

import java.util.Scanner;
/**
 * @author humbe
 *
 */
public class Aula013_Calculadora2_0 {
	
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("    MENU");
		System.out.println("1 - somar");
		System.out.println("2 - subtrair");
		System.out.println("3 - multiplicar");
		System.out.println("4 - dividir");
		System.out.println("Escola uma das opções: ");
		int op = teclado.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		double num1 = teclado.nextDouble();
				
		System.out.println("Digite o segundo número: ");
		double num2 = teclado.nextDouble();
		
		if (op == 1) {
			System.out.println(num1 + num2);
		}else {
			if(op == 2) {
				System.out.println(num1 - num2);
			}else {
				if(op == 3) {
					System.out.println(num1 * num2);
				}else {
					if(op == 4) {
						System.out.println(num1 / num2);
					}
				}
			}
		}
		System.out.println("Obrigado, até a próxima.");
		
		
	}
}
