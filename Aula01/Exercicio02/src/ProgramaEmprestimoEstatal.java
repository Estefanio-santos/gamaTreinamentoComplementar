import java.util.Scanner;

public class ProgramaEmprestimoEstatal {

public static void main(String[] args) {

System.out.println("Bem-vindos ao exerc�cio 02 da aula 01:");
Scanner teclado = new Scanner(System.in);
double rendaBruta, valorPrestacao, calculoPorcentagem;
System.out.println("Insira o valor de seu sal�rio bruto:");
rendaBruta = teclado.nextDouble();
System.out.println("Insira o valor da presta��o que voc� deseja pagar pelo empr�stimo:");
valorPrestacao = teclado.nextDouble();
calculoPorcentagem = rendaBruta * 30 / 100;
if(valorPrestacao <= calculoPorcentagem) {
System.out.println("Parab�ns, empr�stimo aprovado.");
} else {
System.out.println("Que pena, o empr�stimo n�o foi aprovado, seu limite atual � de: " + calculoPorcentagem);
} // fim da condicional if else
System.out.println("Fim do Exerc�cio");
teclado.close();

} // fim do m�todo main

} // fim da classe
