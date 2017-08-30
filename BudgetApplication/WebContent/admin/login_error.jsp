<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login error</title>
</head>
<body>
<h1>Admin Login Form - Error</h1>
<p>You did not log in successfully.</p>
<p>Please check your username and password and try again.</p>
<p>If that doesn't work, you may need to <br>
implement the JDBC realm as described in chapter 17.</p>

<table cellspacing="5" border="0">
  <form action="j_security_check" method="get">
    <tr>
        <td align="right">Username</td>
        <td><input type="text" name="j_username"></td>
    </tr>
    <tr>
        <td align="right">Password</td>
        <td><input type="password" name="j_password"></td>
    </tr>
    <tr>
      <td><input type="submit" value="Login"></td>
    </tr>
  </form>
</table>
</body></html>