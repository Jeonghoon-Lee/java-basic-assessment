/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.studentquizgrades.controller;

import com.hoon.studentquizgrades.ui.StudentQuizGradesView;

/**
 *
 * @author Jeonghoon
 */
public class StudentQuizGradesController {

    StudentQuizGradesView view = new StudentQuizGradesView();

    public void run() {
        boolean keepGoing = true;

        while (keepGoing) {
            switch (getMenuSelection()) {
                case 1:
                    System.out.println("VIEW A LIST OF STUENDTS");
                    break;
                case 2:
                    System.out.println("ADD A STUDENT");
                    break;
                case 3:
                    System.out.println("REMOVE A STUDENT");
                    break;
                case 4:
                    System.out.println("VIEW A LIST OF QUIZ SCORES FOR A GIVEN STUDENT");
                    break;
                case 5:
                    System.out.println("VIEW THE AVERAGE QUIZE SCORE FOR A GIVEN STUDENT");
                    break;
                case 6:
                    keepGoing = false;
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }
        System.out.println("EXIT");
    }

    public int getMenuSelection() {
        return view.printMenuAndGetSelection();
    }
}
