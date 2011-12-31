
package org.ochilab.elearning.ofyEntity;

import java.util.Set;

//組織の種類
public class organization{
    
    //属する組織(組織のID)
    private int id;
    
    //組織の種類
    private String name;
    
    //属する組織(組織のID)
    private int parentid;
    
    //階層のID
    private int hieid;
    
    //マッピングファイルに指定したコレクション型で定義している
    private Set studentList;
    
    public int getId() {
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
    
    public int getParentid() {
        return parentid;
    }
    
    public void setParentid(int parentid) {
        this.parentid = parentid;
    }
    
    public int getHieid() {
        return hieid;
    }
    
    public void setHieid(int hieid) {
        this.hieid = hieid;
    }
    
    public Set getStudentSet() {
        return studentList;
    }
    
    public void setStudentSet(Set studentList) {
        this.studentList = studentList;
    }
    
    //コンストラクタ
    public organization() {
    }
}

