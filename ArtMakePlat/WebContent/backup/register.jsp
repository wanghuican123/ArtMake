<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
   <form action="register" method="post">
     <label>account:</label><input type="text" name="person.account"/><br/>
     <label>password:</label><input type="password" name="person.password"/><br/>
     <label>realname:</label><input type="text" name="person.realname"/><br/>
     <label>email:</label><input type="text" name="person.email"/><br/>
     <label>tell:</label><input type="text" name="person.tel"/><br/>
     <label>address:</label><input type="text" name="person.address"/><br/>
     <label>sex:</label><input type="text" name="person.sex"/><br/>
     <input type="submit" value="提交"/>
   </form>
</body>
</html>