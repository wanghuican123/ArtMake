package cn.edu.xmu.action;


import cn.edu.xmu.entity.Person;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


import org.apache.struts2.ServletActionContext;

/**
 * @ClassName: LogoutAction
 * @Description: 登录 team: 3-10打屁屁小队
 * @date 2015年11月20日 上午2:54:21
 */
public class LogoutAction extends ActionSupport {

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
		 Person person = (Person)ServletActionContext.getRequest().getSession().getAttribute("person");
		 System.out.print(person.getAccount() + "已经登出");
	     ActionContext.getContext().getSession().clear();
	     return "exit";
	}
}
