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
    <c:if test="${ menuModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ menuModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="menuForm" method="post">
    <table class="table_add">
        <thead>
                                          <tr><td>菜单名：</td><td><input type="text" name="menuExt.name" value="<c:out value="${ menuModel.menuExt.name }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>name：</td><td><input type="text" name="menuExt.name_en" value="<c:out value="${ menuModel.menuExt.name_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>菜单地址：</td><td><input type="text" name="menuExt.url" value="<c:out value="${ menuModel.menuExt.url }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>父亲id：</td><td><input type="text" name="menuExt.pid" value="<c:out value="${ menuModel.menuExt.pid }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ menuModel.operationType eq 'edit' }">
    <input type="hidden" value="${ menuModel.menuExt.id }" name="menuExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/menu/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/menu/doEdit";
    form.submit();
}
</script>
</body>
</html>