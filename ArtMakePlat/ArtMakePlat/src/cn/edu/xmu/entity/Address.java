/**
 * @Title: Address.java
 * @Package cn.edu.xmu
 * @Description: TODO
 * team:3-10打屁屁小队
 * @date 2015年11月25日 下午8:05:17
 * @version V1.0
 */

package cn.edu.xmu.entity;
/**
 * @ClassName: Address
 * @Description: 用户收货地址实体
 * team: 3-10打屁屁小队
 * @date 2015年11月25日 下午8:05:17
 */

public class Address {

	/**
	  * @Fields record_id
	  */
	private int record_id;
	/**
	  * @Fields person : 用户实体
	  */
	private Person person;
	/**
	  * @Fields name
	  */
	private String name;
	/**
	  * @Fields address
	  */
	private String address;
	/**
	  * @Fields tel
	  */
	private String tel;

	/**
	  * 创建一个新的实例 Address. 
	  * <p>Description: 无参构造函数</p>
	  */
	
	public Address() {
		super();
	}
	
	

	/**
	  * 创建一个新的实例 Address. 
	  * <p>Description: 全参构造函数</p>
	  * @param record_id
	  * @param person
	  * @param name
	  * @param address
	  * @param tel
	  */
	
	public Address(int record_id, Person person, String name, String address,
			String tel) {
		super();
		this.record_id = record_id;
		this.person = person;
		this.name = name;
		this.address = address;
		this.tel = tel;
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
	 * @return the name
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * setter method
	 * @param name the name to set
	 */
	
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * getter method
	 * @return the address
	 */
	
	public String getAddress() {
		return address;
	}
	/**
	 * setter method
	 * @param address the address to set
	 */
	
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * getter method
	 * @return the tel
	 */
	
	public String getTel() {
		return tel;
	}
	/**
	 * setter method
	 * @param tel the tel to set
	 */
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
}
