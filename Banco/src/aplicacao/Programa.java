package aplicacao;

import java.util.Scanner;

import operacoes.Conta;

public class Programa {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Conta conta;
		int numero_conta;
		String nome, resposta;
		double valor;

		System.out.println("Digite o número da Conta: ");
		numero_conta = leitor.nextInt();
		leitor.nextLine();
		System.out.println("Digite o nome do titular da conta: ");
		nome = leitor.nextLine();
		System.out.println("Há valor inicial de Deposito(s/n)?");
		resposta = leitor.nextLine();
		if (resposta.equals("s")) {
			System.out.println("Entre com o valor de deposito inicial: ");
			double depositoInicial = leitor.nextDouble();
			conta = new Conta(numero_conta, nome, depositoInicial);
		} else {
			conta = new Conta(numero_conta, nome);
		}

		System.out.println(conta);

		System.out.println("Entre com um valor para depósito: ");
		valor = leitor.nextDouble();
		conta.realizarDeposito(valor);

		System.out.println(conta);

		System.out.println("Entre com um valor para saque: ");
		valor = leitor.nextDouble();
		conta.realizarSaque(valor);

		System.out.println(conta);

		leitor.close();
	}

}
