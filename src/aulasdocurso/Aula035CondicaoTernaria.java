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
		// Opera��o TERN�RIA � uma estrutura utilizada para simplificar o c�digo,
		// onde testamos uma condi��o e rertamos um valor
		// ou seja, para subistitur a estrutura condicional IF

		// Defini��o
		// <vari�vel> = (condi��o) ? <valor1> : <valor2>;

		// "Se condi��o for verdadeira, retorne valor1, sen�o retorne valor 2."

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
