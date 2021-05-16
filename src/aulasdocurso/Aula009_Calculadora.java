package aulasdocurso;

import java.util.Scanner;

public class Aula009_Calculadora {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		double num1 , num2, soma, sub;
		double divi, multi;
		
		System.out.println("Insira um número: ");
		num1 = in.nextDouble();
		
		System.out.println("Insira outro número: ");
		num2 = in.nextDouble();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: " + soma);
		
		sub = num1 - num2;
		System.out.println("o resultado da subtração é: " + sub);
		
		divi = num1 / num2;
		multi = num1 * num2;
		
		System.out.println("O resultado da divisão é: "+ divi);
		
		System.out.println("O resultado da multiplicação é: "+ multi);
		
		

		
	}

}
