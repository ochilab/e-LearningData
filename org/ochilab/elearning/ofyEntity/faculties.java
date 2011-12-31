
package org.ochilab.elearning.ofyEntity;

import java.util.Set;


//[サブクラス]先生・事務員
public class faculties extends user{
    
    //先生の部屋の場所のID
    private int roomid;
    
    //先生のオフィスアワーの時間帯
    private String officehour;
    
    //先生の肩書のID
    private int degreeid;
    
    //マッピングファイルに指定したコレクション型で定義している
    private Set lectureList;
    
    public int getRoomid() {
        return roomid;
    }
    
    public void setRoomid(int roomid) {
        this.roomid = roomid;
    }
    
    public String getOfficehour() {
        return officehour;
    }
    
    public void setOfficehour(String officehour) {
        this.officehour = officehour;
    }
    
    public int getDegreeid() {
        return degreeid;
    }
    
    public void setDegreeid(int degreeid) {
        this.degreeid = degreeid;
    }
    
    public Set getLectureSet() {
        return lectureList;
    }
    
    public void setLectureSet(Set lectureList) {
        this.lectureList = lectureList;
    }
    
    //コンストラクタ
    public faculties() {
    }
}

