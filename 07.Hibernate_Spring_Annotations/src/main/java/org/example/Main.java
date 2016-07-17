package org.example;

import org.example.dao.impl.BookRepositoryDaoImpl;
import org.example.vo.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		BookRepositoryDaoImpl bookRepositoryDaoImpl = applicationContext.getBean(BookRepositoryDaoImpl.class);
		
		BookRepository bookRepository = new BookRepository();
		bookRepository.setBookName("Eswar");
		bookRepository.setBookAuthor("JourneyWithJava");
		
		bookRepositoryDaoImpl.save(bookRepository);
	
	}
}
