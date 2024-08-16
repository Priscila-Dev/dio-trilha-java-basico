package com.terminal.contabanco;

import java.util.Locale;
import java.util.Scanner;

/*
 * nome do cliente
 * numero da agencia
 * numero da conta
 * saldo
 * Mensagem final: "Olé [nomeCliente], obrigado por criar uma conta em nosso banco, sua agência é
 * [agencia], conta [numeroConta] e seu saldo [saldo] já está disponível para saque."*/

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		
		int conta = 8437;
		double saldo = 3500;
		
		System.out.println("Olá, seja bem vindo ao Banco Novo Horizonte!");
		System.out.println("Por favor, digite seu nome: ");
		String nome  = scanner.next();
		
		System.out.println("Por favor, digite o número da Agência! ");
		int agencia  = scanner.nextInt();
		
		System.out.println("Olá, " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " 
		+ agencia + ", sua conta é " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
		

	}

}
