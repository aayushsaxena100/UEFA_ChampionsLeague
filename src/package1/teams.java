package package1;

import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class teams {

	String name;
	String country;
	String league;
	int points;
	
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	void displayTeams() {
			String url = "jdbc:mysql://localhost/MovieRating";

			try {
				Class.forName("com.mysql.jdbc.Driver");

			} catch(java.lang.ClassNotFoundException e) {
				System.err.print("ClassNotFoundException: ");
				System.err.println(e.getMessage());
			}

			try {
				con = DriverManager.getConnection(url, "root", "12438630");
				stmt = con.createStatement();
	   		    
	   		    ResultSet rs=stmt.executeQuery("select * from teams");
	   		    while(rs.next())  
   		    	{
	   		    	System.out.println(rs.getString("name")+"  "+rs.getString("country")+"  "+rs.getString("league"));
   		    	}
	   		    	
			} catch(SQLException ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}finally{
				try{
					stmt.close();
					con.close();
				}catch(SQLException e){}
			}
	}
	
	void addTeams(teams t){
		String url = "jdbc:mysql://localhost/MovieRating";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "root", "12438630");
			stmt = con.createStatement();
   		    stmt.executeUpdate("insert into teams values("+"'"+t.name+"','"+t.country+"','"+t.league+"',"+0+")");
   		    	
		    	
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
		
	}
	
	void deleteTeams(teams t){
		String url = "jdbc:mysql://localhost/MovieRating";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "root", "12438630");
			stmt = con.createStatement();
   		    stmt.executeUpdate("delete from teams where name='"+t.name+"'");
   		 		    	
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
		
	}
	
}
