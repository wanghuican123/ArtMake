package cn.edu.xmu.serviceImpl;

import cn.edu.xmu.dao.BaseDao;
import cn.edu.xmu.entity.Person;
import cn.edu.xmu.service.LoginService;

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
    @Resource(name="dao")
     BaseDao dao ;

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
		Person p = (Person)dao.loadObject("from Person where account = '" + person.getAccount() + "' And password = '" + person.getPassword() + "'");
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
		Person p = (Person)dao.loadObject("from Person where account = '" + person.getAccount() + "'");
		if(p==null){
			return 0;
		}else if(!p.getPassword().equals(person.getPassword()))
		{
			return 1;
		}
		return 2;
	}

}
