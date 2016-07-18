package org.example.dao.impl;

import org.example.dao.BookRepositoryDao;
import org.example.vo.BookRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

public class BookRepositoryDaoImpl implements BookRepositoryDao {

	private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

	public void save(BookRepository bookRepository) {

    	Session session = sessionFactory.openSession();
		Integer id = (Integer) session.save(bookRepository);
		System.out.println(id);

	}
    
	
}
