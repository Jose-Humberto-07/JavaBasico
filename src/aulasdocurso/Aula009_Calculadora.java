package aulasdocurso;

import java.util.Scanner;

public class Aula009_Calculadora {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1 , num2, soma, sub;
		double divi, multi;
		
		System.out.println("Insira um n�mero: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira outro n�mero: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma �: " + soma);
		
		sub = num1 - num2;
		System.out.println("o resultado da subtra��o �: " + sub);
		
		divi = num1 / num2;
		multi = num1 * num2;
		
		System.out.println("O resultado da divis�o �: "+ divi);
		
		System.out.println("O resultado da multiplica��o �: "+ multi);
		
		

		
	}

}
