package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Main.Calculadora;

public class CalculadoraTest {
private Calculadora c;

@BeforeEach
public void setup() {
	c = new Calculadora();
}

@Test
	public void deveRetornarASomaDosNumeros() {
	double resultado = c.somar(10, 20);
		assertEquals(30, resultado);
	}

@Test
	public void deveRetornarASubtracaoDosNumeros() {
		double resultado = c.subtracao(20, 10);
		assertEquals(10, resultado);
	}

@Test
public void deveRetornarAMultiplicacaoDosNumeros() {
	double resultado = c.multiplicar(2, 3);
	assertEquals(6, resultado);
}

@Test
public void deveRetornarADivisaoDosNumerosQuandoDivisorDiferenteDeZero() {
	double resultado = c.dividir(4, 2);
	assertEquals(2, resultado);
}

@Test
public void deveRetornarValorNegativoQuandoDivisorIgualZero() {
	double resultado = c.dividir(0, 0);
	assertEquals(-1, resultado);
}

} // fim da classe
