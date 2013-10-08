package com.dota2webapi.accessor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class HttpAccsessor {
	public String getJsonStr(URL url) throws IOException{
		
		HttpURLConnection  connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("GET");
        connection.connect();

        if(connection.getResponseCode() != 200) {
            throw new IOException();
        }
		BufferedReader reader = new BufferedReader
				(new InputStreamReader(connection.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = reader.readLine()) != null) {
			response.append(inputLine);
		}
		reader.close();
		return response.toString();
	}
	
	
	
	public String getJsonStr(String strUrl) throws IOException{
		URL url = new URL(strUrl);
		return getJsonStr(url);
	}
}
