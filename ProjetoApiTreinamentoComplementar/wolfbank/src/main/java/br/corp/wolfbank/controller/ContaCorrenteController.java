package br.corp.wolfbank.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.corp.wolfbank.dao.ContaCorrenteDao;
import br.corp.wolfbank.model.ContaCorrenteModel;

@RestController
@CrossOrigin("*")
public class ContaCorrenteController {

	@Autowired
	private ContaCorrenteDao dao;

@GetMapping("/contacorrente")
public ResponseEntity<ArrayList<ContaCorrenteModel>> listarTodas() {
	ArrayList<ContaCorrenteModel> obterDados = (ArrayList<ContaCorrenteModel>) dao.findAll();
	
	if(obterDados != null) {
		return ResponseEntity.ok(obterDados);
	} else {
		return ResponseEntity.notFound().build();
	}
}

@GetMapping("/contacorrente/{numero}")
public ResponseEntity<ContaCorrenteModel> buscarUmaUnicaConta(@PathVariable int numero) {
	ContaCorrenteModel contaCorrente = dao.findById(numero).orElse(null);

	if(contaCorrente != null) {
		return ResponseEntity.ok(contaCorrente);
	} else {
		return ResponseEntity.notFound().build();
	}
}

@PostMapping("/contacorrente/nova")
public ResponseEntity<ContaCorrenteModel> novaConta(@RequestBody ContaCorrenteModel contaCorrente) {
	try {
		ContaCorrenteModel novaConta = dao.save(contaCorrente);
		return ResponseEntity.ok(novaConta);
	} catch (Exception e) {
		return ResponseEntity.status(400).build();
	}
}


} // fim da classe
