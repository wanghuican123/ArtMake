<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>后台登录</title>
<link href="css/backstage/authority/login_css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#login_sub").click(function(){
			$("#submitForm").attr("action", "adminLogin").submit();
		});
	});
	
	/*回车事件*/
	function EnterPress(e){ //传入 event 
		var e = e || window.event; 
		if(e.keyCode == 13){ 
			$("#submitForm").attr("action", "adminLogin").submit();
		} 
	} 
</script>
</head>
<body>
	<div id="login_center">
		<div id="login_area">
			<div id="login_box">
				<div id="login_form">
					<form id="submitForm" action="" method="post">
						<div id="login_tip">
							<span id="login_err" class="sty_txt2"></span>
						</div>
						<div>
							 账&nbsp;&nbsp;&nbsp;&nbsp;号：<input type="text" value="<s:property value='person.account'/>"
							  name="person.account" class="username" id="name">
						<s:fielderror>
									<p class="empty-message">
										<s:param>account</s:param>
									</p>
									<p class="error-message">
										<s:param>noaccount</s:param>
									</p>
						</s:fielderror>
						</div>
						<div>
							密&nbsp;&nbsp;&nbsp;&nbsp;码：<input type="password" name="person.password" class="pwd" id="pwd" onkeypress="EnterPress(event)" onkeydown="EnterPress()">
						 <s:fielderror>
								<p class="empty-message">
									<s:param>password</s:param>
								</p>
								<p class="error-message">
									<s:param>wrongpassword</s:param>
								</p>
						</s:fielderror>
						</div>
						<div id="btn_area">
							<input type="submit" class="login_btn" id="login_sub"  value="登  录">
							<input type="reset" class="login_btn" id="login_ret" value="重 置">
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>