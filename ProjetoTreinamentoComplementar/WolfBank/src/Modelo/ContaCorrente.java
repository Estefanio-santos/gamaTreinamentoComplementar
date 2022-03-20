package Modelo;

public class ContaCorrente extends Conta{
private double saldo;
private int tipo = 0;
private String nome;
private String cpf;
private String telefone;

public ContaCorrente(int numero, int agencia, double saldo, int tipo, String nome, String cpf, String telefone) {
super(numero, agencia, saldo);
this.tipo = 0;
this.nome = nome;
this.cpf = cpf;
this.telefone = telefone;
}

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " tipo " + tipo + " nome " + nome + " CPF " + cpf + " telefone " + telefone ;
	}

public void depositarValor(double valor) {
if(valor > 0 ) {
valor += saldo;
} else {
System.out.println("Valor inválido!");
}

}

public void sacarValor(double valor) {
if(valor > 0 && valor <= saldo) {
valor -= saldo;
System.out.println("Saque realizado com sucesso: R$" + valor);
}  else {
System.out.println("Valor inválido!");
}
}

} // fim da classe
