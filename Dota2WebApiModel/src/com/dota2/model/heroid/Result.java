package com.dota2.model.heroid;

import java.util.List;



public class Result  {

	private final List<Hero> heroes;
	
	public Result(List<Hero> heroes) {
		this.heroes = heroes;
	}

	/**
	 * @return the heros
	 */
	public List<Hero> getHeroes() {
		return heroes;
	}
}
