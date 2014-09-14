package com.tsdata.sys.service;

import java.util.Collection;
import java.util.List;

import org.hibernate.criterion.Order;

import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.PressExt;

public interface IPressService {

	public PressExt load(final Long id, boolean useCache);

	public PressExt create(final PressExt pressExt);

	public PressExt save(PressExt pressExt);

	public void update(PressExt pressExt);

	public void delete(Long id);

	public void delete(PressExt pressExt);

	public List<PressExt> criteriaQuery(final Collection<ICondition> conditions);

	public List<PressExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders);

	public List<PressExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize);

	public int criteriaQueryCount(final Collection<ICondition> conditions);
}