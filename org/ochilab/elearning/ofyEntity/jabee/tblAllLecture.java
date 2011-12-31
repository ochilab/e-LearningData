/*
 * datatable.java
 *
 * Created on 2006/12/11, 16:38
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package org.ochilab.elearning.ofyEntity.jabee;

/**
 *
 * @author kitayama
 */
public class tblAllLecture {
    
    /** Creates a new instance of datatable */
    public tblAllLecture() {
    }

    private String lecname;

    /**
     * �v���p�e�B lecname �̎擾���\�b�h�B
     * @return �v���p�e�B lecname �̒l�B
     */
    public String getLecname() {

        return this.lecname;
    }

    /**
     * �v���p�e�B lecname �̐ݒ胁�\�b�h�B
     * @param lecname �v���p�e�B lecname �̐V�����l�B
     */
    public void setLecname(String lecname) {

        this.lecname = lecname;
    }

    /**
     * �v���p�e�B lecunit �̒l��ێ��B
     */
    private int lecunit;

    /**
     * �v���p�e�B lecunit �̎擾���\�b�h�B
     * @return �v���p�e�B lecunit �̒l�B
     */
    public int getLecunit() {

        return this.lecunit;
    }

    /**
     * �v���p�e�B lecunit �̐ݒ胁�\�b�h�B
     * @param lecunit �v���p�e�B lecunit �̐V�����l�B
     */
    public void setLecunit(int lecunit) {

        this.lecunit = lecunit;
    }

    /**
     * �v���p�e�B lecsemester �̒l��ێ��B
     */
    private int lecsemester;

    /**
     * �v���p�e�B lecsemester �̎擾���\�b�h�B
     * @return �v���p�e�B lecsemester �̒l�B
     */
    public int getLecsemester() {

        return this.lecsemester;
    }

    /**
     * �v���p�e�B lecsemester �̐ݒ胁�\�b�h�B
     * @param lecsemester �v���p�e�B lecsemester �̐V�����l�B
     */
    public void setLecsemester(int lecsemester) {

        this.lecsemester = lecsemester;
    }

    /**
     * �v���p�e�B lecsubjectmust �̒l��ێ��B
     */
    private String lecsubjectmust;

    /**
     * �v���p�e�B lecsubjectmust �̎擾���\�b�h�B
     * @return �v���p�e�B lecsubjectmust �̒l�B
     */
    public String getLecsubjectmust() {

        return this.lecsubjectmust;
    }

    /**
     * �v���p�e�B lecsubjectmust �̐ݒ胁�\�b�h�B
     * @param lecsubjectmust �v���p�e�B lecsubjectmust �̐V�����l�B
     */
    public void setLecsubjectmust(String lecsubjectmust) {

        this.lecsubjectmust = lecsubjectmust;
    }

    /**
     * �v���p�e�B lecgp �̒l��ێ��B
     */
    private int lecgp;

    /**
     * �v���p�e�B lecgp �̎擾���\�b�h�B
     * @return �v���p�e�B lecgp �̒l�B
     */
    public int getLecgp() {

        return this.lecgp;
    }

    /**
     * �v���p�e�B lecgp �̐ݒ胁�\�b�h�B
     * @param lecgp �v���p�e�B lecgp �̐V�����l�B
     */
    public void setLecgp(int lecgp) {

        this.lecgp = lecgp;
    }
}
