import java.sql.*;

public class Reviewer{
static Connection con;
static Statement stmt;
	public static void main(String args[]) {

		String url = "jdbc:mysql://localhost/MovieRating";
		String createString = "SELECT * FROM Reviewer";

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch(java.lang.ClassNotFoundException e) {
			System.err.print("ClassNotFoundException: ");
			System.err.println(e.getMessage());
		}

		try {
			con = DriverManager.getConnection(url, "root", "12438630");
			stmt = con.createStatement();
   		    stmt.executeQuery(createString);
   		    ResultSet rs=stmt.executeQuery("select * from Reviewer");  
   		    while(rs.next())  
   		    	System.out.println(rs.getInt(1)+"  "+rs.getString(2));  
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

