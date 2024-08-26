package com.estudos.enuns;

public class SistemaIbge {

	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
			System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo());
		}
				
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.PIAUI;
				
		System.out.println(ufSelecionado.getNome());
		System.out.println(ufSelecionado.getSigla());
		System.out.println(ufSelecionado.getNomeMaiusculo());
		System.out.println(ufSelecionado.getIbge());
	}

}
