
public class App {
public static void main(String[] args) {
	Pessoa p1 = new Pessoa("Estefanio", "383.993.248-33", "(11) 94804-9701");
	p1 = new Funcionario();
	p1.calcularSalario();
	System.out.println(p1.calcularSalario());
}
}
