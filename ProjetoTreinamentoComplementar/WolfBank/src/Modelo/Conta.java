package Modelo;

public class Conta {
private int numero, agencia;
private double saldo;

public Conta(int numero, int agencia, double saldo) {

	this.numero = numero;
this.agencia = agencia;
this.saldo = saldo;

} // fim do construtor

public int getNumero() {
return numero;
}

public int getAgencia() {
return agencia;
}

public double getSaldo() {
return saldo;
}

public void setNumero(int numero) {
this.numero = numero;
}

public void setAgencia(int agencia) {
this.agencia = agencia;
}

public void setSaldo(double saldo) {
this.saldo = saldo;
}

public void depositarValor(double valor) {
valor += saldo;
}

public void sacarValor(double valor) {
valor -= saldo;
}

@Override
public String toString() {
return numero + " - " + agencia + " - " + saldo;
}
} // fim da classe
