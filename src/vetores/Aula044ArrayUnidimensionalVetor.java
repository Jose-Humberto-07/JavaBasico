/**
 * 
 */
package vetores;

/**
 * @author humbe
 *
 */
public class Aula044ArrayUnidimensionalVetor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array; //declara��o do nosso array
		array = new int[10];//cria e reserva o espa�o para o nosso array
		//agora utilizar a estrutura for (para) para armazenar as posi��es que nem nos vetores
		
		for ( int i = 0; i <= 9; i++) {
			System.out.printf("%5d%7d\n",i,array[i]);
		}
	}

}
