package org.example.service.impl;

import org.example.dao.impl.BookRepositoryDaoImpl;
import org.example.service.BookRepositoryService;
import org.example.vo.BookRepository;
import org.springframework.transaction.annotation.Transactional;

public class BookRepositoryServiceImpl implements BookRepositoryService {

	BookRepositoryDaoImpl bookRepositoryDao;
	

	public void setBookRepositoryDao(BookRepositoryDaoImpl bookRepositoryDao) {
		this.bookRepositoryDao = bookRepositoryDao;
	}


	@Transactional
	public void saveData(BookRepository bookRepository) {
		bookRepositoryDao.save(bookRepository);
	}

}
