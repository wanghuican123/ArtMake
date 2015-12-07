/**
 * @Title: Prokey.java
 * @Package cn.edu.xmu.entity
 * @Description: TODO
 * team:3-10打屁屁小队
 * @date 2015年11月25日 下午9:42:09
 * @version V1.0
 */

package cn.edu.xmu.entity;
/**
 * @ClassName: Prokey
 * @Description: 艺术品关键词实体
 * team: 3-10打屁屁小队
 * @date 2015年11月25日 下午9:42:09
 */

public class Demkey {

	/**
	  * @Fields record_id 
	  */
	private int record_id;
	
	/**
	  * @Fields demand 
	  */
	private Demand demand;
	
	/**
	  * @Fields key 
	  */
	private Key key;

	/**
	  * 创建一个新的实例 Prokey. 
	  * <p>Description: 无参构造函数</p>
	  */
	
	public Demkey() {
		super();
	}

	/**
	  * 创建一个新的实例 Demkey. 
	  * <p>Description: 全参构造函数</p>
	  * @param record_id
	  * @param demand
	  * @param key
	  */
	
	public Demkey(int record_id, Demand demand, Key key) {
		super();
		this.record_id = record_id;
		this.demand = demand;
		this.key = key;
	}

	/**
	 * getter method
	 * @return the record_id
	 */
	
	public int getRecord_id() {
		return record_id;
	}

	/**
	 * setter method
	 * @param record_id the record_id to set
	 */
	
	public void setRecord_id(int record_id) {
		this.record_id = record_id;
	}

	/**
	 * getter method
	 * @return the demand
	 */
	
	public Demand getDemand() {
		return demand;
	}

	/**
	 * setter method
	 * @param demand the demand to set
	 */
	
	public void setDemand(Demand demand) {
		this.demand = demand;
	}

	/**
	 * getter method
	 * @return the key
	 */
	
	public Key getKey() {
		return key;
	}

	/**
	 * setter method
	 * @param key the key to set
	 */
	
	public void setKey(Key key) {
		this.key = key;
	}
	
}
