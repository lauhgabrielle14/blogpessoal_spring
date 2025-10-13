package com.generation.blogpessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.blogpessoal.model.Postagem;
import com.generation.blogpessoal.repository.PostagemRepository;

@RestController// informa que a classe é um controller
@RequestMapping("/postagens")// localhost:8080/postagens
@CrossOrigin(origins = "*", allowedHeaders = "*")// liberando o acesso para todas as origens
public class PostagemController {
	
	@Autowired// faz a injeção de dependência
	private PostagemRepository postagemRepository;// criando o objeto postagemRepository
	
	@GetMapping// mapeando o método getAll
	public ResponseEntity<List<Postagem>> getAll(){// criando o método getAll
		return ResponseEntity.ok(postagemRepository.findAll());// retornando a lista de postagens
		//SELECT * FROM tb_postagens
	}
}
