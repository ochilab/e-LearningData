
package org.ochilab.elearning.ofyEntity;

import java.io.Serializable;
import java.util.Set;


//[サブクラス]学生
public class student extends user{
    
    //学生の性別
    private String sex;
    
    //学生の郵便番号
    private String postcode;
    
    //学生の住所
    private String address;
    
    //学生の携帯電話番号
    private String cellularphone;
    
    //学生のFAX番号
    private String faxnumber;
    
    //学生の学籍番号
    private String number;
    
    //マッピングファイルに指定したコレクション型で定義している
    private Set evaluationList;
    private organization organization2;
    
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public String getPostcode() {
        return postcode;
    }
    
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCellularphone() {
        return cellularphone;
    }
    
    public void setCellularphone(String cellularphone) {
        this.cellularphone = cellularphone;
    }
    
    public String getFaxnumber() {
        return faxnumber;
    }
    
    public void setFaxnumber(String faxnumber) {
        this.faxnumber = faxnumber;
    }
    
    public String getNumber() {
        return number;
    }
    
    public void setNumber(String number) {
        this.number = number;
    }
    
    
    public organization getOrganization2() {
        return organization2;
    }
    
    public void setOrganization2(organization organization2) {
        this.organization2 = organization2;
    }
    
    public Set getEvaluationSet() {
        return evaluationList;
    }
    
    public void setEvaluationSet(Set evaluationList) {
        this.evaluationList = evaluationList;
    }
    
    //コンストラクタ
    public student() {
    }
}

