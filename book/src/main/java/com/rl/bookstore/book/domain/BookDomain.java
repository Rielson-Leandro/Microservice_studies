package com.rl.bookstore.book.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.rl.bookstore.book.util.LocalTimeDeserializer;
import com.rl.bookstore.book.util.LocalTimeSerializer;

@Entity
public class BookDomain {
	
	private Long masterBookId;
	private String title;
	private List<String> authors;
	private String publishngHouse;
	private List<String> tags;
	private UUID isbn;
	private Double retailPrice;
	private String mongoId;
	
	@JsonSerialize(using = LocalTimeSerializer.class)
	@JsonDeserialize(using = LocalTimeDeserializer.class)
	private LocalDateTime publicationDate;
	
	public BookDomain() {
		
	}
	
	public BookDomain(String title, List<String> authors, LocalDateTime publicationDate, String publishngHouse, List<String> tags, UUID isbn, Double retailPrice){
		
		this.title = title;
		this.authors = authors;
		this.publicationDate = publicationDate;
		this.publishngHouse = publishngHouse;
		this.tags = tags;
		this.isbn = isbn;
		this.retailPrice = retailPrice;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Long getMasterBookId() {
		return masterBookId;
	}

	public void setMasterBookId(Long masterBookId) {
		this.masterBookId = masterBookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@ElementCollection
	@CollectionTable(name = "authors")
	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	public String getPublishngHouse() {
		return publishngHouse;
	}

	public void setPublishngHouse(String publishngHouse) {
		this.publishngHouse = publishngHouse;
	}

	@ElementCollection
	@CollectionTable(name = "tags")
	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public UUID getIsbn() {
		return isbn;
	}

	public void setIsbn(UUID isbn) {
		this.isbn = isbn;
	}

	public Double getRetailPrice() {
		return retailPrice;
	}

	public void setRetailPrice(Double retailPrice) {
		this.retailPrice = retailPrice;
	}

	public String getMongoId() {
		return mongoId;
	}

	public void setMongoId(String mongoId) {
		this.mongoId = mongoId;
	}

	public LocalDateTime getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(LocalDateTime publicationDate) {
		this.publicationDate = publicationDate;
	}
}