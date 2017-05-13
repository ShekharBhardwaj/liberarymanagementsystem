package com.nerdbot.lms.dao;

import java.util.List;

import com.nerdbot.lms.model.Books;

public interface BooksDao {

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
