<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

<link rel="stylesheet" href="/css/bootstrap.min.css">
<script type="text/javascript" src="/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript" src="/js/popper.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</head>
<body>

<table class="table  table-dark">

	<tr>
		<th>姓名</th>
		<th>性别</th>
	</tr>
	
	<#list students as s>
		<tr>
			<td>${s.sname}</td>
			<td>${s.ssex}</td>
		</tr>
	</#list>
</table>
</body>
</html>