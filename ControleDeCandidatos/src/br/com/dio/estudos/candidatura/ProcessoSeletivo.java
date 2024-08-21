package br.com.dio.estudos.candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {	
		String [] candidatos = {"FELIPE", "JÚLIA", "MÁRCIA", "PAULO", "AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA CANDIDADTO");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "JÚLIA", "MÁRCIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual = 0;
		double salarioBase = 2000.0;
		
		while(candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static void imprimirSelecionados() {
		
		String [] candidatos = {"FELIPE", "JÚLIA", "MÁRCIA", "PAULO", "AUGUSTO"};
		System.out.println("");
		
		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.println("");
		}
		
		for(String candidato: candidatos) {
			System.out.println("O candidato selecionado foi: " +candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			
			atendeu = atender();
			continuarTentando = !atendeu;
			
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando &&tentativasRealizadas < 3); 
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas +" REALIZADAS");
	}
	
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	
}
