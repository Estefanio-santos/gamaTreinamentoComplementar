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

import br.corp.wolfbank.dao.ContaEspecialDao;
import br.corp.wolfbank.model.ContaEspecialModel;

@RestController
@CrossOrigin("*")
public class ContaEspecialController {

	@Autowired
	private ContaEspecialDao dao;

@GetMapping("/contas")
public ResponseEntity<ArrayList<ContaEspecialModel>> listarTodas() {
	ArrayList<ContaEspecialModel> obterDados = (ArrayList<ContaEspecialModel>) dao.findAll();
	
	if(obterDados != null) {
		return ResponseEntity.ok(obterDados);
	} else {
		return ResponseEntity.notFound().build();
	}
}

@GetMapping("/conta/{numero}")
public ResponseEntity<ContaEspecialModel> buscarUmaUnicaConta(@PathVariable int numero) {
	ContaEspecialModel contaEspecial = dao.findById(numero).orElse(null);

	if(contaEspecial != null) {
		ResponseEntity.ok(contaEspecial);
	} else {
		return ResponseEntity.notFound().build();
	}
}

@PostMapping("/conta/nova")
public ResponseEntity<ContaEspecialModel> novaConta(@RequestBody ContaEspecialModel contaEspecial) {
	try {
		ContaEspecialModel novaConta = dao.save(contaEspecial);
		return ResponseEntity.ok(novaConta);
	} catch (Exception e) {
		return ResponseEntity.status(400).build();
	}
}

} // fim da classe
