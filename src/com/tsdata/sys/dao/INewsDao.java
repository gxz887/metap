package com.tsdata.sys.dao;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.NewsExt;

public interface INewsDao {
	
	public NewsExt load(final Long id, boolean useCache);

	public NewsExt create(final com.tsdata.sys.entity.NewsExt newsExt);

	public NewsExt save(com.tsdata.sys.entity.NewsExt newsExt);

	public void update(NewsExt newsExt);

	public void delete(Long id);

	public void delete(NewsExt newsExt);

	public List<NewsExt> criteriaQuery(final Collection<ICondition> conditions);

	public List<NewsExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders);

	public List<NewsExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize);

	public int criteriaQueryCount(final Collection<ICondition> conditions);

}