
package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.PersonagemResponseDTO;
import com.example.demo.models.Personagem;

 
public interface PersonagemService { 
	
	public List<Personagem> listaPersonagens();
	
	public List<PersonagemResponseDTO> listaPersonagemUnico(long id);
	
}
