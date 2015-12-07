package cn.edu.xmu.service;

import cn.edu.xmu.entity.Person;


/**
  * @ClassName: LoginService
  * @Description: 登录业务逻辑接口
  * team: 3-10打屁屁小队
  * @date 2015年11月20日 上午2:55:08
  */
public interface LoginService {


	/**
	  * MethidName: login
	  * @Title: login
	  * @Description: 登录方法接口
	  * @param  person
	  * @return Person    返回类型
	  * @throws
	  */
	public Person login(Person person);

	/**
	  * MethidName: checkError
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: checkError
	  * @Description: TODO
	  * @param @param person
	  * @param @return    设定文件
	  * @return int    返回类型
	  * @throws
	  */
	public int check(Person person);
	
	
}
