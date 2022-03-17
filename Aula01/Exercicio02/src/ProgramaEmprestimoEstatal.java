import java.util.Scanner;

public class ProgramaEmprestimoEstatal {

public static void main(String[] args) {

System.out.println("Bem-vindos ao exercício 02 da aula 01:");
Scanner teclado = new Scanner(System.in);
double rendaBruta, valorPrestacao, calculoPorcentagem;
System.out.println("Insira o valor de seu salário bruto:");
rendaBruta = teclado.nextDouble();
System.out.println("Insira o valor da prestação que você deseja pagar pelo empréstimo:");
valorPrestacao = teclado.nextDouble();
calculoPorcentagem = rendaBruta * 30 / 100;
if(valorPrestacao <= calculoPorcentagem) {
System.out.println("Parabéns, empréstimo aprovado.");
} else {
System.out.println("Que pena, o empréstimo não foi aprovado, seu limite atual é de: " + calculoPorcentagem);
} // fim da condicional if else
System.out.println("Fim do Exercício");
teclado.close();

} // fim do método main

} // fim da classe
