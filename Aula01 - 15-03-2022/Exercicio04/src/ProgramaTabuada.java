import java.util.Scanner;

public class ProgramaTabuada {

public static void main(String[] args) {

System.out.println("Bem-vindos ao exerc�cio 04 da aula 01:");
Scanner teclado = new Scanner(System.in);
int numeroEscolhido, multiplicador;
System.out.println("Insira um n�mero:");
numeroEscolhido = teclado.nextInt();
multiplicador = 0;

while(multiplicador <=10) {
int resultado = multiplicador * numeroEscolhido;
System.out.println(numeroEscolhido + " * " + multiplicador + " = " + resultado);
multiplicador++;
} // fim do la�o de repeti��o while
System.out.println("Fim do Exerc�cio");
teclado.close();

} // fim do m�todo main

} // fim da classe
