/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ochilab.elearning.ofyEntity.jabee;

import java.io.Serializable;

/**
 *
 * @author uejima
 */
public class SheetData implements Serializable
{
    private String id, surName, givenName;
    private int year, grade;
    private String mail_address, password;
    private double gpa_a, gpa_b, gpa_c, gpa_d, gpa_e, gpa_f;
    private int num_a, num_b, num_c, num_d, num_e, num_f;
    private String evaluation, request;
    private boolean interview;
    private boolean returnFlag;

    public void setID(String id)
    {
        this.id = id;
    }
    public String getID()
    {
        return this.id;
    }

    public void setSurName(String surName)
    {
        this.surName = surName;
    }
    public String getSurName()
    {
        return this.surName;
    }

    public void setGivenName(String givenName)
    {
        this.givenName = givenName;
    }
    public String getGivenName()
    {
        return this.givenName;
    }

    public void setYear(int year)
    {
        this.year = year;
    }
    public int getYear()
    {
        return this.year;
    }

    public void setGrade(int grade)
    {
        this.grade = grade;
    }
    public int getGrade()
    {
        return this.grade;
    }

    public void setMailAddress(String mail_address)
    {
        this.mail_address = mail_address;
    }
    public String getMailAddress()
    {
        return this.mail_address;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getPassword()
    {
        return this.password;
    }

    public void setGPA_A(double gpa_a)
    {
        this.gpa_a = gpa_a;
    }
    public double getGPA_A()
    {
        return this.gpa_a;
    }

    public void setGPA_B(double gpa_b)
    {
        this.gpa_b = gpa_b;
    }
    public double getGPA_B()
    {
        return this.gpa_b;
    }

    public void setGPA_C(double gpa_c)
    {
        this.gpa_c = gpa_c;
    }
    public double getGPA_C()
    {
        return this.gpa_c;
    }

    public void setGPA_D(double gpa_d)
    {
        this.gpa_d = gpa_d;
    }
    public double getGPA_D()
    {
        return this.gpa_d;
    }

    public void setGPA_E(double gpa_e)
    {
        this.gpa_e = gpa_e;
    }
    public double getGPA_E()
    {
        return this.gpa_e;
    }

    public void setGPA_F(double gpa_f)
    {
        this.gpa_f = gpa_f;
    }
    public double getGPA_F()
    {
        return this.gpa_f;
    }

    public void setNum_A(int num_a)
    {
        this.num_a = num_a;
    }
    public int getNum_A()
    {
        return this.num_a;
    }

    public void setNum_B(int num_b)
    {
        this.num_b = num_b;
    }
    public int getNum_B()
    {
        return this.num_b;
    }

    public void setNum_C(int num_c)
    {
        this.num_c = num_c;
    }
    public int getNum_C()
    {
        return this.num_c;
    }

    public void setNum_D(int num_d)
    {
        this.num_d = num_d;
    }
    public int getNum_D()
    {
        return this.num_d;
    }

    public void setNum_E(int num_e)
    {
        this.num_e = num_e;
    }
    public int getNum_E()
    {
        return this.num_e;
    }

    public void setNum_F(int num_f)
    {
        this.num_f = num_f;
    }
    public int getNum_F()
    {
        return this.num_f;
    }

    public void setEvaluation(String evaluation)
    {
        this.evaluation = evaluation;
    }
    public String getEvaluation()
    {
        return this.evaluation;
    }

    public void setRequest(String request)
    {
        this.request = request;
    }
    public String getRequest()
    {
        return this.request;
    }
    
    public void setInterview(boolean interview)
    {
        this.interview = interview;
    }
    public boolean getInterview()
    {
        return this.interview;
    }

    /**
     * @return the returnFlag
     */
    public boolean getReturnFlag() {
        return returnFlag;
    }

    /**
     * @param returnFlag the returnFlag to set
     */
    public void setReturnFlag(boolean returnFlag) {
        this.returnFlag = returnFlag;
    }
}
