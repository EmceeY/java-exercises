package org.launchcode.java.demos.school;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by mcoreyyares on 3/13/17.
 */
public class Course {
    private String courseName;
    private String courseDescription;
    private int credits;
    private double gpaWeight;
    private ArrayList<String> classRoster;
    private HashMap<String, Double> finalGrades;

    public String getCourseName(){
        return courseName;
    }

    private void setCourseName(String aCourseName){
        courseName = aCourseName;
    }

    public String getCourseDescription(){
        return courseDescription;
    }

    private void setCourseDescription(String aCourseDescription){
        courseDescription = aCourseDescription;
    }

    public int getCredits(){
        return credits;
    }

    private void setCredits(int aCredits){
        credits = aCredits;
    }

    public double getGpaWeight(){
        return gpaWeight;
    }

    private void setGpaWeight(double aGpaWeight){
        gpaWeight = aGpaWeight;
    }

    public ArrayList<String> getClassRoster(){
        return classRoster;
    }

    private void setClassRoster(Student aStudent){
        classRoster.add(aStudent.getName());
    }

    public HashMap getFinalGrades(){
        return finalGrades;
    }

    private void setFinalGrades(Student aStudent){
        finalGrades.put(aStudent.getName(), aStudent.getGpa());
    }


    @Override
    public boolean equals(Object o){
        return ((Course) o).getCourseDescription() == getCourseDescription();
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                ", credits=" + credits +
                ", gpaWeight=" + gpaWeight +
                ", classRoster=" + classRoster +
                ", finalGrades=" + finalGrades +
                '}';
    }

}
