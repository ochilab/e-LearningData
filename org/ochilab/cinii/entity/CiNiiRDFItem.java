package org.ochilab.cinii.entity;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class CiNiiRDFItem implements Serializable{

	private String about;
	private String naid;
	private String title;
	private String link;
	private String resource;
	private List<String> creator;
	private String publisher;
	private String publicationName;
	private String issn;
	private String volume;
	private String number;
	private String startingPage;
	private String endingPage;
	private String pageRange;
	private String publicationDate;
	private String description;
	private String date;
	private boolean registFlag;

	public CiNiiRDFItem() {
	}

	public CiNiiRDFItem(String about, String naid, String title, String link,
			String resource, List<String> creator, String publisher,
			String publicationName, String issn, String volume, String number,
			String startingPage, String endingPage, String pageRange,
			String publicationDate, String description, String date,
			boolean registFlag) {
		this.about = about;
		this.naid = naid;
		this.title = title;
		this.link = link;
		this.resource = resource;
		this.creator = creator;
		this.publisher = publisher;
		this.publicationName = publicationName;
		this.issn = issn;
		this.volume = volume;
		this.number = number;
		this.startingPage = startingPage;
		this.endingPage = endingPage;
		this.pageRange = pageRange;
		this.publicationDate = publicationDate;
		this.description = description;
		this.date = date;
		this.registFlag = registFlag;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public List<String> getCreator() {
		return creator;
	}

	public void setCreator(List<String> creator) {
		this.creator = creator;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEndingPage() {
		return endingPage;
	}

	public void setEndingPage(String endingPage) {
		this.endingPage = endingPage;
	}

	public String getIssn() {
		return issn;
	}

	public void setIssn(String issn) {
		this.issn = issn;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPageRange() {
		return pageRange;
	}

	public void setPageRange(String pageRange) {
		this.pageRange = pageRange;
	}

	public String getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(String publicationDate) {
		this.publicationDate = publicationDate;
	}

	public String getPublicationName() {
		return publicationName;
	}

	public void setPublicationName(String publicationName) {
		this.publicationName = publicationName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	public String getStartingPage() {
		return startingPage;
	}

	public void setStartingPage(String startingPage) {
		this.startingPage = startingPage;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public void setRegistFlag(boolean registFlag) {
		this.registFlag = registFlag;
	}

	public boolean getRegistFlag() {
		return registFlag;
	}

	public String getNaid() {
		return naid;
	}

	public void setNaid(String naid) {
		this.naid = naid;
	}
}
