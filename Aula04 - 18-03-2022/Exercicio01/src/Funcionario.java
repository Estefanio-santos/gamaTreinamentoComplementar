
public class Funcionario extends Pessoa{
private double salario;

public Funcionario(String nome, String cpf, String telefone, double salario) {
	super(nome, cpf, telefone);
	this.salario = salario;
}

public double calcularSalario(double valor) {
	valor =  salario * 5 / 100;
	return salario + valor;
}

}
