<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function alertName(){
alert("Team Is Deleted!");
}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<form action="DeleteTeamServlet" method="get">
	Team Name:<input type="text" name="tName" required>
				<input style="color:blue" value="Delete Team" type="submit" onclick="alertName()">
</form>
</body>
</html>