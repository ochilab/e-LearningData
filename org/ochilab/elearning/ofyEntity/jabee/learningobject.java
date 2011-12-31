
package org.ochilab.elearning.ofyEntity.jabee;

import java.util.Set;

//学習教育目
public class learningobject{
    
    //学習教育目標�
    private int id;
    
    //学習教育目標
    private String mark;
    
    //目�?
    private String target;
    
    //説�?
    private String explanation;
    
    //親のlearningobject_ID(学習教育目標ID)
    private int parentid;
    
    //マッピングファイルに�?定したコレクション型で定義して�?�?
    private Set lectureList;
    
    
    public int getId(){
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getMark() {
        return mark;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }
    
    public String getTarget() {
        return target;
    }
    
    public void setTarget(String target) {
        this.target = target;
    }
    
    public String getExplanation() {
        return explanation;
    }
    
    public void setExplanation(String explantation) {
        this.explanation = explanation;
    }
    
    public int getParentid() {
        return parentid;
    }
    
    public void setParentid(int parentid) {
        this.parentid = parentid;
    }
    
    public Set getLectureSet() {
        return lectureList;
    }
    
    public void setLectureSet(Set lectureList) {
        this.lectureList = lectureList;
    }
    
    //コンストラクタ
    public learningobject() {
    }
}

