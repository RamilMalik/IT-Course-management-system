package com.ramil.course.model;

public class Student {
    
    private int id;
    private String firstName;
    private String lastName;
    private Teacher teacher;
    private String phone;

    public Student() {
    }

    public Student(int id, String firstName, String lastName, Teacher teacher, String phone) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teacher = teacher;
        this.phone = phone;
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

    public Teacher getTeachers() {
        return teacher;
    }

    public void setTeachers(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
}
