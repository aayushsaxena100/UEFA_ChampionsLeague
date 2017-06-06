package package1;

import java.sql.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class players {

	static int totalPlayer = 0; 
	int playerId;
	int age;
	int goals;
	int assists;
	int yellowCards;
	int redCards;
	String name;
	String nationality;
	String team;
	
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	
	players(){
		
	}
	
	players(players p){
		
		totalPlayer++;
		p.playerId=totalPlayer;
	}
	
	void displayPlayers() {
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
	   		    
	   		    ResultSet rs=stmt.executeQuery("select * from players");
	   		    while(rs.next())  
   		    	{
	   		    	System.out.println(rs.getString("name")+"  "+rs.getString("nationality")+"  "+rs.getString("team"));
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
	
	static void editInDatabase(players p) {
		
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
			String tm=p.team;
   		    System.out.println(p.team);
			if(p.goals!=0)
   		   		stmt.executeUpdate("Update players set goals="+p.goals+" where playerId="+p.playerId);
			if(p.assists!=0)
   		   		stmt.executeUpdate("Update players set assists="+p.assists+" where playerId="+p.playerId);
			if(p.team!= null && !p.team.isEmpty())
   		   		stmt.executeUpdate("Update players set team="+"\""+ tm +"\""+" where playerId="+p.playerId);
			if(p.age!=0)
   		   		stmt.executeUpdate("Update players set age="+p.age+" where playerId="+p.playerId);
			if(p.yellowCards!=0)
   		   		stmt.executeUpdate("Update players set yellowCards="+p.yellowCards+" where playerId="+p.playerId);
			if(p.redCards!=0)
   		   		stmt.executeUpdate("Update players set redCards="+p.redCards+" where playerId="+p.playerId);
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
	}
	
	static void addInDatabase(players p) {
		
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
			
   		    stmt.executeUpdate("insert into players values("+"'"+p.name+"','"+p.nationality+"','"+p.team+"',"+p.playerId+","+p.age+","
   		    												+p.goals+","+0+","+0+","+p.assists+")");
   		    	
		} catch(SQLException ex) {
			System.err.println("SQLException: " + ex.getMessage());
		}finally{
			try{
				stmt.close();
				con.close();
			}catch(SQLException e){}
		}
		
	}
	
	static void deleteFromDatabase(int playerId) {
		
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
			
   		    stmt.executeUpdate("delete from players where playerId="+playerId);
   		    	
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
