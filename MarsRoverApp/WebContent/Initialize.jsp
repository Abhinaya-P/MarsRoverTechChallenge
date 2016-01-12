<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
input[type=text]{
    width: 30%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border-radius: 4px;S
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    border-radius: 4px;
    cursor: pointer;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 40px;
}
</style>
<script>
 function Validate() {
	 var x = document.forms["form1"]["initialx"].value;
	 var y = document.forms["form1"]["initialy"].value;
	 if ( x<=0 || y<=0 ) {
		 alert("Invalid values for initial coordinates");
		 return false;
	 }
	 var dir = document.forms["form1"]["direction"].value;
	 if(!(dir == 'N' || dir=='S' || dir=='E' || dir=='W' )) {
		 alert("Invalid direction");
		 return false;
	 }
	 var ax = document.forms["form1"]["area_x"].value;
	 var ay = document.forms["form1"]["area_y"].value;
	 if( ax <= 0 || ay<=0 ) {
		 alert("Invalid values for area boundary");
		 return false;
	 }
 }
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mars Rover</title>
</head>
<body>
<div>
<center>
<form name="form1" onsubmit="return Validate()" action="MarsRoverInitialize" method="get" >
<label for="initial" >Enter the inital position of the rover: </label>
<input type="text" name="initialx" id="initial" />
<input type="text" name="initialy" id="initial" />
<input type="text" name="direction" id="initial" />
<br>
<label for="area" >Enter the area boundary: </label>
<input type="text" name="area_x" id="area" />
<input type="text" name="area_y" id="area" />
<input type="submit" value="submit" />
</form>
</center>
</div>
</body>
</html>