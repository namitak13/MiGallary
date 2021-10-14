<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <h1>Registration Form</h1>
  <form action="UserServlet" method="post">
  <table>
    <tr>
    <td>First Name</td>
    <td><input type="text" name="first_name"/></td>
    </tr>
     <tr>
    <td>Last Name</td>
    <td><input type="text" name="last_name"/></td>
    </tr>
    <tr>
    <td>Email ID</td>
    <td><input type="text" name="email"/></td>
    </tr>
     <tr>
    <td>User Name</td>
    <td><input type="text" name="user_name"/></td>
    </tr>
     <tr>
    <td>Password</td>
    <td><input type="password" name="password"/></td>
    </tr>
    </table>
    <input type="submit" value="Submit"/>
  </form>
</body>
</html>