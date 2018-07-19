<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css" />
 <link href="<c:url value="/resources/login.css" />" rel="stylesheet">
</head>
<body>
<div class="login">
	<h1>Login</h1>
    <form method="post" action="login">
    	<input type="text" name="username" placeholder="Username" required="required" />
        <input type="password" name="password" placeholder="Password" required="required" />
<!--         <button type="submit" class="btn btn-primary btn-block btn-large">Let me in.</button> -->
    <input type="submit" value="Login" name="action"  class="btn btn-primary btn-block btn-large"/>
    </form>
</div>
<!-- <h1>Login page</h1> -->
<!-- <form action="login"> -->
<!-- username:<input type="text" value="" name="username"/> -->
<!-- password:<input type="password" value="" name="password"/> -->
<!-- <input type="submit" value="Login" name="action" /> -->
<!-- </form> -->
</body>
</html>