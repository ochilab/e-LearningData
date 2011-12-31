
package org.ochilab.elearning.ofyEntity.jabee;

import java.io.Serializable;
import java.util.Set;

import org.ochilab.elearning.ofyEntity.lecture;
import org.ochilab.elearning.ofyEntity.student;

//評価
public class evaluation implements Serializable{
    
    //評価のID(主キーを作成するため)
    private int id;
    
    //学生のID(必ず暗号化する)
    private int studentid;
    
    //受講科目ID
    private int lecid;
    
    //GP(成績の点数)
    private int gp;
    
    //ここから下は、マッピング用フィールド
    //リレーション先の型で定義しているところに注目
    private student student;
    private lecture lecture;
    
    
    public int getStudentid() {
        return studentid;
    }
    
    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }
    
    public int getLecid() {
        return lecid;
    }
    
    public void setLecid(int lecid) {
        this.lecid = lecid;
    }
    
    public int getGp() {
        return gp;
    }
    
    public void setGp(int gp) {
        this.gp = gp;
    }
    
    public student getStudent() {
        return student;
    }
    
    public void setStudent(student student) {
        this.student = student;
    }

    public int getId() {
        return id;
    }
     
    public void setId(int id) {
        this.id = id;
    }
    
    public lecture getLecture() {
        return lecture;
    }
    
    public void setLecture(lecture lecture) {
        this.lecture = lecture;
    }
    
    //コンストラクタ
    public evaluation() {
    }
}

