package org.ochilab.elearning.ofyEntity.ewss;

import java.util.List;
import javax.persistence.Id;

public class JEDic {
	@Id
	private Long id;
    private String userId;//ユーザID
    private String jpn; //日本語
    private List<String> eng; //英語
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getJpn() {
		return jpn;
	}
	public void setJpn(String jpn) {
		this.jpn = jpn;
	}
	public List<String> getEng() {
		return eng;
	}
	public void setEng(List<String> eng) {
		this.eng = eng;
	}

}
