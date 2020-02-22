<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME TO HOME PAGE</h1>

	<form action="save" method="post">

		Enter your Name :<input type="text" name="name" /><br> 
		
	Shipment Mode: <select	name="mode">
			<option>--select--</option>
			<option>Air</option>
			<option>ROad</option>
			<option>Train</option>
			<option>Ship</option>

		</select><br>

	Enter the Shipment Id:<input type="text" name="id"/><br>
	
	Enter the Travaling :<input type="radio" name="grade" value="A"/>A
	<input type="radio" name="grade" vaoolue="B"/>B
	<input type="radio" name="grade" value="C"/>C<br>
	
	 Writeing Description: <textarea rows="5" cols="20" name="desg"></textarea>
	 <br><br><input type="submit" value="Submit"/>
	</form>
</body>
</html>