<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
SUCCESS:
<s:property value="#session.person.person_id"/>
<s:property value="#session.person.realname"/>
<s:property value="#session.person.account"/>
<s:property value="#session.person.password"/>
<s:property value="#session.person.email"/>
<s:property value="#session.person.tel"/>
<s:property value="#session.person.sex"/>
<s:property value="#session.person.role.rolename"/>
<h1>地址：<s:property value="#session.person.addressList.size()"/>个</h1>
<s:iterator value="#session.person.addressList" id="row">
<p><s:property value="#row.getName()"/>
&nbsp;
<s:property value="#row.getAddress()"/>
&nbsp;
<s:property value="#row.getTel()"/>
</p>
</s:iterator>
<h1>艺术品:<s:property value="#session.person.productList.size()"/>个</h1>
<s:iterator value="#session.person.productList" id="row">
<p><s:property value="#row.getPrice()"/>
&nbsp;
<s:property value="#row.getFixedprice()"/>
&nbsp;
<s:property value="#row.getStartprice()"/>
&nbsp;
<s:property value="#row.getType()"/>
&nbsp;
<s:property value="#row.getDescribe()"/>
&nbsp;
<s:property value="#row.getUptime()"/>
&nbsp;
<s:property value="#row.getLasttime()"/>
&nbsp;
<s:property value="#row.getState()"/>
<s:iterator value="#row.getImageList()" id="irow">
&nbsp;
<s:property value="#irow.getImage()"/>
</s:iterator>
<s:iterator value="#row.getKeyList()" id="krow">
&nbsp;
<s:property value="#krow.getKey().getKeyname()"/>
</s:iterator>
</p>
</s:iterator>
<h1>需求:<s:property value="#session.person.demandList.size()"/>个</h1>
<s:iterator value="#session.person.demandList" id="row">
<p><s:property value="#row.getPrice()"/>
&nbsp;
<s:property value="#row.getEndprice()"/>
&nbsp;
<s:property value="#row.getStartprice()"/>
&nbsp;
<s:property value="#row.getType()"/>
&nbsp;
<s:property value="#row.getDescribe()"/>
&nbsp;
<s:property value="#row.getUptime()"/>
&nbsp;
<s:property value="#row.getState()"/>
<s:iterator value="#row.getKeyList()" id="krow">
&nbsp;
<s:property value="#krow.getKey().getKeyname()"/>
</s:iterator>
</p>
</s:iterator>
</body>
</html>