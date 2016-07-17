package org.example.service.impl;

import org.example.dao.BookRepositoryDao;
import org.example.service.BookRepositoryService;
import org.example.vo.BookRepository;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

public class BookRepositoryServiceImpl implements BookRepositoryService {

	BookRepositoryDao bookRepositoryDao;
	private TransactionTemplate transactionTemplate;
	
	public void setBookRepositoryDao(BookRepositoryDao bookRepositoryDao) {
		this.bookRepositoryDao = bookRepositoryDao;
	}

	public void setTransactionManager(PlatformTransactionManager transactionManager) {
        this.transactionTemplate = new TransactionTemplate(transactionManager);
    }
	
	public void saveData(final BookRepository bookRepository) {
		this.transactionTemplate.execute(new TransactionCallbackWithoutResult(){

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				bookRepositoryDao.save(bookRepository);
			}
			
		});
		
	}


}
