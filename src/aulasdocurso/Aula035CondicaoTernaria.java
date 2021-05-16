/**
 * 
 */
package aulasdocurso;

/**
 * @author humbe
 *
 */
public class Aula035CondicaoTernaria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operação TERNÁRIA é uma estrutura utilizada para simplificar o código,
		// onde testamos uma condição e rertamos um valor
		// ou seja, para subistitur a estrutura condicional IF

		// Definição
		// <variável> = (condição) ? <valor1> : <valor2>;

		// "Se condição for verdadeira, retorne valor1, senão retorne valor 2."

		// Exemplo

		int a, b;
		String valor;
		a = 6;
		b = 5;

	/*	if (a == b) {
			valor = "verdadeiro";
		}else {
			valor = "false";
		}
	*/	 
		
		valor = (a > b) ? "verdadeiro" : "false";
		
		System.out.println(valor);

	}

}
