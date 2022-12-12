package neoStockUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility_new {
	
	
	public static void main(String[] args) throws IOException
	{
		readDataFromPrpertisfile("Url");
		readDataFromPrpertisfile("username");
		readDataFromPrpertisfile("mobileNumber");
		readDataFromPrpertisfile("password");
	}
	
	
	public static String readDataFromPrpertisfile(String key) throws IOException
	{
		//create the object of properties file-----> given by java
		Properties prop=new Properties();
		
		//then create object of fileinputstreme class--->given by java
		
		FileInputStream myfile=new FileInputStream("C:\\Users\\user\\eclipse-workspace\\16july_evening_selenium\\Neostock.properties");
		
		//load the file into properties
		prop.load(myfile);
		
		String value = prop.getProperty(key);
		
		System.out.println(value);
		
		return value;
		
	}

}
