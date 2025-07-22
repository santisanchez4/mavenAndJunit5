package com.example;

public class Course {
    private String title;
    private int duration;
    private String professor;

    public Course(String title, int duration, String professor) {
        this.title = title;
        this.duration = duration;
        this.professor = professor;
    }

    public Course(String title, int duration) {
        this.title = title;
        this.duration = duration;
        this.professor = "Unassigned";
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getProfessor() {
        return professor;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    public String showInformation() {
        return title + " (" + duration + " hs) - Professor: " + professor;
    }
}