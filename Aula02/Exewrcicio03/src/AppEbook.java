
public class AppEbook {
public static void main(String[] args) {
System.out.println("Bem-vindos ao exercicio 03 da aula 02:");
Ebook livro1 = new Ebook("Estefanio Ferreira Santos", "Luz e Sombras", 300, 58);

System.out.println(livro1.mostrarDados() + ", p�gina atual: " + livro1.getNumeroPaginaAtual());

System.out.println("avan�ar p�gina: " + livro1.avan�arPagina());
System.out.println("Insira o n�mero da p�gina:");
System.out.println("ir para p�gina: " + livro1.mudarPagina(0));

System.out.println("Retroceder p�gina para: " + livro1.retrocederPagina());

System.out.println("Fim do Exercicio");}
}
