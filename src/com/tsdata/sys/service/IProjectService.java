package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.ProjectExt;

public interface IProjectService {

	public ProjectExt load(final Long id, boolean useCache);

	public ProjectExt create(final ProjectExt projectExt);

	public ProjectExt save(ProjectExt projectExt);

	public void update(ProjectExt projectExt);

	public void delete(Long id);

	public void delete(ProjectExt projectExt);

	public List<ProjectExt> criteriaQuery(final Collection<ICondition> conditions);

	public List<ProjectExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders);

	public List<ProjectExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize);

	public int criteriaQueryCount(final Collection<ICondition> conditions);
}