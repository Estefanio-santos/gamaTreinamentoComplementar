import java.util.Scanner;

public class ProgramaMediaAritmetica {

public static void main(String[] args) {
System.out.println("bem-vindos ao exercício 01 referente a aula 01");
Scanner teclado = new Scanner(System.in);
double nota01, nota02, media;
System.out.println("Insira nota 01:");
nota01 = teclado.nextDouble();
System.out.println("Insira a nota 02: ");
nota02 = teclado.nextDouble();
media = ( nota01 + nota02 ) / 2;
System.out.println("O resultado da média aritmética entre as notas " + nota01 + " e " + nota02 + " é de: " + media);
System.out.println("Fim do Exercício");
teclado.close();
} // fim do método main

} // fim da classe
