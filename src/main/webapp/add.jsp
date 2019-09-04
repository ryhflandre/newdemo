<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="jquery-1.8.2.min.js"></script>
<script type="text/javascript">
$(function() {
	$("#btn").click(function() {
		var lids = $("[name=lids]:checked").map(function() {
			return $(this).val();
		}).get().join(",");
		$.post("add.do",$("form").serialize()+"&lids="+lids,function(da){
			if(da){
				alert("电影保存成功");
				location.href="list.do";
			}else{
				alert("添加失败");
				location.reload();
			}
		},"json");
	});
});
</script>
<link rel="stylesheet" style="text/css" href="css.css">
<title>Insert title here</title>
</head>
<body>
<form action="#">
	<table>
		<tr>
			<td>电影名称</td>
			<td><input type="text" name="mname"></td>
		</tr>
		<tr>
			<td>剧情介绍</td>
			<td>
				<textarea rows="5" cols="100" name="mabout">
					
				</textarea>
			</td>
		</tr>
		<tr>
			<td>导演</td>
			<td><input type="text" name="mleader"></td>
		</tr>
		<tr>
			<td>发行日期</td>
			<td><input type="date" name="mdate"></td>
		</tr>
		<tr>
			<td>电影分类</td>
			<td>
				<input type="checkbox" name="lids" id="lids" value="1">动作
				<input type="checkbox" name="lids" id="lids" value="2">喜剧
				<input type="checkbox" name="lids" id="lids" value="3">爱情
				<input type="checkbox" name="lids" id="lids" value="4">动画
				<input type="checkbox" name="lids" id="lids" value="5">剧情
				<input type="checkbox" name="lids" id="lids" value="6">惊悚
				<input type="checkbox" name="lids" id="lids" value="7">犯罪
				<input type="checkbox" name="lids" id="lids" value="8">科幻
				<input type="checkbox" name="lids" id="lids" value="9">战争
				<input type="checkbox" name="lids" id="lids" value="10">记录
				<input type="checkbox" name="lids" id="lids" value="11">电视剧
				<input type="checkbox" name="lids" id="lids" value="12">其他
			</td>
		</tr>
		<tr>
			<td colspan="100">
				<input type="button" value="添加" id="btn">
			</td>
		</tr>
	</table>
</form>
</body>
</html>