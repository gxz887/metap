package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.dao.ProjectDao;
import com.tsdata.sys.entity.ProjectExt;

public class ProjectService implements IProjectService{

	private ProjectDao projectDao;
	
	public ProjectDao getProjectDao() {
		return projectDao;
	}

	public void setProjectDao(ProjectDao projectDao) {
		this.projectDao = projectDao;
	}

	public ProjectExt load(final Long id, boolean useCache)
	{
		return projectDao.load(id, useCache);
	}

	public ProjectExt create(final ProjectExt projectExt)
	{
		return projectDao.create(projectExt);
	}

	public ProjectExt save(ProjectExt projectExt)
	{
		return projectDao.save(projectExt);
	}

	public void update(ProjectExt projectExt)
	{
		projectDao.update(projectExt);
	}

	public void delete(Long id)
	{
		projectDao.delete(id);
	}

	public void delete(ProjectExt projectExt)
	{
		projectDao.delete(projectExt);
	}

	public List<ProjectExt> criteriaQuery(final Collection<ICondition> conditions)
	{
		return projectDao.criteriaQuery(conditions);
	}

	public List<ProjectExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
	{
		return projectDao.criteriaQuery(conditions, orders);
	}

	public List<ProjectExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize)
	{
		return projectDao.criteriaQuery(conditions, orders, currpage, pagesize);
	}

	public int criteriaQueryCount(final Collection<ICondition> conditions)
	{
		return projectDao.criteriaQueryCount(conditions);
	}

}