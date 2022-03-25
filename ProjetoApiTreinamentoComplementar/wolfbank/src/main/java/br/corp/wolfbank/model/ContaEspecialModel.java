package br.corp.wolfbank.model;

import java.util.Random;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbcontaespecial")
public class ContaEspecialModel {
Random random = new Random();
@Id
@Column(name = "numero")
private int numero = random.nextInt((29999) + 1) + 10000;

@Column(name = "agencia")
private int agencia = random.nextInt((3999) + 1) + 1000;

@Column(name = "tipo")
private int tipo = 1;

@Column(name = "saldo")
private double saldo;

@Column(name = "limite")
private double limite = random.nextInt((0) + 1) - 1000;

@Column(name = "nome", length = 100, nullable = false)
private String nome;

@Column(name = "cpr", length = 14, nullable = false)
private String cpf;

@Column(name = "telefone", length = 14, nullable = false)
private String telefone;

public int getNumero() {
	return numero;
}

public void setNumero(int numero) {
	this.numero = numero;
}

public int getAgencia() {
	return agencia;
}

public void setAgencia(int agencia) {
	this.agencia = agencia;
}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public double getSaldo() {
	return saldo;
}

public void setSaldo(double saldo) {
	this.saldo = saldo;
}

public double getLimite() {
	return limite;
}

public void setLimite(double limite) {
	this.limite = limite;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public String getCpf() {
	return cpf;
}

public void setCpf(String cpf) {
	this.cpf = cpf;
}

public String getTelefone() {
	return telefone;
}

public void setTelefone(String telefone) {
	this.telefone = telefone;
}

public ContaEspecialModel() {
	
}

public ContaEspecialModel(int numero, int agencia, int tipo, double saldo, double limite, String nome, String cpf,
		String telefone) {
	this.numero = numero;
	this.agencia = agencia;
	this.tipo = tipo;
	this.saldo = saldo;
	this.limite = limite;
	this.nome = nome;
	this.cpf = cpf;
	this.telefone = telefone;
}

}
