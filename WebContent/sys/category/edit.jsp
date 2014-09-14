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
    <c:if test="${ categoryModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ categoryModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="categoryForm" method="post">
    <table class="table_add">
        <thead>
                                          <tr><td>名字：</td><td><input type="text" name="categoryExt.name" value="<c:out value="${ categoryModel.categoryExt.name }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>name：</td><td><input type="text" name="categoryExt.name_en" value="<c:out value="${ categoryModel.categoryExt.name_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ categoryModel.operationType eq 'edit' }">
    <input type="hidden" value="${ categoryModel.categoryExt.id }" name="categoryExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/category/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/category/doEdit";
    form.submit();
}
</script>
</body>
</html>