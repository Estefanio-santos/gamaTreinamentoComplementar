
public class Veiculo {

private String marca, modelo;
private int quantidadeConsumo;

public Veiculo(String marca, String modelo, int quantidadeConsumo) {
this.marca = marca;
this.modelo = modelo;
this.quantidadeConsumo = quantidadeConsumo;
} // construtor padr�o

public String mostrarDados() {
return ("Marca do ve�culo: " + marca + ", Modelo do ve�culo: " + modelo);
} // m�todo para mostrar dados do ve�culo

public int mostrarConsumo() {
return quantidadeConsumo;
} // Fim do m�todo mostrarConsumo

} // fim da classe
