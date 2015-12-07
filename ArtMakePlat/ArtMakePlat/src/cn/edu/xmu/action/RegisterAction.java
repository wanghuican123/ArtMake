package cn.edu.xmu.action;

import java.util.regex.Pattern;

import cn.edu.xmu.entity.Person;
import cn.edu.xmu.entity.Role;
import cn.edu.xmu.service.LoginService;
import cn.edu.xmu.service.RegisterService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import javax.annotation.Resource;

public class RegisterAction extends ActionSupport{
	
    @Resource(name="registerService")
	private RegisterService registerService;
    @Resource(name="loginService")
    private LoginService loginService;
      
    /**
	  * @Fields account
	  */
	private String account;
	/**
	  * @Fields password
	  */
	private String password;
	/**
	  * @Fields repassword
	  */
	private String repassword;
	/**
	  * @Fields realname
	  */
	private String realname;
	
	/**
	  * @Fields introduce
	  */
	private String introduce;

	/**
	  * @Fields key
	  */
	private String key;
	
	public String getIntroduce() {
		return introduce;
	}

	/**
	 * setter method
	 * @param introduce the introduce to set
	 */
	
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}

	
	/**
	 * getter method
	 * @return the loginService
	 */
	
	public LoginService getLoginService() {
		return loginService;
	}

	/**
	 * setter method
	 * @param loginService the loginService to set
	 */
	
	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}

	/**
	 * getter method
	 * @return the registerService
	 */	
	
	public RegisterService getRegisterService() {
		return registerService;
	}

	/**
	 * getter method
	 * @return the account
	 */
	
	public String getAccount() {
		return account;
	}

	/**
	 * setter method
	 * @param account the account to set
	 */
	
	public void setAccount(String account) {
		this.account = account;
	}

	/**
	 * getter method
	 * @return the password
	 */
	
	public String getPassword() {
		return password;
	}

	/**
	 * setter method
	 * @param password the password to set
	 */
	
	public void setPassword(String password) {
		this.password = password;
	}

	
	
	/**
	 * getter method
	 * @return the repassword
	 */
	
	public String getRepassword() {
		return repassword;
	}

	/**
	 * setter method
	 * @param repassword the repassword to set
	 */
	
	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	/**
	 * getter method
	 * @return the realname
	 */
	
	public String getRealname() {
		return realname;
	}

	/**
	 * setter method
	 * @param realname the realname to set
	 */
	
	public void setRealname(String realname) {
		this.realname = realname;
	}

	/**
	 * setter method
	 * @param registerService the registerService to set
	 */
	
	
	
	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	
	
	/**
	 * getter method
	 * @return the key
	 */
	
	public String getKey() {
		return key;
	}

	/**
	 * setter method
	 * @param key the key to set
	 */
	
	public void setKey(String key) {
		this.key = key;
	}

	@Override
    public String execute() throws Exception {
		/*
		System.out.println(this.getAccount());
		System.out.println(this.getPassword());
		System.out.println(this.getRealname());
		System.out.println(this.getRepassword());
		System.out.println(this.getIntroduce());
		*/
		Person person = new Person();
		person.setAccount(getAccount());
		person.setPassword(getPassword());
		person.setRealname(realname);
		person.setIntroduce(getIntroduce());
        person.setRole(new Role(1, 0, "用户"));
		registerService.register(person);      
        ActionContext.getContext().getSession().put("person", person);
        return "registerSuccess";
	}

	@Override
	public void validate() {
		
		//判断用户名是否输入,如果输入了再判断格式是否正确
		if(getAccount() == null || "".equals(getAccount().trim())){
			this.addFieldError("account2", "用户名必须输入");
		}else if ( !Pattern.matches("\\w{6,20}", getAccount().trim())) {
			this.addFieldError("account2", "用户名为长度6到20的字母、数字");
		}else{
			Person p = new Person();
			p.setAccount(getAccount());
			if(loginService.check(p) != 0){
				this.addFieldError("account2", "用户名已经存在");
			}
		}
		//判断密码是否输入,如果输入了再判断格式是否正确
		if( getPassword() == null || "".equals(getPassword().trim())){
			this.addFieldError("password2", "密码必须输入");
		}else if( !Pattern.matches("\\w{6,20}", getPassword().trim())) {
			this.setPassword("");
			this.addFieldError("password2", "密码为长度6到20的字母、数字");
		}
		//判断确认密码是否输入,如果输入了再判断格式是否正确
		if(getRepassword() == null || "".equals(getRepassword().trim())){
			this.addFieldError("repassword", "确认密码必须输入");
		}else if( !Pattern.matches("\\w{6,20}", repassword.trim())) {
			this.setRepassword("");
			this.addFieldError("repassword", "确认密码为长度6到20的字母、数字");
		}
		//判断确认密码和密码是否相同
		if(getPassword() != null && getRepassword() != null && ! getRepassword().equals(getPassword()) &&
				getPassword() != "" && getRepassword() !=""){
			this.setRepassword("");
			this.addFieldError("repassword","两次密码必须相同");
		}
		//判断姓名
		if(getRealname()!=null && (getRealname().length() < 2 || getRealname().length() > 5)) {  
			this.addFieldError("realname","姓名长度必须在2到5之间");
		}
	}
	
}
