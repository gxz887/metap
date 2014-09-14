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
		
						<c:if test="${!empty pressModel.pressExt.bookname}">
						<tr><td>出版物名称：</td><td><c:out value="${pressModel.pressExt.bookname }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.title}">
						<tr><td>标题：</td><td><c:out value="${pressModel.pressExt.title }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.author}">
						<tr><td>作者：</td><td><c:out value="${pressModel.pressExt.author }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.press}">
						<tr><td>出版：</td><td><c:out value="${pressModel.pressExt.press }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.presstime}">
						<tr><td>出版时间：</td><td><c:out value="${pressModel.pressExt.presstime }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.title_en}">
						<tr><td>标题：</td><td><c:out value="${pressModel.pressExt.title_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.author_en}">
						<tr><td>作者：</td><td><c:out value="${pressModel.pressExt.author_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.press_en}">
						<tr><td>出版：</td><td><c:out value="${pressModel.pressExt.press_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty pressModel.pressExt.fileurl}">
						<tr><td>出版物文件地址：</td><td><c:out value="${pressModel.pressExt.fileurl }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
		</tbody>
	</table>
</div>
</body>
</html>