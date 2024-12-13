<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Add numbers</h2>
<form action="add" method = "post">
num1<input type="text" name="num1" />
num2<input type="text" name="num2" />
<input type = "submit"/>
</form>

<%
if(request.getAttribute("res")!=null){
out.println(request.getAttribute("res"));// control goes to the controller and it will return Output value
}
%>
</body>
</html> 