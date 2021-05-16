package aulasdocurso;
import java.util.Scanner;
public class Aula017OperadoresLógicos {

	public static void main(String[] args) {
		//verificar idade
		//&& = e
		//|| = ou
		//
		Scanner teclado = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite qualquer idade: ");
		idade = teclado.nextInt();
		
		if(idade < 18) {
			System.out.println("Você é um adolescente.");
		}else {
			if(idade >= 18 && idade <= 60) {
				System.out.println("Você é um adulto.");
			}else {
				if(idade > 60) {
					System.out.println("você é um idodo.");
				}
			}
		}
		
		
		
		
	}

}
