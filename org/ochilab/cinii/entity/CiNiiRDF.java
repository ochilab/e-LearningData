package org.ochilab.cinii.entity;

import java.util.List;

public class CiNiiRDF {

	private String xmlns;
	private String rdf;
	private String rdfs;
	private String dc;
	private String prism;
	private String opensearch;
	private String lang;
	private CiNiiRDFChannel channel;
	private List<CiNiiRDFItem> items;

	public CiNiiRDF() {
	}

	public CiNiiRDF(String xmlns, String rdf, String rdfs, String dc,
			String prism, String opensearch, String lang,
			CiNiiRDFChannel channel, List<CiNiiRDFItem> items) {
		this.xmlns = xmlns;
		this.rdf = rdf;
		this.rdfs = rdfs;
		this.dc = dc;
		this.prism = prism;
		this.opensearch = opensearch;
		this.lang = lang;
		this.channel = channel;
		this.items = items;

	}

	public CiNiiRDFChannel getChannel() {
		return channel;
	}

	public void setChannel(CiNiiRDFChannel channel) {
		this.channel = channel;
	}

	public String getDc() {
		return dc;
	}

	public void setDc(String dc) {
		this.dc = dc;
	}

	public List<CiNiiRDFItem> getItems() {
		return items;
	}

	public void setItems(List<CiNiiRDFItem> items) {
		this.items = items;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}

	public String getOpensearch() {
		return opensearch;
	}

	public void setOpensearch(String opensearch) {
		this.opensearch = opensearch;
	}

	public String getPrism() {
		return prism;
	}

	public void setPrism(String prism) {
		this.prism = prism;
	}

	public String getRdf() {
		return rdf;
	}

	public void setRdf(String rdf) {
		this.rdf = rdf;
	}

	public String getRdfs() {
		return rdfs;
	}

	public void setRdfs(String rdfs) {
		this.rdfs = rdfs;
	}

	public String getXmlns() {
		return xmlns;
	}

	public void setXmlns(String xmlns) {
		this.xmlns = xmlns;
	}

}
