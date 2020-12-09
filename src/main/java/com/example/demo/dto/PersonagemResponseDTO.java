package com.example.demo.dto;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
//@Component
public class PersonagemResponseDTO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private long id;

	private String name;

	private String description;

	@JsonFormat(pattern="dd-MM-yyyy")
	private Date modified;

	private String resourceURI;
	
	private String type;

	private String url;

}
