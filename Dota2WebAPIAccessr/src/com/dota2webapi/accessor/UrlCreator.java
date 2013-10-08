package com.dota2webapi.accessor;

public class UrlCreator {
	private enum URL_CONSTANTS {
		KEY("?key="),
		GET_MATCH("https://api.steampowered.com/IDOTA2Match_570/"),
		GET_HEROS("https://api.steampowered.com/IEconDOTA2_205790/GetHeroes/v0001/"),
		GET_MATCH_HISTORY("GetMatchHistory/V001/"),
		GET_MATCH_DETAIL("GetMatchDetails/V001/"),
		ACCOUNT_ID("&account_id="),
		MATCH_ID("?match_id=");
		
		private String value;

		URL_CONSTANTS(String str){
			this.value = str;
		}
		
		public String getValue(){
			return value;
		}
	}	
	private final String key;
	public UrlCreator(String key) {
		this.key = key;
	}

	public  String getMatchHistory(){
		return URL_CONSTANTS.GET_MATCH.getValue()+URL_CONSTANTS.GET_MATCH_HISTORY.getValue()
				+URL_CONSTANTS.KEY.getValue()+key;
	}
	
	public  String getMatchHistoryAccountId(long accountId){
		return URL_CONSTANTS.GET_MATCH.getValue()+URL_CONSTANTS.GET_MATCH_HISTORY.getValue()
				+URL_CONSTANTS.KEY.getValue()+key+URL_CONSTANTS.ACCOUNT_ID.getValue()+accountId;
	}
	
	public  String getHeros(){
		return URL_CONSTANTS.GET_HEROS.getValue()+URL_CONSTANTS.KEY.getValue()+key;
	}
	
	
}
