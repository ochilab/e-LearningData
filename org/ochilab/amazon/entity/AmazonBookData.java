package org.ochilab.amazon.entity;
import java.io.Serializable;

@SuppressWarnings("serial")
public class AmazonBookData implements Serializable {
	private String title;
	private String author;
	private String publisher;
	private String isbn;
	private String imgUrl;
	private boolean registFlag;
	private String publicationDate;
	private String FormattedPrice;

	public AmazonBookData() {
	}

	public AmazonBookData(String title, String author, String publisher,
			String imgUrl, String isbn, boolean registFlag,String FormattedPrice) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.imgUrl = imgUrl;
		this.isbn = isbn;
		this.registFlag = registFlag;
		this.setFormattedPrice(FormattedPrice);
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

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getFormattedPrice() {
		return FormattedPrice;
	}

	public void setFormattedPrice(String formattedPrice) {
		FormattedPrice = formattedPrice;
	}
}
