<%@ page language="java" contentType="text/html; charset=ISO-8859-1" import="org.abhinaya.marsrover.MarsRover"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
button {
    width: 30%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    border-radius: 4px;
}
div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 40px;
}
</style>
<%
MarsRover rover = (MarsRover)session.getAttribute("rover");
%>
<title>Control</title>
</head>
<body>
<center>
<div>
<form action="MarsRoverController" method="get" >
<button type="submit" value="L" name="command" > Left</button>
<button type="submit" value="R" name="command" > Right</button>
<button type="submit" value="M" name="command" > MoveForward</button>
</form>
<br>
<br>
<h3> The current position of the rover is <%= rover.getCurrentPosition() %></h3>
</div>
</center>
</body>
</html>