
package org.ochilab.elearning.ofyEntity;

//[スーパークラス]ユーザー
public class user{
    
    //ID
    private int id;
    
    //パスワード
    private String passwd;
    
    //姓
    private String surname;
    
    //名
    private String givenname;
    
    //電話番号
    private String phonenumber;
    
    //Eメールアドレス
    private String email;
    
    //証明写真
    private String picture;
    
    //所属組織（学部・学科・[主]コース）のID
    private int orgid;

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getGivenname() {
        return givenname;
    }

    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public int getOrgid() {
        return orgid;
    }

    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }

    //コンストラクタ
    public user() {
    }
}

