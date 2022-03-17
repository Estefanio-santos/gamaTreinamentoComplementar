import java.util.Scanner;

public class ProgramaTabuada {

public static void main(String[] args) {

System.out.println("Bem-vindos ao exercício 04 da aula 01:");
Scanner teclado = new Scanner(System.in);
int numeroEscolhido, multiplicador;
System.out.println("Insira um número:");
numeroEscolhido = teclado.nextInt();
multiplicador = 0;

while(multiplicador <=10) {
int resultado = multiplicador * numeroEscolhido;
System.out.println(numeroEscolhido + " * " + multiplicador + " = " + resultado);
multiplicador++;
} // fim do laço de repetição while
System.out.println("Fim do Exercício");
teclado.close();

} // fim do método main

} // fim da classe
