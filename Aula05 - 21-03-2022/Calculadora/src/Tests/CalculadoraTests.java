package Tests;

import Main.Calculadora;

public class CalculadoraTests {
private Calculadora c;

@BeforeEach
public void setup() {
	c = new Calculadora();
}

@Test
public void deveRetornarASomaDosNumeros() {
	double resultado = c.somar(10, 20);
AssertEquals(30, resultado);
}

public void deveRetornarASubtracaoDosNumeros() {
	double resultado = c.subtrair(10, 20);
AssertEquals(10, resultado);
}
public void deveRetornarAMultiplicacaoDosNumeros() {
	double resultado = c.multiplicar(3, 2);
AssertEquals(6, resultado);
}

public void deveRetornarAdivisaoDosNumerosQuandoDivisorDiferenteDeZero() {
	double resultado = c.dividir(4, 2);
	AssertEquals(2, resultado);
}

@Test
public void deveRetornarValorNegativoQuandoDivisorIgualZero() {
	double resultado = c.dividir(0, 0);
	AssertEquals(-1, resultado);
}

}
