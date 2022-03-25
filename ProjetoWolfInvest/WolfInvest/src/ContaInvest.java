import java.util.Scanner;

public class ContaInvest {
Scanner teclado = new Scanner(System.in);
private double rendaBruta = teclado.nextDouble();
private double custosFixos;
private double custosVariaveis;
private double investimento;
private double dividas;

public ContaInvest(double rendaBruta, double custosFixos, double custosVariaveis, double investimento, double dividas) {
	this.rendaBruta = rendaBruta;
	this.custosFixos = custosFixos;
	this.custosVariaveis = custosVariaveis;
	this.investimento = investimento;
	this.dividas = dividas;
}

public ContaInvest() {
	// TODO Auto-generated constructor stub
}

public double getRendaBruta() {
	return rendaBruta;
}

public void setRendaBruta(double rendaBruta) {
	this.rendaBruta = rendaBruta;
}

public double getCustosFixos() {
	return custosFixos;
}

public void setCustosFixos(double custosFixos) {
	this.custosFixos = custosFixos;
}

public double getCustosVariaveis() {
	return custosVariaveis;
}

public void setCustosVariaveis(double custosVariaveis) {
	this.custosVariaveis = custosVariaveis;
}

public double getInvestimento() {
	return investimento;
}

public void setInvestimento(double investimento) {
	this.investimento = investimento;
}

public double getDividas() {
	return dividas;
}

public void setDividas(double dividas) {
	this.dividas = dividas;
}

public void calcularPorcentagemCustosFixos() {
	double valor = 50 / 100;
	System.out.println(this.custosFixos = this.rendaBruta * valor);
}

public void calcularPorcentagemCustosVariaveis() {
	double valor = 10 / 100;
	System.out.println(this.custosVariaveis = this.rendaBruta * valor);
}

public void calcularPorcentagemInvestimentos() {
	double valor = 20 / 100;
System.out.println(this.investimento = this.rendaBruta * valor);
}

public void calcularPorcentagemDivida() {
	double valor = 20 / 100;
	System.out.println(this.dividas = this.rendaBruta * valor);
}
}
