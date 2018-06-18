<%@ page language="java" import="java.util.*,com.myEdition.bean.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    
    <title>内容管理系统之设定内容类别</title>
    <style type="text/css">
    	.style1{
    		color:#FF0000;
    		font-weight:bold;
    	}
    </style>
  </head>
  
  <body>
    <form name="user" action="/myEdition/setType.action" method="post">
    	<table>
    		<tr>
    			<td colspan="2">
    				<div align="center">
    					<a href="/myEdition/release.action?user.user=${user.username}&user.id=${user.id}"></a>
    					
    				</div>
   				</td>
			</tr>
			<tr>
				<td height="38" colspan="2">
					<div align="center">
						内容类别设定
						<span class="style1">消息提示：${login.msg}${setContentType.msg}</span>
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div align="right">
						内容类别名称:
					</div>
				</td>
				<td>
					<input type="text" name="contentType.name" value="${contentType.name}" />
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<div align="center"></div>
					<div align="center">
						<input type="submit" name="Submit" value="新增">
						<input type="submit" name="Submit" value="修改">
						<input type="submit" name="Submit" value="删除">
					</div>
				</td>
			</tr>					
    	</table>
    	<input name="user.id" type="hidden" value="${user.id}" />
    	<input name="user.username type="hidden" value="${user.username}" />
    </form>
  </body>
</html>
