package Modelo;

public class Conta {
	private int numero, agencia;
	private double saldo;
	private String nome, cpf, telefone;

	public Conta(int numero, int agencia, double saldo, String nome, String cpf, String telefone) {

		this.numero = numero;
		this.agencia = agencia;
		this.saldo = saldo;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;

	} // fim do construtor

	public int getNumero() {
		return numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void depositarValor(double valor) {
		saldo += valor;
	}

	public void sacarValor(double valor) {
		saldo -= valor;
	}

	@Override
	public String toString() {
		return "Conta: " + numero + "; - Agência: " + agencia + "; - Saldo de R$" + saldo + "; Nome: " + nome
				+ "; CPF: " + cpf + "; + telefone: " + telefone;
	}
} // fim da classe
