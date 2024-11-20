package com.JackClasses.DMS.Models;
/**
 * @author Anthony Jack
 */
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Dog {
	@Id
	private int id;
	private String breed;
	private String name;
	@ManyToOne
	private Trainer trainer;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Trainer getTrainer() {
		return trainer;
	}
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", breed=" + breed + ", name=" + name + ", trainer=" + trainer + "]";
	}
	
	
}
