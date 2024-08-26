package com.desafio.iphone;

import com.desafio.aplicacao.aparelhotelefonico.AparelhoTelefonico;
import com.desafio.aplicacao.reprodutormusical.ReprodutorMusical;
import com.desafio.aplicaco.navegadorinternet.NavegadorInternet;

public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
	public void ligar(String numero) {
		System.out.println("LIGANDO PARA "+ numero + " VIA IPHONE" );
	}
	
	public void atender() {
		System.out.println("ATENDENDO A LIGAÇÃO VIA IPHONE");
	}
	
	public void iniciarCorreioVoz() {
		System.out.println("INICIANDO CORREIO DE VOZ VIA IPHONE");
	}
	
	public void exibirPagina(String url) {
		System.out.println("EXIBINDO PÁGINA VIA IPHONE " + url);
	}
	
	public void adicionarNovaAba() {
		System.out.println("ADICIONANDO NOVA ABA VIA IPHONE");
	}
	
	public void atualizarPagina() {
		System.out.println("ATUALIZANDO A PÁGINA VIA IPHONE");
	}
	
	public void selecionarMusica(String musica) {
		System.out.println("SELECIONANDO MÚSICA VIA IPHONE - " + musica);
	}
	
	public void tocar() {
		System.out.println("TOCANDO UMA MÚSICA VIA IPHONE");
	}

	public void pausar() {
		System.out.println("PAUSANDO MÚSICA VIA IPHONE");
	}

	
}
