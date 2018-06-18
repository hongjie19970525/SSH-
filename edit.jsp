<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.myEdition.bean.*" %>
<html>
  <head>
  	<title>内容管理系统之内容发布</title>
  	<style type="text/css">
  		.style1{
  			color:#FFOOOO;
  			font-weight:bold;
  		}
  	</style>
  </head>
  
  <body>
    <form name="user" action="/myEdition/edit.action" method="post">
    	<table width="776" border="1">
    		<tr>
    			<td height="38" colspan="2">
    				<div align="center">
    					内容发布
    					<span class="style1">消息提示:${setContent.msg}</span>
    				</div>
   				</td>
			</tr>
			<tr>
				<td width="320">
					<div align="right">
						内容标题:
					</div>
				</td>
				<td width="440">
					<input name="content.title" type="text" size="100" maxlengt="100" value="${content.title}" />
				</td>
			</tr>
			<tr>
				<td>
					<div align="right">
						内容正文：
					</div>
				</td>
				<td>
					<textarea id="content" name="content.content" cols="76" >${content.contents}</textarea>
				</td>
			</tr>
    		<tr>
    			<td>
    				<select name="contentType">
    					<c:forEach items="{contentTypes}" var="contentType">
    					<option value="${contentType.id }">${contentType.name }</option>
    					</c:forEach>   					
    					</select>
				</td>
			</tr>
			<tr>
				<td>
					<div align="right">
						发布日期:
					</div>
				</td>
				<td>
					"${content.date}"
				</td>
    					
    	</table>
    
    </form>
    
    
    
  </body>
</html>
