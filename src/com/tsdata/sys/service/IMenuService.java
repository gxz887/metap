package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.MenuExt;

public interface IMenuService {

	public MenuExt load(final Long id, boolean useCache);

	public MenuExt create(final MenuExt menuExt);

	public MenuExt save(MenuExt menuExt);

	public void update(MenuExt menuExt);

	public void delete(Long id);

	public void delete(MenuExt menuExt);

	public List<MenuExt> criteriaQuery(final Collection<ICondition> conditions);

	public List<MenuExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders);

	public List<MenuExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize);

	public int criteriaQueryCount(final Collection<ICondition> conditions);
}