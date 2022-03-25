
public class Senior extends Pessoa{
private double salario, bonus;

public Senior(String nome, String cpf, String telefone, double salario, double bonus) {
	super(nome, cpf, telefone);
	this.salario = salario;
	this.bonus = bonus;
}


public double calcularSalario(double valor) {
	bonus = salario * 50 / 100;
	return salario + bonus;
}

}
