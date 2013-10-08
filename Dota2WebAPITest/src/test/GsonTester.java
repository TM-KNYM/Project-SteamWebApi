package test;

import static org.junit.Assert.assertTrue;

import java.io.IOException;




import org.junit.Test;

import com.dota2.model.heroid.RootHeroesModel;
import com.dota2.model.matchhistory.RootMatchHistoryModel;
import com.dota2webapi.accessor.UrlCreator;
import com.dota2webapi.accessor.HttpAccsessor;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonTester {
	
	private UrlCreator urlCreator = new UrlCreator(TestConst.key);
	
	@Test
	public void testGetJsonStr() {
		String url = urlCreator.getMatchHistoryAccountId(TestConst.accountId);
		try {
			String json = new HttpAccsessor().getJsonStr(url);
			System.out.println(json);
			Gson gson  = new Gson();
			RootMatchHistoryModel result = gson.fromJson(json,RootMatchHistoryModel.class);
			result.getResult();
		} catch (IOException e) {
		assertTrue(false);
		}
		
	}
	
	@Test
	public void testGetHeros() {
		String url = urlCreator.getHeros();
		try {
			String json = new HttpAccsessor().getJsonStr(url);
			System.out.println(json);
			GsonBuilder gsonBuilder  = new GsonBuilder();
			Gson gson = gsonBuilder.create();	
			RootHeroesModel result = gson.fromJson(json, RootHeroesModel.class);
			result.getResult();
		} catch (IOException e) {
		assertTrue(false);
		}
		
	}
	
	@Test
	public void testMatchDetail(){
		
	}
}
