package com.example.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpServerErrorException;

import com.example.demo.dto.PersonagemResponseDTO;
import com.example.demo.models.Personagem;
import com.example.demo.services.PersonagemService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/v1/public")
@Api(value = "API REST Personagens")
@CrossOrigin(origins = "*")
public class PersonagemController {

	public static final Logger log = LoggerFactory.getLogger(PersonagemController.class);

	@Autowired
	PersonagemService personagemService;

	@GetMapping("/personagens")
	@ApiOperation(value = "Retorna uma lista de personagens")
	public ResponseEntity<List<Personagem>> listaPersonagens() {

		List<Personagem> lstPer = null;

		log.info("[PersonagemController.listaPersonagens] - Iniciando busca de personagens.");

		try {
			lstPer = personagemService.listaPersonagens();
		} catch (HttpServerErrorException e) {
			log.error("[PersonagemController.listaPersonagens] - Erro ao buscar personagens.", e);
		}
		return ResponseEntity.ok(lstPer);
	}

	@ApiOperation(value = "Retorna um personagem único")
	@GetMapping("/personagem/{id}")
	public ResponseEntity<List<PersonagemResponseDTO>> listaPersonagemUnico(@PathVariable(value = "id") long id) {
		List<PersonagemResponseDTO> personagem = null;

		personagem = personagemService.listaPersonagemUnico(id);
		return ResponseEntity.ok(personagem);
	}
}
