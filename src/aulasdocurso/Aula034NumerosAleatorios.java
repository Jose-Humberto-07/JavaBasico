/**
 * 
 */
package aulasdocurso;
import java.util.Scanner;
import java.util.Random;
/**
 * @author humbe
 *
 */
public class Aula034NumerosAleatorios {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Gerando números aleatórios
		//tem que importar a classe RANDOM (aleatório)
		
		
		/*
		 * Para gerar números aleatórios de 0 até 50 eu uso: Random random = new
		 * Random(); int array[] = new int[5]; // 5 números serão gerados. for (int i=0;
		 * i<array. length; i++) { array[i] = random.
		 */		
		
		
		
		Random num = new Random();
		for (int cont = 1; cont <= 20; cont++) {
			System.out.println(num.nextInt(7)+1);
		}
	}

}
