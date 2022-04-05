/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.studentquizgrades.dto;

import java.util.ArrayList;

/**
 *
 * @author Jeonghoon
 */
public class Student {
    private String name;
    private ArrayList<Integer> scores;

    public Student(String name) {
        this.name = name;

        scores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getScores() {
        return scores;
    }

    public void setScores(ArrayList<Integer> scores) {
        this.scores = scores;
    }

    public void addScore(int score) {
        scores.add(score);
    }
}
