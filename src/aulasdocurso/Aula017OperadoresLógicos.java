package aulasdocurso;
import java.util.Scanner;
public class Aula017OperadoresL�gicos {

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
			System.out.println("Voc� � um adolescente.");
		}else {
			if(idade >= 18 && idade <= 60) {
				System.out.println("Voc� � um adulto.");
			}else {
				if(idade > 60) {
					System.out.println("voc� � um idodo.");
				}
			}
		}
		
		
		
		
	}

}
