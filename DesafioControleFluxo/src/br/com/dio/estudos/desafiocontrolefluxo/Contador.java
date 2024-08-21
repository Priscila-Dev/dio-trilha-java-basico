package br.com.dio.estudos.desafiocontrolefluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		
		Scanner terminal = new Scanner(System.in);
		
		 boolean parametrosValidos = false;

	    while (!parametrosValidos) {
	    	System.out.println("Digite o primeiro parâmetro ");
	    	int parametroUm = terminal.nextInt();
	    	System.out.println("Digite o segundo parâmetro ");
	    	int parametroDois = terminal.nextInt();
	    	System.out.println();
			
	    	try {
			//chamando o metodo contendo a lógica de contagem
			contar(parametroUm, parametroDois);
	    	}catch (Exception e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
			System.out.println();
			
	    	}
	    	System.out.println();
	    }
	}
	
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException();
			
		}else {
			
			int contagem = parametroDois - parametroUm;
			//realizar o for para imprimir os números com base na variável contagem
			for(int numero = 1; numero <= contagem; numero++ ) {
				
				System.out.println("Imprimindo o numero " + numero);				
			}
		}
	}
	
}
