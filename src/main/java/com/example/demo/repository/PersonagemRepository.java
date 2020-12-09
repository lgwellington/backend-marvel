package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.dto.PersonagemResponseDTO;
import com.example.demo.models.Personagem;

public interface PersonagemRepository extends JpaRepository<Personagem, Long> {
	
	@Query(" SELECT "
			+ " NEW com.example.demo.dto.PersonagemResponseDTO( "
			+ " tc.id,"
			+ " tc.name,"
			+ " tc.description,"
			+ " tc.modified,"
			+ " tc.resourceURI,"
			+ " tu.type,"
			+ " tu.url)"
			+ " FROM Personagem tc JOIN Url tu"
			+ " ON tu.personagem.id = tc.id "
			+ " WHERE tc.id = :#{#id} ")
	List<PersonagemResponseDTO> listaPersonagemUnico(@Param("id") long id);
	
	
	/*
	 * @Query(" SELECT tc, tu " + " FROM Personagem tc INNER JOIN Url tu " +
	 * " ON tu.character_id = tc.id " + " WHERE tc.id = :#{#id} ") Personagem
	 * listaPersonagemUnicoFunfa(@Param("id") long id);
	 */

}
