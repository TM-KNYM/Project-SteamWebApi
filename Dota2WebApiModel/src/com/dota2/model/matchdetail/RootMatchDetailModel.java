package com.dota2.model.matchdetail;

import com.dota2.model.RootModel;



public class RootMatchDetailModel extends RootModel {
	private final Result result;

	public RootMatchDetailModel(Result result){
		this.result = result;
	}
	
	/**
	 * 
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}

}
