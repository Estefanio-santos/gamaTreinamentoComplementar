package Modelo;

public class ContaCorrente extends Conta{
private int tipo = 0;

public ContaCorrente(int numero, int agencia, double saldo, String nome, String cpf, String telefone, int tipo) {
super(numero, agencia, saldo, nome, cpf, telefone);
this.tipo = 0;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "; Tipo da Conta: " + tipo;
	}


@Override
	public void sacarValor(double valor) {
		// TODO Auto-generated method stub
		if(this.getSaldo() >= valor) {
			this.setSaldo(this.getSaldo() - valor);
System.out.println("Saque realizado com sucesso, R$" + valor + ", e seu saldo é de R$" + this.getSaldo());
		} else {
			System.out.println("Saldo insuficiente!");
		}
}

} // fim da classe
