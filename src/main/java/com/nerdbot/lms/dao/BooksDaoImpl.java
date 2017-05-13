package com.nerdbot.lms.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nerdbot.lms.model.Books;

@Repository
public class BooksDaoImpl implements BooksDao {

	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	@Override
	public List<Books> findAll() {
		Session session = sessionFactory.openSession();
		List<Books> books = session.createCriteria(Books.class).list();
		session.close();
		return books;
	}

	@Override
	public List<Books> findBybuid(int buid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> findByAuthor(String authorName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> findByMetaTags(String metaTags) {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Books> findByBookName(String bookName) {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Books where book_Name = :code ");
		query.setParameter("code", bookName);
		List<Books> book = query.list();
		return book;
	}

	@Override
	public List<Books> findByIsbn(String isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Books> findBySubject(String bookSubject) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveABook(Books book) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

	@Override
	public void deleteABook(Books book) {
		// TODO Auto-generated method stub

	}

}
