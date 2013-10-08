package com.dota2webapi.accessor;

import java.io.IOException;
import java.net.URL;

import com.dota2.model.RootModel;

public abstract class AbstractGetModelCommand {

	private final ModelReciver reciver;
	protected final HttpAccsessor acsHttp = new HttpAccsessor();
	
	public AbstractGetModelCommand(ModelReciver reciver) {
		this.reciver = reciver;
	}

	abstract protected URL createUrl();

	abstract RootModel convertToModel(String json) ;
	abstract public void canExecute();
	
	public void execute() throws IOException{
		String json = acsHttp.getJsonStr( createUrl());
		reciver.recivedModel(convertToModel(json));
	}
}
