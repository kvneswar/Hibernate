package org.example;

import org.example.service.impl.BookRepositoryServiceImpl;
import org.example.vo.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		BookRepositoryServiceImpl bookRepositoryDaoImpl = applicationContext.getBean(BookRepositoryServiceImpl.class);
		
		BookRepository bookRepository = new BookRepository();
		bookRepository.setBookName("Eswar");
		bookRepository.setBookAuthor("JourneyWithJava");
		
		bookRepositoryDaoImpl.saveData(bookRepository);
	
	}
}
