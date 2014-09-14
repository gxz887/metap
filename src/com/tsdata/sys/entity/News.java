package com.tsdata.sys.entity;

import java.io.Serializable;
import java.util.Date;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class News implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private CommonsMultipartFile smallImgFile = null;
	
	private CommonsMultipartFile bigImgFile = null;
	
	private Long id;
	
	public CommonsMultipartFile getSmallImgFile() {
		return smallImgFile;
	}

	public void setSmallImgFile(CommonsMultipartFile smallImgFile) {
		this.smallImgFile = smallImgFile;
	}

	public CommonsMultipartFile getBigImgFile() {
		return bigImgFile;
	}

	public void setBigImgFile(CommonsMultipartFile bigImgFile) {
		this.bigImgFile = bigImgFile;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public String getTitle_en() {
		return title_en;
	}

	public void setTitle_en(String title_en) {
		this.title_en = title_en;
	}

	public String getContent_en() {
		return content_en;
	}

	public void setContent_en(String content_en) {
		this.content_en = content_en;
	}



	private String title_en;
	private String title;
	
	public String gettitle(){
		return title;
	}
	
	public void settitle(String title){
		this.title = title;
	}
	private String postdate;
	
	public String getpostdate(){
		return postdate;
	}
	
	public void setpostdate(String postdate){
		this.postdate = postdate;
	}
	private String smallimg;
	
	public String getsmallimg(){
		return smallimg;
	}
	
	public void setsmallimg(String smallimg){
		this.smallimg = smallimg;
	}
	private String bigimg;
	
	public String getbigimg(){
		return bigimg;
	}
	
	public void setbigimg(String bigimg){
		this.bigimg = bigimg;
	}
	private String content;
	private String content_en;
	public String getcontent(){
		return content;
	}
	
	public void setcontent(String content){
		this.content = content;
	}

	public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof News))
        {
            return false;
        }
        final News that = (News)object;
        if (this.id == null || that.getId() == null || !this.id.equals(that.getId()))
        {
            return false;
        }
        return true;
    }
	
	public int hashCode() {
		int hashCode = 0;
		hashCode = 29 * hashCode + (id == null ? 0 : id.hashCode());
		return hashCode;
	}
	
	public String toString() {
		try {
			return org.apache.commons.lang3.builder.ReflectionToStringBuilder.toString(this);
		} catch (Exception e) {
			return "";
		}

	}
	
	public News cloneNews (){
        
		News newObj = null;
        try
        {
            newObj = (News)org.apache.commons.beanutils.BeanUtils.cloneBean(this);            
        } catch (IllegalAccessException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InstantiationException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (java.lang.reflect.InvocationTargetException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (NoSuchMethodException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        return newObj;
	}
}