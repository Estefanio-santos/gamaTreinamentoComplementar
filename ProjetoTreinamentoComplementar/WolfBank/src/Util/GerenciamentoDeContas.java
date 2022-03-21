package Util;

import java.util.ArrayList;
import Modelo.Conta;

public class GerenciamentoDeContas {
	private ArrayList<Conta> contas;

	public GerenciamentoDeContas() {
		contas = new ArrayList<>();
	}

	public void novaConta(Conta c1) {
		contas.add(c1);
	}

	public String visualizarConta(int numero) {
		for (int i = 0; i < contas.size(); i++) {
			if (contas.get(i).getNumero() == numero) {
				return contas.get(i).toString();
			} // fim da condicional if

		} // fim do laço de repetição for
		return "Conta não cadastrada!";
	}

	public void listarContas() {
		for (int i = 0; i < contas.size(); i++) {
			System.out.println(contas.get(i));
		}
	}

} // fim da classe
