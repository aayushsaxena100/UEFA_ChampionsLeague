package package1;

import java.sql.*;



public class loginProcess{
	String username,password;
	public loginProcess(String u,String p) {
		username=u;
		password=p;
	}

	static Connection con;
	static Statement stmt;
	
	int process() {
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
	   		    ResultSet rs=stmt.executeQuery("select * from users");
	   		    while(rs.next())  
   		    	{
	   		    	if(username.equals(rs.getString("username")) && password.equals(rs.getString("password")))
	   		    	{
	   		    		return 1;
	   		    	}
   		    	}
	   		    	
			} catch(SQLException ex) {
				System.err.println("SQLException: " + ex.getMessage());
			}finally{
				try{
					stmt.close();
					con.close();
				}catch(SQLException e){}
			}
			return 0;
	}
}