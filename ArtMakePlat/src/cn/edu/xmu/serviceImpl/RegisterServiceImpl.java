package cn.edu.xmu.serviceImpl;

import cn.edu.xmu.dao.BaseDao;
import cn.edu.xmu.entity.Person;
import cn.edu.xmu.service.RegisterService;

import javax.annotation.Resource;


public class RegisterServiceImpl implements RegisterService{
	
    @Resource(name="dao")
    BaseDao dao ;
    
    @Override
	public void register(Person person){
    	dao.saveOrUpdate(person);
    }

}
