/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.javabasicassessment;

import java.util.Scanner;

/**
 *
 * @author Jeonghoon
 */
public class HealthyHearts {

    public static void main(String[] args) {

        final int MAX_HEART_RATE = 220;

        Scanner sc = new Scanner(System.in);

        System.out.print("What is your age? ");
        int userAge = sc.nextInt();

        int maxHeartRateOfUser = MAX_HEART_RATE - userAge;

        System.out.format("Your maximum heart rate should be %d beats per minute\n", maxHeartRateOfUser);
        System.out.format("Your target HR Zone is %d - %d beats per minute\n",
                Math.round(maxHeartRateOfUser * 0.5),
                Math.round(maxHeartRateOfUser * 0.85));
    }
}
