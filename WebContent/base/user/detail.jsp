<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/core/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户名</title>
<%@ include file="/core/includecss.jsp"%>
</head>
<body>
<div id="wrapper">
	<table class="table_add">
		<tbody>
		
						<c:if test="${!empty userModel.userExt.name}">
						<tr><td>用户名：</td><td><c:out value="${userModel.userExt.name }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty userModel.userExt.password}">
						<tr><td>密码：</td><td><c:out value="${userModel.userExt.password }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty userModel.userExt.role}">
						<tr><td>角色：</td><td><c:out value="${userModel.userExt.role }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
		</tbody>
	</table>
</div>
</body>
</html>