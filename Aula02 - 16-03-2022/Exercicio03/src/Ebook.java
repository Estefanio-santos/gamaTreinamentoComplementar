import java.util.Scanner;

public class Ebook {
Scanner teclado = new Scanner(System.in);
private String autor, nomeDoLivro;
private int quantidadePaginasTotal, numeroPaginaAtual;


public Ebook(String autor, String nomeDoLivro, int quantidadePaginasTotal, int numeroPaginaAtual) {
	super();
	this.autor = autor;
	this.nomeDoLivro = nomeDoLivro;
	this.quantidadePaginasTotal = quantidadePaginasTotal;
	this.numeroPaginaAtual = numeroPaginaAtual;
}

public String getAutor() {
	return autor;
}

public void setAutor(String autor) {
	this.autor = autor;
}

public String getNomeDoLivro() {
	return nomeDoLivro;
}

public void setNomeDoLivro(String nomeDoLivro) {
	this.nomeDoLivro = nomeDoLivro;
}

public int getQuantidadePaginasTotal() {
	return quantidadePaginasTotal;
}

public void setQuantidadePaginasTotal(int quantidadePaginasTotal) {
	this.quantidadePaginasTotal = quantidadePaginasTotal;
}

public int getNumeroPaginaAtual() {
	return numeroPaginaAtual;
}

public void setNumeroPaginaAtual(int numeroPaginaAtual) {
	this.numeroPaginaAtual = numeroPaginaAtual;
}

public String mostrarDados() {
return ("autor: " + autor + "; Nome do Livro: " + nomeDoLivro + "; quantidade de páginas: " + quantidadePaginasTotal );
}

public int avançarPagina() {
return numeroPaginaAtual += 1;

}

public int retrocederPagina() {
if(numeroPaginaAtual >= 0 && numeroPaginaAtual <= quantidadePaginasTotal) {
	
}
	return numeroPaginaAtual -= 1;
}

public int mudarPagina(int numeroPagina) {
numeroPagina = teclado.nextInt();
return numeroPaginaAtual = numeroPagina;
}
} // fim da classe
