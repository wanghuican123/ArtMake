package cn.edu.xmu.dao;

import com.mysql.jdbc.Connection;
import java.io.Serializable;
import java.util.List;

/**
  * @ClassName: BaseDao
  * @Description: TODO
  * team: 3-10打屁屁小队
  * @date 2015年11月20日 上午2:54:51
  */
public interface BaseDao {


	/**
	  * MethidName: loadById
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: loadById
	  * @Description: TODO
	  * @param @param clazz
	  * @param @param id
	  * @param @return    设定文件
	  * @return Object    返回类型
	  * @throws
	  */
	public Object loadById(Class clazz, int id);

	/**
	  * MethidName: loadObject
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: loadObject
	  * @Description: TODO
	  * @param @param hql
	  * @param @return    设定文件
	  * @return Object    返回类型
	  * @throws
	  */
	public Object loadObject( String hql);

	/**
	  * MethidName: delById
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: delById
	  * @Description: TODO
	  * @param @param clazz
	  * @param @param id    设定文件
	  * @return void    返回类型
	  * @throws
	  */
	public void  delById(Class clazz, int id);

	/**
	  * MethidName: saveOrUpdate
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: saveOrUpdate
	  * @Description: TODO
	  * @param @param obj    设定文件
	  * @return void    返回类型
	  * @throws
	  */
	public void saveOrUpdate(Object obj);

	/**
	  * MethidName: listAll
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: listAll
	  * @Description: TODO
	  * @param @param clazz
	  * @param @return    设定文件
	  * @return List    返回类型
	  * @throws
	  */
	public List listAll(String clazz);

	/**
	  * MethidName: listAll
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: listAll
	  * @Description: TODO
	  * @param @param clazz
	  * @param @param pageNo
	  * @param @param pageSize
	  * @param @return    设定文件
	  * @return List    返回类型
	  * @throws
	  */
	public List listAll(String clazz, int pageNo, int pageSize);

	/**
	  * MethidName: countAll
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: countAll
	  * @Description: TODO
	  * @param @param clazz
	  * @param @return    设定文件
	  * @return int    返回类型
	  * @throws
	  */
	public int countAll(String clazz);

	/**
	  * MethidName: query
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: query
	  * @Description: TODO
	  * @param @param hql
	  * @param @return    设定文件
	  * @return List    返回类型
	  * @throws
	  */
	public List query(String hql);

	/**
	  * MethidName: query
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: query
	  * @Description: TODO
	  * @param @param hql
	  * @param @param pageNo
	  * @param @param pageSize
	  * @param @return    设定文件
	  * @return List    返回类型
	  * @throws
	  */
	public List query(String hql, int pageNo, int pageSize);

	/**
	  * MethidName: countQuery
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: countQuery
	  * @Description: TODO
	  * @param @param hql
	  * @param @return    设定文件
	  * @return int    返回类型
	  * @throws
	  */
	public int countQuery(String hql);

	/**
	  * MethidName: update
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: update
	  * @Description: TODO
	  * @param @param hql
	  * @param @return    设定文件
	  * @return int    返回类型
	  * @throws
	  */
	public int update(String hql);

	/**
	  * MethidName: getConnection
	  * TODO(这里描述这个方法适用条件 – 可选)
	  * TODO(这里描述这个方法的使用方法 – 可选)
	  * TODO(这里描述这个方法的注意事项 – 可选)
	  * @Title: getConnection
	  * @Description: TODO
	  * @param @return    设定文件
	  * @return Connection    返回类型
	  * @throws
	  */
	public Connection getConnection();
        
       
        
}