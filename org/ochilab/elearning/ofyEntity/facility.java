
package org.ochilab.elearning.ofyEntity;

import java.util.Set;

//施設・教室
public class facility{
    
    //施設のID
    private int id;
    
    //施設の名称
    private String name;
    
    //施設利用に必要な物
    private String needs;
    
    //追記事項
    private String notes;
    
    //組織(学部)のID(今回はKinKi大学を中心として考えること)
    private int orgid;
    
    //利用用途のID
    private int usageid;
    
    //親のfac_ID(施設のID)
    private int parentid;
    
    //講義のフラッグ
    private int lectureflag;
    
    //コメントのID
    private int commentid;
    
    //最高位の番号(事務:1、教室:0)
    private int greatest;
     
    //マッピングファイルに指定したコレクション型で定義している
    private Set lectureList;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getNeeds() {
        return needs;
    }
    
    public void setNeeds(String needs) {
        this.needs = needs;
    }
    
    public String getNotes() {
        return notes;
    }
    
    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public int getOrgid() {
        return orgid;
    }
    
    public void setOrgid(int orgid) {
        this.orgid = orgid;
    }
    
    public int getUsageid() {
        return usageid;
    }
    
    public void setUsageid(int usageid) {
        this.usageid = usageid;
    }
    
    public int getParentid() {
        return parentid;
    }
    
    public void setParentid(int parentid) {
        this.parentid = parentid;
    }
    
    public int getLectureflag() {
        return lectureflag;
    }
    
    public void setLectureflag(int lectureflag) {
        this.lectureflag = lectureflag;
    }
    
    public int getCommentid() {
        return commentid;
    }
    
    public int getGreatest() {
        return greatest;
    }
    
    public void setGreatest(int greatest) {
        this.greatest = greatest;
    }
    
    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }
    
     public Set getLectureSet() {
        return lectureList;
    }

    public void setLectureSet(Set lectureList) {
        this.lectureList = lectureList;
    }
    
    //コンストラクタ
    public facility(){
    }

}

