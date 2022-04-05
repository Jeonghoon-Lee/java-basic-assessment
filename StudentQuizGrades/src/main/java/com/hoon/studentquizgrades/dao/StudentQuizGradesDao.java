/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.hoon.studentquizgrades.dao;

import com.hoon.studentquizgrades.dto.Student;
import java.util.List;

/**
 *
 * @author Jeonghoon
 */
public interface StudentQuizGradesDao {

    void addStudent(String name, List<Integer> grades);

    List<Student> getAllStudents();

    Student getScores(String name);

    Student removeStudent(String name);
}
