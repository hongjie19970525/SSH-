<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
	<head>
		<title>内容管理系统之用户管理系统</title>
		<style type="text/css">
			.style1{
				color:#FF0000;
				font-weight:bold;
			}
		</style>
	</head>
	
	<body>
		<form name="user" action="/myEdition/login.action" method="post">
		
		<table width="776" border="1">
			<tr>
				<td height="38" colspan="2">
					<div align="center">
					用户登录
							<span class="style1"> 消息提示：${login.msg}</span>
					</div>"					
				</td>
			</tr>
			<tr>
					<td>
						<div align="right">
							用户名：
						</div>
					</td>
					<td>
						<input type="text" name="user.username" value="${user.username}" />
					</td>					
				</tr>
				<tr>
					<td>
						<div align="right">
							密码:
						</div>
					</td>
					<td>
						<input type="password" name="user.password" value="${user.password}" />
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<div align="center"></div>
						<div align="center">
							<input type="submit" name="submit" value="登录">
							<input type="reset" name="submit" value="重置">
							
						</div>
					</td>
				</tr>
		</table>
		</form>
	</body>
</html>
