package com.ramil.course.model;

public class Teacher {
    
    private int id;
    private String firstName;
    private String lastName;
    private Course idCourse;

    public Teacher() {
    }

    public Teacher(int id, String firstName, String lastName, Course idCourse) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.idCourse = idCourse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Course getIdCourse() {
        return idCourse;
    }

    public void setIdCourse(Course idCourse) {
        this.idCourse = idCourse;
    }
    
    
    
}
