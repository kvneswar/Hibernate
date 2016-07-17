package org.example.service.impl;

import org.example.dao.BookRepositoryDao;
import org.example.service.BookRepositoryService;
import org.example.vo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookRepositoryServiceImpl implements BookRepositoryService {

	BookRepositoryDao bookRepositoryDao;
	
	@Autowired
	public void setBookRepositoryDao(BookRepositoryDao bookRepositoryDao) {
		this.bookRepositoryDao = bookRepositoryDao;
	}

	@Transactional
	public void saveData(BookRepository bookRepository) {
		bookRepositoryDao.save(bookRepository);
	}

}
