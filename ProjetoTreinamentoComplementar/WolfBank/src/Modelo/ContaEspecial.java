package Modelo;

public class ContaEspecial extends Conta {
	private int tipo = 1;

	public ContaEspecial(int numero, int agencia, double saldo, String nome, String cpf, String telefone, int tipo) {
		super(numero, agencia, saldo, nome, cpf, telefone);
		this.tipo = 1;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " tipo " + tipo;
	}

	@Override
	public void depositarValor(double valor) {
		// TODO Auto-generated method stub
		super.depositarValor(valor);
	}

	@Override
	public void sacarValor(double valor) {
		// TODO Auto-generated method stub
		super.sacarValor(valor);
	}

} // fim da classe
