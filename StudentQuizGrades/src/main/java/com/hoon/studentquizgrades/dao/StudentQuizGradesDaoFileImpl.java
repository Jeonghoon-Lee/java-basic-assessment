/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.studentquizgrades.dao;

import com.hoon.studentquizgrades.dto.Student;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Jeonghoon
 */
public class StudentQuizGradesDaoFileImpl implements StudentQuizGradesDao {

    private Map<String, List<Integer>> students = new HashMap<>();

    @Override
    public void addStudent(String name, List<Integer> grades) {
        students.put(name, grades);
    }

    @Override
    public List<Student> getAllStudents() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student getScores(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Student removeStudent(String name) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
