package com.tsdata.sys.entity;

import java.io.Serializable;

public class Press implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	private String bookname;
	
	public String getbookname(){
		return bookname;
	}
	
	public void setbookname(String bookname){
		this.bookname = bookname;
	}
	private String title;
	
	public String gettitle(){
		return title;
	}
	
	public void settitle(String title){
		this.title = title;
	}
	private String author;
	
	public String getauthor(){
		return author;
	}
	
	public void setauthor(String author){
		this.author = author;
	}
	private String press;
	
	public String getpress(){
		return press;
	}
	
	public void setpress(String press){
		this.press = press;
	}
	private String presstime;
	
	public String getpresstime(){
		return presstime;
	}
	
	public void setpresstime(String presstime){
		this.presstime = presstime;
	}
	private String title_en;
	
	public String gettitle_en(){
		return title_en;
	}
	
	public void settitle_en(String title_en){
		this.title_en = title_en;
	}
	private String author_en;
	
	public String getauthor_en(){
		return author_en;
	}
	
	public void setauthor_en(String author_en){
		this.author_en = author_en;
	}
	private String press_en;
	
	public String getpress_en(){
		return press_en;
	}
	
	public void setpress_en(String press_en){
		this.press_en = press_en;
	}
	private String fileurl;
	
	public String getfileurl(){
		return fileurl;
	}
	
	public void setfileurl(String fileurl){
		this.fileurl = fileurl;
	}

	public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Press))
        {
            return false;
        }
        final Press that = (Press)object;
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
	
	public Press clonePress (){
        
		Press newObj = null;
        try
        {
            newObj = (Press)org.apache.commons.beanutils.BeanUtils.cloneBean(this);            
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