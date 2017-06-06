<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript">
function alertName(){
alert("Team is added!");
}
</script>
</head>
<body>
<form action="AddTeamServlet" method="get">
	Name:<input type="text" name="tName" required>
	Country:<input type="text" name="tCountry" required>
	League:<input type="text" name="tLeague" required>
<input style="color:blue" value="Add Team" type="submit" onclick="alertName()">
</form>
</body>
</html>