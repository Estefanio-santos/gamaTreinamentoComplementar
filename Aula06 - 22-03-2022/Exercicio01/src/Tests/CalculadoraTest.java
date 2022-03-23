package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import Main.Calculadora;

public class CalculadoraTest {

@

@Test
	public void deveRetornarASomaDosNumeros() {
		Calculadora c = new Calculadora();
		double resultado = c.somar(10, 20);
		assertEquals(30, resultado);
	}

@Test
	public void deveRetornarASubtracaoDosNumeros() {
		Calculadora c = new Calculadora();
		double resultado = c.subtracao(20, 10);
		assertEquals(10, resultado);
	}

public void deveRetornar() {
	double resultado = c.multiplicacao();
	assertEquals(2, resultado);
}


} // fim da classe
