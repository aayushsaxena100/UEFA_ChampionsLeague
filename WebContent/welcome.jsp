<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<link rel="stylesheet" type="text/css" href="styleWelcome.css">
    <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
		<div class="body"></div>
		
        
            <div id="main-nav" class="grad">
                        <nav class="navbar navbar-dark bg-inverse navbar-full">
                                <ul class="nav navbar-nav" style="list-style:none;">
                                    <li class="nav-item">
                                        <form id="showTeams" action="showTeams.jsp">
											<a href="#" onclick="document.getElementById('showTeams').submit();">Show Teams</a>
										</form>
                                    </li>
                                    <li class="nav-item">
                                        <form id="showPlayers" action="showPlayers.jsp">
  											<a href="#" onclick="document.getElementById('showPlayers').submit();">Show Players</a>
										</form>
                                    </li>
                                    <li class="nav-item">
                                        <form id="editPlayer" action="editPlayer.jsp">
  											<a href="#" onclick="document.getElementById('editPlayer').submit();">Edit Player</a>
										</form>
                                    </li>
                                    <li class="nav-item">
                                       <form id="deletePlayer" action="deletePlayer.jsp">
  											<a href="#" onclick="document.getElementById('deletePlayer').submit();">Delete Players</a>
										</form> 
                                    </li>
                                    <li class="nav-item">
                                        <form id="addPlayer" action="type.jsp">
  											<a href="#" onclick="document.getElementById('addPlayer').submit();">Add Player</a>
										</form>
                                    </li>
                                    <li class="nav-item">
                                        <form id="addTeam" action="addTeam.jsp">
  											<a href="#" onclick="document.getElementById('addTeam').submit();">Add Team</a>
										</form>
                                    </li>
                                    <li class="nav-item">
                                        <form id="deleteTeam" action="deleteTeam.jsp">
  											<a href="#" onclick="document.getElementById('deleteTeam').submit();">Delete Team</a>
									</form>
                                    </li>
                                    <li class="nav-item">
                                        <form id="insertResult" action="insertResult.jsp">
  											<a href="#" onclick="document.getElementById('insertResult').submit();">Insert Result</a>
										</form>
                                    </li>
                             </ul>
                        </nav>
            </div>
     
     		<div class="more">
     		
     	<section id="training">
            <div class="container">
                <div class="row" id="benefits">
                <br><br>
                    <div class="col-sm-3" id="run">
                    	<h1>RUN</h1>
                        <%
                        Connection connection = DriverManager.getConnection(
                                "jdbc:mysql://localhost/MovieRating", "root", "12438630");

                            Statement statement = connection.createStatement() ;
                            ResultSet resultset = 
                                statement.executeQuery("select * from players") ; 
                        %>                    
                    </div>
                    <div class="col-sm-3" id="jump">
                        <h1>JUMP</h1>
                        <p class="lead">Running for just 5 min can burn about 200 calories.Running for just 5 min can burn about 200 calories.</p>
                        
                    </div>
                    <div class="col-sm-3" id="swim">
                        <h1>SWIM</h1>
                        <p class="lead">Running for just 5 min can burn about 200 calories.Running for just 5 min can burn about 200 calories.</p>

                    </div>
                
                </div>
                
            </div>
        
        </section>
     		
     		</div>
     
</body>
</html>