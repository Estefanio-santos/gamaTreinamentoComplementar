
public class Veiculo {

private String marca, modelo;
private int quantidadeConsumo;

public Veiculo(String marca, String modelo, int quantidadeConsumo) {
this.marca = marca;
this.modelo = modelo;
this.quantidadeConsumo = quantidadeConsumo;
} // construtor padrão

public String mostrarDados() {
return ("Marca do veículo: " + marca + ", Modelo do veículo: " + modelo);
} // método para mostrar dados do veículo

public int mostrarConsumo() {
return quantidadeConsumo;
} // Fim do método mostrarConsumo

} // fim da classe
