package br.corp.wolfbank.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.corp.wolfbank.model.ContaCorrenteModel;

public interface ContaCorrenteDao extends CrudRepository<ContaCorrenteModel, Integer>{

	public ArrayList<ContaCorrenteModel> findByeNomeLike(String nome);
	public ArrayList<ContaCorrenteModel> findByeNumerooLessThan(int numero);

} // fim da interface
