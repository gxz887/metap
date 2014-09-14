package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.dao.MenuDao;
import com.tsdata.sys.entity.MenuExt;

public class MenuService implements IMenuService{

	private MenuDao menuDao;
	
	public MenuDao getMenuDao() {
		return menuDao;
	}

	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	public MenuExt load(final Long id, boolean useCache)
	{
		return menuDao.load(id, useCache);
	}

	public MenuExt create(final MenuExt menuExt)
	{
		return menuDao.create(menuExt);
	}

	public MenuExt save(MenuExt menuExt)
	{
		return menuDao.save(menuExt);
	}

	public void update(MenuExt menuExt)
	{
		menuDao.update(menuExt);
	}

	public void delete(Long id)
	{
		menuDao.delete(id);
	}

	public void delete(MenuExt menuExt)
	{
		menuDao.delete(menuExt);
	}

	public List<MenuExt> criteriaQuery(final Collection<ICondition> conditions)
	{
		return menuDao.criteriaQuery(conditions);
	}

	public List<MenuExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
	{
		return menuDao.criteriaQuery(conditions, orders);
	}

	public List<MenuExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize)
	{
		return menuDao.criteriaQuery(conditions, orders, currpage, pagesize);
	}

	public int criteriaQueryCount(final Collection<ICondition> conditions)
	{
		return menuDao.criteriaQueryCount(conditions);
	}

}