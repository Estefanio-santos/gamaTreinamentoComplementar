package Modelo;

public class ContaEspecial extends Conta {
	private int tipo = 1;
	private double limite;

	public ContaEspecial(int numero, int agencia, double saldo, String nome, String cpf, String telefone, int tipo, double limite) {
		super(numero, agencia, saldo, nome, cpf, telefone);
		this.tipo = 1;
		this.limite = limite;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " tipo " + tipo + ", limite R$" + limite;
	}

	@Override
	public void sacarValor(double valor) {
		// TODO Auto-generated method stub
		if(this.getSaldo() - valor >= limite) {
			this.setSaldo(this.getSaldo()-valor);
				System.out.println("Saque realizado com sucesso: R$" + valor + ". Seu saldo é de: " + this.getSaldo() + ", e seu limite é de R$" + limite);
		} else {
		System.out.println("Saldo insuficiente.");
		}
	}

@Override
public void transfereValor(double valor, Conta destino) {
	// TODO Auto-generated method stub
	super.transfereValor(valor, destino);
		if(this.getSaldo() - valor >= limite) {
			this.setSaldo(this.getSaldo() - valor);
			destino.depositarValor(valor);
		} else {
			System.out.println("Saldo insuficiente!");
		}
}

} // fim da classe
