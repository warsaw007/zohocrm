<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <h2>lead | create</h2>
      <form action="savelead" method="post" >
      <pre>
      First Name<input type="text" name="firstName"/>
       Last Name<input type="text" name="lastName"/>
       email<input type="text" name="email"/>
       Lead Source:
	   <select name="leadSource" >
		  <option value="tv commercial">TV commercial</option>
		  <option value="radio">radio</option>
		  <option value="news paper">news paper</option>
		  <option value="online">online</option>
		</select>				
		Mobile<input type="text" name="mobile"/>
		<input type="submit" value="save"/>									       
      </pre>
      </form>
</body>
</html>