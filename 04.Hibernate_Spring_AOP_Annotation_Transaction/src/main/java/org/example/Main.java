package org.example;

import org.example.service.BookRepositoryService;
import org.example.vo.BookRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringConfig.xml");
		BookRepositoryService bookRepositoryDaoImpl = applicationContext.getBean("bookRepoService", BookRepositoryService.class);
		
		BookRepository bookRepository = new BookRepository();
		bookRepository.setBookName("Eswar12");
		bookRepository.setBookAuthor("JourneyWithJava");
		
		bookRepositoryDaoImpl.saveData(bookRepository);
	
	}
}
