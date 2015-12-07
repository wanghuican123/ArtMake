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
public class IndexAction extends ActionSupport {

	 @Override
	 public String execute() throws Exception {
	       return super.execute();
	 }
	 
	private String goIndex() throws Exception{
		return SUCCESS;
	}
}
