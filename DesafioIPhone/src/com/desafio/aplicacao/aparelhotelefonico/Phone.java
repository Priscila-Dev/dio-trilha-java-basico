package com.desafio.aplicacao.aparelhotelefonico;

public class Phone implements AparelhoTelefonico {

	public void ligar(String numero) {
		System.out.println("LIGANDO PARA " + numero);
	}
	
	public void atender() {
		System.out.println("ATENDENDO A LIGAÇÃO");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ");
	}

} 
