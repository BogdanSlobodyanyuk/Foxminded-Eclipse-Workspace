package ua.com.foxminded.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class DatabaseFacade {
	
	
	

	
	
	public static List<String> getBooks() {
		
		 
		
		List<String> result = new ArrayList<String>();


		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Books",
				"postgres", "1234")) {
			
			System.out.println("Java JDBC PostgreSQL Example");

			System.out.println("Connected to PostgreSQL database!");
			
			
			
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.books");
			
			
			
			while (resultSet.next()) {
				result.add(resultSet.getString("name"));
				//result.add(resultSet.getString("ID"));
			}
		} 
		
		catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	
	

	
	 public static void addBook (String newBook){
		
		 try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Books",
					"postgres", "1234")) {
				
				Statement statement = connection.createStatement();
				statement.executeUpdate("INSERT INTO books.books (\"NAME\") VALUES ( '" + newBook + "'  )");
				statement.close();
				connection.close();}	
		 
			

		
		catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
		
	}
	
	
	
	public static List<String> removeBook (String removeBook){
		
		List<String> result = new ArrayList<String>();
		
		
		
		

		try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Books",
				"postgres", "1234")) {
			System.out.println("Java JDBC PostgreSQL Example");

			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM books.books");
			
			
			while (resultSet.next()) {
				result.add(resultSet.getString("name"));
				//result.add(resultSet.getString("ID"));
			}
		} 
		
		catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
		
		
		
		return result;
		
		
		
	}
	
	
	/* public static List<String> addBooks() {
	        List<String> result=new ArrayList<String>();
	        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Books",
					"postgres", "1234")){
	            Scanner scanner = new Scanner(System.in);
	            while (scanner.hasNextLine()) {
	                result.addAll(addBooks());
	            }
	            scanner.close();
	        } catch (SQLException e) {
			
				e.printStackTrace();
			} 
	        return result;
	    } */
	 
	
	

	
	
}
