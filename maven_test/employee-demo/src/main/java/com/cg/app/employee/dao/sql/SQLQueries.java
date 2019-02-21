package com.cg.app.employee.dao.sql;

import java.util.ResourceBundle;

public final class SQLQueries {
	
	public static SQLQueries queries = new SQLQueries();
	private SQLQueries() {}
	
	public static SQLQueries getInstance() {
		return queries;
		
	}
	
	public String insertQuery() {
		
		ResourceBundle bundle = ResourceBundle.getBundle("sql-queries");
		return bundle.getString("INSERT_Employee");
		
	}
	

}
