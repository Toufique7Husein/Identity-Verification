package userVarification.dao;

import java.util.ArrayList;

import javax.persistence.criteria.AbstractQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import userVarification.models.User;

@Repository
public class UserDao {
	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public int saveUser(User user) {
		Session session = sessionFactory.getCurrentSession();
		return (int) session.save(user);
	}

	/*
	 * SessionFactory factory = cfg.buildSessionFactory(); Session session =
	 * factory.openSession();
	 * 
	 * 
	 * Address address = session.get(Address.class, 5);
	 */
	
	
	@Transactional
	public List<User> getAlldata() {
		
		Session session=sessionFactory.openSession();
		
		Query<User> c = session.createQuery("from User");
    	List<User> list=c.list();
		return list;
	}

}
