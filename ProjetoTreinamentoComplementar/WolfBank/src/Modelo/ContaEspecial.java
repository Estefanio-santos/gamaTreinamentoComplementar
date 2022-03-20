package Modelo;

public class ContaEspecial extends Conta{
private double saldo;
private int tipo = 1;
private String nome;
private String cpf;
private String telefone;

public ContaEspecial(int numero, int agencia, double saldo, int tipo, String nome, String cpf, String telefone) {
super(numero, agencia, saldo);
this.tipo = 1;
this.nome = nome;
this.cpf = cpf;
this.telefone = telefone;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " tipo " + tipo + " nome " + nome + " CPF " + cpf + " telefone " + telefone;
	}

public void depositarValor(double valor) {
if(valor > 0 ) {
	valor += saldo;
	System.out.println("depósito realizado com sucesso: R$" + valor);
} else {
	System.out.println("Valor inválido!");
}
}

public void sacarValor(double valor) {
if(valor >= -300) {
valor -= saldo;
	System.out.println("você está usando o limite da conta!");
} else if(valor <= saldo) {
valor -= saldo;
System.out.println("Saque realizado com sucesso: " + valor);
} else {
System.out.println("Saldo insuficiente!");
}
}

} // fim da classe
