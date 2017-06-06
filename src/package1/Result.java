package package1;
import java.sql.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Result {
	String tName1;
	String tName2;
	int goalsScoredByTeam1;
	int goalsScoredByTeam2;
	static Connection con;
	static Statement stmt;
	HttpServletRequest request;
	HttpServletResponse response;
	public void insert(Result r){
		
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
   		    stmt.executeUpdate("insert into results values("+"'"+r.tName1+"',"+r.goalsScoredByTeam1+","+
   		    												r.goalsScoredByTeam2+",'"+r.tName2+"')");
   		    //change the name of the table to one in which the result is stored	
		    	
   		    if(r.goalsScoredByTeam1>r.goalsScoredByTeam2)
   		    {
   		    	stmt.executeUpdate("update teams set points=points+3 where name='"+r.tName1+"'");
   		    }
   		    else if(r.goalsScoredByTeam1<r.goalsScoredByTeam2)
   		    {
   		    	stmt.executeUpdate("update teams set points=points+3 where name='"+r.tName2+"'");
   		    }
   		    else
   		    {
   		    	stmt.executeUpdate("update teams set points=points+1 where name='"+r.tName2+"' or name='"+r.tName1+"'");
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
	
}



