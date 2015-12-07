/**
 * @Title: Demand.java
 * @Package cn.edu.xmu.entity
 * @Description: TODO
 * team:3-10打屁屁小队
 * @date 2015年11月25日 下午9:02:57
 * @version V1.0
 */

package cn.edu.xmu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Demand
 * @Description: TODO
 * team: 3-10打屁屁小队
 * @date 2015年11月25日 下午9:02:57
 */

public class Demand {

	/**
	  * @Fields demand_id
	  */
	private int demand_id;
	
	/**
	  * @Fields price : 一口价
	  */
	private double price;
	
	/**
	  * @Fields endprice 
	  */
	private double endprice;
	
	/**
	  * @Fields startprice 
	  */
	private double startprice;

	/**
	  * @Fields type : 1:价格区间 2:固定价格
	  */
	private int type;
	
	/**
	  * @Fields describe
	  */
	private String describe;
	
	/**
	  * @Fields uptime : TODO（用一句话描述这个变量表示什么）
	  */
	private Date uptime;
	
	/**
	  * @Fields person
	  */
	private Person person;
	
	/**
	  * @Fields lasttime : 持续时间h
	  */
	private int lasttime;
	
	/**
	  * @Fields state : 1:未完成 -1:已完成
	  */
	private int state;


	/**
	  * @Fields keyList : 关键词列表
	  */
	private List<Demkey> keyList = new ArrayList();

	
	/**
	  * 创建一个新的实例 Demand. 
	  * <p>Description: 无参构造函数</p>
	  */
	
	public Demand() {
		super();
	}
	
	

	/**
	  * 创建一个新的实例 Demand. 
	  * <p>Title: </p>
	  * <p>Description: </p>
	  * @param demand_id
	  * @param price
	  * @param endprice
	  * @param startprice
	  * @param type
	  * @param describe
	  * @param uptime
	  * @param person
	  * @param lasttime
	  * @param state
	  * @param keyList
	  */
	
	public Demand(int demand_id, double price, double endprice,
			double startprice, int type, String describe, Date uptime,
			Person person, int lasttime, int state, List<Demkey> keyList) {
		super();
		this.demand_id = demand_id;
		this.price = price;
		this.endprice = endprice;
		this.startprice = startprice;
		this.type = type;
		this.describe = describe;
		this.uptime = uptime;
		this.person = person;
		this.lasttime = lasttime;
		this.state = state;
		this.keyList = keyList;
	}



	/**
	 * getter method
	 * @return the demand_id
	 */
	
	public int getDemand_id() {
		return demand_id;
	}



	/**
	 * setter method
	 * @param demand_id the demand_id to set
	 */
	
	public void setDemand_id(int demand_id) {
		this.demand_id = demand_id;
	}



	/**
	 * getter method
	 * @return the price
	 */
	
	public double getPrice() {
		return price;
	}



	/**
	 * setter method
	 * @param price the price to set
	 */
	
	public void setPrice(double price) {
		this.price = price;
	}


	
	/**
	 * getter method
	 * @return the endprice
	 */
	
	public double getEndprice() {
		return endprice;
	}



	/**
	 * setter method
	 * @param endprice the endprice to set
	 */
	
	public void setEndprice(double endprice) {
		this.endprice = endprice;
	}



	/**
	 * getter method
	 * @return the startprice
	 */
	
	public double getStartprice() {
		return startprice;
	}



	/**
	 * setter method
	 * @param startprice the startprice to set
	 */
	
	public void setStartprice(double startprice) {
		this.startprice = startprice;
	}



	/**
	 * getter method
	 * @return the type
	 */
	
	public int getType() {
		return type;
	}



	/**
	 * setter method
	 * @param type the type to set
	 */
	
	public void setType(int type) {
		this.type = type;
	}



	/**
	 * getter method
	 * @return the describe
	 */
	
	public String getDescribe() {
		return describe;
	}



	/**
	 * setter method
	 * @param describe the describe to set
	 */
	
	public void setDescribe(String describe) {
		this.describe = describe;
	}



	/**
	 * getter method
	 * @return the uptime
	 */
	
	public Date getUptime() {
		return uptime;
	}



	/**
	 * setter method
	 * @param uptime the uptime to set
	 */
	
	public void setUptime(Date uptime) {
		this.uptime = uptime;
	}



	/**
	 * getter method
	 * @return the person
	 */
	
	public Person getPerson() {
		return person;
	}



	/**
	 * setter method
	 * @param person the person to set
	 */
	
	public void setPerson(Person person) {
		this.person = person;
	}



	/**
	 * getter method
	 * @return the lasttime
	 */
	
	public int getLasttime() {
		return lasttime;
	}



	/**
	 * setter method
	 * @param lasttime the lasttime to set
	 */
	
	public void setLasttime(int lasttime) {
		this.lasttime = lasttime;
	}



	/**
	 * getter method
	 * @return the state
	 */
	
	public int getState() {
		return state;
	}



	/**
	 * setter method
	 * @param state the state to set
	 */
	
	public void setState(int state) {
		this.state = state;
	}



	/**
	 * getter method
	 * @return the keyList
	 */
	
	public List<Demkey> getKeyList() {
		return keyList;
	}



	/**
	 * setter method
	 * @param keyList the keyList to set
	 */
	
	public void setKeyList(List<Demkey> keyList) {
		this.keyList = keyList;
	}
	
	
}
