import java.util.ArrayList;

public class AppEd {

	public static void main(String[] args) {

// criando uma ArrayList //
ArrayList<Integer> menu = new ArrayList<>();

menu.add(10);

menu.add(20);

//adicionando itens na ArrayList //
menu.add(30); 

//mostrar um �nico item da ArrayList //
System.out.println(menu.get(2)); 

//verificar o tamanho do ArrayList //
System.out.println(menu.size()); 

for(int i = 0; i < menu.size(); i++) {
System.out.println(menu.get(i));
if(menu.get(i) == 10) {
System.out.println("Achei!");

// o break para a execu��o do la�o //
break; 

} // fim da condicional if

} // fim do la�o de repeti��o for
System.out.println("Fim do Programa!");
} // fim do m�todo main

} // fim da classe
