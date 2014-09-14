<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
	//StringBuffer sbMenu = (StringBuffer)session.getAttribute("menu");
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="resource/css/tree.css" rel="stylesheet" type="text/css" >
<script type="text/javascript" src="resource/js/funcTree.js"></script>
<script type="text/javascript">
    var Tree = new Array;
    Tree.push("1||运营|a");
    Tree.push("2|1|用户管理测试中文| user/query?locale=zh");
    Tree.push("3|1|用户管理测试英文| user/query?locale=en");
    Tree.push("2|1|新闻分类管理| news/query");
    Tree.push("2|1|项目分类管理| category/query");
    Tree.push("2|1|菜单管理| menu/query");
    Tree.push("2|1|出版管理| press/query");
    Tree.push("2|1|项目管理| project/query");
    Tree.push("2|1|项目图片管理| projectimg/index");
</script>
</head>
<body>
<body bgcolor="#f3f3f3"  leftmargin="0" topmargin="0" marginwidth="0" marginheight="0" style="background:url(resource/images/lefttreebg.jpg) left top repeat-x ; ">
	<div id="tree">
		<script type="text/javascript">
			createTree(Tree,null,null,7,null,null);
		</script>
	</div>
</body>
</body>
</html>