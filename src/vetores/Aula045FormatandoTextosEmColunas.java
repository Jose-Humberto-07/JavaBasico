/**
 * 
 */
package vetores;

/**
 * @author humbe
 *
 */
public class Aula045FormatandoTextosEmColunas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array; //declara��o do nosso array
		array = new int[10];//cria e reserva o espa�o para o nosso array
		//agora utilizar a estrutura for (para) para armazenar as posi��es que nem nos vetores
		System.out.printf("%s10s\n", " _______" + " ________ ");
		System.out.printf("%s10s\n", "|�ndice"   +" |valores |");
		System.out.printf("%s10s\n", "|-------" + "|--------|");
		for ( int i = 0; i <= 9; i++) {
			System.out.printf("%5d3%7d |\n",i, array[i]);
			
	}
		System.out.printf("%s10s\n", "|-------" + "|--------|");
  }
}
