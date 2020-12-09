package com.example.demo.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_character")
public class Personagem implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String description;

	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date modified;

	private String resourceURI;

	
//	@OneToMany(mappedBy="personagem", cascade = CascadeType.ALL)
//    Set<Url> url = new HashSet<Url>();
//	private Url urls;
	
	
	/*
	 * @OneToMany private List<Url> urls;
	 */

	/*
	 * private Image thumbnail;
	 * 
	 * private List<Comic> comics;
	 * 
	 * private List<Story> stories;
	 * 
	 * private List<Event> events;
	 * 
	 * private List<Serie> series;
	 */

	/*
	 * @OneToMany private Set<Url> urls;
	 */

}
