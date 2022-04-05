/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.studentquizgrades.ui;

/**
 *
 * @author Jeonghoon
 */
public class StudentQuizGradesView {

    private UserIO io = new UserIOConsoleImpl();

    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List Students");
        io.print("2. Create New Student");
        io.print("3. Remove a Student");
        io.print("4. View a list of quiz score for a Student");
        io.print("5. View the average quiz score for a Student");
        io.print("6. Exit");

        return io.readInt("Please select from the above choices.", 1, 6);
    }
}
