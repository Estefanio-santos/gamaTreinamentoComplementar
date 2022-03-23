package Main;

public class Calculadora {

public double somar(double n1, double n2) {
	return n1 + n2;
}

public double subtracao(double n1, double n2) {
	return n1 - n2;
}

public double multiplicar(double n1, double n2) {
	return n1 * n2;
}

public double dividir(double n1, double n2) {
if(n2 == 0) {
	return -1;
} else {
	return n1 / n2;
}
}

} // fim da classe
