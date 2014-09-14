package com.tsdata.sys.entity;

import java.io.Serializable;

public class Project implements Serializable{

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
	
	private String title;
	
	public String gettitle(){
		return title;
	}
	
	public void settitle(String title){
		this.title = title;
	}
	private String title_en;
	
	public String gettitle_en(){
		return title_en;
	}
	
	public void settitle_en(String title_en){
		this.title_en = title_en;
	}
	private String location;
	
	public String getlocation(){
		return location;
	}
	
	public void setlocation(String location){
		this.location = location;
	}
	private String pdate;
	
	public String getpdate(){
		return pdate;
	}
	
	public void setpdate(String pdate){
		this.pdate = pdate;
	}
	private String client;
	
	public String getclient(){
		return client;
	}
	
	public void setclient(String client){
		this.client = client;
	}
	private String program;
	
	public String getprogram(){
		return program;
	}
	
	public void setprogram(String program){
		this.program = program;
	}
	private String area;
	
	public String getarea(){
		return area;
	}
	
	public void setarea(String area){
		this.area = area;
	}
	private String budget;
	
	public String getbudget(){
		return budget;
	}
	
	public void setbudget(String budget){
		this.budget = budget;
	}
	private String status;
	
	public String getstatus(){
		return status;
	}
	
	public void setstatus(String status){
		this.status = status;
	}
	private String projectteam;
	
	public String getprojectteam(){
		return projectteam;
	}
	
	public void setprojectteam(String projectteam){
		this.projectteam = projectteam;
	}
	private String collaborator;
	
	public String getcollaborator(){
		return collaborator;
	}
	
	public void setcollaborator(String collaborator){
		this.collaborator = collaborator;
	}
	private String location_en;
	
	public String getlocation_en(){
		return location_en;
	}
	
	public void setlocation_en(String location_en){
		this.location_en = location_en;
	}
	private String client_en;
	
	public String getclient_en(){
		return client_en;
	}
	
	public void setclient_en(String client_en){
		this.client_en = client_en;
	}
	private String program_en;
	
	public String getprogram_en(){
		return program_en;
	}
	
	public void setprogram_en(String program_en){
		this.program_en = program_en;
	}
	private String area_en;
	
	public String getarea_en(){
		return area_en;
	}
	
	public void setarea_en(String area_en){
		this.area_en = area_en;
	}
	private String budget_en;
	
	public String getbudget_en(){
		return budget_en;
	}
	
	public void setbudget_en(String budget_en){
		this.budget_en = budget_en;
	}
	private String status_en;
	
	public String getstatus_en(){
		return status_en;
	}
	
	public void setstatus_en(String status_en){
		this.status_en = status_en;
	}
	private String projectteam_en;
	
	public String getprojectteam_en(){
		return projectteam_en;
	}
	
	public void setprojectteam_en(String projectteam_en){
		this.projectteam_en = projectteam_en;
	}
	private String collaborator_en;
	
	public String getcollaborator_en(){
		return collaborator_en;
	}
	
	public void setcollaborator_en(String collaborator_en){
		this.collaborator_en = collaborator_en;
	}

	public boolean equals(Object object)
    {
        if (this == object)
        {
            return true;
        }
        if (!(object instanceof Project))
        {
            return false;
        }
        final Project that = (Project)object;
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
	
	public Project cloneProject (){
        
		Project newObj = null;
        try
        {
            newObj = (Project)org.apache.commons.beanutils.BeanUtils.cloneBean(this);            
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