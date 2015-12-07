package cn.edu.xmu.daoImpl;

import javax.annotation.Resource;

import cn.edu.xmu.dao.BaseDao;
import cn.edu.xmu.dao.PersonDao;
import cn.edu.xmu.entity.Person;
import cn.edu.xmu.util.Common;

public class PersonDaoImpl implements PersonDao {
	/**
     * @Fields dao : dao组件
     */
   @Resource(name="dao")
    BaseDao dao ;
   
	@Override
	public Person getPersonByLogin(Person person) {
		// TODO Auto-generated method stub
		String hql = "from " + Common.TABLE_PERSON + " where account = ? and password = ?";
		String pro[] = new String[2];
		pro[0] = person.getAccount();
		pro[1] = person.getPassword();
		Person p = (Person) dao.loadObject(hql,pro);
		if(p != null)
			return p;
		return null;
	}

	@Override
	public Person getPersonByAccount(String account) {
		// TODO Auto-generated method stub
		String hql = "from " + Common.TABLE_PERSON + " where account = ?";
		String pro[] = new String[1];
		pro[0] = account;
		Person p = (Person) dao.loadObject(hql,pro);
		if(p != null)
			return p;
		return null;
	}

}
