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
		//Gerando n�meros aleat�rios
		//tem que importar a classe RANDOM (aleat�rio)
		
		
		/*
		 * Para gerar n�meros aleat�rios de 0 at� 50 eu uso: Random random = new
		 * Random(); int array[] = new int[5]; // 5 n�meros ser�o gerados. for (int i=0;
		 * i<array. length; i++) { array[i] = random.
		 */		
		
		
		
		Random num = new Random();
		for (int cont = 1; cont <= 20; cont++) {
			System.out.println(num.nextInt(7)+1);
		}
	}

}
