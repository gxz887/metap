package com.tsdata.sys.entity;

import java.io.Serializable;

public class ProjectImg implements Serializable{

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
	
	private String img;
	
	public String getimg(){
		return img;
	}
	
	public void setimg(String img){
		this.img = img;
	}
	private String projectid;
	
	public String getprojectid(){
		return projectid;
	}
	
	public void setprojectid(String projectid){
		this.projectid = projectid;
	}
	private String newsid;
	
	public String getnewsid(){
		return newsid;
	}
	
	public void setnewsid(String newsid){
		this.newsid = newsid;
	}

	public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof ProjectImg))
        {
            return false;
        }
        final ProjectImg that = (ProjectImg)object;
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
	
	public ProjectImg cloneProjectImg (){
        
		ProjectImg newObj = null;
        try
        {
            newObj = (ProjectImg)org.apache.commons.beanutils.BeanUtils.cloneBean(this);            
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