/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.javabasicassessment;

/**
 *
 * @author Jeonghoon
 */
public class SummativeSums {

    public static int calculateSum(int[] arr) {
        int sum = 0;

        for (int number : arr) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] testArrays = {
            {1, 90, -33, -55, 67, -16, 28, -55, 15},
            {999, -60, -77, 14, 160, 301},
            {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, -99}
        };

        for (int i = 0; i < testArrays.length; i++) {
            System.out.format("#%d Array Sum: %d\n", i + 1, calculateSum(testArrays[i]));
        }
    }
}
