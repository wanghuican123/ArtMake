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

public class Prokey {

	/**
	  * @Fields record_id 
	  */
	private int record_id;
	
	/**
	  * @Fields product 
	  */
	private Product product;
	
	/**
	  * @Fields key 
	  */
	private Key key;

	/**
	  * 创建一个新的实例 Prokey. 
	  * <p>Description: 无参构造函数</p>
	  */
	
	public Prokey() {
		super();
	}

	/**
	  * 创建一个新的实例 Prokey. 
	  * <p>Description: 关联构造函数</p>
	  * @param record_id
	  * @param product
	  * @param key
	  */
	
	public Prokey(int record_id, Product product, Key key) {
		super();
		this.record_id = record_id;
		this.product = product;
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
	 * @return the product
	 */
	
	public Product getProduct() {
		return product;
	}

	/**
	 * setter method
	 * @param product the product to set
	 */
	
	public void setProduct(Product product) {
		this.product = product;
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
