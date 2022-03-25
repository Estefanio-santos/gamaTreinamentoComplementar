package br.corp.wolfbank.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.corp.wolfbank.model.ContaEspecialModel;

public interface ContaEspecialDao extends CrudRepository<ContaEspecialModel, Integer>{
public ArrayList<ContaEspecialModel> findByNomeLike(String nome);
public ArrayList<ContaEspecialModel> findByNumeroLessThan(int numero);

	
}
