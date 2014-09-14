<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/core/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>首页大图编辑页</title>
<%@ include file="/core/includecss.jsp"%>
</head>
<body>
<div id="wrapper">
    <c:if test="${ projectModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ projectModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="projectForm" method="post">
    <table class="table_add">
        <thead>
                                          <tr><td>项目名字：</td><td><input type="text" name="projectExt.title" value="<c:out value="${ projectModel.projectExt.title }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>title：</td><td><input type="text" name="projectExt.title_en" value="<c:out value="${ projectModel.projectExt.title_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>地址：</td><td><input type="text" name="projectExt.location" value="<c:out value="${ projectModel.projectExt.location }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>日期：</td><td><input type="text" name="projectExt.pdate" value="<c:out value="${ projectModel.projectExt.pdate }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>客户：</td><td><input type="text" name="projectExt.client" value="<c:out value="${ projectModel.projectExt.client }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>项目：</td><td><input type="text" name="projectExt.program" value="<c:out value="${ projectModel.projectExt.program }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>地址：</td><td><input type="text" name="projectExt.area" value="<c:out value="${ projectModel.projectExt.area }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>预算：</td><td><input type="text" name="projectExt.budget" value="<c:out value="${ projectModel.projectExt.budget }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>状态：</td><td><input type="text" name="projectExt.status" value="<c:out value="${ projectModel.projectExt.status }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>团队：</td><td><input type="text" name="projectExt.projectteam" value="<c:out value="${ projectModel.projectExt.projectteam }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>合作方：</td><td><input type="text" name="projectExt.collaborator" value="<c:out value="${ projectModel.projectExt.collaborator }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>location：</td><td><input type="text" name="projectExt.location_en" value="<c:out value="${ projectModel.projectExt.location_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>client：</td><td><input type="text" name="projectExt.client_en" value="<c:out value="${ projectModel.projectExt.client_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>program：</td><td><input type="text" name="projectExt.program_en" value="<c:out value="${ projectModel.projectExt.program_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>area：</td><td><input type="text" name="projectExt.area_en" value="<c:out value="${ projectModel.projectExt.area_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>budget：</td><td><input type="text" name="projectExt.budget_en" value="<c:out value="${ projectModel.projectExt.budget_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>status：</td><td><input type="text" name="projectExt.status_en" value="<c:out value="${ projectModel.projectExt.status_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>projectteam：</td><td><input type="text" name="projectExt.projectteam_en" value="<c:out value="${ projectModel.projectExt.projectteam_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>collaborator：</td><td><input type="text" name="projectExt.collaborator_en" value="<c:out value="${ projectModel.projectExt.collaborator_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ projectModel.operationType eq 'edit' }">
    <input type="hidden" value="${ projectModel.projectExt.id }" name="projectExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/project/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/project/doEdit";
    form.submit();
}
</script>
</body>
</html>