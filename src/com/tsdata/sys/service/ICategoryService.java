package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.CategoryExt;

public interface ICategoryService {

	public CategoryExt load(final Long id, boolean useCache);

	public CategoryExt create(final CategoryExt categoryExt);

	public CategoryExt save(CategoryExt categoryExt);

	public void update(CategoryExt categoryExt);

	public void delete(Long id);

	public void delete(CategoryExt categoryExt);

	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions);

	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders);

	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize);

	public int criteriaQueryCount(final Collection<ICondition> conditions);
}