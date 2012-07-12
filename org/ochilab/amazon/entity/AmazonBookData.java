package org.ochilab.amazon.entity;

import java.io.Serializable;

@SuppressWarnings("serial")
public class AmazonBookData implements Serializable {
	private String title;
	private String author;
	private String publisher;
	private String imgUrl;
	private String isbn;
	private boolean registFlag;

	public AmazonBookData() {
	}

	public AmazonBookData(String title, String author, String publisher,
			String imgUrl, String isbn, boolean registFlag) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.imgUrl = imgUrl;
		this.isbn = isbn;
		this.registFlag = registFlag;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setRegistFlag(boolean registFlag) {
		this.registFlag = registFlag;
	}

	public boolean getRegistFlag() {
		return registFlag;
	}

}
