import java.util.Random;
import java.util.Scanner;

import Modelo.Conta;
import Modelo.ContaCorrente;
import Modelo.ContaEspecial;
import Util.GerenciamentoDeContas;

public class App {
public static void main(String[] args) {
	Random random = new Random();
	Scanner teclado = new Scanner(System.in);
	GerenciamentoDeContas contas = new GerenciamentoDeContas();
	int opcao = 0, numero, agencia, tipo;
	double saldo, limite;
	String nome, cpf, telefone, entradaDigitada;
	Conta c1;
	Conta conta = new Conta();

	while (opcao != 7) {
			System.out.println("Bem-vindos ao Wolf Bank");
		System.out.println();
		System.out.println("1-Nova conta Corrente");
		System.out.println("2-Nova Conta Especial");
		System.out.println("3-Visualizar conta");
		System.out.println("4-Realizar depósito:");
		System.out.println("5-Realizar Saque:");
		System.out.println("6-Listar contas: ");
		System.out.println("7-Sair");
		System.out.println("Sua opção:");
		entradaDigitada = teclado.nextLine();
		opcao = Integer.parseInt(entradaDigitada);

		switch (opcao) {

		case 1: {
			numero = random.nextInt((30000) - 1) + 10000;
			agencia = random.nextInt((3999) - 1) + 1000;
			System.out.println("Esse é o numero da sua nova conta corrente: " + numero + " e sua agencia é " + agencia);
			System.out.println("Tipo da conta: ");
			tipo = 0;
			System.out.println("Insira seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Insira seu CPF: ");
			cpf = teclado.nextLine();
			System.out.println("Insira seu telefone: ");
			telefone = teclado.nextLine();
			saldo = 0;
			System.out.println("Seu saldo atual é = " + saldo);
			c1 = new ContaCorrente(numero, agencia, saldo, nome, cpf, telefone, tipo);
			contas.novaConta(c1);
		
			break;
			}

		case 2: {
			numero = random.nextInt((30000) - 1) + 10000;
			agencia = random.nextInt((3999) - 1) + 1000;
			limite = random.nextInt((100) - 1) - 600;
			System.out.println("Esse é o numero da sua nova conta corrente: " + numero + " e sua agencia é " + agencia);
			System.out.println("Seu limite liberado é de: R$" + limite);
			System.out.println("tipo da conta: ");
			tipo = 1;
			System.out.println("Insira seu nome: ");
			nome = teclado.nextLine();
			System.out.println("Insira seu CPF: ");
			cpf = teclado.nextLine();
			System.out.println("Insira seu telefone: ");
			telefone = teclado.nextLine();
			saldo = 0;
			System.out.println("Seu saldo atual é = " + saldo);
			c1 = new ContaEspecial(numero, agencia, saldo, nome, cpf, telefone, tipo, limite);
			contas.novaConta(c1);
			break;
		}

		case 3: {
			System.out.println("Insira o número da conta para visualizar seus dados:");
			entradaDigitada = teclado.nextLine();
			numero = Integer.parseInt(entradaDigitada);
			conta = contas.visualizarConta(numero);
			System.out.println(conta.toString());
			break;
		}

		case 4: {
			System.out.println(conta.getNome()+" digite o valor que deseja depositar:");
			entradaDigitada = teclado.nextLine();
			double valor = Double.parseDouble(entradaDigitada);
			conta.depositarValor(valor);
		break;
		}

		case 5: {
			System.out.println(conta.getNome()+" digite o valor que deseja sacar:");
			entradaDigitada = teclado.nextLine();
			double valor = Double.parseDouble(entradaDigitada);
			conta.sacarValor(valor);
			break;
		}

		case 6: {
			System.out.println("Lista de contas:");
			contas.listarContas();
			break;
		}

		case 7: {
			System.out.println("Fim do Programa!");
			break;
		}
		default:
			System.out.println("Opção invalida");
			break;
		}
	} // fim do laço while

		teclado.close();
	} // fim do método main

} // fim da classe
