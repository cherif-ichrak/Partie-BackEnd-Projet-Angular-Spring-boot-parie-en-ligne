package com.example.softher.sportG2.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Team {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TEAM_ID")
	private Long id;
	private String name;
	private String stadium;
	private String owner;
	private Long foundation;
	private Team() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Team(Long id, String name, String stadium, String owner, Long foundation) {
		super();
		this.id = id;
		this.name = name;
		this.stadium = stadium;
		this.owner = owner;
		this.foundation = foundation;
	}
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the stadium
	 */
	public String getStadium() {
		return stadium;
	}
	/**
	 * @param stadium the stadium to set
	 */
	public void setStadium(String stadium) {
		this.stadium = stadium;
	}
	/**
	 * @return the owner
	 */
	public String getOwner() {
		return owner;
	}
	/**
	 * @param owner the owner to set
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}
	/**
	 * @return the foundation
	 */
	public Long getFoundation() {
		return foundation;
	}
	/**
	 * @param foundation the foundation to set
	 */
	public void setFoundation(Long foundation) {
		this.foundation = foundation;
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", name=" + name + ", stadium=" + stadium + ", owner=" + owner + ", foundation="
				+ foundation + "]";
	}
	
	
}
