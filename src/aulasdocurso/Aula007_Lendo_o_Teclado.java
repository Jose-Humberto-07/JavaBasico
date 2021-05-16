package aulasdocurso;


/*para ler as vari�veis em java, primeiro tem que importar a classe Scanner.
 * vai est� aqui em baixo a importa��o*/

import java.util.Scanner;



public class Aula007_Lendo_o_Teclado {

	
	/*Uma inst�ncia de uma classe � um novo objeto criado dessa classe, com o operador new.
	 *  Instanciar uma classe � criar um novo objeto do mesmo tipo dessa classe. 
	 *  Uma classe somente poder� ser utilizada ap�s ser instanciada.
	 * 
	 *  temos que criar um objeto, usando a classe Scanner
	 * ("Scanner nome = new Scanner(System.in);")
	 * a palavra new � uma inst�ncia
	 *para ler faremos o seguinte:
	 *exemplo:
	 *
	 *
	 *criando primeiro a vari�vel.
	 *	System.out.println("Informe a idade so seu cachorro: ")
	 *	Scanner nome = new Scanner(System.in);
	 *  int idadeCachorro = in.nextInt();
	 *  idadeCachorro = idadeCachorro * 7;
     *
	 *
	 * */
	
	
	
	
	public static void main(String[] args) {
		/*System.out.println("Digite um n�mero: ");
		Scanner lendo = new Scanner(System.in);
		System.out.println(lendo.nextLine());
		*/
		
		/*LENDO UMA LINHA INTEIRA*/
		Scanner lendoDenovo = new Scanner(System.in);
		
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = lendoDenovo.nextLine();
		System.out.println("Seu nome completo �: "+nomeCompleto);
		
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = lendoDenovo.next();
		System.out.println("Seu primeiro nome �: "+primeiroNome);
		
		/*LENDO N�MERO INTEIRO*/
		
		System.out.println("Digite a sua idade: ");
		int idade = lendoDenovo.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		
		
		
	}

}
