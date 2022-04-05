/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.classroster.dto;

/**
 *
 * @author Jeonghoon
 */
public class Student {
    private String studentId;
    private String firstName;
    private String lastName;
    // Programming Language + cohort month/year
    private String cohort;

    public Student(String studentId) {
        this.studentId = studentId;
    }

    public Student(String studentId, String firstName, String lastName, String cohort) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.cohort = cohort;
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

    public String getStudentId() {
        return studentId;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    @Override
    public String toString() {
        return "#" + studentId + " : " + firstName + " " + lastName;
    }

}
