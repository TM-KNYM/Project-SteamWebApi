package com.dota2.model.heroid;

public class Hero {

	private final String name;
	private final String id;
	public Hero(String name, String id) {
		this.name = name;
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	
	
}
