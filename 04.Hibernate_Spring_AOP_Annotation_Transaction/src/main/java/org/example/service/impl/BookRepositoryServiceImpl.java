package org.example.service.impl;

import org.example.dao.BookRepositoryDao;
import org.example.service.BookRepositoryService;
import org.example.vo.BookRepository;
import org.springframework.transaction.annotation.Transactional;

public class BookRepositoryServiceImpl implements BookRepositoryService {

	BookRepositoryDao bookRepositoryDao;
	
	public void setBookRepositoryDao(BookRepositoryDao bookRepositoryDao) {
		this.bookRepositoryDao = bookRepositoryDao;
	}

	@Transactional
	public void saveData(BookRepository bookRepository) {
		bookRepositoryDao.save(bookRepository);
	}

}
