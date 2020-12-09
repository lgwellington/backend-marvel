
package com.example.demo.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.PersonagemResponseDTO;
import com.example.demo.models.Personagem;
import com.example.demo.repository.PersonagemRepository;
import com.example.demo.services.PersonagemService;

@Service
public class PersonagemServiceImpl implements PersonagemService{
	
	@Autowired
	PersonagemRepository personagemRepository;

	@Override
	public List<Personagem> listaPersonagens() {

		return personagemRepository.findAll();
		
	}

	@Override
	public List<PersonagemResponseDTO> listaPersonagemUnico(long id) {
		
		//List<PersonagemResponseDTO> lst = null;
		return personagemRepository.listaPersonagemUnico(id);
	}
	
	

	

}
