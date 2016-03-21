package com.movie.web.global;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CommandFactory {
	public static Command getCommand(HttpServletRequest request, HttpServletResponse response){
		String[] arr = new String[2];
		String path = request.getServletPath();
		String temp = path.split("/")[2];
		
		arr[0] = path.split("/")[1];
	//	arr[1] = temp3.split("\\.")[0]; 이 방법도 가능
		arr[1] = temp.substring(0, temp.indexOf("."));
		
		return new Command(arr[0],arr[1]);
	}
	public static Command createCommand(String directory,String action){
		return new Command(directory,action);
	}
}
