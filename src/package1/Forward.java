package package1;

import java.sql.DriverManager;
import java.sql.SQLException;


public class Forward extends players{

	int shots;
	int assists;


	public Forward() {
		// TODO Auto-generated constructor stub
	}

	 void addForward(Forward p) {
			
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
	   		    												+p.goals+","+0+","+0+","+p.assists+","+0+","+0+","+p.shots+","+0+
	   		    												",'Forward')");
	   		    	
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
