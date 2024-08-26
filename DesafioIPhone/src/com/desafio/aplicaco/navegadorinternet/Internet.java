package com.desafio.aplicaco.navegadorinternet;

public class Internet implements NavegadorInternet{
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA");
	}

}
