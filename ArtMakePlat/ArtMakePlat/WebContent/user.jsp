<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="format-detection" content="telephone=no" />
<link rel="stylesheet" href="css/login-form.css">
<link rel="stylesheet" href="css/register-form.css">
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/script.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.equalheights.js"></script>
<script src="js/jquery.mobilemenu.js"></script>
<script src="js/tmStickUp.js"></script>
<script src="js/jquery.ui.totop.js"></script>
<script src="js/TMForm.js"></script>
<script src="js/modal.js"></script>

<script>
function goAdminLogin()
{
	window.location.href = "forward!goAdminLogin";
}
	$(window).load(function() {
		if ("<s:property value='key'/>" != "")
			window.location.href = "#" + "<s:property value='key'/>";
		$().UItoTop({
			easingType : 'easeOutQuart'
		});
		$('#stuck_container').tmStickUp({});
	});
</script>
<title>登录</title>
</head>
<body>
	<!--==============================
              header
=================================-->
	<header>
	<div onclick="goAdminLogin()" style="cursor:pointer;position:absolute;z-index:100;top:1%;left:95%;color:black;width:30%">管理员登陆</div>
	<div class="header_top">
		<div class="container">
			<div class="row">
				<div class="grid_12">
					<h1>
						<a href="index.html">Art.More <br> embellish life
						</a>
					</h1>
					your photographer
				</div>
			</div>
		</div>
	</div>
	<section id="stuck_container"> <!--==============================
              Stuck menu
  =================================-->
	<div class="container">
		<div class="row">
			<div class="grid_12 ">
				<h1 class="logo">
					<a href="index.html"> Art.More </a>
				</h1>
				<div class="navigation ">
					<nav>
					<ul class="sf-menu">
						<li><a href="index">首页</a></li>
						<li><a href="about.html">关于</a></li>
						<li><a href="gallery.html">拍卖</a></li>
						<li><a href="blog.html">定制</a></li>
						<li class="current"><a href="user.jsp"> <s:if
									test="#session.person==null">                                  
                                                        登录/注册
               </s:if> <s:else>
                                                亲爱的<s:property value="#session.person.role.rolename" />:
                          <s:property value="#session.person.realname" />
                          <a href="logout"
								class="btn" data-type="submit"
								style="font-family: 'Microsoft YaHei UI'">登出</a>
								</s:else>
						</a></li>
					</ul>
					</nav>
					<div class="clear"></div>
				</div>
				<div class="clear"></div>
			</div>
		</div>
	</div>
	</section> </header>
	<!--=====================
          Content
======================-->
	<section id="content">
	<div class="container">
		<div class="row">
			<div class="map">
				<div class="grid_6">
					<h2>登录</h2>
					<form id="login-form" action="login" method="post">
						<div class="login-form-loader"></div>
						<fieldset>
							<label class="name"> <input type="text"
								name="person.account" placeholder="account:"
								value="<s:property value='person.account'/>" data-constraints=""
								style="border-color: #87858a; border-width: thin; background: none; height: 35px; font-family: 'Microsoft YaHei UI'" />
								<s:fielderror>
									<p class="empty-message">
										<s:param>account</s:param>
									</p>
									<p class="error-message">
										<s:param>noaccount</s:param>
									</p>
								</s:fielderror>
							</label> <label class="email"> <input type="password"
								name="person.password" placeholder="password:" value=""
								data-constraints=""
								style="float: right; border-color: #87858a; border-width: thin; background: none; height: 35px; font-family: 'Microsoft YaHei UI'" />
								<s:fielderror>
									<p class="empty-message">
										<s:param>password</s:param>
									</p>
									<p class="error-message">
										<s:param>wrongpassword</s:param>
									</p>
								</s:fielderror>
							</label> <input type="submit" id="in" value="登录"
								style="border-color: #87858a; border-width: thin; background: none; height: 35px; width: 100%; font-family: 'Microsoft YaHei UI'" />
						</fieldset>
					</form>
					<br> <a class="" href="" style="font-family:"youyuan";">忘记密码？</a>
					<a href="#register" style="float: right; font-family:"
						youyuan";"id="toTop"> <span id="toTopHover"
						style="opacity: 1;"> 注册</span></a>



				</div>
			</div>
			<br>


			<div class="grid_5">
				<h2>用户须知</h2>
				<div class="text1 tx__1">Lorem ipsum dolor sit amet,
					consecteturpiscinger elit um dolor sit amet, consecteturpiscing.</div>
				<p>
					All <a href="http://www.templatemonster.com/ " rel="nofollow"
						class="color1"><strong>premium website themes</strong></a> go with
					24/7 support.
				</p>
				<p>
					If you have any questions regarding customization of <a
						href="http://blog.templatemonster.com/free-website-templates/"
						rel="nofollow" class="color1"><strong>freebies</strong></a>, ask
					guys from <a href="http://www.templatetuning.com/" rel="nofollow"
						class="color1"><strong>TemplateTuning</strong></a> to help you.
				</p>
				The Company Name Inc. <br> 9870 St Vincent Place,<br>
				Glasgow, DC 45 Fr 45.<br> Telephone: +1 800 603 6035<br>
				FAX: +1 800 889 9898<br> E-mail: <a href="#">mail@demolink.org</a>

			</div>
			<div class="grid_6 preffix_1" id="register">
				<h2>注册</h2>
				<form id="register-form" action="register" method="post">
					<input type="hidden" name="key" value="register">
					<div class="register-form-loader"></div>
					<fieldset>
						<label class="name"> <input type="text" name="account"
							placeholder="Account:" value="<s:property value='account'/>"
							data-constraints=""
							style="border-color: #87858a; border-width: thin; background: none; width: 99%; height: 35px; font-family: 'Microsoft YaHei UI'" />
							<s:fielderror>
								<p class="empty-message">
									<s:param>account2</s:param>
								</p>
							</s:fielderror>
						</label> <label class="name"> <input type="text" name="realname"
							placeholder="Realname:" value="<s:property value='realname'/>"
							data-constraints="@Required @Email"
							style="border-color: #87858a; border-width: thin; background: none; width: 99%; height: 35px; font-family: 'Microsoft YaHei UI'" />
							<s:fielderror>
								<p class="empty-message">
									<s:param>realname</s:param>
								</p>
							</s:fielderror>
						</label> <label class="password"> <input type="password"
							name="password" placeholder="Password:"
							value="<s:property value='password'/>" data-constraints=""
							style="border-color: #87858a; border-width: thin; background: none; width: 99%; height: 35px; font-family: 'Microsoft YaHei UI'" />
							<s:fielderror>
								<p class="empty-message">
									<s:param>password2</s:param>
								</p>
							</s:fielderror>
						</label>
						<fieldset>

							<label class="password"> <input type="password"
								name="repassword" placeholder="Repassword:"
								value="<s:property value='repassword'/>" data-constraints=""
								style="border-color: #87858a; border-width: thin; background: none; width: 99%; height: 35px; font-family: 'Microsoft YaHei UI'" />
								<s:fielderror>
									<p class="empty-message">
										<s:param>repassword</s:param>
									</p>
								</s:fielderror>
							</label>
						</fieldset>

						<label class="message"> <textarea name="introduce"
								placeholder="Introduce:"
								data-constraints='@Required @Length(min=0,max=999999)'
								style="border-color: #87858a; border-width: thin; background: none; width: 100%; font-family: 'Microsoft YaHei UI'"><s:property
									value='%{#request.introduce}' /></textarea>
						</label>
					</fieldset>
					<fieldset>
						<div class="ta__right">
							<input type="reset" class="btn" data-type="reset"
								style="font-family: 'Microsoft YaHei UI'; cursor: pointer;"
								value="重置" /> <a href="javascript:$('#register-form').submit()"
								class="btn" data-type="submit"
								style="font-family: 'Microsoft YaHei UI'">注册</a>
						</div>
					</fieldset>
					<div class="modal fade response-message">
						<div class="modal-dialog">
							<div class="modal-content">
								<div class="modal-header">
									<button type="button" class="close" data-dismiss="modal"
										aria-hidden="true">&times;</button>
									<h4 class="modal-title">Modal title</h4>
								</div>
								<div class="modal-body">You message has been sent! We will
									be in touch soon.</div>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>
	</section>
	<script type="text/javascript">
		$(document).ready(function() {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<a href="#" id="toTop" style="display: block;"> <span
		id="toTopHover" style="opacity: 1;">↑↑↑↑↑↑↑↑ </span></a>
	<script type="text/javascript">
		function click_scroll() {
			var scroll_offset = $("#pos").offset();
			$("body,html").animate({
				scrollTop : scroll_offset.top
			}, 1000);
		}
		function reset(con) {
			con.reset();
		}
	</script>
	<!--==============================
              footer
=================================-->
	<footer id="footer"> </footer>
	<a href="#" id="toTop" class="fa fa-chevron-up"></a>
</body>
</html>