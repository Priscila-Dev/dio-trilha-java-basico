package com.desafio.usuario;

import com.desafio.aplicacao.aparelhotelefonico.AparelhoTelefonico;
import com.desafio.aplicacao.reprodutormusical.ReprodutorMusical;
import com.desafio.aplicaco.navegadorinternet.NavegadorInternet;
import com.desafio.iphone.IPhone;

public class Usuario {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();
		
		ReprodutorMusical reprodutorMusical = iphone;
		AparelhoTelefonico aparelhoTelefonico = iphone;
		NavegadorInternet navegadorInternet = iphone;
		
		reprodutorMusical.selecionarMusica("Memories - Marron 5");
		reprodutorMusical.tocar();
		reprodutorMusical.pausar();
		System.out.println("\n");
		
		aparelhoTelefonico.ligar("2598-3722");
		aparelhoTelefonico.atender();;
		aparelhoTelefonico.iniciarCorreioVoz();
		System.out.println("\n");
		
		navegadorInternet.adicionarNovaAba();
		navegadorInternet.atualizarPagina();
		navegadorInternet.exibirPagina("https://www.youtube.com/watch?v=9ou608QQRq8");
		
	}
}
