package com.nerdbot.lms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nerdbot.lms.dao.BooksDao;
import com.nerdbot.lms.model.Books;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	private BooksDao booksDao;

	@Override
	public List<Books> findAll() {
		return booksDao.findAll();
	}

	@Override
	public List<Books> findBybuid(int buid) {
		return booksDao.findBybuid(buid);
	}

	@Override
	public List<Books> findByAuthor(String authorName) {
		return booksDao.findByAuthor(authorName);
	}

	@Override
	public List<Books> findByMetaTags(String metaTags) {
		return booksDao.findByMetaTags(metaTags);
	}

	@Override
	public List<Books> findByBookName(String bookName) {
		List<Books> books = null;

		if (bookName.equalsIgnoreCase("all")) {

			books = booksDao.findAll();

		} else {

			books = booksDao.findByBookName(bookName);
		}

		return books;
	}

	@Override
	public List<Books> findByIsbn(String isbn) {
		return booksDao.findByIsbn(isbn);
	}

	@Override
	public List<Books> findBySubject(String bookSubject) {
		return booksDao.findBySubject(bookSubject);
	}

	@Override
	public void saveABook(Books book) {

		booksDao.saveABook(book);

	}

	@Override
	public void deleteABook(Books book) {
		// TODO Auto-generated method stub

	}

}
