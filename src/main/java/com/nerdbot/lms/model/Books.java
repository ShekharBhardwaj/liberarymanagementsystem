package com.nerdbot.lms.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Books {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int buid;

	private String book_Name;

	private String isbn;

	private String author;

	private boolean avialable;

	private String teachers_note;

	private String suid;

	private Timestamp return_date;

	private String meta_tags;

	private boolean award_winner;

	private String subject;

	private boolean banned_in_any_country;

	private String country_of_ban;

	private String aisle;
	
	

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public boolean isAvialable() {
		return avialable;
	}

	public void setAvialable(boolean avialable) {
		this.avialable = avialable;
	}

	public String getMeta_tags() {
		return meta_tags;
	}

	public void setMeta_tags(String meta_tags) {
		this.meta_tags = meta_tags;
	}

	public boolean isAward_winner() {
		return award_winner;
	}

	public void setAward_winner(boolean award_winner) {
		this.award_winner = award_winner;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getCountry_of_ban() {
		return country_of_ban;
	}

	public void setCountry_of_ban(String country_of_ban) {
		this.country_of_ban = country_of_ban;
	}

	public String getAisle() {
		return aisle;
	}

	public void setAisle(String aisle) {
		this.aisle = aisle;
	}

	public String getSuid() {
		return suid;
	}

	public void setSuid(String suid) {
		this.suid = suid;
	}

	public int getBuid() {
		return buid;
	}

	public void setBuid(int buid) {
		this.buid = buid;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBook_Name() {
		return book_Name;
	}

	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}

	public String getTeachers_note() {
		return teachers_note;
	}

	public void setTeachers_note(String teachers_note) {
		this.teachers_note = teachers_note;
	}

	public Timestamp getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Timestamp return_date) {
		this.return_date = return_date;
	}

	public boolean isBanned_in_any_country() {
		return banned_in_any_country;
	}

	public void setBanned_in_any_country(boolean banned_in_any_country) {
		this.banned_in_any_country = banned_in_any_country;
	}

}
