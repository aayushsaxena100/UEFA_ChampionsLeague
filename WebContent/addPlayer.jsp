<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function alertName(){
alert("Player Is Added!");
} 
</script> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="servlet5">
		Player Id &nbsp;&nbsp;<input type="text" name="pid"><br>
		Player Name &nbsp;&nbsp;<input type="text" name="name"><br>
		Nationality &nbsp;&nbsp;<input type="text" name="nationality"><br>
		Player Age &nbsp;&nbsp;<input type="text" name="age"><br>
		Player Goals &nbsp;&nbsp;<input type="text" name="goals"><br>
		Player Assists &nbsp;&nbsp;<input type="text" name="assists"><br>
		Player Team &nbsp;&nbsp;<input type="text" name="team"><br>
		<input type="submit" value="Add Player" onclick="alerName()">
	</form>
</body>
</html>