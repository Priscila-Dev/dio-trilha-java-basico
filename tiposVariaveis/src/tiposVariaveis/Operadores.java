package tiposVariaveis;

public class Operadores {

	public static void main(String[] args) {
		
		//operadores de atribuição
		String nome = "Priscila";
		int idade = 34;
		double peso = 85.6;
		char sexo = 'F';
		boolean doadorOrgao = false;
		
		//Date dataNascimento = new Date();
		
		//operadores aritiméticos
		double soma = 10.5 + 15.7;
		int subtracao = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15 / 3;
		int modulo = 18 % 3;
		
		double resultado = (10 * 7) + (20 / 4);
		
		//concatenação
		String nomeCompleto = "LINGUAGEM" + "JAVA";
		System.out.println(nomeCompleto);
		
		String concatenacao = "?";
		
		//a partir do momento que é detectado um caracter, ele para de atribuir à soma e começa a concatenar
		concatenacao = 1 + 1 + 1 + "1"; //31
		
		concatenacao = 1 + "1" + 1 + 1 + 1; //1111
		
		concatenacao = 1 + "1" + 1 + "1"; //1111
		
		concatenacao = "1" + 1 + 1 + 1; //1111
		
		concatenacao = "1" + (1 + 1 + 1); //13
		
		
		//operadores Unários 
		/*(+) Operador unário de valor positivo - numeros são positivos sem esse operador explixcitamente; 
		 *(-) Operador unário de valor negativo - nega um número ou expressão aritimética;
		 *(++) Operador unário de incremento de valor - incrementa o valor em uma unidade;
		 *(--)Operador unário de decremento de valor - decrementa o valor em uma unidade;
		 *(!) Operador unário lógico de negação - nega o valor de uma expressão booleana;
		 */
		int numero = 5;
		
		numero = - numero; //tornando o numero negativo
		
		System.out.println(numero);
		
		numero = numero * -1; //tornando o numero positivo
		
		System.out.println(numero);
		
		
		//incrementação
		int numeroIncremento = 5;
		
		System.out.println(numeroIncremento ++); //incrementação
		
		System.out.println(numeroIncremento);
		
		
		//mudando o valor da variavel do tipo boolean
		boolean variavel = true;
		
		variavel = !variavel;
		
		System.out.println(variavel);
		
		
		//operador ternario
		int a, b;
		
		a = 5;
		b = 6;
		
		//metodo reduzido
		String resultadoDois = a==b ? "verdadeiro" : "falso";
		/*
		String resultado = "";
		
		if(a==b)
			resultado = "verddeiro";
		else
			resultado = "falso";
		*/
		System.out.println(resultado);
		
		
		//operadores relacionais
		
		String nomeUm = "Priscila";
		String nomeDois = new String("Priscila");
		
		System.out.println(nomeUm.equals(nomeDois));//metodo de comparação de String
		
		int numero1 = 1;
		int numero2 = 2;
		
		boolean simNao = numero1 == numero2; //== igual
		
		if(numero1 < numero2) {
			System.out.println("a nossa condição é verdadeira");
		}
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 != numero2;//!= diferente
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 > numero2;//> maior
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		simNao = numero1 < numero2;//< menor
		
		System.out.println("numeroUm é igual a numeroDois? " + simNao);
		
		
		//operadores lógicos
		
		boolean condicao1 = true;
		boolean condicao2 = false;
		
		//&&(e) indica as duas condiçoes 
		if(condicao1 && condicao2) {
			System.out.println("As duas condições são verdadeira");
		}
		
		if(condicao1 && (7 > 4)) {
			System.out.println("As duas condições são verdadeira");
		}


		//||(ou)indica uma ou outra
		if(condicao1 || condicao2) {
			System.out.println("Uma das condições é verdadeira");
		}
		
	}
}
