package com.pedrodosreis.model;

import java.util.UUID;

public class Recipe {
	
	String id;
	
	String name;
	
	String timeRecipe;
	
	String createdBy;
	
	public Recipe (String name, String timeRecipe, String createdBy) {
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.timeRecipe = timeRecipe;
		this.createdBy = createdBy;
	}
	
	public Recipe() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTimeRecipe() {
		return timeRecipe;
	}

	public void setTimeRecipe(String timeRecipe) {
		this.timeRecipe = timeRecipe;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {		
		return "Nome: " + name + " Tempo de Preparo: " + timeRecipe + " Criado por: " + createdBy;
	}
	
	

}
