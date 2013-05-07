package com.dns.framework.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class CommonHibernteDAO extends HibernateDaoSupport{

	@Autowired
	private SessionFactory sessionFactory;
}
