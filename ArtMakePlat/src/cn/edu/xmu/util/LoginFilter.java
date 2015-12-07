/**
 * @Title: LoginFilter.java
 * @Package cn.edu.xmu.util
 * @Description: TODO
 * team:3-10打屁屁小队
 * @author Comsys-xmu03
 * @date 2015年12月2日 上午10:07:47
 * @version V1.0
 */

package cn.edu.xmu.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.edu.xmu.entity.Person;

/**
 * @ClassName: LoginFilter
 * @Description: TODO
 * team: 3-10打屁屁小队
 * @date 2015年12月2日 上午10:07:47
 */

public class LoginFilter implements Filter{
	/*
	  * Title: destroy
	  * @see javax.servlet.Filter#destroy()
	  */
	public void destroy() {
	}

	/*
	  * Title: doFilter
	  * @param arg0
	  * @param arg1
	  * @param arg2
	  * @throws IOException
	  * @throws ServletException
	  * @see javax.servlet.Filter#doFilter(javax.servlet.ServletRequest, javax.servlet.ServletResponse, javax.servlet.FilterChain)
	  */
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("我是过滤器" );
		HttpServletRequest servletRequest = (HttpServletRequest) request;
		HttpServletResponse servletResponse = (HttpServletResponse) response;
		HttpSession session = servletRequest.getSession();
		Person person = (Person) session.getAttribute("person");
		String path = servletRequest.getServletPath();
		if(person == null){
			System.out.println("我是过滤器：没通过" );
			servletResponse.sendRedirect(servletRequest.getContextPath()+"/user.jsp");
			return;
		}else{
			chain.doFilter(request,response);
			System.out.println("我是过滤器：通过了" );
		}
	}

	/*
	  * Title: init
	  * @param arg0
	  * @throws ServletException
	  * @see javax.servlet.Filter#init(javax.servlet.FilterConfig)
	  */
	public void init(FilterConfig arg0) throws ServletException {
	}

}
