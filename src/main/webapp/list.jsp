<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#btna").click(function() {
		location.href="add.jsp";
	});
});

function update(mid) {
	location.href="update.jsp?mid="+mid;
}
</script>
<link rel="stylesheet" style="text/css" href="css.css">
<title>Insert title here</title>
</head>
<body>
<form action="list.do" method="post">
	电影名称:<input type="text" name="mname">
	<input type="submit" value="搜索"> <input type="button" id="btna" value="添加"> <input type="button" value="批量删除" onclick="del()">
</form>
<table>
	<tr>
		<td><input type="button" value="全选" id="btnb"><input type="button" value="全不选" id="btnc"><input type="button" value="反选" id="btnd"></td>
		<td>电影名称</td>
		<td>剧情介绍</td>
		<td>导演</td>
		<td>发行日期</td>
		<td>电影分类</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${page.list }" var="m">
		<tr>
			<td><input type="checkbox" name="mid" value="${m.mid }"></td>
			<td>${m.mname }</td>
			<td>${m.mabout }</td>
			<td>${m.mleader }</td>
			<td>${m.mdate }</td>
			<td>${m.lnames }</td>
			<td><input type="button" value="修改" onclick="update(${m.mid })"></td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="100">
			<a href="?pageNum=1">首页</a>
			<a href="?pageNum=${page.pageNum-1<1?page.pageNum:page.pageNum-1 }">上一页</a>
			共${page.pages }页
			<a href="?pageNum=${page.pageNum+1>page.pages?page.pageNum:page.pageNum+1 }">下一页</a>
			<a href="?pageNum=${page.pages }">尾页</a>
		</td>
	</tr>
</table>
</body>
</html>