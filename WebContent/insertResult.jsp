<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function alertName(){
	alert("Result Added!");
}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="InsertResultServlet">
	Home Team:<input type="text" name="tHomeTeam" placeholder="Home Team Name..."><br>
	Away Team:<input type="text" name="tAwayTeam" placeholder="Away Team Name..."><br>
	Goals Scored By Home Team:<input type="text" name="goalsByTeam1" placeholder="Home Team Goals..."><br>
	Goals Scored By Away Team:<input type="text" name="goalsByTeam2"  placeholder="Away Team Goals..."><br>
	<input style="color:blue" value="Insert Result" type="submit" name="InsertResultServlet" onclick="alertName()">
</form>

</body>
</html>