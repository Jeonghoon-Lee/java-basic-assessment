/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hoon.javabasicassessment;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jeonghoon
 */
public class DogGenetics {

    public static void main(String[] args) {

        final String[] DOG_BREEDS = {
            "St. Bernard",
            "Chihuahua",
            "Dramatic RedNosed Asian Pug",
            "Common Cur",
            "King Doberman"
        };

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("What is your dog's name? ");
        String dogName = sc.nextLine();

        System.out.format("Well then, I have this highly reliable report "
                + "on %s's prestigious background right here.\n\n", dogName);
        System.out.println(dogName + " is:\n");

        // Maximum percentage of breed is 100%.
        int maxPercentOfBreed = 100;
        int percentOfBreeds;

        for (int i = 0; i < DOG_BREEDS.length - 1; i++) {
            percentOfBreeds = rand.nextInt(maxPercentOfBreed + 1);
            System.out.println(percentOfBreeds + "% " + DOG_BREEDS[i]);

            // change maximum possiblity of breed
            maxPercentOfBreed -= percentOfBreeds;
        }

        // Percentage of 5 dog breeds that should add up to 100%
        System.out.println(maxPercentOfBreed + "% " + DOG_BREEDS[DOG_BREEDS.length - 1]);


        System.out.println("\nWow, that's QUITE the dog!");
    }
}
