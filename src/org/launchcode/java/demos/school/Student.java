package org.launchcode.java.demos.school;

/**
 * Created by mcoreyyares on 3/13/17.
 */
public class Student {
    private static int nextStudentId = 1;
    private String name;
    private final int studentID;
    private int numberOfCredits;
    private double gpa;

    public Student (int studentID){
        this.studentID = studentID;
    }

    public String getName(){
        return name;
    }

    private void setName(String aName) {
        name = aName;
    }

    public int getStudentID(){
        return studentID;
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

    public Student(String name, int studentID, int numberOfCredits, double gpa){
        this.name = name;
        this.studentID = studentID;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentID){
        this(name, studentID,0 ,0);
    }

    public Student(String name){
        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade){

        int currentCredits = this.getNumberOfCredits();

        int newCredits = currentCredits + courseCredits;

        double currentQualityScore = this.getGpa() * this.getNumberOfCredits();

        double newQualityScore = (grade * courseCredits) + currentQualityScore;

        this.setNumberOfCredits(newCredits);

        double newGpa = newQualityScore / newCredits;

        this.setGpa(newGpa);

    }

    public String getGradeLevel(){
        int currentCredits = this.getNumberOfCredits();

        String gradeLevel = new String();

        if (currentCredits <= 29){
            gradeLevel = "Freshman";
        }
            else if(currentCredits >= 30 && currentCredits <= 59){
                gradeLevel = "Sophomore";
            }
            else if(currentCredits >= 60 && currentCredits <= 89){
                gradeLevel = "Junior";
            }
            else{
                gradeLevel = "Senior";
            }
        return gradeLevel;
    }

    @Override
    public boolean equals(Object o){
        return ((Student) o).getStudentID() == getStudentID();
    }

    @Override
    public String toString(){
        return "Name: " + this.name + " GPA: " + this.gpa +
                " Student ID: " + this.studentID + "Grade Level: " +
                this.getGradeLevel() + "Number Of Credits: " + this.numberOfCredits;
    }
}

