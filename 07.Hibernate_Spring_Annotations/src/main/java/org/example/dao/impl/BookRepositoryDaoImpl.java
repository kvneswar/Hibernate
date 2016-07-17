package org.example.dao.impl;

import org.example.dao.BookRepositoryDao;
import org.example.vo.BookRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class BookRepositoryDaoImpl implements BookRepositoryDao {

	@Autowired
	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(BookRepository bookRepository) {

    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	
		Integer id = (Integer) session.save(bookRepository);
		session.getTransaction().commit();
		System.out.println(id);

	}
    
	
}
