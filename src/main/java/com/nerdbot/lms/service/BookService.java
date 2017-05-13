package com.nerdbot.lms.service;

import java.util.List;

import com.nerdbot.lms.model.Books;

public interface BookService {
	
	List<Books> findAll();

	List<Books> findBybuid(int buid);

	List<Books> findByAuthor(String authorName);

	List<Books> findByMetaTags(String metaTags);

	List<Books> findByBookName(String bookName);

	List<Books> findByIsbn(String isbn);

	List<Books> findBySubject(String bookSubject);

	void saveABook(Books book);

	void deleteABook(Books book);

}
