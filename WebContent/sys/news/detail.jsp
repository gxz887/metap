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
		
						<c:if test="${!empty newsModel.newsExt.title}">
						<tr><td>标题：</td><td><c:out value="${newsModel.newsExt.title }" escapeXml="true" /></td></tr>
						</c:if>				    
							
						<c:if test="${!empty newsModel.newsExt.title_en}">
						<tr><td>title：</td><td><c:out value="${newsModel.newsExt.title_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							        
				<c:if test="${!empty newsModel.newsExt.postdate}">
						<tr><td>发表日期：</td><td><c:out value="${newsModel.newsExt.postdate }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty newsModel.newsExt.smallimg}">
						<tr><td>新闻小图：</td><td>
						  <img style="width:200px;height:200px" src="<%=request.getContextPath()%><c:out value="${ newsModel.newsExt.smallimg }"/>" /></td></tr>
						</td></tr>
						</c:if>				    
							    
				<c:if test="${!empty newsModel.newsExt.bigimg}">
						<tr><td>新闻大图：</td><td>
						<img style="width:200px;height:200px" src="<%=request.getContextPath()%><c:out value="${ newsModel.newsExt.bigimg }"/>" />
						</td></tr>
						</c:if>				    
							    
				<c:if test="${!empty newsModel.newsExt.content}">
						<tr><td>内容：</td><td><c:out value="${newsModel.newsExt.content }" escapeXml="true" /></td></tr>
						</c:if>				    
					<c:if test="${!empty newsModel.newsExt.content_en}">
						<tr><td>content：</td><td><c:out value="${newsModel.newsExt.content_en }" escapeXml="true" /></td></tr>
						</c:if>			    
		</tbody>
	</table>
</div>
</body>
</html>