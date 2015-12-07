/**
 * @Title: Article.java
 * @Package cn.edu.xmu.entity
 * @Description: TODO
 * team:3-10打屁屁小队
 * @date 2015年11月25日 下午8:24:58
 * @version V1.0
 */

package cn.edu.xmu.entity;

import java.util.Date;

/**
 * @ClassName: Article
 * @Description: 咨询实体
 * team: 3-10打屁屁小队
 * @date 2015年11月25日 下午8:24:58
 */

public class Article {

	/**
	  * @Fields article_id
	  */
	private int article_id;
	/**
	  * @Fields content
	  */
	private String content;
	/**
	  * @Fields image
	  */
	private String image;
	/**
	  * @Fields important : 是否是重要咨询
	  */
	private int important;
	/**
	  * @Fields uptime
	  */
	private Date uptime;
	
	/**
	  * @Fields video
	  */
	private String video;
	
	
	/**
	  * 创建一个新的实例 Article. 
	  * <p>Description: 无参构造函数</p>
	  */
	
	public Article() {
		super();
	}

	
	
	/**
	  * 创建一个新的实例 Article. 
	  * <p>Description: 全信息构造函数</p>
	  * @param article_id
	  * @param content
	  * @param image
	  * @param important
	  * @param uptime
	  * @param video
	  */
	
	public Article(int article_id, String content, String image, int important,
			Date uptime, String video) {
		super();
		this.article_id = article_id;
		this.content = content;
		this.image = image;
		this.important = important;
		this.uptime = uptime;
		this.video = video;
	}


	


	/**
	 * getter method
	 * @return the article_id
	 */
	
	public int getArticle_id() {
		return article_id;
	}



	/**
	 * setter method
	 * @param article_id the article_id to set
	 */
	
	public void setArticle_id(int article_id) {
		this.article_id = article_id;
	}



	/**
	 * getter method
	 * @return the content
	 */
	
	public String getContent() {
		return content;
	}


	/**
	 * setter method
	 * @param content the content to set
	 */
	
	public void setContent(String content) {
		this.content = content;
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


	/**
	 * getter method
	 * @return the important
	 */
	
	public int getImportant() {
		return important;
	}


	/**
	 * setter method
	 * @param important the important to set
	 */
	
	public void setImportant(int important) {
		this.important = important;
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
	 * @return the video
	 */
	
	public String getVideo() {
		return video;
	}

	/**
	 * setter method
	 * @param video the video to set
	 */
	
	public void setVideo(String video) {
		this.video = video;
	}
	
	
}
