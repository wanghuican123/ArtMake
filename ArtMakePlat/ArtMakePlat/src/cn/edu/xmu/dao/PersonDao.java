/**
 * @Title: PersonDao.java
 * @Package cn.edu.xmu.dao
 * @Description: TODO
 * team:3-10打屁屁小队
 * @author Comsys-xmu03
 * @date 2015年12月7日 下午5:50:07
 * @version V1.0
 */

package cn.edu.xmu.dao;

import java.util.List;

import cn.edu.xmu.entity.Person;

/**
 * @ClassName: PersonDao
 * @Description: TODO
 * team: 3-10打屁屁小队
 * @date 2015年12月7日 下午5:50:07
 */

public interface PersonDao {

	public Person getPersonByLogin(Person person);
	
	public Person getPersonByAccount(String account);
}
