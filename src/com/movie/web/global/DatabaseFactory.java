package com.movie.web.global;

public class DatabaseFactory {
	public static DatabaseService getDatabase(Vendor vendor, String id,String password){
		String driver = null,url = null;
		switch (vendor) {
		case ORACLE:
			driver = Constants.ORACLE_DRIVER;
			url = Constants.ORACLE_URL;
			break;
		case MYSQL:break;
		case MSSQL:break;
		default:
			break;
		}
		return new DatabaseServiceImpl(driver,url,id,password);
	}
}
