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
		
						<c:if test="${!empty projectImgModel.projectImgExt.img}">
						<tr><td>图片地址：</td><td><c:out value="${projectImgModel.projectImgExt.img }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectImgModel.projectImgExt.projectid}">
						<tr><td>项目id：</td><td><c:out value="${projectImgModel.projectImgExt.projectid }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectImgModel.projectImgExt.newsid}">
						<tr><td>新闻id：</td><td><c:out value="${projectImgModel.projectImgExt.newsid }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
		</tbody>
	</table>
</div>
</body>
</html>