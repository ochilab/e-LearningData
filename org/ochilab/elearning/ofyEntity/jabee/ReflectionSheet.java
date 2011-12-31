/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ochilab.elearning.ofyEntity.jabee;

import java.io.Serializable;



/**
 *
 * @author ochi
 */
public class ReflectionSheet implements Serializable{
    private String semester;
    private String number;
    private String surname;
    private String givenname;
    private int grade;
    private String email;
    private String passwd;
    private boolean meetRequest = false;
    private double gpaA;
    private double gpaB;
    private double gpaC;
    private double gpaD;
    private double gpaE;
    private double gpaF;
    private double numA;
    private double numB;
    private double numC;
    private double numD;
    private double numE;
    private double numF;
    private String evaluation;
    private String request;

    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

  
    /**
     * @return the grade
     */
    public int getGrade() {
        return grade;
    }

    /**
     * @param grade the grade to set
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * @return the meetRequest
     */
    public boolean getMeetRequest() {
        return meetRequest;
    }

    /**
     * @param meetRequest the meetRequest to set
     */
    public void setMeetRequest(boolean meetRequest) {
        this.meetRequest = meetRequest;
    }

    /**
     * @return the gpaA
     */
    public double getGpaA() {
        return gpaA;
    }

    /**
     * @param gpaA the gpaA to set
     */
    public void setGpaA(double gpaA) {
        this.gpaA = gpaA;
    }

    /**
     * @return the gpaB
     */
    public double getGpaB() {
        return gpaB;
    }

    /**
     * @param gpaB the gpaB to set
     */
    public void setGpaB(double gpaB) {
        this.gpaB = gpaB;
    }

    /**
     * @return the gpaC
     */
    public double getGpaC() {
        return gpaC;
    }

    /**
     * @param gpaC the gpaC to set
     */
    public void setGpaC(double gpaC) {
        this.gpaC = gpaC;
    }

    /**
     * @return the gpaD
     */
    public double getGpaD() {
        return gpaD;
    }

    /**
     * @param gpaD the gpaD to set
     */
    public void setGpaD(double gpaD) {
        this.gpaD = gpaD;
    }

    /**
     * @return the gpaE
     */
    public double getGpaE() {
        return gpaE;
    }

    /**
     * @param gpaE the gpaE to set
     */
    public void setGpaE(double gpaE) {
        this.gpaE = gpaE;
    }

    /**
     * @return the gpaF
     */
    public double getGpaF() {
        return gpaF;
    }

    /**
     * @param gpaF the gpaF to set
     */
    public void setGpaF(double gpaF) {
        this.gpaF = gpaF;
    }

    /**
     * @return the numA
     */
    public double getNumA() {
        return numA;
    }

    /**
     * @param numA the numA to set
     */
    public void setNumA(double numA) {
        this.numA = numA;
    }

    /**
     * @return the numB
     */
    public double getNumB() {
        return numB;
    }

    /**
     * @param numB the numB to set
     */
    public void setNumB(double numB) {
        this.numB = numB;
    }

    /**
     * @return the numC
     */
    public double getNumC() {
        return numC;
    }

    /**
     * @param numC the numC to set
     */
    public void setNumC(double numC) {
        this.numC = numC;
    }

    /**
     * @return the numD
     */
    public double getNumD() {
        return numD;
    }

    /**
     * @param numD the numD to set
     */
    public void setNumD(double numD) {
        this.numD = numD;
    }

    /**
     * @return the numE
     */
    public double getNumE() {
        return numE;
    }

    /**
     * @param numE the numE to set
     */
    public void setNumE(double numE) {
        this.numE = numE;
    }

    /**
     * @return the numF
     */
    public double getNumF() {
        return numF;
    }

    /**
     * @param numF the numF to set
     */
    public void setNumF(double numF) {
        this.numF = numF;
    }

    /**
     * @return the evaluation
     */
    public String getEvaluation() {
        return evaluation;
    }

    /**
     * @param evaluation the evaluation to set
     */
    public void setEvaluation(String evaluation) {
        this.evaluation = evaluation;
    }

    /**
     * @return the request
     */
    public String getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(String request) {
        this.request = request;
    }

    /**
     * @return the semester
     */
    public String getSemester() {
        return semester;
    }

    /**
     * @param semester the semester to set
     */
    public void setSemester(String semester) {
        this.semester = semester;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the passwd
     */
    public String getPasswd() {
        return passwd;
    }

    /**
     * @param passwd the passwd to set
     */
    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the givenname
     */
    public String getGivenname() {
        return givenname;
    }

    /**
     * @param givenname the givenname to set
     */
    public void setGivenname(String givenname) {
        this.givenname = givenname;
    }



}
