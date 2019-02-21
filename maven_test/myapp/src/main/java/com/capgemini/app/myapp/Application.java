package com.capgemini.app.myapp;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class Application {

	private static Logger logger = Logger.getLogger(Application.class.getName());
    public static void main(String[] args) throws Exception{
    	
    	BasicConfigurator.configure();
    	logger.info("built");
    	Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Hello myapp");
    }

}