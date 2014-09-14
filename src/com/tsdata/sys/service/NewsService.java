package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.dao.NewsDao;
import com.tsdata.sys.entity.NewsExt;

public class NewsService implements INewsService{

	private NewsDao newsDao;
	
	public NewsDao getNewsDao() {
		return newsDao;
	}

	public void setNewsDao(NewsDao newsDao) {
		this.newsDao = newsDao;
	}

	public NewsExt load(final Long id, boolean useCache)
	{
		return newsDao.load(id, useCache);
	}

	public NewsExt create(final NewsExt newsExt)
	{
		return newsDao.create(newsExt);
	}

	public NewsExt save(NewsExt newsExt)
	{
		return newsDao.save(newsExt);
	}

	public void update(NewsExt newsExt)
	{
		newsDao.update(newsExt);
	}

	public void delete(Long id)
	{
		newsDao.delete(id);
	}

	public void delete(NewsExt newsExt)
	{
		newsDao.delete(newsExt);
	}

	public List<NewsExt> criteriaQuery(final Collection<ICondition> conditions)
	{
		return newsDao.criteriaQuery(conditions);
	}

	public List<NewsExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
	{
		return newsDao.criteriaQuery(conditions, orders);
	}

	public List<NewsExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize)
	{
		return newsDao.criteriaQuery(conditions, orders, currpage, pagesize);
	}

	public int criteriaQueryCount(final Collection<ICondition> conditions)
	{
		return newsDao.criteriaQueryCount(conditions);
	}

}