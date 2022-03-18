
public class AppVeiculo {

public static void main(String[] args) {
System.out.println("Bem-vindos ao exercício 01 da aula 02:");
Veiculo v1 = new Veiculo("honda", "Fit", 10);
System.out.println(v1.mostrarDados());
System.out.println("O consumo deste veículo é de: " + v1.mostrarConsumo() + " km por litro.");
System.out.println("Fim do Exercicio.");

} // fim do método main

} // fim da classe
