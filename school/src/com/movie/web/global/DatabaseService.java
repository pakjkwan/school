package com.movie.web.global;

import java.sql.Connection;

public interface DatabaseService {
	public Connection getConnection();
}
