<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
function alertName(){
alert("Player Is Deleted!");
} 
</script> 
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="get" action="servlet6">
		Player Id&nbsp;&nbsp;<input type="text" name="pid">
		<input type="submit" value="Delete Player" onclick="alertName()">
	</form>
</body>
</html>