package com.terminal.contabanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Olá, seja bem vindo ao Banco Novo Horizonte!");
		System.out.println("Por favor, digite seu nome: ");
		String nome  = scanner.next();
		
		System.out.println("Por favor, digite o número da Agência! ");
		String agencia  = scanner.next();
		
		// Formata o valor inserido para o formato "000-0" de maneira compacta
        String agenciaFormatada = String.format("%03d-%d", Integer.parseInt(agencia) / 10, Integer.parseInt(agencia) % 10);
		
		System.out.println("Por favor, digite o número da Conta! ");
		int numero = scanner.nextInt();
		
		System.out.println("Quanto deseja depositar em sua conta? ");
		double saldo = scanner.nextDouble();
		
		System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ agenciaFormatada + ", sua conta é " + numero + " e seu saldo R$" + String.format("%.2f", saldo) + " já está disponível para saque.");
	}
}
