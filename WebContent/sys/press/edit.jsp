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
    <c:if test="${ pressModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ pressModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="pressForm" method="post">
    <table class="table_add">
        <thead>
                                          <tr><td>出版物名称：</td><td><input type="text" name="pressExt.bookname" value="<c:out value="${ pressModel.pressExt.bookname }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>标题：</td><td><input type="text" name="pressExt.title" value="<c:out value="${ pressModel.pressExt.title }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>作者：</td><td><input type="text" name="pressExt.author" value="<c:out value="${ pressModel.pressExt.author }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>出版：</td><td><input type="text" name="pressExt.press" value="<c:out value="${ pressModel.pressExt.press }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>出版时间：</td><td><input type="text" name="pressExt.presstime" value="<c:out value="${ pressModel.pressExt.presstime }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>标题：</td><td><input type="text" name="pressExt.title_en" value="<c:out value="${ pressModel.pressExt.title_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>作者：</td><td><input type="text" name="pressExt.author_en" value="<c:out value="${ pressModel.pressExt.author_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>出版：</td><td><input type="text" name="pressExt.press_en" value="<c:out value="${ pressModel.pressExt.press_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>出版物文件地址：</td><td><input type="text" name="pressExt.fileurl" value="<c:out value="${ pressModel.pressExt.fileurl }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ pressModel.operationType eq 'edit' }">
    <input type="hidden" value="${ pressModel.pressExt.id }" name="pressExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/press/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/press/doEdit";
    form.submit();
}
</script>
</body>
</html>