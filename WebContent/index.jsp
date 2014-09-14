<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title></title>
</head>
	<frameset cols="220,10,*" framespacing="0" frameborder="NO" border="0" id=lmain />
	  <frame src="<%=request.getContextPath()%>/lefttree.jsp" name="leftFrame" noresize />
	  <frame src="<%=request.getContextPath()%>/treeClose.jsp" name="treegl" scrolling="NO" noresize />
	  <frame src="<%=request.getContextPath()%>/userinfo.jsp" name="mainFrame">
	</frameset>
	<noframes></noframes>
</html>