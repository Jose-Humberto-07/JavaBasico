/**
 * 
 */
package aulasdocurso;

import java.util.Scanner;

/**
 * @author humbe
 *
 */
public class Aula036OperadorTernario2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//exemplo usando a condição TERNÁRIA
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o seu dia da semana preferido? ");
		System.out.println("Digite 1 para segunda e 7 para domingo: ");
		int num = teclado.nextInt();
		
		
		String dia = (num == 1) ? "Segunda" :
					 (num == 2) ? "Terça"   :
					 (num == 3) ? "Quarta"  :
					 (num == 4) ? "Quinta"	:
					 (num == 5) ? "Sexta"   :
					 (num == 6) ? "Sábado"  :
					 (num == 7) ? "Domingo" :
						  		  "Dia inválido";
		
		System.out.println("O dia escolhido foi: "+dia);
 				
				
				
				
				
				
	}

}
