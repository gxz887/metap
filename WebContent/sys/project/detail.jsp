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
		
						<c:if test="${!empty projectModel.projectExt.title}">
						<tr><td>项目名字：</td><td><c:out value="${projectModel.projectExt.title }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.title_en}">
						<tr><td>title：</td><td><c:out value="${projectModel.projectExt.title_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.location}">
						<tr><td>地址：</td><td><c:out value="${projectModel.projectExt.location }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.pdate}">
						<tr><td>日期：</td><td><c:out value="${projectModel.projectExt.pdate }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.client}">
						<tr><td>客户：</td><td><c:out value="${projectModel.projectExt.client }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.program}">
						<tr><td>项目：</td><td><c:out value="${projectModel.projectExt.program }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.area}">
						<tr><td>地址：</td><td><c:out value="${projectModel.projectExt.area }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.budget}">
						<tr><td>预算：</td><td><c:out value="${projectModel.projectExt.budget }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.status}">
						<tr><td>状态：</td><td><c:out value="${projectModel.projectExt.status }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.projectteam}">
						<tr><td>团队：</td><td><c:out value="${projectModel.projectExt.projectteam }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.collaborator}">
						<tr><td>合作方：</td><td><c:out value="${projectModel.projectExt.collaborator }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.location_en}">
						<tr><td>location：</td><td><c:out value="${projectModel.projectExt.location_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.client_en}">
						<tr><td>client：</td><td><c:out value="${projectModel.projectExt.client_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.program_en}">
						<tr><td>program：</td><td><c:out value="${projectModel.projectExt.program_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.area_en}">
						<tr><td>area：</td><td><c:out value="${projectModel.projectExt.area_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.budget_en}">
						<tr><td>budget：</td><td><c:out value="${projectModel.projectExt.budget_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.status_en}">
						<tr><td>status：</td><td><c:out value="${projectModel.projectExt.status_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.projectteam_en}">
						<tr><td>projectteam：</td><td><c:out value="${projectModel.projectExt.projectteam_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
				<c:if test="${!empty projectModel.projectExt.collaborator_en}">
						<tr><td>collaborator：</td><td><c:out value="${projectModel.projectExt.collaborator_en }" escapeXml="true" /></td></tr>
						</c:if>				    
							    
		</tbody>
	</table>
</div>
</body>
</html>