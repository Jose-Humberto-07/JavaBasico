/**
 * 
 */
package aulasdocurso;

/**
 * @author humbe
 *
 */
public class Aula040InstrucaoContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a intru��o continue ao contr�rio do break n�o termina uma intru��o, ela
		 * continua um ciclo, dentro do looping o continue volta para o cabe�alho que a
		 * condi��o e continua a contagem.
		 */
		System.out.println("Imprime os n�meros pares de 0 at� 100");
		
		for (int i = 0; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}else {
				continue;	
				
 			}
			int a = 0; 
			int soma = 0;
			
			while (a < i) {
				a++;
				soma+=1;
			}
			System.out.println("A soma de todos os n�meros �: "+ soma);
		}
 		
		
	}

}
