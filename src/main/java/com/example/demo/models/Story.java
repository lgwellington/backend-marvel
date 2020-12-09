/*
 * package com.example.demo.models;
 * 
 * import java.io.Serializable; import java.util.List;
 * 
 * import javax.persistence.Embeddable; import javax.persistence.EmbeddedId;
 * import javax.persistence.Entity; import javax.persistence.Table;
 * 
 * import lombok.Data;
 * 
 * @Data
 * 
 * @Embeddable
 * 
 * @Entity
 * 
 * @Table(name = "TB_STORY") public class Story implements Serializable {
 * 
 * private static final long serialVersionUID = 1L;
 * 
 * @EmbeddedId private Character character;
 * 
 * private int available;
 * 
 * private int returned;
 * 
 * private String collectionURI;
 * 
 * private List<StorySummary> items;
 * 
 * }
 */