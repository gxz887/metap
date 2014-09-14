package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.dao.CategoryDao;
import com.tsdata.sys.entity.CategoryExt;

public class CategoryService implements ICategoryService{

	private CategoryDao categoryDao;
	
	public CategoryDao getCategoryDao() {
		return categoryDao;
	}

	public void setCategoryDao(CategoryDao categoryDao) {
		this.categoryDao = categoryDao;
	}

	public CategoryExt load(final Long id, boolean useCache)
	{
		return categoryDao.load(id, useCache);
	}

	public CategoryExt create(final CategoryExt categoryExt)
	{
		return categoryDao.create(categoryExt);
	}

	public CategoryExt save(CategoryExt categoryExt)
	{
		return categoryDao.save(categoryExt);
	}

	public void update(CategoryExt categoryExt)
	{
		categoryDao.update(categoryExt);
	}

	public void delete(Long id)
	{
		categoryDao.delete(id);
	}

	public void delete(CategoryExt categoryExt)
	{
		categoryDao.delete(categoryExt);
	}

	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions)
	{
		return categoryDao.criteriaQuery(conditions);
	}

	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
	{
		return categoryDao.criteriaQuery(conditions, orders);
	}

	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize)
	{
		return categoryDao.criteriaQuery(conditions, orders, currpage, pagesize);
	}

	public int criteriaQueryCount(final Collection<ICondition> conditions)
	{
		return categoryDao.criteriaQueryCount(conditions);
	}

}