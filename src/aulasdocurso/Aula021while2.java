package aulasdocurso;
import java.util.Scanner;
public class Aula021while2 {
	
	
	
	
	public static void main(String[] args) {
		//Estruturas de Repeti��es
		//estrutura enquanto
		Scanner teclado = new Scanner(System.in);
		int num;
		int i = 1;
		
		System.out.println("Ola, quer contar at� quanto? ");
		num = teclado.nextInt();
		
		while (i <= num) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("Obrigado, at� a pr�xima.");
		
	}
}
