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
		
						<c:if test="${!empty categoryModel.categoryExt.name}">
						<tr><td>名字：</td><td><c:out value="${categoryModel.categoryExt.name }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty categoryModel.categoryExt.name_en}">
						<tr><td>name：</td><td><c:out value="${categoryModel.categoryExt.name_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
		</tbody>
	</table>
</div>
</body>
</html>