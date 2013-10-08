package com.dota2.model.matchhistory;

import com.dota2.model.RootModel;



public class RootMatchHistoryModel extends RootModel {
	private final Result result;

	public RootMatchHistoryModel(Result result){
		this.result = result;
	}
	
	/**
	 * @return the result
	 */
	public Result getResult() {
		return result;
	}

}
