package Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

public class FizzBuzzTests {
@Test
	public void deveRetornarFizzQuandoMultiploDeTres() {
	FizzBuzz f = new FizzBuzz();
String retorno = f.calcular(3);
assertEquals("Fizz", retorno);
}
	
}
