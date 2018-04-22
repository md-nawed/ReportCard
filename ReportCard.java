package com.example.android.reportcard;

public class ReportCard {

    private int studentId;
    private int year;
    private int english;
    private int mathematics;
    private int chemistry;
    private int physics;
    private int geography;
    private int history;
    private int computer;

    public ReportCard(int studentId, int year, int english, int mathematics,
                      int chemistry, int physics, int geography, int computer,
                      int history) {
        this.studentId = studentId;
        this.year = year;
        this.english = english;
        this.mathematics = mathematics;
        this.chemistry = chemistry;
        this.physics = physics;
        this.geography = geography;
        this.computer = computer;
        this.history = history;
    }

    @Override
    public String toString() {
        //Your code here!  Return a representation of
        //the report card rather than the empty string
        return " Result {" + "id = " + studentId + ", " + " year = " + year + ", " + " english = " +
                english + ", " + "mathematics =" + mathematics + ", " + "chemistry =" +
                chemistry + ", " + "physics =" + physics + ", " + "geography =" +
                geography + ", " + "computer =" + computer + ", " + "history =" + history +
                "}";
    }

    private int getStudentId() {
        return studentId;
    }

    public int getChemistry() {
        return chemistry;
    }

    public int getComputer() {
        return computer;
    }

    public int getEnglish() {
        return english;
    }

    public int getGeography() {
        return geography;
    }

    public int getHistory() {
        return history;
    }

    public int getMathematics() {
        return mathematics;
    }

    public int getPhysics() {
        return physics;
    }

    public int getYear() {
        return year;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    public void setComputer(int computer) {
        this.computer = computer;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public void setMathematics(int mathematics) {
        this.mathematics = mathematics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setYear(int year) {
        this.year = year;
    }
}