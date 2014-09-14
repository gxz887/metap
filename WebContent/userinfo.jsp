<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.tsdata.base.entity.UserExt" %>
<%@ include file="/core/include.jsp"%>
<%
UserExt baseUserExt = (UserExt)request.getSession().getAttribute("user");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome <%=baseUserExt.getname() %></title>
</head>
<body>
<div style="width:150px;margin:0 auto;">
welcome <%=baseUserExt.getname() %>
</div>
</body>
</html>