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
    <c:if test="${ userModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ userModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="userForm" method="post">
    <table class="table_add">
        <thead>
                                          <tr><td>用户名：</td><td><input type="text" name="userExt.name" value="<c:out value="${ userModel.userExt.name }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>密码：</td><td><input type="text" name="userExt.password" value="<c:out value="${ userModel.userExt.password }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>角色：</td><td><input type="text" name="userExt.role" value="<c:out value="${ userModel.userExt.role }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ userModel.operationType eq 'edit' }">
    <input type="hidden" value="${ userModel.userExt.id }" name="userExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/user/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/user/doEdit";
    form.submit();
}
</script>
</body>
</html>