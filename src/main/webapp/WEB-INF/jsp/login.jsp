<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请登录</title>
</head>
<body>

	<div style="margin:0 auto; padding-top: 100px;" align="center">
		<form action="doLogin.html" method="post">
			<p>
				<span>用户名</span><input type="text" name="username">
			</p>
			<p>
				<span>密码</span><input type="password" name="password">
			</p>
			<p>
				<input type="submit" value="登录">
			</p>
			<p style="color: red;">
				<option value="${error}">${error}</option>
			</p>			
		</form>
	</div>

</body>
</html>