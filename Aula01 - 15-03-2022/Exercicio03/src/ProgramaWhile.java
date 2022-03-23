import java.util.Scanner;

public class ProgramaWhile {

public static void main(String[] args) {
System.out.println("bem-vindos ao exercício 03 da aula 01:");
Scanner teclado = new Scanner(System.in);
int numeroEscolhido, contador;
System.out.println("Digite um número:");
numeroEscolhido = teclado.nextInt();
contador = 1;
while(contador <= numeroEscolhido) {
System.out.println(contador);
contador++;
} // fim do laço de repetição while
System.out.println("Fim do Exercício");
teclado.close();
} // fim do método main

} // fim da classe
