package aulasdocurso;

public class Aula015Constante1 {

	public static void main(String[] args) {
		/*
		 * 1) os dados nunca serão alterados
		 * 2) uma const. tem o seu endereço protegido
		 * 3)uma const. nunca será desalocada
		 * 4) declaramos uma vez, utilizamos quantas vezes for preciso
		 *  ou seja constante não muda, variável pode mudar, como já diz o nome
		 *  */
		
			  int var = 10;//delara uma variável
		final int constante = 3800;// declara uma constante
		
		System.out.println(var);
		System.out.println(constante);
		
	}

}
