package com.tsdata.sys.entity;

import java.io.Serializable;

public class Menu implements Serializable{

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
	
	private String name;
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name = name;
	}
	private String name_en;
	
	public String getname_en(){
		return name_en;
	}
	
	public void setname_en(String name_en){
		this.name_en = name_en;
	}
	private String url;
	
	public String geturl(){
		return url;
	}
	
	public void seturl(String url){
		this.url = url;
	}
	private String pid;
	
	public String getpid(){
		return pid;
	}
	
	public void setpid(String pid){
		this.pid = pid;
	}

	public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Menu))
        {
            return false;
        }
        final Menu that = (Menu)object;
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
	
	public Menu cloneMenu (){
        
		Menu newObj = null;
        try
        {
            newObj = (Menu)org.apache.commons.beanutils.BeanUtils.cloneBean(this);            
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