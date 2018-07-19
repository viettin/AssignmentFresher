package com.dxc.DaoImpl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.dxc.Dao.UserDao;

public class UserDaoImpl implements UserDao {
private SessionFactory sessionFactory;

@Override
public boolean Checklogin(String name, String pass) {
	
	try {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		String sql=" from User where name = ? and password = ? ";
		Query query = session.createQuery(sql);
		query.setString(0, name);
		query.setString(1, pass);
		 List list=query.list();
		 if(list.size()==1) {
			 return true;
		 }
		 
		return false;
	} catch (Exception e) {
		
	e.printStackTrace();
	}
	finally {
	sessionFactory.close();
		
	}
	return false;
}

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

}
