package org.launchcode.java.demos.school;

/**
 * Created by mcoreyyares on 3/13/17.
 */
public class Student {
    private String name;
    private int studentID;
    private int numberOfCredits;
    private double gpa;


    public String getName(){
        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    public int getStudentID(){
        return studentID;
    }

    private void setStudentID(int aStudentID){
        studentID = aStudentID;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    private void setGpa(double aGpa){
        gpa = aGpa;
    }
}

