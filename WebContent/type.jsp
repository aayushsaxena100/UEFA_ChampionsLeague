<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action = "typeServlet" method ="get">
	<select name ="type">
		<option value="SelectType"> Select Type </option>
		<option value="Defender"> Defender </option>
		<option value="MidFielder"> MidFielder </option>
		<option value="Forward"> Forward </option>
	</select>
	<input type="submit" value="Submit">
</form>
</body>
</html>