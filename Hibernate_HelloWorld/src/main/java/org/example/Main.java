package org.example;

import org.example.vo.BookRepository;
import org.hibernate.Session;

public class Main {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		BookRepository bookRepository = new BookRepository();
		bookRepository.setBookId(3);
		bookRepository.setBookName("Eswar");
		bookRepository.setBookAuthor("JourneyWithIOS");
		
		Integer id = (Integer) session.save(bookRepository);
		session.getTransaction().commit();
		System.out.println(id);
	}

}
