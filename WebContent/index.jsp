<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html >
<head>
  <meta charset="UTF-8">
  <title>Login</title>

<script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.7/prefixfree.min.js"></script>
<link rel="stylesheet" type="text/css" href="styleLogin.css">
</head>

<body>
  <div class="body"></div>
		<div class="grad"></div>
		<div class="header">
			<div>UEFA<span>LOGIN</span></div>
		</div>
		<br>
		<form action="servlet1" method="get">
			<div class="login">
			
				<input type="text" placeholder="username" name="user_name"><br>
				<input type="password" placeholder="password" name="pass"><br>
				<input type="submit" value="Login">
			
			</div>
		</form>
  <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js'></script>

  
</body>
</html>