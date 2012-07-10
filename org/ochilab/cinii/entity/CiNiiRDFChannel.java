package org.ochilab.cinii.entity;

import java.util.List;

public class CiNiiRDFChannel{

	private String about;
	private String title;
	private String link;
	private String date;
	private String totalResults;
	private String startIndex;
	private String itemsPerPage;
	private List<String> resource;

	public CiNiiRDFChannel() {
	}

	public CiNiiRDFChannel(String about, String title, String link,
			String date, String totalResults, String startIndex,
			String itemsPerPage, List<String> resource) {
		this.about = about;
		this.title = title;
		this.link = link;
		this.date = date;
		this.totalResults = totalResults;
		this.startIndex = startIndex;
		this.itemsPerPage = itemsPerPage;
		this.resource = resource;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getItemsPerPage() {
		return itemsPerPage;
	}

	public void setItemsPerPage(String itemsPerPage) {
		this.itemsPerPage = itemsPerPage;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public List<String> getResource() {
		return resource;
	}

	public void setResource(List<String> resource) {
		this.resource = resource;
	}

	public String getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(String startIndex) {
		this.startIndex = startIndex;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTotalResults() {
		return totalResults;
	}

	public void setTotalResults(String totalResults) {
		this.totalResults = totalResults;
	}
}
