package org.ochilab.amazon.gwt;

import java.util.ArrayList;
import java.util.List;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;
import com.google.gwt.xml.client.impl.DOMParseException;


/**
GWTクライアントでの動作を前提にしたAmazonの書籍データパーサーの雛形です。
**/
public class AmazonBooksParser {
	private int totalPages;

	public List<AmazonBookData> parse(String xml) {
		try {
			Document doc = XMLParser.parse(xml);// パースしてDOMに!
			List<AmazonBookData> list = new ArrayList<AmazonBookData>();
			// getElementsByTagNameメソッドはDocumentとElementの両方で別々に宣言されている。Nodeから継承している訳ではないよ。

			NodeList itemlistTotalPages = doc
					.getElementsByTagName("TotalPages");// キーワードが空じゃない限り必ず、このタグはある。
			int numberOfPages = Integer.parseInt(itemlistTotalPages.item(0)
					.getFirstChild().getNodeValue());
			if (numberOfPages == 0) {
				list = null;
			} else {
				NodeList itemlist = doc.getElementsByTagName("Item");// ItemノードリストをGET
				for (int i = 0; i < itemlist.getLength(); i++) {
					;// Itemの個数分繰り返し（まあ、大体は１０回）
					Element itemElement = (Element) itemlist.item(i);// getElementsByTagNameメソッドを使うためにキャストしている
					// public interface Element extends Node
					// ElementはNodeの拡張だからキャストOKだよ
					AmazonBookData data = this.toAmazonBookData(itemElement);// Itemノードを一つ渡すと本のデータが出てくるよ
					list.add(data);
				}
			}
			setTotalPages(numberOfPages);// 総page数GET&設定
			return list;
		} catch (NumberFormatException NFe) {
			setTotalPages(1);// バグったら、総ページ数は１に設定
			System.out.println(NFe.toString());
			System.out.println("ページをintに変換出来なかった。");
			return null;
		} catch (NullPointerException NullPo) {
			setTotalPages(1);// バグったら、総ページ数は１に設定
			System.out.println(NullPo.toString());
			System.out.println("TotalPages要素がないんじゃね？");
			return null;
		} catch (DOMParseException domE) {
			setTotalPages(1);// バグったら、総ページ数は１に設定
			System.out.println(domE.toString());
			System.out.println("XMLをパース出来なかった");
			return null;
		}
	}

	private AmazonBookData toAmazonBookData(Element itemElement) {// item要素をゲット
		AmazonBookData abd = new AmazonBookData();
		// gwtのNodeクラスとJavaのNodeクラスって、実装しているメソッドが全然違う！気をつけなければ
		if (0 < itemElement.getElementsByTagName("Author").getLength()) {
			Node authorNode = itemElement.getElementsByTagName("Author")
					.item(0);
			abd.setAuthor(authorNode.getFirstChild().getNodeValue());
		} else if (0 < itemElement.getElementsByTagName("Creator").getLength()) {
			Node authorNode = itemElement.getElementsByTagName("Creator").item(
					0);
			abd.setAuthor(authorNode.getFirstChild().getNodeValue());
		} else {
			abd.setAuthor("unknown");
		}// 著作によって、AuthorとCreatorどっちで書かれているか分からないからだよ
		abd.setTitle(setEachData("Title", itemElement));
		abd.setPublisher(setEachData("Publisher", itemElement));
		abd.setIsbn(setEachData("ISBN", itemElement));
		abd.setPublicationDate(setEachData("PublicationDate", itemElement));
		abd.setFormattedPrice(setEachData("FormattedPrice", itemElement));
		try {
			Element smallImageNode = (Element) itemElement
					.getElementsByTagName("MediumImage").item(0);
			Node urlNode = smallImageNode.getElementsByTagName("URL").item(0);
			abd.setImgUrl(urlNode.getFirstChild().getNodeValue());
		} catch (NullPointerException e) {
			abd.setImgUrl("unknown");
		}
		return abd;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	private String setEachData(String str, Element node) {
		Node data = node.getElementsByTagName(str).item(0);
		if (data == null) {
			return "unknown";
		} else {
			return data.getFirstChild().getNodeValue();
		}
	}
}
