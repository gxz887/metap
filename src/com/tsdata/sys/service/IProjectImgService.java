package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.ProjectImgExt;

public interface IProjectImgService {

	public ProjectImgExt load(final Long id, boolean useCache);

	public ProjectImgExt create(final ProjectImgExt projectImgExt);

	public ProjectImgExt save(ProjectImgExt projectImgExt);

	public void update(ProjectImgExt projectImgExt);

	public void delete(Long id);

	public void delete(ProjectImgExt projectImgExt);

	public List<ProjectImgExt> criteriaQuery(final Collection<ICondition> conditions);

	public List<ProjectImgExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders);

	public List<ProjectImgExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize);

	public int criteriaQueryCount(final Collection<ICondition> conditions);
}