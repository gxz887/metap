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
    <c:if test="${ newsModel.operationType eq 'create' }">
    <input type="button" value="新建" onclick="doCreate()" />
    </c:if>
    <c:if test="${ newsModel.operationType eq 'edit' }">
    <input type="button" value="保存" onclick="doEdit()"/>
    </c:if>
    <form id="form" name="newsForm" method="post"  enctype="multipart/form-data">
    <table class="table_add">
        <thead>
                                          <tr><td>标题：</td><td><input type="text" name="newsExt.title" value="<c:out value="${ newsModel.newsExt.title }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>title：</td><td><input type="text" name="newsExt.title_en" value="<c:out value="${ newsModel.newsExt.title_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>发表日期：</td><td><input type="date" name="newsExt.postdate" value="<c:out value="${ newsModel.newsExt.postdate }" escapeXml="true" />" style="width:700px;"/></td></tr>
                                          <tr><td>新闻小图：</td><td>  <input type="file" name="newsExt.smallImgFile" />
                                          <img style="width:200px;height:200px" src="<%=request.getContextPath()%><c:out value="${ newsModel.newsExt.smallimg }"/>" /></td></tr>
                                          <tr><td>新闻大图：</td><td> 
                                           <input type="file" name="newsExt.bigImgFile" />
                                             <img style="width:200px;height:200px" src="<%=request.getContextPath()%><c:out value="${ newsModel.newsExt.bigimg }"/>" /></td></tr>
                                           </td></tr>
                                          <tr><td>content：</td><td><input type="text" name="newsExt.content_en" value="<c:out value="${ newsModel.newsExt.content_en }" escapeXml="true" />" style="width:700px;"/></td></tr>
        </thead>
        <tbody></tbody>
    </table>
    <c:if test="${ newsModel.operationType eq 'edit' }">
    <input type="hidden" value="${ newsModel.newsExt.id }" name="newsExt.id"/>
    </c:if>
    </form>
</div>

<script type="text/javascript">
function doCreate(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/news/doCreate";
    form.submit();
}

function doEdit(){
    var form = document.getElementById("form");
    form.action = "<%=request.getContextPath()%>/news/doEdit";
    form.submit();
}
</script>
</body>
</html>