<%@ page language="java" pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ include file="/core/include.jsp"%>
<!DOCTYPE html>
<html>
<head>
<title>信息维护</title>
<%@ include file="/core/includecss.jsp"%>
<link href="<%=request.getContextPath()%>/resource/js/pager/Pager.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/jquery.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/pager/jquery.pager.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/resource/js/control.js"></script>
</head>
<body>
	<div class="weizhi">
		<div class="weizhi_bj">用户信息</div>
	</div>
	<form id="form" method="post">
		<table border="0" cellpadding="0" cellspacing="0" class="table_list">
			<tr>
				<th width="11%">用户信息列表</th>
				<th width="89%">
					<div>
						<!-- <input name="add" type="button" value="导出excel" onclick="toExcel();" /> --> 
						<input type="button" value="新增" onclick="goCreate()" />&nbsp;&nbsp;
					</div>
				</th>
			</tr>
			<tr>
				<td colspan="2">
					<table border="0" cellpadding="0" cellspacing="0" class="table_date"
						id="dataTable">
						<tr>
							<th width="5%">请选择</th>
							
																	<th width="30%">项目名字 </th>
									<th width="30%">title </th>
									<th width="30%">地址 </th>
									<th width="30%">日期 </th>
									<th width="30%">客户 </th>
									<th width="30%">项目 </th>
									<th width="30%">地址 </th>
									<th width="30%">预算 </th>
									<th width="30%">状态 </th>
									<th width="30%">团队 </th>
									<th width="30%">合作方 </th>
									<th width="30%">location </th>
									<th width="30%">client </th>
									<th width="30%">program </th>
									<th width="30%">area </th>
									<th width="30%">budget </th>
									<th width="30%">status </th>
									<th width="30%">projectteam </th>
									<th width="30%">collaborator </th>
							<th width="10%"></th>
						</tr>
						<c:forEach var="var" items="${projectModel.items}">
	
							<tr onmouseover="this.className='over'" onmouseout="this.className='out'"   onclick="showInfo(${ var.id },this);">
								<td><input type="radio" name="selectNos" id="radioId${var.id}"  value="${ var.id }" /></td>
										<td><div><c:out value="${var.title}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.title_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.location}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.pdate}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.client}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.program}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.area}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.budget}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.status}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.projectteam}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.collaborator}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.location_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.client_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.program_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.area_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.budget_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.status_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.projectteam_en}" escapeXml="true"/></div></td>
										<td><div><c:out value="${var.collaborator_en}" escapeXml="true"/></div></td>
								<td><a href="<%=request.getContextPath()%>/project/goView?dataId=${ var.id }" >查看</a>&nbsp;&nbsp;<a href="<%=request.getContextPath()%>/project/goEdit?dataId=${ var.id }" >编辑 &nbsp;&nbsp;<a href="<%=request.getContextPath()%>/project/doDelete?dataId=${ var.id }" >删除</a></a></td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
			<tr>
				<td height="40" colspan="2">
					<div class="pager"></div>
				</td>
			</tr>
		</table>
		<input type="hidden" name="currentPage" value="${projectModel.currentPage}"/>
	</form>

	<script type="text/javascript">
	$(".pager").pager({ pagenumber: ${projectModel.currentPage}, pagecount: ${projectModel.pageCount}, buttonClickCallback: pageClick });
	function pageClick(pageNum){
		$("input[name='currentPage']").val(pageNum);
		$("#form").submit();
	}


    function goCreate(){
        var form = document.getElementById("form");
        form.action = "<%=request.getContextPath()%>/project/goCreate";
        form.submit();
    }
    
    function doDelete(){
        var form = document.getElementById("form");
        form.action = "<%=request.getContextPath()%>/project/doDelete";
        form.submit();
    }
    
    function doQuery(){
        var form = document.getElementById("form");
        form.action = "<%=request.getContextPath()%>/project/query";
        form.submit();
    }
    
    
	</script>
</body>
</html>


