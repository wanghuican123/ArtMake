package cn.edu.xmu.serviceImpl;

import cn.edu.xmu.dao.PersonDao;
import cn.edu.xmu.entity.Person;
import cn.edu.xmu.service.LoginService;
import cn.edu.xmu.util.Common;

import javax.annotation.Resource;


/**
  * @ClassName: LoginServiceImpl
  * @Description: 登录服务
  * team: 3-10打屁屁小队
  * @date 2015年11月20日 上午2:55:21
  */
public class LoginServiceImpl implements LoginService {
     
     /**
      * @Fields dao : dao组件
      */
    @Resource(name="persondao")
     PersonDao dao ;

	/*
	  * Title: login
	  * Description:登录方法
	  * @param person
	  * @return
	  * @see cn.edu.xmu.service.LoginService#Login(cn.edu.xmu.Person)
	  */
	
	@Override
	public Person login(Person person) {
		// TODO Auto-generated method stub
		Person p = dao.getPersonByLogin(person);
		if(p!=null){
			return p;
		}
		return null;
	}

	/*
	  * Title: checkError
	  * Description:
	  * @param person
	  * @return
	  * @see cn.edu.xmu.service.LoginService#checkError(cn.edu.xmu.entity.Person)
	  */
	
	@Override
	public int check(Person person) {
		// TODO Auto-generated method stub
		Person p = dao.getPersonByAccount(person.getAccount());
		if(p==null){
			return 1;//不存在
		}else{
			if(!p.getRole().getRolename().contains("管理员")){
				if(p.getPassword().equals(person.getPassword()))
				{
					return 2;//用户密码正确
				}else{
					return 3;//用户密码错误
				}
			}else{
				if(p.getPassword().equals(person.getPassword()))
				{
					return 4;//管理员密码正确
				}else{
					return 5;//管理员密码错误
				}
			}
		}
	}
}
