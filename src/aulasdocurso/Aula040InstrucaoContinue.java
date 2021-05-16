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
		 * a intrução continue ao contrário do break não termina uma intrução, ela
		 * continua um ciclo, dentro do looping o continue volta para o cabeçalho que a
		 * condição e continua a contagem.
		 */
		System.out.println("Imprime os números pares de 0 até 100");
		
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
			System.out.println("A soma de todos os números é: "+ soma);
		}
 		
		
	}

}
