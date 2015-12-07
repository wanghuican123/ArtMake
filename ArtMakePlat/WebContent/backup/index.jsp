<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录</title>
</head>
<body>
   <form action="login" method="post">
     <label>account:</label><input type="text" value="<s:property value='%{#request.person.account}'/>" name="person.account"/><br/>
      <s:fielderror> 
        <s:param>account</s:param> 
      </s:fielderror>
     <label>password:</label><input type="password" name="person.password"/><br/>
      <s:fielderror> 
        <s:param>password </s:param> 
      </s:fielderror>
     <input type="submit" value="提交"/>
   </form>
</body>
</html>