package com.tsdata.sys.dao;

import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.hibernate.CacheMode;
import org.hibernate.criterion.Order;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Service;

import com.sogou.hibernate.ExpressionUtil;
import com.sogou.hibernate.ICondition;
import com.tsdata.sys.entity.CategoryExt;

public class CategoryDao extends HibernateDaoSupport implements ICategoryDao{

	private final static Logger logger = Logger.getLogger(CategoryDao.class);
	
	public CategoryExt load(final Long id, boolean useCache)
    {
        if (id == null)
        {
            throw new IllegalArgumentException("CategoryDao.load - 'id' can not be null");
        }
        this.getHibernateTemplate().setCacheQueries(useCache);
        
        return this.getHibernateTemplate().get(CategoryExt.class, id);
    }
	
	public CategoryExt create(final CategoryExt categoryExt)
    {
        if (categoryExt == null)
        {
            throw new IllegalArgumentException("CategoryDao.create - 'categoryExt' can not be null");
        }
        this.getHibernateTemplate().setFlushMode(org.springframework.orm.hibernate3.HibernateTemplate.FLUSH_AUTO);
        Object identifier = this.getHibernateTemplate().save(categoryExt);
        categoryExt.setId((Long)identifier);
        return categoryExt;
    }
	
	public CategoryExt save(com.tsdata.sys.entity.CategoryExt categoryExt)
    {
        if (categoryExt == null)
        {
            throw new IllegalArgumentException("CategoryDao.save - 'categoryExt' can not be null");
        }
        this.getHibernateTemplate().setFlushMode(org.springframework.orm.hibernate3.HibernateTemplate.FLUSH_AUTO);
        return this.getHibernateTemplate().merge(categoryExt);
    }
	
	public void update(CategoryExt categoryExt)
    {
        if (categoryExt == null)
        {
            throw new IllegalArgumentException("CategoryDao.update - 'categoryExt' can not be null");
        }
        this.getHibernateTemplate().setFlushMode(org.springframework.orm.hibernate3.HibernateTemplate.FLUSH_AUTO);
        this.getHibernateTemplate().update(categoryExt);
    }
	
	public void delete(Long id)
    {
        if (id == null)
        {
            throw new IllegalArgumentException("CategoryDao.remove - 'id' can not be null");
        }
        CategoryExt entity = this.load(id,true);
        if (entity != null)
        {
            this.delete(entity);
        }
    }
	
	public void delete(CategoryExt categoryExt)
    {
        if (categoryExt == null)
        {
            throw new IllegalArgumentException("CategoryDao.remove - 'categoryExt' can not be null");
        }
        this.getHibernateTemplate().setFlushMode(org.springframework.orm.hibernate3.HibernateTemplate.FLUSH_AUTO);
        this.getHibernateTemplate().delete(categoryExt);
    }
	
	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions) 
	{
        return criteriaQuery(conditions, null, 0, 0);
    }

    
    public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders)
    {
        return criteriaQuery(conditions, orders, 0, 0);
    }
    
	public List<CategoryExt> criteriaQuery(final Collection<ICondition> conditions, final Collection<Order> orders, final int currpage, final int pagesize) {
		org.springframework.orm.hibernate3.HibernateCallback<List<CategoryExt>> callback = new org.springframework.orm.hibernate3.HibernateCallback<List<CategoryExt>>() {
			public List<CategoryExt> doInHibernate(org.hibernate.Session session) throws org.hibernate.HibernateException {

				session.setCacheMode(CacheMode.NORMAL);

				org.hibernate.Criteria criteria = session.createCriteria(CategoryExt.class);

				if (conditions != null) {
					ExpressionUtil.generateQueryExpression(conditions, criteria);
				}

				if (orders != null) {
					ExpressionUtil.generateOrderExpression(orders, criteria);
				}

				if ((pagesize > 0) && (currpage > 0)) {
					criteria.setFirstResult(pagesize * (currpage - 1));
					criteria.setMaxResults(pagesize);
				}

				return criteria.list();
			}
		};

		return getHibernateTemplate().execute(callback);
	}
	
	public int criteriaQueryCount(final Collection<ICondition> conditions) { 
       	this.getHibernateTemplate().setCacheQueries(true);
       	
       	org.hibernate.Criteria criteria = getHibernateTemplate().getSessionFactory().getCurrentSession().createCriteria(CategoryExt.class);
       	
       	if (conditions != null) {
             ExpressionUtil.generateQueryExpression(conditions, criteria);
         }
        	
       	int count=((Number) criteria .setProjection(org.hibernate.criterion.Projections.rowCount()).uniqueResult()).intValue(); 
        	
        return count; 
    }
}