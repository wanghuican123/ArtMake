/**
 * @Title: Proimg.java
 * @Package cn.edu.xmu.entity
 * @Description: TODO
 * team:3-10打屁屁小队
 * @date 2015年11月25日 下午9:31:18
 * @version V1.0
 */

package cn.edu.xmu.entity;
/**
 * @ClassName: Proimg
 * @Description: 艺术品图片实体
 * team: 3-10打屁屁小队
 * @date 2015年11月25日 下午9:31:18
 */

public class Proimg {

	/**
	  * @Fields record_id 
	  */
	private int record_id;
	
	/**
	  * @Fields product 
	  */
	private Product product;
	
	/**
	  * @Fields image 
	  */
	private String image;

	/**
	  * 创建一个新的实例 Proimg. 
	  * <p>Description: 无参构造</p>
	  */
	
	public Proimg() {
		super();
	}

	/**
	  * 创建一个新的实例 Proimg. 
	  * <p>Description: 全信息构造函数</p>
	  * @param record_id
	  * @param product
	  * @param image
	  */
	
	public Proimg(int record_id, Product product, String image) {
		super();
		this.record_id = record_id;
		this.product = product;
		this.image = image;
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
	 * @return the image
	 */
	
	public String getImage() {
		return image;
	}

	/**
	 * setter method
	 * @param image the image to set
	 */
	
	public void setImage(String image) {
		this.image = image;
	}
	
}
