
public class AppEbook {
public static void main(String[] args) {
System.out.println("Bem-vindos ao exercicio 03 da aula 02:");
Ebook livro1 = new Ebook("Estefanio Ferreira Santos", "Luz e Sombras", 300, 58);

System.out.println(livro1.mostrarDados() + ", página atual: " + livro1.getNumeroPaginaAtual());

System.out.println("avançar página: " + livro1.avançarPagina());
System.out.println("Insira o número da página:");
System.out.println("ir para página: " + livro1.mudarPagina(0));

System.out.println("Retroceder página para: " + livro1.retrocederPagina());

System.out.println("Fim do Exercicio");}
}
