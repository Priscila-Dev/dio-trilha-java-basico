package com.desafio.aplicacao.reprodutormusical;

public class IPod implements ReprodutorMusical{
	public void tocar() {
		System.out.println("TOCANDO UMA MÚSICA");
	}

public void pausar() {
	System.out.println("PAUSANDO MÚSICA");
	}

public void selecionarMusica(String musica) {
	System.out.println("SELECIONANDO MÚSICA");
	}
}
