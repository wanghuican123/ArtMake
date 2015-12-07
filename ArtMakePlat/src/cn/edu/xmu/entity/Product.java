/**
 * @Title: Product.java
 * @Package cn.edu.xmu.entity
 * @Description: TODO
 * team:3-10打屁屁小队
 * @date 2015年11月25日 下午8:49:24
 * @version V1.0
 */

package cn.edu.xmu.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName: Product
 * @Description: 艺术品实体
 * team: 3-10打屁屁小队
 * @date 2015年11月25日 下午8:49:24
 */

public class Product {

	/**
	  * @Fields product_id
	  */
	private int product_id;
	
	/**
	  * @Fields price : 当前价格
	  */
	private double price;
	
	/**
	  * @Fields fixedprice : 一口价/最高价
	  */
	private double fixedprice;
	
	/**
	  * @Fields startprice : 起始价
	  */
	private double startprice;
	
	/**
	  * @Fields addprice : 加价限额
	  */
	private int addprice;
	
	/**
	  * @Fields type : 1:竞买 2:一口价
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
	  * @Fields state : 0:未展示 1:未售出 -1:已售出
	  */
	private int state;
	
	/**
	  * @Fields imageList : 图片列表
	  */
	private List<Proimg> imageList = new ArrayList();
	
	/**
	  * @Fields keyList : 关键词列表
	  */
	private List<Prokey> keyList = new ArrayList();

	/**
	  * 创建一个新的实例 Product. 
	  * <p>Description: 无参构造函数</p>
	  */
	
	public Product() {
		super();
	}
	
	/**
	  * 创建一个新的实例 Product. 
	  * <p>Description: 全参构造函数</p>
	  * @param product_id
	  * @param price
	  * @param fixedprice
	  * @param startprice
	  * @param addprice
	  * @param type
	  * @param describe
	  * @param uptime
	  * @param person
	  * @param lasttime
	  * @param state
	  * @param imageList
	  * @param keyList
	  */
	
	public Product(int product_id, double price, double fixedprice,
			double startprice, int addprice, int type, String describe,
			Date uptime, Person person, int lasttime, int state,
			List<Proimg> imageList, List<Prokey> keyList) {
		super();
		this.product_id = product_id;
		this.price = price;
		this.fixedprice = fixedprice;
		this.startprice = startprice;
		this.addprice = addprice;
		this.type = type;
		this.describe = describe;
		this.uptime = uptime;
		this.person = person;
		this.lasttime = lasttime;
		this.state = state;
		this.imageList = imageList;
		this.keyList = keyList;
	}



	/**
	 * getter method
	 * @return the product_id
	 */
	
	public int getProduct_id() {
		return product_id;
	}

	/**
	 * setter method
	 * @param product_id the product_id to set
	 */
	
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
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
	 * @return the fixedprice
	 */
	
	public double getFixedprice() {
		return fixedprice;
	}

	/**
	 * setter method
	 * @param fixedprice the fixedprice to set
	 */
	
	public void setFixedprice(double fixedprice) {
		this.fixedprice = fixedprice;
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
	 * @return the addprice
	 */
	
	public int getAddprice() {
		return addprice;
	}

	/**
	 * setter method
	 * @param addprice the addprice to set
	 */
	
	public void setAddprice(int addprice) {
		this.addprice = addprice;
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
	 * @return the imageList
	 */
	
	public List<Proimg> getImageList() {
		return imageList;
	}


	/**
	 * setter method
	 * @param imageList the imageList to set
	 */
	
	public void setImageList(List<Proimg> imageList) {
		this.imageList = imageList;
	}

	/**
	 * getter method
	 * @return the keyList
	 */
	
	public List<Prokey> getKeyList() {
		return keyList;
	}

	/**
	 * setter method
	 * @param keyList the keyList to set
	 */
	
	public void setKeyList(List<Prokey> keyList) {
		this.keyList = keyList;
	}
	
	
}
