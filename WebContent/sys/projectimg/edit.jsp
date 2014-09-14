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
    <c:if test="${ projectImgModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ projectImgModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="projectImgForm" method="post">
    <table class="table_add">
        <thead>
                                          <tr><td>图片地址：</td><td><input type="text" name="projectImgExt.img" value="<c:out value="${ projectImgModel.projectImgExt.img }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>项目id：</td><td><input type="text" name="projectImgExt.projectid" value="<c:out value="${ projectImgModel.projectImgExt.projectid }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>新闻id：</td><td><input type="text" name="projectImgExt.newsid" value="<c:out value="${ projectImgModel.projectImgExt.newsid }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ projectImgModel.operationType eq 'edit' }">
    <input type="hidden" value="${ projectImgModel.projectImgExt.id }" name="projectImgExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/projectimg/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/projectimg/doEdit";
    form.submit();
}
</script>
</body>
</html>