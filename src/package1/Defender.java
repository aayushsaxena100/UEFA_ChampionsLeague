package package1;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Defender extends players{

	int tackles;
	int interceptions;
 void addDefender(Defender p) {
		
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
   		    												+p.goals+","+0+","+0+","+p.assists+","+p.tackles+","+p.interceptions+","
   		    												+0+","+0+",'Defender')");
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
