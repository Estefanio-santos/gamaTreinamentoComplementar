import java.util.Scanner;

public class ProgramaWhile {

public static void main(String[] args) {
System.out.println("bem-vindos ao exerc�cio 03 da aula 01:");
Scanner teclado = new Scanner(System.in);
int numeroEscolhido, contador;
System.out.println("Digite um n�mero:");
numeroEscolhido = teclado.nextInt();
contador = 1;
while(contador <= numeroEscolhido) {
System.out.println(contador);
contador++;
} // fim do la�o de repeti��o while
System.out.println("Fim do Exerc�cio");
teclado.close();
} // fim do m�todo main

} // fim da classe
