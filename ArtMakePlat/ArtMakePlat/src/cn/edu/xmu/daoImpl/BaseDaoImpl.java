/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.xmu.daoImpl;

import cn.edu.xmu.dao.BaseDao;

import com.mysql.jdbc.Connection;

import java.sql.SQLException;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

/**
 *
 * @author Administrator
 */
/**
 * @ClassName: BaseDaoImpl
 * @Description: TODO team: 3-10打屁屁小队
 * @date 2015年11月20日 上午2:55:01
 */
public class BaseDaoImpl implements BaseDao {

	/**
	 * @Fields hibernateTemplate : TODO（用一句话描述这个变量表示什么）
	 */
	@Resource(name = "hibernateTemplate")
	HibernateTemplate hibernateTemplate;

	/*
	 * Title: loadById Description:
	 * 
	 * @param clazz
	 * 
	 * @param id
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#loadById(java.lang.Class, int)
	 */
	@Override
	public Object loadById(Class clazz, int id) {
		return hibernateTemplate.get(clazz, id);
	}

	/*
	 * Title: loadObject Description:
	 * 
	 * @param hql
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#loadObject(java.lang.String)
	 */
	@Override
	public Object loadObject(String hql) {
		final String hql1 = hql;
		Object obj = null;
		List list = hibernateTemplate.executeFind(new HibernateCallback() {
			// 重写查询方法
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				Query query = session.createQuery(hql1);
				return query.list();
			}
		});
		if (list.size() > 0) {
			obj = list.get(0);
		}
		return obj;
	}

	/*
	 * Title: loadObject Description:
	 * 
	 * @param hql
	 * 
	 * @param pro
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#loadObject(java.lang.String,
	 * java.lang.String[])
	 */
	@Override
	public Object loadObject(String hql, String[] pro) {
		// TODO Auto-generated method stub
		final String hql1 = hql;
		final String[] pro1 = pro;
		Object obj = null;
		List list = hibernateTemplate.executeFind(new HibernateCallback() {
			// 重写查询方法
			@Override
			public Object doInHibernate(Session session)
					throws HibernateException {
				Query query = session.createQuery(hql1);
				for (int i = 0; i < pro1.length; i++) {
					query.setParameter(i, pro1[i]);
				}
				return query.list();
			}
		});
		if (list.size() > 0) {
			obj = list.get(0);
		}
		return obj;
	}

	/*
	 * Title: delById Description:
	 * 
	 * @param clazz
	 * 
	 * @param id
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#delById(java.lang.Class, int)
	 */
	@Override
	public void delById(Class clazz, int id) {
		hibernateTemplate.delete(hibernateTemplate.load(clazz, id));
	}

	/*
	 * Title: saveOrUpdate Description:
	 * 
	 * @param obj
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#saveOrUpdate(java.lang.Object)
	 */
	@Override
	public void saveOrUpdate(Object obj) {
		hibernateTemplate.saveOrUpdate(obj);
	}

	/*
	 * Title: listAll Description:
	 * 
	 * @param clazz
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#listAll(java.lang.String)
	 */
	@Override
	public List listAll(String clazz) {
		return hibernateTemplate.find("from " + clazz + " as c ");
	}

	/*
	 * Title: listAll Description:
	 * 
	 * @param clazz
	 * 
	 * @param pageNo
	 * 
	 * @param pageSize
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#listAll(java.lang.String, int, int)
	 */
	@Override
	public List listAll(String clazz, int pageNo, int pageSize) {
		final int pNo = pageNo;
		final int pSize = pageSize;
		final String hqlString = "from " + clazz + " as c order by c.id desc";
		List list = hibernateTemplate
				.executeFind(new HibernateCallback<Object>() {

					@Override
					public Object doInHibernate(Session sn)
							throws HibernateException, SQLException {
						Query query = sn.createQuery(hqlString);
						query.setMaxResults(pSize);
						query.setFirstResult((pNo - 1) * pSize);
						List result = query.list();
						if (!Hibernate.isInitialized(result)) {
							Hibernate.initialize(result);
						}
						return result;
					}
				});
		return list;
	}

	/*
	 * Title: countAll Description:
	 * 
	 * @param clazz
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#countAll(java.lang.String)
	 */
	@Override
	public int countAll(String clazz) {
		// selcet count(*) from Post 这里不加'Post'
		final String hql = "select count(*) from  " + clazz + " as c ";
		Long count = (Long) hibernateTemplate
				.execute(new HibernateCallback<Object>() {

					@Override
					public Object doInHibernate(Session sn)
							throws HibernateException, SQLException {
						Query query = sn.createQuery(hql);
						query.setMaxResults(1);
						return query.uniqueResult();
					}
				});
		return count.intValue();
	}

	/*
	 * Title: query Description:
	 * 
	 * @param hql
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#query(java.lang.String)
	 */
	@Override
	public List query(String hql) {
		final String hql1 = hql;

		return hibernateTemplate.executeFind(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session sn) throws HibernateException,
					SQLException {
				Query query = sn.createQuery(hql1);
				return query.list();
			}
		});
	}

	/*
	  * Title: query
	  * Description:
	  * @param hql
	  * @param pro
	  * @return
	  * @see cn.edu.xmu.dao.BaseDao#query(java.lang.String, java.lang.String[])
	  */
	@Override
	public List query(String hql, String[] pro) {
		// TODO Auto-generated method stub
		final String hql1 = hql;
		final String[] pro1 = pro;

		return hibernateTemplate.executeFind(new HibernateCallback<Object>() {

			@Override
			public Object doInHibernate(Session sn) throws HibernateException,
					SQLException {
				Query query = sn.createQuery(hql1);
				for(int i=0;i<pro1.length;i++){
					query.setParameter(i, pro1[1]);
				}
				return query.list();
			}
		});
	}
	
	/*
	 * Title: query Description:
	 * 
	 * @param hql
	 * 
	 * @param pageNo
	 * 
	 * @param pageSize
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#query(java.lang.String, int, int)
	 */
	@Override
	public List query(String hql, int pageNo, int pageSize) {
		final int pNo = pageNo;
		final int pSize = pageSize;
		final String hqlString = hql;
		List list = hibernateTemplate
				.executeFind(new HibernateCallback<Object>() {

					@Override
					public Object doInHibernate(Session sn)
							throws HibernateException, SQLException {
						Query query = sn.createQuery(hqlString);
						query.setMaxResults(pSize);
						query.setFirstResult((pNo - 1) * pSize);
						List result = query.list();
						if (!Hibernate.isInitialized(result)) {
							Hibernate.initialize(result);
						}
						return result;
					}
				});
		return list;
	}
	
	/*
	  * Title: query
	  * Description:
	  * @param hql
	  * @param pro
	  * @param pageNo
	  * @param pageSize
	  * @return
	  * @see cn.edu.xmu.dao.BaseDao#query(java.lang.String, java.lang.String[], int, int)
	  */
	@Override
	public List query(String hql,String[] pro, int pageNo, int pageSize){
		final int pNo = pageNo;
		final int pSize = pageSize;
		final String hqlString = hql;
		final String[] pro1 = pro;
		List list = hibernateTemplate
				.executeFind(new HibernateCallback<Object>() {
					@Override
					public Object doInHibernate(Session sn)
							throws HibernateException, SQLException {
						Query query = sn.createQuery(hqlString);
						for(int i = 0;i<pro1.length;i++){
							query.setParameter(i, pro1[i]);
						}
						query.setMaxResults(pSize);
						query.setFirstResult((pNo - 1) * pSize);
						List result = query.list();
						if (!Hibernate.isInitialized(result)) {
							Hibernate.initialize(result);
						}
						return result;
					}
				});
		return list;
	}
	
	
	/*
	 * Title: countQuery Description:
	 * 
	 * @param hql
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#countQuery(java.lang.String)
	 */
	@Override
	public int countQuery(String hql) {
		final String hql1 = hql;
		Long count = (Long) hibernateTemplate.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session sn) throws HibernateException,
					SQLException {
				Query query = sn.createQuery(hql1);
				query.setMaxResults(1);
				return query.uniqueResult();
			}

		});
		return count.intValue();
	}

	/*
	  * Title: countQuery
	  * Description:
	  * @param hql
	  * @param pro
	  * @return
	  * @see cn.edu.xmu.dao.BaseDao#countQuery(java.lang.String, java.lang.String[])
	  */
	@Override
	public int countQuery(String hql,String[] pro) {
		final String hql1 = hql;
		final String[] pro1 = pro;
		Long count = (Long) hibernateTemplate.execute(new HibernateCallback() {

			@Override
			public Object doInHibernate(Session sn) throws HibernateException,
					SQLException {
				Query query = sn.createQuery(hql1);
				for(int i=0;i<pro1.length;i++){
					query.setParameter("i", pro1[1]);
				}
				query.setMaxResults(1);
				return query.uniqueResult();
			}

		});
		return count.intValue();
	}
	/*
	 * Title: update Description:
	 * 
	 * @param hql
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#update(java.lang.String)
	 */
	@Override
	public int update(String hql) {
		throw new UnsupportedOperationException("Not supported yet.");
	}

	/*
	 * Title: getConnection Description:
	 * 
	 * @return
	 * 
	 * @see cn.edu.xmu.dao.BaseDao#getConnection()
	 */
	@Override
	public Connection getConnection() {
		throw new UnsupportedOperationException("Not supported yet.");
	}

}
