package cn.edu.xmu.action;

import java.util.HashSet;
import java.util.Set;

import cn.edu.xmu.entity.Person;
import cn.edu.xmu.service.LoginService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

/**
 * @ClassName: LoginAction
 * @Description: 登录 team: 3-10打屁屁小队
 * @date 2015年11月20日 上午2:54:21
 */
public class LoginAction extends ActionSupport {

	/**
	 * @Fields loginService : 登录业务逻辑组件
	 */
	@Resource(name = "loginService")
	LoginService loginService;

	/**
	 * @Fields person
	 */
	private Person person;

	/**
	 * getter method
	 * 
	 * @return the loginService
	 */

	public LoginService getLoginService() {
		return loginService;
	}

	/**
	 * setter method
	 * 
	 * @param loginService
	 *            the loginService to set
	 */

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	/**
	 * getter method
	 * 
	 * @return the person
	 */

	public Person getPerson() {
		return person;
	}

	/**
	 * setter method
	 * 
	 * @param person
	 *            the person to set
	 */

	public void setPerson(Person person) {
		this.person = person;
	}

	/*
	 * Title: execute Description:
	 * 
	 * @return
	 * 
	 * @throws Exception
	 * 
	 * @see com.opensymphony.xwork2.ActionSupport#execute()
	 */
	@Override
	public String execute() throws Exception {
		// 登录前清空所有session
		ActionContext.getContext().getSession().clear();
		Person p = loginService.login(person);
		if (p != null) {
			ActionContext.getContext().getSession().put("person", p);
			return "loginSuccess";
		}
		return INPUT;
	}
	 public String exit() {
		    System.out.print("登出");
	        //ActionContext.getContext().getSession().clear();
	        return "exit";
	   }
	@Override
	public void validate() {
		/* Check that fields are not empty */
		//System.out.println("validate");
		if (person.getPassword().length() == 0) {
			addFieldError("password", getText("password is required"));
		}
		if (person.getAccount().length() == 0) {
			addFieldError("account", getText("account is required"));
		}
		int errortype = loginService.check(person);
		if(errortype == 0 && person.getPassword().length() != 0){
			addFieldError("noaccount",getText("account is not exist"));
		}else if(errortype == 1 && person.getPassword().length() != 0){
			addFieldError("wrongpassword",getText("password is wrong"));
		}
	}
}
