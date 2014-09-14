package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.dao.PressDao;
import com.tsdata.sys.entity.PressExt;

public class PressService implements IPressService{

	private PressDao pressDao;
	
	public PressDao getPressDao() {
		return pressDao;
	}

	public void setPressDao(PressDao pressDao) {
		this.pressDao = pressDao;
	}

	public PressExt load(final Long id, boolean useCache)
	{
		return pressDao.load(id, useCache);
	}

	public PressExt create(final PressExt pressExt)
	{
		return pressDao.create(pressExt);
	}

	public PressExt save(PressExt pressExt)
	{
		return pressDao.save(pressExt);
	}

	public void update(PressExt pressExt)
	{
		pressDao.update(pressExt);
	}

	public void delete(Long id)
	{
		pressDao.delete(id);
	}

	public void delete(PressExt pressExt)
	{
		pressDao.delete(pressExt);
	}

	public List<PressExt> criteriaQuery(final Collection<ICondition> conditions)
	{
		return pressDao.criteriaQuery(conditions);
	}

	public List<PressExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
	{
		return pressDao.criteriaQuery(conditions, orders);
	}

	public List<PressExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize)
	{
		return pressDao.criteriaQuery(conditions, orders, currpage, pagesize);
	}

	public int criteriaQueryCount(final Collection<ICondition> conditions)
	{
		return pressDao.criteriaQueryCount(conditions);
	}

}