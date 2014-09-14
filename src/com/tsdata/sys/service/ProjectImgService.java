package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.dao.ProjectImgDao;
import com.tsdata.sys.entity.ProjectImgExt;

public class ProjectImgService implements IProjectImgService{

	private ProjectImgDao projectImgDao;
	
	public ProjectImgDao getProjectImgDao() {
		return projectImgDao;
	}

	public void setProjectImgDao(ProjectImgDao projectImgDao) {
		this.projectImgDao = projectImgDao;
	}

	public ProjectImgExt load(final Long id, boolean useCache)
	{
		return projectImgDao.load(id, useCache);
	}

	public ProjectImgExt create(final ProjectImgExt projectImgExt)
	{
		return projectImgDao.create(projectImgExt);
	}

	public ProjectImgExt save(ProjectImgExt projectImgExt)
	{
		return projectImgDao.save(projectImgExt);
	}

	public void update(ProjectImgExt projectImgExt)
	{
		projectImgDao.update(projectImgExt);
	}

	public void delete(Long id)
	{
		projectImgDao.delete(id);
	}

	public void delete(ProjectImgExt projectImgExt)
	{
		projectImgDao.delete(projectImgExt);
	}

	public List<ProjectImgExt> criteriaQuery(final Collection<ICondition> conditions)
	{
		return projectImgDao.criteriaQuery(conditions);
	}

	public List<ProjectImgExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
	{
		return projectImgDao.criteriaQuery(conditions, orders);
	}

	public List<ProjectImgExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize)
	{
		return projectImgDao.criteriaQuery(conditions, orders, currpage, pagesize);
	}

	public int criteriaQueryCount(final Collection<ICondition> conditions)
	{
		return projectImgDao.criteriaQueryCount(conditions);
	}

}