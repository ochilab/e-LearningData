
package org.ochilab.elearning.ofyEntity;

import java.io.Serializable;
import java.util.Set;

import org.ochilab.elearning.ofyEntity.jabee.jabeeobject;
import org.ochilab.elearning.ofyEntity.jabee.learningobject;

// 授業
public class lecture{
    
    //授業科目のID
    private int id;
    
    //施設のID
    private int facid;
    
    //先生・事務員ID
    private int teacherid;
    
    //授業科目の名称
    private String name;
    
    //開講されている授業の組織（コース）のID
    private int coursid;
    
    //授業の行われるセメスター
    private int semester;
    
    //授業の行われる曜日
    private String day;
    
    //授業の行われる時間帯(何時限目)
    private int hour;
    
    //授業の単位数
    private int unit;
    
    //授業を行う教員のコメントのID
    private int commentid;
    
    //授業で使用する教科書
    private String textbook;
    
    //授業で使用する参考書
    private String referencebook;
    
    //学習教育目標のID
    private int targetid;
    
    //科目が選択か必修
    private String subjectmust;
    
    //JABEE目標のID
    private int jabeeid;
    
    //マッピングファイルに指定したコレクション型で定義している
    private Set evaluationList;
    private facility facility;
    private faculties faculties;
    private learningobject learningobject;
    private jabeeobject jabeeobject;
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public int getFacid() {
        return facid;
    }
    
    public void setFacid(int facid) {
        this.facid = facid;
    }
    
    public int getTeacherid() {
        return teacherid;
    }
    
    public void setTeacherid(int teacherid) {
        this.teacherid = teacherid;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getCoursid() {
        return coursid;
    }
    
    public void setCoursid(int coursid) {
        this.coursid = coursid;
    }
    
    public int getSemester() {
        return semester;
    }
    
    public void setSemester(int semester) {
        this.semester = semester;
    }
    
    public String getDay() {
        return day;
    }
    
    public void setDay(String day) {
        this.day = day;
    }
    
    public int getHour() {
        return hour;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }
    
    public int getUnit() {
        return unit;
    }
    
    public void setUnit(int unit) {
        this.unit = unit;
    }
    
    public int getCommentid() {
        return commentid;
    }
    
    public void setCommentid(int commentid) {
        this.commentid = commentid;
    }
    
    public String getTextbook() {
        return textbook;
    }
    
    public void setTextbook(String textbook) {
        this.textbook = textbook;
    }
    
    public String getReferencebook() {
        return referencebook;
    }
    
    public void setReferencebook(String referencebook) {
        this.referencebook = referencebook;
    }
    
    public int getTargetid() {
        return targetid;
    }
    
    public void setTargetid(int targetid) {
        this.targetid = targetid;
    }
    
    public String getSubjectmust() {
        return subjectmust;
    }
    
    public void setSubjectmust(String subjectmust) {
        this.subjectmust = subjectmust;
    }
    
    public int getJabeeid() {
        return jabeeid;
    }
    
    public void setJabeeid(int jabeeid) {
        this.jabeeid = jabeeid;
    }
    
    public Set getEvaluationSet() {
        return evaluationList;
    }
    
    public void setEvaluationSet(Set evaluationList) {
        this.evaluationList = evaluationList;
    }
    
    public facility getFacility() {
        return facility;
    }
    
    public void setFacility(facility facility) {
        this.facility = facility;
    }
    
    public faculties getFaculties() {
        return faculties;
    }

    public void setFaculties(faculties faculties) {
        this.faculties = faculties;
    }
     public learningobject getLearningobject() {
        return learningobject;
    }

    public void setLearningobject(learningobject learningobject) {
        this.learningobject = learningobject;
    }

    public jabeeobject getJabeeobject() {
        return jabeeobject;
    }

    public void setJabeeobject(jabeeobject jabeeobject) {
        this.jabeeobject = jabeeobject;
    }
    
    //コンストラクタ
    public lecture() {
    }
}
