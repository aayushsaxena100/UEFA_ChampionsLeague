<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<% Class.forName("com.mysql.jdbc.Driver"); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="styleTable.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/MovieRating", "root", "12438630");

            Statement statement = connection.createStatement() ;
            ResultSet resultset = 
                statement.executeQuery("select * from players") ; 
        %>

	<div class="datagrid">
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Nationality</th>
					<th>Team</th>
					<th>Player Id</th>
					<th>Age</th>
					<th>Goals</th>
					<th>Assists</th>
					<th>Yellow Cards</th>
					<th>Red Cards</th>
				</tr>
			</thead>
			
			<tbody>
				<% while(resultset.next()){ %>
            <tr class="alt">
                <td> <%= resultset.getString(1) %></td>
                <td> <%= resultset.getString(2) %></td>
                <td> <%= resultset.getString(3) %></td>
                <td> <%= resultset.getInt(4) %></td>
                <td> <%= resultset.getInt(5) %></td>
                <td> <%= resultset.getInt(6) %></td>
                <td> <%= resultset.getInt(9) %></td>
                <td> <%= resultset.getInt(8) %></td>
                <td> <%= resultset.getInt(7) %></td>
            </tr>
            <% } %>
				
			</tbody>
		</table>
	</div>
</body>
</html>