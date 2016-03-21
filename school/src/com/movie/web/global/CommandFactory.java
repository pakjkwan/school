package com.movie.web.global;

public class CommandFactory {
	public Command getCommand(String a,String b){
		Command command = new Command(a,b);
		return command;
	}
}
