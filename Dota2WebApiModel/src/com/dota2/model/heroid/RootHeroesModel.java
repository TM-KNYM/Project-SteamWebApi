package com.dota2.model.heroid;

import com.dota2.model.RootModel;
import com.google.gson.annotations.SerializedName;



public class RootHeroesModel extends RootModel {
	@SerializedName("result")
	private final Result result;

	public RootHeroesModel(Result result){
		this.result = result;
	}
	
	/**
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}

}
