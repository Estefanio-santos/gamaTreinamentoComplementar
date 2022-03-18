import java.util.Scanner;

public class ProgramaTesteRepeticao {

public static void main(String[] args) {

System.out.println("bem-vindos ao exercício 05 da aula 01:");
Scanner teclado = new Scanner(System.in);
int numeroEscolhido, soma;
numeroEscolhido = 1;
soma = 0;
while(numeroEscolhido != 0 ) {
System.out.println("Insira um nnúmero:");
numeroEscolhido = teclado.nextInt();
soma = soma + numeroEscolhido;
}
System.out.println(soma);
teclado.close();
} // fim do método main

} // fim da classe
